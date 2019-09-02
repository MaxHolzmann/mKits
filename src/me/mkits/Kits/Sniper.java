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

public class Sniper implements CommandExecutor {
	
	private Main plugin;
	public Sniper(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("sniper") && sender.hasPermission("KitPvP.sniper")){
			
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
			String sniper = plugin.getConfig().getString("snipermsg");
String prefixmsg = plugin.getConfig().getString("prefixmsg");
			
			p.sendMessage(ChatColor.GOLD + "[" + ChatColor.RED + "" + prefixmsg + ChatColor.GOLD + "] " + ChatColor.GOLD + " " + sniper);
			
			// List Items
			ItemStack sword = new ItemStack(Material.STONE_SWORD);
			ItemStack bow = new ItemStack(Material.BOW);
			ItemStack arrow = new ItemStack(Material.ARROW, 10);
			
			
            // List armor
            ItemStack helm = new ItemStack(Material.AIR);
            ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemStack legs = new ItemStack(Material.AIR);
            ItemStack boots = new ItemStack(Material.AIR);
            
            // Enchant any items 
            sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
            bow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 10);
            
            // Add any potion effects
            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100000000, 0));
            
            // Add items to inventory (weapons first.)
            inv.addItem(sword);
            inv.addItem(bow);
            
         // List & add Soup (Make the "<=35>" less if you have more than 1 item)
         			ItemStack getSoup = new ItemStack(Material.MUSHROOM_STEW, 1);		    
                     for(int i=1; i <=33; i++)
                     	inv.addItem(getSoup);     
                        inv.addItem(arrow);
            
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