package model;

/**
 * 
 * @author Nicklas class for the smart AI, it will take the answer from player
 *         before making any move.
 */
public class SmartAi extends AbstractAi {

	String humanAnswer;
	String aiName;
	String aiAnswer;

	MostOfClass moc = new MostOfClass();

	static SmartAi smartAi;

	private SmartAi() {
	}

	/**
	 * Singleton pattern, it can only be one Ai player.
	 * 
	 * @return ai
	 */
	public static SmartAi getInstance() {
		if (smartAi == null) {
			smartAi = new SmartAi();
		}
		return smartAi;
	}

	
	
	
	@Override
	public String theAnswer() {
		humanAnswer = humenPlayer.getAnswer();

		if (humanAnswer.equalsIgnoreCase("rock")) {
			aiAnswer = moc.mostRock();
		} else if (humanAnswer.equalsIgnoreCase("paper")) {
			aiAnswer = moc.mostPaper();
		} else if (humanAnswer.equalsIgnoreCase("scissors")) {
			aiAnswer = moc.mostScissors();
		} else if (humanAnswer.equalsIgnoreCase("lizard")) {
			aiAnswer = moc.mostLizard();
		} else if (humanAnswer.equalsIgnoreCase("spock")) {
			aiAnswer = moc.mostSpock();
		}

		return aiAnswer;
	}
}