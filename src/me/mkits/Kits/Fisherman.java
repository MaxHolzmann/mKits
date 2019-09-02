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

public class Fisherman implements CommandExecutor {
	
	private Main plugin;
	public Fisherman(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("fisherman") && sender.hasPermission("KitPvP.fisherman")){
			
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
			String fish = plugin.getConfig().getString("fishermanmsg");
			String prefixmsg = plugin.getConfig().getString("prefixmsg");
			
			p.sendMessage(ChatColor.GOLD + "[" + ChatColor.RED + "" + prefixmsg + ChatColor.GOLD + "] " + ChatColor.GOLD + " " + fish);
			
			// List Items
			ItemStack wepon = new ItemStack(Material.FISHING_ROD);
						
			
            // List armor
            ItemStack helm = new ItemStack(Material.IRON_HELMET);
            ItemStack chest = new ItemStack(Material.GOLDEN_CHESTPLATE);
            ItemStack legs = new ItemStack(Material.CHAINMAIL_LEGGINGS);
            ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
            
            // Enchant any items 
            wepon.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
            wepon.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
            wepon.addUnsafeEnchantment(Enchantment.KNOCKBACK, 3);
                       
            // Add any potion effects
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000000, 0));
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100000000, 0));
            
            // Add items to inventory (weapons first.)
            inv.addItem(wepon);
            
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