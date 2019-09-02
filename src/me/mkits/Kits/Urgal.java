package me.mkits.Kits;

import me.mkits.Main.Main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Urgal implements CommandExecutor {
	
	private Main plugin;
	public Urgal(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("urgal") && sender.hasPermission("KitPvP.urgal")){
			
			// Create variables
			Player p = (Player) sender;
			Inventory inv = p.getInventory();
			if(plugin.kit.contains(p.getName())) {
				p.sendMessage(ChatColor.RED + "You can only use one kit per life!");
			} else {
			plugin.kit.add(p.getName());
			// Clear Inventory
			inv.clear();
			
			//Remove Potion Effects
			for (PotionEffect effect : p.getActivePotionEffects())
		        p.removePotionEffect(effect.getType());
			
			// Send the player a message
			String urgal = plugin.getConfig().getString("urgalmsg");
String prefixmsg = plugin.getConfig().getString("prefixmsg");
			
			p.sendMessage(ChatColor.GOLD + "[" + ChatColor.RED + "" + prefixmsg + ChatColor.GOLD + "] " + ChatColor.GOLD + " " + urgal);
			
			// List Items
			ItemStack sword = new ItemStack(Material.WOODEN_SWORD);
			
			
			
            // List armor
            ItemStack helm = new ItemStack(Material.LEATHER_HELMET);
            ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
            ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS);
            ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
            
            // Enchant any items 
            sword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
            helm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
            chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            legs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
            boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            
            // Add any potion effects
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100000000, 1));
            
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
		}
		return false;
}
}