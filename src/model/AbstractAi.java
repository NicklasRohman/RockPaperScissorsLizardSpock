package model;

/**
 * 
 * @author Nicklas abstract class for all the Ai we will have
 */
public abstract class AbstractAi extends Players implements AiAlgoritms , IRandomMethods{
	
	Human humanPlayer = Human.getInstance();
	/**
	 * Human have pushed rock mostly 
	 * @return paper or spock
	 */
	public String mostRock() {
		if (humanPlayer.getAnswerPaper() == humanPlayer.getAnswerSpock()) {
			switch (randomMethod(1, 2)) {
			case 1:
				return "paper";
			case 2:
				return "spock";
			default:
				break;
			}
		}
		if (humanPlayer.getAnswerPaper() > humanPlayer.getAnswerSpock()) {
			return "paper";
		} else {
			return "spock";
		}
	}

	/**
	 * Human have pushed paper mostly 
	 * @return scissors or lizard
	 */
	public String mostPaper() {
		if (humanPlayer.getAnswerScissors() == humanPlayer.getAnswerLizard()) {
			switch (randomMethod(1, 2)) {
			case 1:
				return "scissors";
			case 2:
				return "lizard";
			default:
				break;
			}
		}

		if (humanPlayer.getAnswerScissors() > humanPlayer.getAnswerLizard()) {
			return "scissors";
		} else {
			return "lizard";
		}

	}

	/**
	 * Human have pushed Spock mostly 
	 * @return paper or lizard
	 */
	public String mostSpock() {
		if (humanPlayer.getAnswerLizard() == humanPlayer.getAnswerPaper()) {
			switch (randomMethod(1, 2)) {
			case 1:
				return "lizard";
			case 2:
				return "paper";
			default:
				break;
			}
		}

		if (humanPlayer.getAnswerLizard() > humanPlayer.getAnswerPaper()) {
			return "lizard";
		} else {
			return "paper";
		}
	}

	/**
	 * Human have pushed lizard mostly 
	 * @return scissors or rock
	 */
	public String mostLizard() {
		if (humanPlayer.getAnswerRock() == humanPlayer.getAnswerScissors()) {
			switch (randomMethod(1, 2)) {
			case 1:
				return "rock";
			case 2:
				return "scissors";
			default:
				break;
			}
		}
		if (humanPlayer.getAnswerRock() > humanPlayer.getAnswerScissors()) {
			return "rock";
		} else {
			return "scissors";
		}

	}

	/**
	 * Human have pushed scissors mostly 
	 * @return rock or Spock
	 */
	public String mostScissors() {
		if (humanPlayer.getAnswerSpock() == humanPlayer.getAnswerRock()) {
			switch (randomMethod(1, 2)) {
			case 1:
				return "spock";
			case 2:
				return "rock";
			default:
				break;
			}
		}

		if (humanPlayer.getAnswerSpock() > humanPlayer.getAnswerRock()) {
			return "spock";
		} else {
			return "rock";
		}
	}

	/**
	 * random number between min and max
	 * returns a integer
	 */
	@Override
	public int randomMethod(int min, int max) {
			int test = rand.nextInt(max + 1 - min) + min;
			return test;
		}

}
