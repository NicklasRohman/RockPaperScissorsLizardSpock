package model;

import controller.DataBas;

public class Ai implements PlayerInterface{

	public Ai() {
	}
	
	@Override
	public void createPlayer(String name) {
//		DataBas db = DataBas.getInstance();
//		db.createPlayer("Ai");
		System.out.println("Skapat en AI");
	}
}
