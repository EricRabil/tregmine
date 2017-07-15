package info.tregmine.commands;

import info.tregmine.Tregmine;
import info.tregmine.api.GenericPlayer;
import info.tregmine.api.PlayerReport;
import info.tregmine.database.DAOException;
import info.tregmine.database.IContext;
import info.tregmine.database.IPlayerReportDAO;
import net.md_5.bungee.api.chat.TextComponent;

import java.util.Date;
import java.util.List;

import static org.bukkit.ChatColor.DARK_AQUA;
import static org.bukkit.ChatColor.RED;

public class BanCommand extends AbstractCommand {
    private Tregmine plugin;

    public BanCommand(Tregmine tregmine) {
        super(tregmine, "ban", Tregmine.PermissionDefinitions.STAFF_REQUIRED);
        plugin = tregmine;
    }

    private String argsToMessage(String[] args) {
        StringBuffer buf = new StringBuffer();
        for (int i = 1; i < args.length; ++i) {
            buf.append(" ");
            buf.append(args[i]);
        }

        return buf.toString();
    }

    @Override
    public boolean handlePlayer(GenericPlayer player, String[] args) {
        if (args.length < 2) {
            return false;
        }

        String pattern = args[0];
        String message = argsToMessage(args);

        List<GenericPlayer> candidates = tregmine.matchPlayer(pattern);
        if (candidates.size() != 1) {
            // TODO: List users
            return true;
        }

        GenericPlayer victim = candidates.get(0);

        victim.kickPlayer(plugin, "Banned by " + player.getName() + ": " + message);

        try (IContext ctx = tregmine.createContext()) {
            PlayerReport report = new PlayerReport();
            report.setSubjectId(victim.getId());
            report.setIssuerId(player.getId());
            report.setAction(PlayerReport.Action.BAN);
            report.setMessage(message);
            // three days default
            report.setValidUntil(new Date(System.currentTimeMillis() + 3 * 86400 * 1000l));

            IPlayerReportDAO reportDAO = ctx.getPlayerReportDAO();
            reportDAO.insertReport(report);
        } catch (DAOException e) {
            throw new RuntimeException(e);
        }
        player.getSpigot();
        plugin.broadcast(victim.getChatName(), new TextComponent("" + RED + " was banned by "), player.getChatName(),
                new TextComponent("."));

        LOGGER.info(victim.getName() + " Banned by " + player.getName());

        return true;
    }
}
