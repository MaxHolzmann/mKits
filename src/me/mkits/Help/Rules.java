package me.mkits.Help;

import me.mkits.Main.*;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Rules implements CommandExecutor {
	
	private Main plugin;
	public Rules(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("rules")){
			
			//Defines Variables
			Player p = (Player) sender;
			
			//Send message
			String rule1 = plugin.getConfig().getString("rule1");
			p.sendMessage(ChatColor.GREEN + "[1] " + ChatColor.RED + " " + rule1);
			
			String rule2 = plugin.getConfig().getString("rule2");
			p.sendMessage(ChatColor.GREEN + "[2] " + ChatColor.RED + " " + rule2);
			
			String rule3 = plugin.getConfig().getString("rule3");
			p.sendMessage(ChatColor.GREEN + "[3] " + ChatColor.RED + " " + rule3);
			
			String rule4 = plugin.getConfig().getString("rule4");
			p.sendMessage(ChatColor.GREEN + "[4] " + ChatColor.RED + " " + rule4);
			
			String rule5 = plugin.getConfig().getString("rule5");
			p.sendMessage(ChatColor.GREEN + "[5] " + ChatColor.RED + " " + rule5);
			
			String rule6 = plugin.getConfig().getString("rule6");
			p.sendMessage(ChatColor.GREEN + "[6] " + ChatColor.RED + " " + rule6);
			
			String rule7 = plugin.getConfig().getString("rule7");
			p.sendMessage(ChatColor.GREEN + "[7] " + ChatColor.RED + " " + rule7);
			
			String rule8 = plugin.getConfig().getString("rule8");
			p.sendMessage(ChatColor.GREEN + "[8] " + ChatColor.RED + " " + rule8);
			
			String rule9 = plugin.getConfig().getString("rule9");
			p.sendMessage(ChatColor.GREEN + "[9] " + ChatColor.RED + " " + rule9);
			
			String rule10 = plugin.getConfig().getString("rule10");
			p.sendMessage(ChatColor.GREEN + "[10] " + ChatColor.RED + " " + rule10);
			
				
		}
		return false;
	}
}
		