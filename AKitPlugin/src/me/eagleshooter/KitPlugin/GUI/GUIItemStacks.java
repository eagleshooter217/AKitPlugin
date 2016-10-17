package me.eagleshooter.KitPlugin.GUI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.eagleshooter.KitPlugin.MySQL;

public class GUIItemStacks {
	
	MySQL mysql = MySQL.getInstance();

	private GUIItemStacks() { }
	
	static GUIItemStacks instance = new GUIItemStacks();
	   
    public static GUIItemStacks getInstance() {
            return instance;
    }
    
    
    //@All ItemStacks For Menu
    
    public ItemStack glass() {
		
		ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE, 1);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName("");
		List<String> lore = new ArrayList<String>();
		itemmeta.setLore(lore);
        item.setItemMeta(itemmeta);
        
		return item;
	}
    
	public ItemStack kit1() {
		
		ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Kit 1");
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "Kit 1 Contains:");
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(mysql.getKit(1).split(",")));
		for (String i : myList) {
			lore.add(ChatColor.DARK_GRAY + "\u25BA " + ChatColor.WHITE + i.toLowerCase());
		}
		itemmeta.setLore(lore);
        item.setItemMeta(itemmeta);
        
		return item;
	}
	
	public ItemStack kit2() {
		
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Kit 2");
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "Kit 2 Contains:");
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(mysql.getKit(2).split(",")));
		for (String i : myList) {
			lore.add(ChatColor.DARK_GRAY + "\u25BA " + ChatColor.WHITE + i.toLowerCase());
		}
		itemmeta.setLore(lore);
        item.setItemMeta(itemmeta);
        
		return item;
	}

	public ItemStack kit3() {
	
		ItemStack item = new ItemStack(Material.BOW, 1);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Kit 3");
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "Kit 3 Contains:");
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(mysql.getKit(3).split(",")));
		for (String i : myList) {
			lore.add(ChatColor.DARK_GRAY + "\u25BA " + ChatColor.WHITE + i.toLowerCase());
		}
		itemmeta.setLore(lore);
		item.setItemMeta(itemmeta);
    
	return item;
	}
    
    
    
    
}
