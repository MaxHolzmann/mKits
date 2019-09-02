package me.mkits.Events;
 
import me.mkits.Main.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinIP implements Listener{
 
        public Main plugin;
       
        public JoinIP(Main instance){
                plugin = instance;
        }
        
        @EventHandler
        public void onPlayerJoin(PlayerJoinEvent e) {
        	Player p = e.getPlayer();
        	
        if(p.getServer().getIp().equals("test.minecraft-kits.com:25567"));
        p.sendMessage(ChatColor.RED + "Lol!");
        
        }
}

        
