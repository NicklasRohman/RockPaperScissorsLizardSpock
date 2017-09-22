package controller;

import model.Ai;
import model.ButtonPressedEvent;
import model.ButtonPressedListener;
import model.Human;
import view.GUI;
import view.NameBox;
import view.ResultBox;

public class GamePlay implements ButtonPressedListener {

	public static GamePlay gp = null;
	private static GUI gui;

	// PlayerFactory playerFactory = new PlayerFactory();
	// Human human = new Human();
	static Human human;
	static Ai ai;

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
		human = Human.getInstance();
		ai = Ai.getInstance();

		switch (event.getPressedButton()) {
		case 0:
			ai.aiCalculateAnswer();
			human.setAnswerRock(human.getAnswerRock() + 1);
			human.setHumanAnswer("rock");
			break;
		case 1:
			ai.aiCalculateAnswer();
			human.setAnswerPaper(human.getAnswerPaper() + 1);
			human.setHumanAnswer("paper");
			break;
		case 2:
			ai.aiCalculateAnswer();
			human.setAnswerScissors(human.getAnswerScissors() + 1);
			human.setHumanAnswer("scissors");
			break;
		case 3:
			ai.aiCalculateAnswer();
			human.setAnswerLizard(human.getAnswerLizard() + 1);
			human.setHumanAnswer("lizard");
			break;
		case 4:
			ai.aiCalculateAnswer();
			human.setAnswerSpock(human.getAnswerSpock() + 1);
			human.setHumanAnswer("spock");
			break;
		case 5:
			gui.helpButton();
			break;

		default:
			System.out.println("No index");

			break;
		}
		resultGame();
	}

	public void startGame() {
		DataBas databas = DataBas.getInstance();
		NameBox namebox = NameBox.getInstance();

		String name = namebox.display("Vad heter du då?");
		databas.lookForPlayer(name);

	}

	public void resultGame() {
		ResultBox resultbox = ResultBox.getInstance();
		resultbox.display();
	}

}
