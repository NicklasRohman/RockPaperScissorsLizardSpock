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

	public void startDB() {

		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		driverManagerSetup();
		try {
			rs = stmt.executeQuery("select * from test");

			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void createPlayer(String newPlayerName) {

		try {
			driverManagerSetup();
			stmt.executeUpdate("INSERT INTO PLAYERS VALUES('"+newPlayerName+"',0,0,0);");
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void lookForPlayer(String name) {

		try {
			driverManagerSetup();
			rs = stmt.executeQuery("select * from players");

			while (rs.next()) {
				if(rs.getString("name").equalsIgnoreCase(name)){
					System.out.println("player "+rs.getString("name")+" exist");
				}
				else{
					System.out.println("Creat new player");
		//			createPlayer(name);
				}
			}
			conn.close();
		} catch (SQLException e) {
			System.err.println("" + e.getMessage());
			System.err.println("" + e.getErrorCode());
			System.err.println("" + e.getSQLState());
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
