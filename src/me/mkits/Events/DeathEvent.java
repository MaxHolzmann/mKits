package me.mkits.Events;

import me.mkits.Main.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEvent implements Listener{
	
		
	
 
       
	public Main plugin;
	  public DeathEvent(Main instance) {
	    this.plugin = instance;
        }
	  	  
	  
        @EventHandler
        public void onPlayerInteract(PlayerDeathEvent e){     
        	Player p = e.getEntity();
        	Player t = p.getKiller();
        	e.getDrops().clear();           
        	plugin.kit.remove(p.getName());
        	if(e.getEntity() instanceof Player) {
        		if(e.getDeathMessage().contains("slain")) {
        			e.setDeathMessage(null);
        			Main.economy.depositPlayer(t, 300);
        		} else {
        			if(e.getDeathMessage().contains("shot")) {
        				e.setDeathMessage(null);
            			
        			}        	        			
        	}

          }
        }
}

       