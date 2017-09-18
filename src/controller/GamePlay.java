package controller;

import model.Ai;
import model.ButtonPressedEvent;
import model.ButtonPressedListener;
import model.Human;
import model.PlayerFactory;
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
		DataBas databas = DataBas.getInstance();
		databas.startDB();
		//
		// Ai ai = playerFactory.getPlayer("Ai");
		// Human human = playerFactory.getPlayer(name);

		gui = new GUI();
		gui.startGui(args);

		PlayerFactory playerFactory = new PlayerFactory();

	}

	@Override
	public void buttonPressed(ButtonPressedEvent event) {

		System.out.println(event.getPressedButton());

		switch (event.getPressedButton()) {
		case 0:

			break;

		case 1:

			break;

		case 2:

			break;

		case 3:

			break;
		case 4:

			break;

		case 5:
			gui.helpButton();
			break;

		case 6:
			gui.quitButton();
			break;

		default:
			System.out.println("No index");

			break;
		}

	}

}
