package me.eagleshooter.KitPlugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.eagleshooter.KitPlugin.SettingsManager;
import me.eagleshooter.KitPlugin.GUI.GUI;

public class KitCommand implements CommandExecutor {

	SettingsManager settings = SettingsManager.getInstance();
	GUI gui = GUI.getInstance();

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		Player p = (Player) sender;
		
		if (!p.hasPermission("kit.openmenu")) {
			p.sendMessage(ChatColor.RED + "You do not have permissions to do that.");
			return true;
		}
		
		p.sendMessage(settings.smsg + ChatColor.GREEN + "Opened kit selector!");
		gui.openSelector(p);
		
		return true;
	}

}