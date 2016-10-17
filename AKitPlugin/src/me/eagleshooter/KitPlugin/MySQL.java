package me.eagleshooter.KitPlugin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MySQL {
	
    private MySQL() { }
    
    static MySQL instance = new MySQL();
   
    public static MySQL getInstance() {
            return instance;
    }
	
	
	private Connection connection;
	private String connectionStr = "jdbc:mysql://mc.mysql.freaze.nl/ssd_5879?user=ssd_5879&password=27342624ac&autoReconnect=true";
	
	//@Connect to DataBase
	public void establishConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(connectionStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    
	//@Set kit to DataBase
    public void setKit(ArrayList<String> items, int a) {
        try {
                PreparedStatement statement = connection.prepareStatement("UPDATE test SET ItemStack='" + items.toString().replaceAll(", ", ",").replace("[", "").replace("]", "") + "' WHERE id=" + a);
                statement.executeUpdate();
                statement.close();
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
    
    //@Get kit from DataBase
    public String getKit(int a) {
        try {
                PreparedStatement statement = connection.prepareStatement("SELECT ItemStack FROM test WHERE id=" + a);
                ResultSet result = statement.executeQuery();
               
                if (result.next()) {
                        return result.getString("ItemStack");
                } else {
                        return null;
                }
        } catch (Exception e) {
                e.printStackTrace();
                return "[[Failed to connect]]";
        }
    }
	
}
