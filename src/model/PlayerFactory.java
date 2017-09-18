package model;

public class PlayerFactory {
	
	public PlayerFactory() {
	}
	
	
	public playerInterface getPlayer(String playerName) {
		if (playerName == null) {
			return null;
		}
		if (playerName.equalsIgnoreCase("AI")) {
			return new Ai();

		} else  {
			return new Human();

		}
	}
}
