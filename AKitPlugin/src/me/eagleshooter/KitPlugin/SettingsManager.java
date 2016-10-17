package me.eagleshooter.KitPlugin;

import org.bukkit.ChatColor;

public class SettingsManager {
	 
    private SettingsManager() { }
   
    static SettingsManager instance = new SettingsManager();
   
    public static SettingsManager getInstance() {
            return instance;
    }
    
    public String smsg = ChatColor.DARK_GRAY + "[" + ChatColor.RED + "!" + ChatColor.DARK_GRAY + "]> ";


}