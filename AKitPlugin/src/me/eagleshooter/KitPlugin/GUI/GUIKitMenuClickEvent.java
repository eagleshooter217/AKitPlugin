package me.eagleshooter.KitPlugin.GUI;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import me.eagleshooter.KitPlugin.MySQL;
import me.eagleshooter.KitPlugin.SettingsManager;

public class GUIKitMenuClickEvent implements Listener {
	
	MySQL mysql = MySQL.getInstance();
	SettingsManager settings = SettingsManager.getInstance();
	GUIItemStacks GUIItems = GUIItemStacks.getInstance();
	GUI gui = GUI.getInstance();
	
	
	//@Click Events For Kit Selector
	@EventHandler	
	public void InventoryClick(InventoryClickEvent e) {
		
		Player p = (Player) e.getWhoClicked();
		
		if (e.getInventory().getName().equalsIgnoreCase(ChatColor.DARK_GRAY + "Kit Selector")) {
			
			e.setCancelled(true);
			
			if (e.getCurrentItem() == null) return;
	    	if (e.getCurrentItem().getItemMeta() == null) return;
	    	if (e.getCurrentItem().getItemMeta().getDisplayName() == null) return;
	    	
	    	
	    	if (e.getCurrentItem().equals(GUIItems.kit1())) {
	    		p.closeInventory();
	    		giveKit(p, 1);
	    		p.sendMessage(settings.smsg + ChatColor.GREEN + "You selected kit " + ChatColor.YELLOW + "1" + ChatColor.GREEN + "!");
	    		return;
	    	}
	    	if (e.getCurrentItem().equals(GUIItems.kit2())) {
	    		p.closeInventory();
	    		giveKit(p, 2);
	    		p.sendMessage(settings.smsg + ChatColor.GREEN + "You selected kit " + ChatColor.YELLOW + "2" + ChatColor.GREEN + "!");
	    		return;
	    	}
	    	if (e.getCurrentItem().equals(GUIItems.kit3())) {
	    		p.closeInventory();
	    		giveKit(p, 3);
	    		p.sendMessage(settings.smsg + ChatColor.GREEN + "You selected kit " + ChatColor.YELLOW + "3" + ChatColor.GREEN + "!");
	    		return;
	    	}
	    	
	    	
	    	
	    	
			return;
		}
		
		
		//@Click Events For Kit Editor
		if (e.getInventory().getName().equalsIgnoreCase(ChatColor.DARK_GRAY + "Kit Editor")) {
			
			e.setCancelled(true);
			
			if (e.getCurrentItem() == null) return;
	    	if (e.getCurrentItem().getItemMeta() == null) return;
	    	if (e.getCurrentItem().getItemMeta().getDisplayName() == null) return;
	    	
	    	if (e.getCurrentItem().equals(GUIItems.kit1())) {
	    		p.closeInventory();
	    		gui.openEditorKit(p, ChatColor.stripColor(e.getCurrentItem().getItemMeta().getDisplayName()));
	    		p.sendMessage(settings.smsg + ChatColor.GREEN + "Your now editing kit " + ChatColor.YELLOW + "1" + ChatColor.GREEN + "!");
	    		return;
	    	}
	    	if (e.getCurrentItem().equals(GUIItems.kit2())) {
	    		p.closeInventory();
	    		gui.openEditorKit(p, ChatColor.stripColor(e.getCurrentItem().getItemMeta().getDisplayName()));
	    		p.sendMessage(settings.smsg + ChatColor.GREEN + "Your now editing kit " + ChatColor.YELLOW + "2" + ChatColor.GREEN + "!");
	    		return;
	    	}
	    	if (e.getCurrentItem().equals(GUIItems.kit3())) {
	    		p.closeInventory();
	    		gui.openEditorKit(p, ChatColor.stripColor(e.getCurrentItem().getItemMeta().getDisplayName()));
	    		p.sendMessage(settings.smsg + ChatColor.GREEN + "Your now editing kit " + ChatColor.YELLOW + "3" + ChatColor.GREEN + "!");
	    		return;
	    	}
	    	
	    	
	    	
	    	
			return;
		}
		return;
	}
	
	
	//@Give Kit Method
	public void giveKit(Player p, int d) {
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(mysql.getKit(d).split(",")));
		for (String i : myList) {
			if (i.equals("")) return;
			
			String[] s = i.split(" ");
			
			Material material = Material.matchMaterial(s[0]);
			int amount = Integer.parseInt(s[1]);
			
			ItemStack item = new ItemStack(material, amount);
			
			p.getInventory().addItem(item);
			
		}
		return;
	}

}
