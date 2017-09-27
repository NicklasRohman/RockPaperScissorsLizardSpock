package model;

/**
 * 
 * @author Nicklas abstract class for all the Ai we will have
 */
public abstract class AbstractAi extends Players implements AiAlgoritms {
	
	private int aiLevel = 1;
	
	public String theAnswer() {
		return null;
	}

	Human humanPlayer = Human.getInstance();
	public String mostRock() {
		if (humanPlayer.getAnswerPaper() == humanPlayer.getAnswerSpock()) {
			switch (RandomClass.randomMethod(1, 2)) {
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

	public String mostPaper() {
		if (humanPlayer.getAnswerScissors() == humanPlayer.getAnswerLizard()) {
			switch (RandomClass.randomMethod(1, 2)) {
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

	public String mostSpock() {
		if (humanPlayer.getAnswerLizard() == humanPlayer.getAnswerPaper()) {
			switch (RandomClass.randomMethod(1, 2)) {
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

	public String mostLizard() {
		if (humanPlayer.getAnswerRock() == humanPlayer.getAnswerScissors()) {
			switch (RandomClass.randomMethod(1, 2)) {
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

	public String mostScissors() {
		if (humanPlayer.getAnswerSpock() == humanPlayer.getAnswerRock()) {
			switch (RandomClass.randomMethod(1, 2)) {
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
	 * @return the aiLevel
	 */
	public int getAiLevel() {
		return aiLevel;
	}

	/**
	 * @param aiLevel the aiLevel to set
	 */
	public void setAiLevel(int aiLevel) {
		this.aiLevel = aiLevel;
	}

}
