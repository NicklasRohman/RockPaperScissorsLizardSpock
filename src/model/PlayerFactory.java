package model;

public class PlayerFactory {
	
	public PlayerFactory() {
	}
	
	
	public PlayerInterface getPlayer(String playerName) {
		if (playerName == null) {
			return null;
		}
		if (playerName.equalsIgnoreCase("AI")) {
			return new Ai("Ai");

		} else  {
			return new Human(playerName);

		}
	}
}
