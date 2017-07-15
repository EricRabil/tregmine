package info.tregmine.commands;

import info.tregmine.Tregmine;
import info.tregmine.api.GenericPlayer;
import info.tregmine.database.DAOException;
import info.tregmine.database.IContext;
import info.tregmine.database.IHandbookDAO;
import org.bukkit.ChatColor;

import java.util.List;

public class StaffHandbookCommand extends AbstractCommand {
    Tregmine t;

    public StaffHandbookCommand(Tregmine instance) {
        super(instance, "staffbook");
        this.t = instance;
    }

    @Override
    public boolean handlePlayer(GenericPlayer player, String[] b) {
        try (IContext ctx = tregmine.createContext()) {
            IHandbookDAO c = ctx.getHandbookDAO();
            List<String[]> handbook = c.getHandbook();
            if (handbook.size() == 0) {
                error(player, "There are no rules in the handbook.");
                return true;
            }
            player.sendMessage(ChatColor.GOLD + t.getConfig().getString("general.servername") + ChatColor.AQUA
                    + " Staff Handbook");
            for (String[] rule : handbook) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('#', rule[0]) + ChatColor.RESET + ". "
                        + ChatColor.translateAlternateColorCodes('#', rule[1]));
            }
        } catch (DAOException e) {
            error(player, "Something bad happened...");
            throw new RuntimeException(e);
        }
        return true;
    }
}
