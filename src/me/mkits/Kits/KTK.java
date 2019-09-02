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

public class KTK implements CommandExecutor {
	
	private Main plugin;
	public KTK(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("ktk") && sender.hasPermission("KitPvP.ktk")){
			
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
			
			
			p.sendMessage(ChatColor.GOLD + "[" + ChatColor.RED + "MinecraftKits" + ChatColor.GOLD + "] " + ChatColor.GOLD + "You have equipped the KTK kit!");
			
			// List Items
			ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
			
			
			
            // List armor
			ItemStack helm = new ItemStack(Material.DIAMOND_HELMET);
			ItemStack chest = new ItemStack(Material.DIAMOND_HELMET);
            ItemStack legs = new ItemStack(Material.DIAMOND_LEGGINGS);
            ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
            
            
            // Enchant any items 
            sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
            sword.addUnsafeEnchantment(Enchantment.KNOCKBACK, 15);
            sword.addUnsafeEnchantment(Enchantment.DURABILITY, 69);
            helm.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
            helm.addUnsafeEnchantment(Enchantment.THORNS, 5);
            helm.addUnsafeEnchantment(Enchantment.DURABILITY, 69);
            chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
            chest.addUnsafeEnchantment(Enchantment.THORNS, 5);
            chest.addUnsafeEnchantment(Enchantment.DURABILITY, 69);
            legs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
            legs.addUnsafeEnchantment(Enchantment.THORNS, 5);
            legs.addUnsafeEnchantment(Enchantment.DURABILITY, 69);
            boots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
            boots.addUnsafeEnchantment(Enchantment.THORNS, 5);
            boots.addUnsafeEnchantment(Enchantment.DURABILITY, 69);
            
            // Add any potion effects
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 1));
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 1));
            p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999, 1));
            
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