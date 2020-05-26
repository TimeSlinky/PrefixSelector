package me.timeslinky.prefixselector;

import me.timeslinky.prefixselector.commands.CommandManager;
import me.timeslinky.prefixselector.commands.subcommands.Version;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.File;

public final class PrefixSelector extends JavaPlugin {

    public static PrefixSelector plugin;

    @Override
    public void onEnable() {
        System.out.println("PrefixSelector " + ChatColor.GREEN + "Enabled");

        getCommand("prefix").setExecutor(new CommandManager());

        plugin = this;

        //create or load config
            File config = new File("plugins/config.yml");
            if(config.exists())
            {
                System.out.println("Load Default Config");
            }
            else
            {
                System.out.println("Save Default Config");
                getConfig().options().copyDefaults(true);
                saveDefaultConfig();
            }
        //
    }

    @Override
    public void onDisable() {
        System.out.println("PrefixSelector " + ChatColor.RED + "Disabled");
    }
}



/*
TimeSlinkys Notes

formats:
    1:
       key1: 123
       key2: test

getConfig().getConfigurationSection("formats").getKeys(false);
    This would return "1" and any other keys in the same column.

getConfig().getConfigurationSection("formats").getKeys(true);
    This would get ALL subnodes.

 */