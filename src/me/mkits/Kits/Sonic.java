package me.mkits.Kits;

import me.mkits.Main.Main;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Sonic implements CommandExecutor {
	
	private Main plugin;
	public Sonic(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("sonic") && sender.hasPermission("KitPvP.sonic")){
			
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
			String pvp = plugin.getConfig().getString("sonicmsg");
String prefixmsg = plugin.getConfig().getString("prefixmsg");
			
			p.sendMessage(ChatColor.GOLD + "[" + ChatColor.RED + "" + prefixmsg + ChatColor.GOLD + "] " + ChatColor.GOLD + " " + pvp);
			
			// List Items
			ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
			
			
			
            // List armor
			ItemStack helm = new ItemStack(Material.LEATHER_HELMET, 1);
			LeatherArmorMeta meta = (LeatherArmorMeta) helm.getItemMeta();
			  meta.setColor(Color.AQUA);
			  helm.setItemMeta(meta);

            ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
            LeatherArmorMeta meta2 = (LeatherArmorMeta) chest.getItemMeta();
			  meta2.setColor(Color.AQUA);
			  chest.setItemMeta(meta2);
            
            
            ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS);
            LeatherArmorMeta meta3 = (LeatherArmorMeta) legs.getItemMeta();
			  meta3.setColor(Color.AQUA);
			  legs.setItemMeta(meta3);
            
            
            ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta meta4 = (LeatherArmorMeta) boots.getItemMeta();
			  meta4.setColor(Color.AQUA);
			  boots.setItemMeta(meta4);
            
            // Enchant any items 
            sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
            helm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            legs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            boots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            
            // Add any potion effects
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 1));
            
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