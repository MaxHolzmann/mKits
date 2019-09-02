package me.mkits.Kits;



import me.mkits.Main.Main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;

public class Viper implements CommandExecutor, Listener {
	
	
 	   
 	   
    

	
	private Main plugin;
	public Viper(Main plugin) {
		this.plugin = plugin;
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("viper") && sender.hasPermission("KitPvP.viper")){
			
	
			// Create variables
			Player p = (Player) sender;
			Inventory inv = p.getInventory();
			if(plugin.kit.contains(p.getName())) {
				p.sendMessage(ChatColor.RED + "You can only use one kit per life!");
			} else {
			plugin.kit.add(p.getName());
	inv.clear();
			
			
			
			// Clear Inventor
				

	

			
			
			
			//Remove Potion Effects
			for (PotionEffect effect : p.getActivePotionEffects())
		        p.removePotionEffect(effect.getType());
			
			// Send the player a message
			String pvp = plugin.getConfig().getString("vipermsg");
String prefixmsg = plugin.getConfig().getString("prefixmsg");
			
			p.sendMessage(ChatColor.GOLD + "[" + ChatColor.RED + "" + prefixmsg + ChatColor.GOLD + "] " + ChatColor.GOLD + " " + pvp);
			
			// List Items
			ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
			
			
			
            // List armor
            ItemStack helm = new ItemStack(Material.IRON_HELMET);
            ItemStack chest = new ItemStack(Material.IRON_CHESTPLATE);
            ItemStack legs = new ItemStack(Material.IRON_LEGGINGS);
            ItemStack boots = new ItemStack(Material.IRON_BOOTS);
            
            // Enchant any items 
            sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
            
            // Add any potion effects
            
            // Add items to inventory (weapons first.)
            inv.addItem(sword);
            
         // List & add Soup (Make the "<=35>" less if you have more than 1 item)
            
         			ItemStack getSoup = new ItemStack(Material.MUSHROOM_STEW, 1);		    
                     for(int i=1; i <=35; i++)
                     	inv.addItem(getSoup);
                     
                     
            
            //Put armor on player
            ((PlayerInventory) inv).setHelmet(helm);
            ((PlayerInventory)inv).setChestplate(chest);
            ((PlayerInventory)inv).setLeggings(legs);
            ((PlayerInventory)inv).setBoots(boots);
            
            
		}
		{
	}
}
		return false;
}
}

            
 
