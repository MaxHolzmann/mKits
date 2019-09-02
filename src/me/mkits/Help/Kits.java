package me.mkits.Help;

import me.mkits.Main.*;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kits implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	public Kits(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("kits")) {
			Player p = (Player) sender;
            StringBuilder kitsyes = new StringBuilder();
            StringBuilder kitsno = new StringBuilder();
            String[] Kits = new String[] { "PvP", "Archer", "Elite", "Blaze", "Dwarf", "Fisherman", "Grandpa", "Knight", "Ninja", "Scout", "Sniper", "Sonic", "Tank", "Urgal", "Viking", "Viper", "Voter"   };
            for (String kit : Kits) {
                if (p.hasPermission("kitpvp." + kit.toLowerCase())) {
                	kitsyes.append(ChatColor.GREEN+kit+", ");
                }
                else {
                	kitsno.append(ChatColor.RED+kit+", ");
                }
            }
 
            p.sendMessage(ChatColor.GRAY + "Your Kits: " + kitsyes.toString());
            p.sendMessage(ChatColor.GRAY + "Other Kits: " + kitsno.toString());
        }
		return false;
	}
}