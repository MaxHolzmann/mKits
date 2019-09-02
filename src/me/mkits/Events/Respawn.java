package me.mkits.Events;
 
import java.util.ArrayList;

import me.mkits.Main.*;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;

public class Respawn implements Listener{
	
	ArrayList<String> life = new ArrayList<String>();
	


        public Main plugin;
       
        public Respawn(Main instance){
                plugin = instance;
        }
       
        @EventHandler
        public void onFoodLevelChange(PlayerRespawnEvent e){
        	Player p = e.getPlayer();
        	
        	for (PotionEffect effect : p.getActivePotionEffects())
		        p.removePotionEffect(effect.getType());
        	
        	ItemStack gui = new ItemStack(Material.NETHER_STAR);
        	ItemMeta mgui = gui.getItemMeta();
        	mgui.setDisplayName(ChatColor.GREEN + "Select a kit!");
        	gui.setItemMeta(mgui);
        	// p.getInventory().addItem(gui);
        	
      
        			
        }
}
       