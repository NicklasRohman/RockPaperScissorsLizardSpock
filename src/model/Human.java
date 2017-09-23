package model;

public class Human implements PlayerInterface {
	private String name;
	private String HumanAnswer;
	private int answerRock, answerLizard, answerSpock, answerScissors, answerPaper;
	private int win=0, lose=0, draw=0;

	static Human human;

	private Human() {

	}

	public static Human getInstance() {
		if (human == null) {
			human = new Human();
		}
		return human;
	}

	/**
	 * @return the win
	 */
	public int getWin() {
		return win;
	}

	/**
	 * @param win
	 *            the win to set
	 */
	public void setWin(int win) {
		this.win = win;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the humanAnswer
	 */
	public String getHumanAnswer() {
		return HumanAnswer;
	}

	/**
	 * @param humanAnswer
	 *            the humanAnswer to set
	 */
	public void setHumanAnswer(String humanAnswer) {
		HumanAnswer = humanAnswer;
	}

	/**
	 * @return the answerRock
	 */
	public int getAnswerRock() {
		return answerRock;
	}

	/**
	 * @return the lose
	 */
	public int getLose() {
		return lose;
	}

	/**
	 * @param lose
	 *            the lose to set
	 */
	public void setLose(int lose) {
		this.lose = lose;
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

	/**
	 * @return the draw
	 */
	public int getDraw() {
		return draw;
	}

	/**
	 * @param draw
	 *            the draw to set
	 */
	public void setDraw(int draw) {
		this.draw = draw;
	}

}