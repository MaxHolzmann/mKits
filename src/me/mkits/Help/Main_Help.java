package me.mkits.Help;

import me.mkits.Main.*;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Main_Help implements CommandExecutor {
	
	private Main plugin;
	public Main_Help(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("help")){
			
			//Defines Variables
			Player p = (Player) sender;
			
			String server = plugin.getConfig().getString("prefixmsg");
			
			//Send message
			p.sendMessage(ChatColor.GOLD + server + ChatColor.WHITE + " Help");
			p.sendMessage(ChatColor.GRAY + "====================================================");
			p.sendMessage(ChatColor.GOLD + "/kits" + ChatColor.WHITE + " - Find out what kits you have!");
			p.sendMessage(ChatColor.GOLD + "/who" + ChatColor.WHITE + " - List all the online players!");
			p.sendMessage(ChatColor.GOLD + "/rules" + ChatColor.WHITE + " - Lists all the rules!");
			p.sendMessage(ChatColor.GOLD + "/events" + ChatColor.WHITE + " - Lists all the events on the server!");
			p.sendMessage(ChatColor.GRAY + "====================================================");
		}
		return false;
	}
}
		