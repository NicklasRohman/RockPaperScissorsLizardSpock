package model;

/**
 * @author Nicklas This class should only contain things whit the simple Ai player.
 */
public class Ai extends AbstractAi {

	private String name = "Simple Ai";
	private String answer;

	static Ai ai;

	private Ai() {
	}

	/**
	 * Singleton pattern, it can only be one Ai player.
	 * 
	 * @return ai
	 */
	public static Ai getInstance() {
		if (ai == null) {
			ai = new Ai();
		}
		return ai;
	}

	public void aiCalculateAnswer() {
		this.answer = theAnswer();
	}

	/**
	 * gets the name of Ai
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
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
	 * @param aiAnswer
	 *            the aiAnswer to set
	 */
	public void setAiAnswer(String aiAnswer) {
		this.answer = aiAnswer;
	}

	/**
	 * 	calculating a answer for the Ai
	 * @return a answer against the player
	 */
	public String theAnswer() {
		MostOfClass moc = new MostOfClass();
		int rock = humenPlayer.getAnswerRock();
		int scissors = humenPlayer.getAnswerScissors();
		int paper = humenPlayer.getAnswerPaper();
		int lizard = humenPlayer.getAnswerLizard();
		int spock = humenPlayer.getAnswerSpock();

		if ((rock > scissors) && (rock > paper) && (rock > lizard) && (rock > spock)) {
			answer = moc.mostRock();
		} else if ((scissors > rock) && (scissors > paper) && (scissors > lizard) && (scissors > spock)) {
			answer = moc.mostScissors();
		} else if ((paper > rock) && (paper > scissors) && (paper > lizard) && (paper > spock)) {
			answer = moc.mostPaper();
		} else if ((lizard > rock) && (lizard > scissors) && (lizard > paper) && (lizard > spock)) {
			answer = moc.mostLizard();
		} else if ((spock > rock) && (spock > scissors) && (spock > paper) && (spock > lizard)) {
			answer = moc.mostSpock();
		} else {
			switch (RandomClass.randomMethod(1, 5)) {
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

	

}