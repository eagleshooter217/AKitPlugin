package me.eagleshooter.KitPlugin.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import me.eagleshooter.KitPlugin.SettingsManager;

public class GUI {
	
	SettingsManager settings = SettingsManager.getInstance();
	GUIItemStacks GUIItems = GUIItemStacks.getInstance();
	
	private GUI() { }
	
	static GUI instance = new GUI();
	   
    public static GUI getInstance() {
            return instance;
    }
    
    //@Opens Kit Selector
    public void openSelector(Player p) {
    	
    	Inventory Menu = Bukkit.createInventory(null, 27, ChatColor.DARK_GRAY + "Kit Selector");
    	
    	Menu.setItem(11, GUIItems.kit1());
    	Menu.setItem(13, GUIItems.kit2());
    	Menu.setItem(15, GUIItems.kit3());
    	
    	
    	Menu.setItem(0, GUIItems.glass());
    	Menu.setItem(1, GUIItems.glass());
    	Menu.setItem(2, GUIItems.glass());
    	Menu.setItem(3, GUIItems.glass());
    	Menu.setItem(4, GUIItems.glass());
    	Menu.setItem(5, GUIItems.glass());
    	Menu.setItem(6, GUIItems.glass());
    	Menu.setItem(7, GUIItems.glass());
    	Menu.setItem(8, GUIItems.glass());
    	
    	Menu.setItem(9, GUIItems.glass());
    	Menu.setItem(17, GUIItems.glass());
    	
    	Menu.setItem(18, GUIItems.glass());
    	Menu.setItem(19, GUIItems.glass());
    	Menu.setItem(20, GUIItems.glass());
    	Menu.setItem(21, GUIItems.glass());
    	Menu.setItem(22, GUIItems.glass());
    	Menu.setItem(23, GUIItems.glass());
    	Menu.setItem(24, GUIItems.glass());
    	Menu.setItem(25, GUIItems.glass());
    	Menu.setItem(26, GUIItems.glass());
    	
    	p.openInventory(Menu);
    	
    	return;
    }
    
    //@Opens Kit Editor
    public void openEditor(Player p) {
    	
    	Inventory Menu = Bukkit.createInventory(null, 27, ChatColor.DARK_GRAY + "Kit Editor");
    	
    	Menu.setItem(11, GUIItems.kit1());
    	Menu.setItem(13, GUIItems.kit2());
    	Menu.setItem(15, GUIItems.kit3());
    	
    	
    	Menu.setItem(0, GUIItems.glass());
    	Menu.setItem(1, GUIItems.glass());
    	Menu.setItem(2, GUIItems.glass());
    	Menu.setItem(3, GUIItems.glass());
    	Menu.setItem(4, GUIItems.glass());
    	Menu.setItem(5, GUIItems.glass());
    	Menu.setItem(6, GUIItems.glass());
    	Menu.setItem(7, GUIItems.glass());
    	Menu.setItem(8, GUIItems.glass());
    	
    	Menu.setItem(9, GUIItems.glass());
    	Menu.setItem(17, GUIItems.glass());
    	
    	Menu.setItem(18, GUIItems.glass());
    	Menu.setItem(19, GUIItems.glass());
    	Menu.setItem(20, GUIItems.glass());
    	Menu.setItem(21, GUIItems.glass());
    	Menu.setItem(22, GUIItems.glass());
    	Menu.setItem(23, GUIItems.glass());
    	Menu.setItem(24, GUIItems.glass());
    	Menu.setItem(25, GUIItems.glass());
    	Menu.setItem(26, GUIItems.glass());
    	
    	p.openInventory(Menu);
    	return;
    }
    
    //@Opens Kit Editor For A Kit
    public void openEditorKit(Player p, String kitname) {
    	
    	Inventory Menu = Bukkit.createInventory(null, 27, ChatColor.DARK_GRAY + "Kit Editor: " + kitname);
    	
    	p.openInventory(Menu);
    	
    	return;
    }

}
