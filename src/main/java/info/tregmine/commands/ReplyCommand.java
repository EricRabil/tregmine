package info.tregmine.commands;

import info.tregmine.Tregmine;
import info.tregmine.api.GenericPlayer;
import info.tregmine.api.Notification;
import info.tregmine.database.DAOException;
import info.tregmine.database.IContext;
import info.tregmine.database.IPlayerDAO;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;

import java.util.List;

import static org.bukkit.ChatColor.GREEN;

public class ReplyCommand extends AbstractCommand {

    public ReplyCommand(Tregmine tregmine) {
        super(tregmine, "reply");
    }

    private String argsToMessage(String[] args) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < args.length; ++i) {
            buf.append(" ");
            buf.append(args[i]);
        }

        return buf.toString();
    }

    @Override
    public boolean handlePlayer(GenericPlayer player, String[] args) {
        if (args.length >= 1) {

            String message = argsToMessage(args);

            String lastMessenger = player.getLastMessenger();

            if (lastMessenger == null || lastMessenger.equalsIgnoreCase("")) {
                error(player, "No one has messaged you");
                return true;
            }

            try (IContext ctx = tregmine.createContext()) {
                IPlayerDAO playerDAO = ctx.getPlayerDAO();

                List<GenericPlayer> candidates = tregmine.matchPlayer(lastMessenger);

                if (candidates.size() != 1) {
                    return error(player, "No player found by the name of " + lastMessenger);
                }

                GenericPlayer receivingPlayer = candidates.get(0);

                boolean ignored;
                ignored = playerDAO.doesIgnore(receivingPlayer, player);

                if (player.getRank().canNotBeIgnored())
                    ignored = false;
                if (ignored)
                    return true;

                // Show message in senders terminal, as long as the recipient
                // isn't
                // invisible, to prevent /msg from giving away hidden players
                // presence
                TextComponent messageTC = new TextComponent(GREEN + ": " + message);
                messageTC.setColor(net.md_5.bungee.api.ChatColor.GREEN);
                if (!receivingPlayer.hasFlag(GenericPlayer.Flags.INVISIBLE) || player.getRank().canSeeHiddenInfo()) {
                    player.sendMessage(new TextComponent(GREEN + "(to) "), receivingPlayer.getChatName(),
                            messageTC);
                }
                // Send message to recipient
                receivingPlayer.sendNotification(Notification.MESSAGE, new TextComponent(GREEN + "(msg) "),
                        player.getChatName(), messageTC);
                receivingPlayer.setLastMessenger(player.getName());
            } catch (DAOException e) {
                throw new RuntimeException(e);
            }

        } else {
            error(player, "You need to type a message!");
        }
        return true;
    }

}