package info.tregmine.commands;

import info.tregmine.Tregmine;
import info.tregmine.api.GenericPlayer;
import info.tregmine.api.GenericPlayer.Property;
import info.tregmine.api.Nickname;
import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class ChangeNameCommand extends AbstractCommand {
    public ChangeNameCommand(Tregmine tregmine) {
        super(tregmine, "cname", Tregmine.PermissionDefinitions.ADMIN_REQUIRED);
    }

    @Override
    public boolean handlePlayer(GenericPlayer player, String[] args) {
        if (args.length != 2) {
            return false;
        }
        // String colorstring = args[0];
        String use[] = args[0].split(":");
        String colorstring = use[0];
        List<String> formatting = new ArrayList<String>();
        List<ChatColor> format = new ArrayList<ChatColor>();
        if (use.length >= 2) {
            if (use[1] != null) {
                for (String lol : use) {
                    if (lol != colorstring && !formatting.contains(lol.toLowerCase())) {
                        formatting.add(lol.toLowerCase());
                    }
                }
            }
        }
        for (ChatColor color : ChatColor.values()) {
            if (!color.isFormat()) {
                continue;
            }
            if (formatting.contains(color.name().toLowerCase())) {
                format.add(color);
                continue;
            }
        }
        ChatColor usecolor = null;
        try {
            usecolor = ChatColor.valueOf(colorstring.toUpperCase());
        } catch (IllegalArgumentException e) {
            return error(player, "The color provided does not exist.");
        }
        player.setNickname(new Nickname(args[1], usecolor, format));

        player.setProperty(Property.NICKNAME);
        player.sendMessage("You are now: " + player.getChatNameNoHover());
        LOGGER.info(player.getName() + " changed name to " + player.getChatNameNoHover());

        return true;
    }
}
