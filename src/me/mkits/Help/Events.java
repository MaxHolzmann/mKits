package me.mkits.Help;

import me.mkits.Main.*;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Events implements CommandExecutor {
	
	private Main plugin;
	public Events(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("events")){
			
			//Defines Variables
			Player p = (Player) sender;
			
			String server = plugin.getConfig().getString("prefixmsg");
			
			p.sendMessage(ChatColor.GOLD + server + ChatColor.WHITE + " Events");
			p.sendMessage(ChatColor.GRAY + "====================================================");
			p.sendMessage(ChatColor.GOLD + "LMS - A battle until one player is left! ");
			p.sendMessage(ChatColor.GOLD + "KTK - Kill the King   ");
			p.sendMessage(ChatColor.GOLD + "Leaf Decay - ");
			p.sendMessage(ChatColor.GOLD + "Brackets - ");
			p.sendMessage(ChatColor.GOLD + "Cannons - ");
			p.sendMessage(ChatColor.GRAY + "====================================================");
		}
		return false;
	}
}