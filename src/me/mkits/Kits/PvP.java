package me.mkits.Kits;


import me.mkits.Main.Main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;


public class PvP implements CommandExecutor, Listener {
	
	
 	   
 	   
    

	
	private Main plugin;
	public PvP(Main plugin) {
		this.plugin = plugin;
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("pvp") && sender.hasPermission("KitPvP.pvp")){
			Player p = (Player) sender;		
			if(plugin.kit.contains(p.getName())) {
				p.sendMessage(ChatColor.RED + "You can only use one kit per life!");
			} else {
			plugin.kit.add(p.getName());
			plugin.givePvP(p);
			
}
		
}
		return false;
	}
}

 
            
         
			
			
