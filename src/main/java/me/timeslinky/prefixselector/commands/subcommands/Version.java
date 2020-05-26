package me.timeslinky.prefixselector.commands.subcommands;

import me.timeslinky.prefixselector.PrefixSelector;
import me.timeslinky.prefixselector.commands.SubCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Version extends SubCommand {
    @Override
    public String getName() {
        return "version";
    }

    @Override
    public String getDescription() {
        return "Get the version of UltraCraft PrefixSelector";
    }

    @Override
    public String getSyntax() {
        return "/prefix version";
    }

    FileConfiguration config = PrefixSelector.plugin.getConfig();

    @Override
    public void perform(Player player, String[] args) {
        String version = config.getString("version");
        player.sendMessage("Ultracraft Prefix Selector Version: " + version);
        player.sendMessage("This worked!");
    }
}
