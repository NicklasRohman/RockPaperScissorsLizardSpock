package controller;

import model.ButtonPressedEvent;
import model.ButtonPressedListener;
import model.PlayerFactory;
import model.PlayerInterface;
import view.GUI;
import view.NameBox;

public class GamePlay implements ButtonPressedListener {

	public static GamePlay gp = null;
	private static GUI gui;

	private GamePlay() {
	}

	/**
	 * the method to get a instance of the class
	 */
	public static GamePlay getInstance() {
		if (gp == null) {
			gp = new GamePlay();
		}
		return gp;
	}

	public static void main(String[] args) {
		
		gui = new GUI();
		gui.startGui(args);
		
	}

	@Override
	public void buttonPressed(ButtonPressedEvent event) {

		System.out.println(event.getPressedButton());

		switch (event.getPressedButton()) {
		case 0:
			
		case 1:
		case 2:
		case 3:
		case 4:

			break;

		case 5:
			gui.helpButton();
			break;

		default:
			System.out.println("No index");

			break;
		}

	}

	public void startGame(){
		DataBas databas = DataBas.getInstance();
		NameBox namebox= NameBox.getInstance();
		PlayerFactory playerFactory = new PlayerFactory();
		
		String name = namebox.display("Vad heter du d�?");
		databas.lookForPlayer(name);
		
		PlayerInterface human =  playerFactory.getPlayer(name);
		PlayerInterface ai = playerFactory.getPlayer("Ai");
				
		
		
	}
	
	
	
}
