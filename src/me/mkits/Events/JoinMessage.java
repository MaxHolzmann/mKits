package me.mkits.Events;
 
import me.mkits.Main.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinMessage implements Listener{
 
        public Main plugin;
       
        public JoinMessage(Main instance){
                plugin = instance;
        }
       
        @EventHandler
        public void onFoodLevelChange(PlayerJoinEvent e)
        {
        	// Define Variables
        	Player p = e.getPlayer();
        	String server = plugin.getConfig().getString("prefixmsg");
        	p.sendMessage(ChatColor.AQUA + "Welcome to " + server);
        	p.sendMessage(ChatColor.AQUA + "Do " + ChatColor.RED + "/help " + ChatColor.AQUA + "for a list of commands.");
        	
        	
        	
        }
}