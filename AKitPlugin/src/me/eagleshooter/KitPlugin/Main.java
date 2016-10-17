package me.eagleshooter.KitPlugin;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.eagleshooter.KitPlugin.Commands.KitCommand;
import me.eagleshooter.KitPlugin.Commands.KitEditorCommand;
import me.eagleshooter.KitPlugin.GUI.GUIEditorKitCloseEvent;
import me.eagleshooter.KitPlugin.GUI.GUIKitMenuClickEvent;

public class Main extends JavaPlugin {
	
	MySQL mysql = MySQL.getInstance();
	
	public void onEnable() {
		mysql.establishConnection();
		PluginManager pm = getServer().getPluginManager();
		
		//@RegisterEvents
		pm.registerEvents(new GUIKitMenuClickEvent(), this);
		pm.registerEvents(new GUIEditorKitCloseEvent(), this);
		
		//@RegisterCommands
		getCommand("kit").setExecutor(new KitCommand());
		getCommand("kiteditor").setExecutor(new KitEditorCommand());
		
	}
	
	public void onDisable() {
	}

}
