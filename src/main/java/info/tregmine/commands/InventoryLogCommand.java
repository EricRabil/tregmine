package info.tregmine.commands;

import info.tregmine.Tregmine;
import info.tregmine.api.GenericPlayer;
import info.tregmine.database.DAOException;
import info.tregmine.database.IContext;
import info.tregmine.database.IPlayerDAO;

import static org.bukkit.ChatColor.AQUA;
import static org.bukkit.ChatColor.RED;

public class InventoryLogCommand extends AbstractCommand {
    public InventoryLogCommand(Tregmine tregmine) {
        super(tregmine, "invlog");
    }

    @Override
    public boolean handlePlayer(GenericPlayer player, String[] args) {
        if (args.length < 1) {
            player.sendMessage("Your InventoryLog is set to "
                    + (player.hasFlag(GenericPlayer.Flags.CHEST_LOG) ? "on" : "off") + ".");
            return true;
        }

        String state = args[0];

        if ("on".equalsIgnoreCase(state)) {
            player.setFlag(GenericPlayer.Flags.CHEST_LOG);
            player.sendMessage(AQUA + "Inventory Log display is now turned on for you.");
        } else if ("off".equalsIgnoreCase(state)) {
            player.removeFlag(GenericPlayer.Flags.CHEST_LOG);
            player.sendMessage(AQUA + "Inventory Log display is now turned off for you.");
        } else if ("status".equalsIgnoreCase(state)) {
            player.sendMessage("Your Inventory Log display is set to "
                    + (player.hasFlag(GenericPlayer.Flags.CHEST_LOG) ? "on" : "off") + ".");
        } else {
            player.sendMessage(RED + "The commands are /invlog on, /invlog off and /invlog status.");
        }

        try (IContext ctx = tregmine.createContext()) {
            IPlayerDAO playerDAO = ctx.getPlayerDAO();
            playerDAO.updatePlayer(player);
        } catch (DAOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }

}
