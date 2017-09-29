package model;

/**
 * @author Nicklas This class should only contain things whit the Easy Ai player.
 */
public class EasyAi extends AbstractAi implements INewAi {

	private String answer;
	
	/**
	 * Calculating a answer
	 */
	public void aiCalculateAnswer() {
		this.answer = theAnswer();
	}

	/**
	 * gets what the Ai answered
	 * 
	 * @return the aiAnswer
	 */
	public String getAiAnswer() {
		return answer;
	}

	/**
	 * 	calculating a answer for the Ai
	 * @return a answer against the player
	 */
	public String theAnswer() {
		int rock = humanPlayer.getAnswerRock();
		int scissors = humanPlayer.getAnswerScissors();
		int paper = humanPlayer.getAnswerPaper();
		int lizard = humanPlayer.getAnswerLizard();
		int spock = humanPlayer.getAnswerSpock();

		if ((rock > scissors) && (rock > paper) && (rock > lizard) && (rock > spock)) {
			answer = mostRock();
		} else if ((scissors > rock) && (scissors > paper) && (scissors > lizard) && (scissors > spock)) {
			answer = mostScissors();
		} else if ((paper > rock) && (paper > scissors) && (paper > lizard) && (paper > spock)) {
			answer = mostPaper();
		} else if ((lizard > rock) && (lizard > scissors) && (lizard > paper) && (lizard > spock)) {
			answer = mostLizard();
		} else if ((spock > rock) && (spock > scissors) && (spock > paper) && (spock > lizard)) {
			answer = mostSpock();
		} else {
			switch (randomMethod(1, 5)) {
			case 1:
				return "rock";
			case 2:
				return "scissors";
			case 3:
				return "paper";
			case 4:
				return "lizard";
			case 5:
				return "spock";
			default:
				break;
			}
		}
		return answer;
	}

	/**
	 * Sends back the AiLevel
	 */
	@Override
	public int getAiLevel() {
		return 1;
	}

}