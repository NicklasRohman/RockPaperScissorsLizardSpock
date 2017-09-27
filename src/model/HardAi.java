package model;

/**
 * 
 * @author Nicklas class for the smart AI, it will take the answer from player
 *         before making any move.
 */
public class HardAi extends AbstractAi {

	String humanAnswer;
	String aiName;
	String aiAnswer;


	static HardAi hardAi;

	private HardAi() {
	}

	/**
	 * Singleton pattern, it can only be one Ai player.
	 * 
	 * @return ai
	 */
	public static HardAi getInstance() {
		if (hardAi == null) {
			hardAi = new HardAi();
		}
		return hardAi;
	}

	@Override
	public String theAnswer() {
		humanAnswer = humanPlayer.getAnswer();

		if (humanAnswer.equalsIgnoreCase("rock")) {
			aiAnswer = mostRock();
		} else if (humanAnswer.equalsIgnoreCase("paper")) {
			aiAnswer = mostPaper();
		} else if (humanAnswer.equalsIgnoreCase("scissors")) {
			aiAnswer = mostScissors();
		} else if (humanAnswer.equalsIgnoreCase("lizard")) {
			aiAnswer = mostLizard();
		} else if (humanAnswer.equalsIgnoreCase("spock")) {
			aiAnswer = mostSpock();
		}

		return aiAnswer;
	}
}