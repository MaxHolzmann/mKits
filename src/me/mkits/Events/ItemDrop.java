package me.mkits.Events;

import me.mkits.Main.Main;


import org.bukkit.Material;



import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class ItemDrop implements Listener {
	
	public ItemDrop(Main plugin) {
	}
	
	
	//copied this code - needs to be cleaned up.
	
	@EventHandler
	public void playerDropItem(PlayerDropItemEvent event) {
		
	if (event.getItemDrop().getItemStack().getType() == Material.BOWL
	|| (event.getItemDrop().getItemStack().getType() == Material.MUSHROOM_STEW || (event
	.getItemDrop().getItemStack().getType() == Material.IRON_BOOTS || (event
	.getItemDrop().getItemStack().getType() == Material.IRON_LEGGINGS || (event
	.getItemDrop().getItemStack().getType() == Material.IRON_CHESTPLATE || (event
	.getItemDrop().getItemStack().getType() == Material.IRON_HELMET || (event
	.getItemDrop().getItemStack().getType() == Material.LEATHER_BOOTS || (event
	.getItemDrop().getItemStack().getType() == Material.LEATHER_LEGGINGS
	|| (event.getItemDrop().getItemStack().getType() == Material.LEATHER_CHESTPLATE) || (event
	.getItemDrop().getItemStack().getType() == Material.LEATHER_HELMET || (event
	.getItemDrop().getItemStack().getType() == Material.IRON_SWORD || (event
	.getItemDrop().getItemStack().getType() == Material.DIAMOND_AXE))))))))))) {
		
	event.getItemDrop().remove();
	} else {
	event.setCancelled(true);
	event.getPlayer().sendMessage(" §4You can't drop that item!");
	}
	}
}
	


