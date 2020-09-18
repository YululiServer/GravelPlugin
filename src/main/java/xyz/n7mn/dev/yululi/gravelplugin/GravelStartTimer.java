package xyz.n7mn.dev.yululi.gravelplugin;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Collection;

public class GravelStartTimer extends BukkitRunnable {

    private final Plugin plugin = Bukkit.getPluginManager().getPlugin("GravelPlugin");

    private final int count;

    public GravelStartTimer(int count){
        this.count = count;
    }

    public GravelStartTimer(){
        count = 0;
    }

    @Override
    public void run() {
        int timerStart = plugin.getConfig().getInt("timerstart");

        plugin.getServer().broadcastMessage("ゲーム開始まで 残り " + (timerStart - count) + " 秒");
        if (timerStart - count >= 5){
            Collection<? extends Player> players = plugin.getServer().getOnlinePlayers();
            for (Player player : players){
                player.playSound(player.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER,  1, 1);
            }
        }

        if (timerStart - count != 0) {
            GravelStartTimer gravelStartTimer = new GravelStartTimer(count + 1);
            gravelStartTimer.runTaskLaterAsynchronously(plugin, 20L);
        } else {
            plugin.getServer().broadcastMessage("ゲームスタート！");
        }

    }
}
