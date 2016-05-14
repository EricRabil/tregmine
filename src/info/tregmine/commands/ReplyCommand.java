package info.tregmine.commands;

import static org.bukkit.ChatColor.GREEN;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.util.StringUtil;

import info.tregmine.Tregmine;
import info.tregmine.api.Notification;
import info.tregmine.api.TregminePlayer;
import info.tregmine.database.DAOException;
import info.tregmine.database.IContext;
import info.tregmine.database.IPlayerDAO;
import net.md_5.bungee.api.chat.TextComponent;

public class ReplyCommand extends AbstractCommand
{

    public ReplyCommand(Tregmine tregmine)
    {
        super(tregmine, "reply");
    }

    private String argsToMessage(String[] args)
    {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < args.length; ++i) {
            buf.append(" ");
            buf.append(args[i]);
        }

        return buf.toString();
    }

    public boolean handlePlayer(TregminePlayer player, String[] args)
    {
        if (args.length >= 1) {

            String message = argsToMessage(args);

            String lastMessenger = player.getLastMessenger();

            if (lastMessenger == null || lastMessenger.equalsIgnoreCase("")) {
                player.sendStringMessage(ChatColor.RED + "No one has messaged you");
                return true;
            }

            try (IContext ctx = tregmine.createContext()) {
                IPlayerDAO playerDAO = ctx.getPlayerDAO();

                List<TregminePlayer> candidates = tregmine.matchPlayer(lastMessenger);

                if (candidates.size() != 1) {
                    player.sendNotification(Notification.COMMAND_FAIL, new TextComponent(ChatColor.RED + "No player found by the name of "
                                    + lastMessenger));
                    return true;
                }

                TregminePlayer receivingPlayer = candidates.get(0);
                
                boolean ignored;
                ignored = playerDAO.doesIgnore(receivingPlayer, player);

                if (player.getRank().canNotBeIgnored())
                    ignored = false;
                if (ignored)return true;

                // Show message in senders terminal, as long as the recipient
                // isn't
                // invisible, to prevent /msg from giving away hidden players
                // presence
                if (!receivingPlayer.hasFlag(TregminePlayer.Flags.INVISIBLE)
                        || player.getRank().canSeeHiddenInfo()) {
                    player.sendSpigotMessage(new TextComponent(GREEN + "(to) "
                            ),receivingPlayer.getChatName(), new TextComponent( GREEN + ": "
                            + message));
                }

                // Send message to recipient
                receivingPlayer.sendNotification(Notification.MESSAGE,
                        new TextComponent(GREEN + "(msg) "), player.getChatName(), new TextComponent(GREEN + ": "
                        + message));
                receivingPlayer.setLastMessenger(player.getName());
            } catch (DAOException e) {
                throw new RuntimeException(e);
            }

        }else{
        	player.sendStringMessage(ChatColor.RED + "You need to type a message!");
        }
        return true;
    }

}