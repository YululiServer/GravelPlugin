package xyz.n7mn.dev.yululi.gravelplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class GravelPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new GravelPluginListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
