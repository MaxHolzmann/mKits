package me.mkits.Events;
 
import me.mkits.Main.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener{
 
        public Main plugin;
       
        public JoinEvent(Main instance){
                plugin = instance;
        }
       
        @EventHandler
        public void onFoodLevelChange(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        
        e.setJoinMessage(ChatColor.GOLD + p.getName() + ChatColor.GRAY +" has connected");
        
        {
        }
}
}