package me.mkits.Help;

import me.mkits.Main.*;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Plugins implements Listener {
	
	public Plugins(Main plugin) {
	}
	
	@EventHandler
	public void onPlayerRunPluginsCMD(PlayerCommandPreprocessEvent e) {
		Player p = e.getPlayer();
		String cmd = e.getMessage();		
		if(cmd.equalsIgnoreCase("plugins")) {
			p.sendMessage(ChatColor.RED + "Ehem, uh no.");
			
		}
		
	}

}
