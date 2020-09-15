package xyz.n7mn.dev.yululi.gravelplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class GravelPluginListener implements Listener {

    @EventHandler
    public void PlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent e){
        if (e.getMessage().startsWith("/game-start")){
            if (e.getPlayer().hasPermission("gravel.op")){

                e.setCancelled(true);
            }
        }
    }


}
