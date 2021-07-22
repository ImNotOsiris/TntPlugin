package me.zdellarocco.tntplugin.tntplugin;

import me.zdellarocco.tntplugin.tntplugin.listeners.creditCMDListener;
import me.zdellarocco.tntplugin.tntplugin.listeners.tntListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class TntPlugin extends JavaPlugin{

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "[TNTPlugin] " + ChatColor.RED + "TNTPlugin is now Enabled");

        this.getServer().getPluginManager().registerEvents(new tntListener(), this);
        Objects.requireNonNull(this.getCommand("credits")).setExecutor(new creditCMDListener());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "[TNTPlugin] " + ChatColor.RED + "TNTPlugin is now Disabled");
    }
}
