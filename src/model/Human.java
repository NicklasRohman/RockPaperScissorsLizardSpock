package model;

public class Human implements PlayerInterface{
	String name;

	@Override
	public void createPlayer(String name) {
		System.out.println("Skapat en human");
		
	}

}
