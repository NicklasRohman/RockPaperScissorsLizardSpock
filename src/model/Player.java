package model;

public class Player implements AiAlgoritms {

	String name;
	private int answerRock = 0, answerLizard = 0, answerSpock = 0, answerScissors = 0, answerPaper = 0;

	/**
	 * @return the answerRock
	 */
	public int getAnswerRock() {
		return answerRock;
	}

	/**
	 * @param answerRock
	 *            the answerRock to set
	 */
	public void setAnswerRock(int answerRock) {
		this.answerRock = answerRock;
	}

	/**
	 * @return the answerLizard
	 */
	public int getAnswerLizard() {
		return answerLizard;
	}

	/**
	 * @param answerLizard
	 *            the answerLizard to set
	 */
	public void setAnswerLizard(int answerLizard) {
		this.answerLizard = answerLizard;
	}

	/**
	 * @return the answerSpock
	 */
	public int getAnswerSpock() {
		return answerSpock;
	}

	/**
	 * @param answerSpock
	 *            the answerSpock to set
	 */
	public void setAnswerSpock(int answerSpock) {
		this.answerSpock = answerSpock;
	}

	/**
	 * @return the answerScissors
	 */
	public int getAnswerScissors() {
		return answerScissors;
	}

	/**
	 * @param answerScissors
	 *            the answerScissors to set
	 */
	public void setAnswerScissors(int answerScissors) {
		this.answerScissors = answerScissors;
	}

	/**
	 * @return the answerPaper
	 */
	public int getAnswerPaper() {
		return answerPaper;
	}

	/**
	 * @param answerPaper
	 *            the answerPaper to set
	 */
	public void setAnswerPaper(int answerPaper) {
		this.answerPaper = answerPaper;
	}

}
