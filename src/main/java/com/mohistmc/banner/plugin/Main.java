package com.mohistmc.banner.plugin;

import com.mohistmc.banner.api.ServerAPI;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    public static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;
        getConfig().options().copyDefaults(true);
        saveConfig();
        saveDefaultConfig();
        reloadConfig();
        ServerAPI.putBukkitEvents(this, this);
        if (ServerAPI.hasMod("banner")) { // only 1.20.1 +
            Bukkit.getLogger().info("Successful hook banner mod!");
        }
    }

    public void onDisable() {
    }
}
