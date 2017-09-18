package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBas {

	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public static DataBas db = null;
	
	private DataBas() {
	}

	/**
	 * the method to get a instance of the class
	 */
	public static DataBas getInstance() {
		if (db == null) {
			db = new DataBas();
		}
		return db;
	}
	
	public void startDB() {
	
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/"+System.getProperty("user.home")+"/test","Nicklas","Rohman");

			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from test");

			while(rs.next()){
				System.out.println(rs.getString("name"));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void createPlayer(String name){
		
		try {
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/"+System.getProperty("user.home")+"/test","Nicklas","Rohman");
			stmt = conn.createStatement();
			//rs = stmt.executeQuery("INSERT INTO Players VALUES("+name+",0,0,0);");

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
