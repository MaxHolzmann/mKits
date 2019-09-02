package me.mkits.Events;


import me.mkits.Main.*;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class SlashSoup implements CommandExecutor, Listener {
	
	
 	   
 	   
    

	
	private Main plugin;
	public SlashSoup(Main plugin) {
		this.plugin = plugin;
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("soup") && sender.hasPermission("KitPvP.soup")){
			final Player p = (Player) sender;
			final Inventory inv = p.getInventory();
			
			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 0));
			p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 10, 0));
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 10, 0));
			
			new BukkitRunnable() {
          	  public void run() {
          		  p.removePotionEffect(PotionEffectType.SLOW);
          		p.removePotionEffect(PotionEffectType.CONFUSION);
          		p.removePotionEffect(PotionEffectType.BLINDNESS);
          		
          		ItemStack getSoup = new ItemStack(Material.MUSHROOM_STEW, 1);		    
                for(int i=1; i <=8; i++)
                 	inv.addItem(getSoup);
          	  }
          	}.runTaskLater(plugin, 100);
		}
		return false;
	}
}
		
			