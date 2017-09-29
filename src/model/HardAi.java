package model;

/**
 * 
 * @author Nicklas class for the smart AI, it will take the answer from player
 *         before making any move.
 */
public class HardAi extends AbstractAi implements INewAi{

	private String humanAnswer;
	private String aiAnswer;

	/**
	 * makes a decision and return a answer
	 */
	@Override
	public String theAnswer() {
		humanAnswer = humanPlayer.getHumanAnswer();
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
	
	/**
	 * Sends back the AiLevel
	 */
	@Override
	public int getAiLevel() {
		return 3;
	}

	/**
	 * Calculating a answer
	 */
	@Override
	public void aiCalculateAnswer() {
		this.aiAnswer = theAnswer();
	}

	/**
	 * return the aiAnswer
	 */
	@Override
	public String getAiAnswer() {
		return this.aiAnswer;
	}

}