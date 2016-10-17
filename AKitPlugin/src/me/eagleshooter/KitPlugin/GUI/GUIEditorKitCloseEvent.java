package me.eagleshooter.KitPlugin.GUI;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

import me.eagleshooter.KitPlugin.MySQL;
import me.eagleshooter.KitPlugin.SettingsManager;

public class GUIEditorKitCloseEvent implements Listener {
	
	MySQL mysql = MySQL.getInstance();
	SettingsManager settings = SettingsManager.getInstance();
	
	
	//@Saves Kit On Close Inventory
	@EventHandler
    public void InventoryCloseEvent(InventoryCloseEvent e) {
		
		Player p = (Player) e.getPlayer();
		
		if (e.getInventory().getName().contains(ChatColor.DARK_GRAY + "Kit Editor:")) {
			
			int a = e.getInventory().getSize();
			
			ArrayList<String> items = new ArrayList<String>();
			
			int counter = 0;
			while (counter < a) {
				if (e.getInventory().getItem(counter) == null) {
					
				}else{
					items.add(e.getInventory().getItem(counter).getType() + " " + e.getInventory().getItem(counter).getAmount());
				}
				counter++;
			}
			String[] b = ChatColor.stripColor(e.getInventory().getName()).split(" ");
			int i = Integer.parseInt(b[3]);
			
			mysql.setKit(items, i);
			p.sendMessage(settings.smsg + ChatColor.GREEN + "Kit " + ChatColor.YELLOW + i + ChatColor.GREEN + " is now saved!");
			return;
		}
		return;
	}

}
