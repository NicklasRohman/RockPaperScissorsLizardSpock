package controller;

import model.EasyAi;
import model.AbstractAi;
import model.ButtonPressedEvent;
import model.ButtonPressedListener;
import model.Human;
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

	// PlayerFactory playerFactory = new PlayerFactory();
	// Human human = new Human();
	static Human human;
	static EasyAi ai;

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
		int AiIntAnswer = makeAnswerToIntValue(ai.getAiAnswer());
		String theWinnerIs = calculateHowWins(HumanIntAnswer, AiIntAnswer);

		gui.labelText();
		resultbox.display(theWinnerIs);
	}

	/**
	 * method that know what to do whit the button player just pressed.
	 */
	@Override
	public void buttonPressed(ButtonPressedEvent event) {
		human = Human.getInstance();
		ai = EasyAi.getInstance();
		AbstractAi aiLevel;
		
		switch (event.getPressedButton()) {
		case 0:
			whatAiLevel();
			ai.aiCalculateAnswer();
			human.setAnswerRock(human.getAnswerRock() + 1);
			human.setHumanAnswer("rock");
			resultGame();
			break;
		case 1:
			ai.aiCalculateAnswer();
			human.setAnswerPaper(human.getAnswerPaper() + 1);
			human.setHumanAnswer("paper");
			resultGame();
			break;
		case 2:
			ai.aiCalculateAnswer();
			human.setAnswerScissors(human.getAnswerScissors() + 1);
			human.setHumanAnswer("scissors");
			resultGame();
			break;
		case 3:
			ai.aiCalculateAnswer();
			human.setAnswerLizard(human.getAnswerLizard() + 1);
			human.setHumanAnswer("lizard");
			resultGame();
			break;
		case 4:
			ai.aiCalculateAnswer();
			human.setAnswerSpock(human.getAnswerSpock() + 1);
			human.setHumanAnswer("spock");
			resultGame();
			break;
		case 5:
			helpButton();
			break;
		case 6:
			aiLevel = new AbstractAi() {
				@Override
				public void setAiLevel(int aiLevel) {
					super.setAiLevel(1);
				}
			};
			break;
		case 7:
			aiLevel = new AbstractAi() {
				@Override
				public void setAiLevel(int aiLevel) {
					super.setAiLevel(2);
				}
			};
			
			break;
		case 8:
			aiLevel = new AbstractAi() {
				@Override
				public void setAiLevel(int aiLevel) {
					super.setAiLevel(3);
				}
			};
						break;

		default:
			System.out.println("No index");

			break;
		}

	}

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
	 * Show the helpBox
	 */
	private void helpButton() {
		HelpBox help = HelpBox.getInstance();
		help.display();
	}

	public void whatAiLevel(){
		int aiLevelMove;
		AbstractAi abstractAi = new AbstractAi() {
			
		};
		if (true) {
			
		}
	}
	
	
}


