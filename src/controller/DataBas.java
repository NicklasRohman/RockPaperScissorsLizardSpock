package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Human;

public class DataBas {

	Human human;
	Connection conn;
	Statement stmt;
	ResultSet rs;

	private String url = "jdbc:h2:tcp://localhost:9092/";
	private String user = "Nicklas";
	private String pass = "Rohman";

	public static DataBas databas = null;

	private DataBas() {
	}

	/**
	 * the method to get a instance of the class
	 */
	public static DataBas getInstance() {
		if (databas == null) {
			databas = new DataBas();
		}
		return databas;
	}

	private void createPlayer(String newPlayerName) {

		try {
			driverManagerSetup();
			stmt.executeUpdate("INSERT INTO PLAYERS VALUES('" + newPlayerName + "',0,0,0);");

			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void lookForPlayer(String name) {
		
		try {
			driverManagerSetup();
			rs = stmt.executeQuery("select * from players");
			boolean createNewPlayer = true;
			while (rs.next()) {
				if (rs.getString("name").equalsIgnoreCase(name)) {
					System.out.println("player " + rs.getString("name") + " exist");
					loadPlayer(name);
					createNewPlayer = false;
					break;
				}
			}

			if (createNewPlayer) {
				createPlayer(name);
			}

			conn.close();
		} catch (SQLException e) {
			System.err.println("" + e.getMessage());
			System.err.println("" + e.getErrorCode());
			System.err.println("" + e.getSQLState());
		}
	}

	private void loadPlayer(String name) {
		
		driverManagerSetup();
		try {
			rs = stmt.executeQuery("select * from players");
			human = new Human();	 
			
			while (rs.next()) {
				if (rs.getString("name").equalsIgnoreCase(name)) {
	            human.setName(name); 
	            human.setWin(rs.getInt("win"));
	            human.setLose(rs.getInt("lose"));
	            human.setDraw(rs.getInt("lose"));
	            System.out.println("player " +human.getName() +" har "+human.getWin() +" vinster "+human.getLose()+" förluster "+human.getDraw()+" oavgjorda matcher");
				break;
				}
			
			
			conn.close();
		}}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void savePlayer() {
		driverManagerSetup();
		human = new Human();
			try {
				rs = stmt.executeQuery("UPDATE players set win =" + human.getWin()+",lose = "+ human.getLose()+",draw = "+human.getDraw()+"where name = " + human.getName());
			} catch (SQLException e) {
				e.printStackTrace();
			}		
	}

	private void driverManagerSetup() {
		try {
			conn = DriverManager.getConnection(url + System.getProperty("user.home") + "/test", user, pass);
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
