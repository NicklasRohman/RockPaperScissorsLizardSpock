package controller;

import model.AiFactory;
import model.ButtonPressedEvent;
import model.ButtonPressedListener;
import model.Human;
import model.INewAi;
import view.GUI;
import view.HelpBox;
import view.NameBox;
import view.ResultBox;

/**
 * 
 * @author Nicklas This class starts the game and is the controller over the
 *         game.
 */
public class GamePlay implements ButtonPressedListener {

	static GamePlay gp = null;
	static GUI gui;

	static Human human;

	int ailevel = 1;
	int AiIntAnswer;

	AiFactory aiFactory = new AiFactory();
	INewAi easyAi = aiFactory.makingAAI("Easy");
	INewAi normalAi = aiFactory.makingAAI("Normal");
	INewAi hardAi = aiFactory.makingAAI("hard");

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

	/**
	 * Main method starts up the application
	 * 
	 * @param args
	 *            = null
	 */
	public static void main(String[] args) {

		gui = new GUI();
		gui.startGui(args);

	}

	/**
	 * Method that starts the game
	 */
	public void startGame() {
		DataBas databas = DataBas.getInstance();
		NameBox namebox = NameBox.getInstance();

		String name = namebox.display("Vad heter du då?");
		databas.lookForPlayer(name);

	}

	/**
	 * method that will show how is the winner
	 */
	public void resultGame() {
		ResultBox resultbox = ResultBox.getInstance();
		int HumanIntAnswer = makeAnswerToIntValue(human.getHumanAnswer());
		String theWinnerIs = calculateHowWins(HumanIntAnswer, AiIntAnswer);

		gui.labelText();
		if (ailevel == 3) {
			resultbox.display(theWinnerIs, hardAi);
		} else if (ailevel == 2) {
			resultbox.display(theWinnerIs, normalAi);
		} else {
			resultbox.display(theWinnerIs, easyAi);
		}
	}

	/**
	 * method that know what to do whit the button player just pressed.
	 */
	@Override
	public void buttonPressed(ButtonPressedEvent event) {
		human = Human.getInstance();

		switch (event.getPressedButton()) {
		case 0:

			human.setAnswerRock(human.getAnswerRock() + 1);
			human.setHumanAnswer("rock");
			whatAiLevel(ailevel);
			resultGame();
			break;
		case 1:
			human.setAnswerPaper(human.getAnswerPaper() + 1);
			human.setHumanAnswer("paper");
			whatAiLevel(ailevel);
			resultGame();
			break;
		case 2:
			human.setAnswerScissors(human.getAnswerScissors() + 1);
			human.setHumanAnswer("scissors");
			whatAiLevel(ailevel);
			resultGame();
			break;
		case 3:
			human.setAnswerLizard(human.getAnswerLizard() + 1);
			human.setHumanAnswer("lizard");
			whatAiLevel(ailevel);
			resultGame();
			break;
		case 4:
			human.setAnswerSpock(human.getAnswerSpock() + 1);
			human.setHumanAnswer("spock");
			whatAiLevel(ailevel);
			resultGame();
			break;
		case 5:
			HelpBox help = HelpBox.getInstance();
			help.display();
			break;
		case 6:
			ailevel = easyAi.getAiLevel();
			break;
		case 7:
			ailevel = normalAi.getAiLevel();
			break;
		case 8:
			ailevel = hardAi.getAiLevel();
			break;
		default:
			System.out.println("No index");
			break;
		}

	}

	/**
	 * Method how calculate how will win
	 * @param humanIntAnswer
	 * @param aiIntAnswer
	 * @return
	 */
	private String calculateHowWins(int humanIntAnswer, int aiIntAnswer) {
		int result = (5 + humanIntAnswer - aiIntAnswer) % 5;
		if ((result == 1) || result == 3) {
			human.setWin(human.getWin() + 1);
			return human.getName();
		} else if ((result == 2) || result == 4) {
			human.setLose(human.getLose() + 1);
			return "Ai";
		} else {
			human.setDraw(human.getDraw() + 1);
			return "It's a Tie";
		}
	}

	/**
	 * This method convert the answer into a integer
	 * @param answer from one of the player
	 * @return a integer between 0-4 dependent on answer
	 */
	private int makeAnswerToIntValue(String answer) {
		if (answer.equalsIgnoreCase("rock")) {
			return 0;
		} else if (answer.equalsIgnoreCase("paper")) {
			return 1;
		} else if (answer.equalsIgnoreCase("scissors")) {
			return 2;
		} else if (answer.equalsIgnoreCase("spock")) {
			return 3;
		} else {
			return 4;
		}
	}

	/**
	 * make a answer based on Ai level
	 * @param level of Ai
	 */
	public void whatAiLevel(int level) {
		if (level == 3) {
			hardAi.aiCalculateAnswer();
			AiIntAnswer = makeAnswerToIntValue(hardAi.getAiAnswer());
		} else if (level == 2) {
			normalAi.aiCalculateAnswer();
			AiIntAnswer = makeAnswerToIntValue(normalAi.getAiAnswer());
		} else {
			easyAi.aiCalculateAnswer();
			AiIntAnswer = makeAnswerToIntValue(easyAi.getAiAnswer());
		}

	}

}