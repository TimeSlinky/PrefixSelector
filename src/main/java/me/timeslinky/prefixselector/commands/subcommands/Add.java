package me.timeslinky.prefixselector.commands.subcommands;

import me.timeslinky.prefixselector.commands.SubCommand;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Add extends SubCommand {
    @Override
    public String getName() {
        return "add";
    }

    @Override
    public String getDescription() {
        return "UltraCraft player prefix menu - Use it to change your chat prefix";
    }

    @Override
    public String getSyntax() {
        return "/prefix add <prefixName> <prefixFormat>";
    }

    @Override
    public void perform(Player player, String[] args) {

        if (args.length > 2) {
            player.sendMessage("This is args[1]: " + args[1]);
            player.sendMessage("This is args[2]: " + args[2]);
        }
        else {
            player.sendMessage("Please provide the correct amount of arguments");
            player.sendMessage(ChatColor.AQUA + getSyntax());
        }


    }
}
