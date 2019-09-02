package me.mkits.Help;

import me.mkits.Main.*;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Pl implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	public Pl(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("pl")){
			
			//Defines Variables
			Player p = (Player) sender;
			
			//Send message
			p.sendMessage("Plugins (1): " + ChatColor.GREEN + "KitPvP");
		}
		return false;
	}
}
		