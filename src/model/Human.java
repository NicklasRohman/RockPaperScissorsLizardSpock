package model;

/**
 * 
 * @author Nicklas This class should only contain things whit the human player.
 */
public class Human extends Players /* implements PlayerInterface */ {
	private String name;
	private String answer;
	private int answerRock, answerLizard, answerSpock, answerScissors, answerPaper;
	private int win = 0, lose = 0, draw = 0;

	static Human human;

	private Human() {

	}

	/**
	 * Singleton pattern, it can only be one Human player.
	 * 
	 * @return human
	 */
	public static Human getInstance() {
		if (human == null) {
			human = new Human();
		}
		return human;
	}

	/**
	 * gets the Human name
	 * 
	 * @return the Human name
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the Human name
	 * 
	 * @param name
	 *            of the human
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets what the human answered
	 * 
	 * @return the humanAnswer
	 */
	public String getHumanAnswer() {
		return answer;
	}

	/**
	 * sets what the human answered
	 * 
	 * @param humanAnswer
	 */
	public void setHumanAnswer(String humanAnswer) {
		answer = humanAnswer;
	}

	/**
	 * get how many time human have answered rock
	 * 
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
	 * get how many time human have answered lizard
	 * 
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
	 * get how many time human have answered spock
	 * 
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
	 * get how many time human have answered scissors
	 * 
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
	 * get how many time human have answered paper
	 * 
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
	 * returns number of human wins
	 * 
	 * @return the win
	 */
	public int getWin() {
		return win;
	}

	/**
	 * set the wins on human player
	 * 
	 * @param number
	 *            of win
	 */
	public void setWin(int win) {
		this.win = win;
	}

	/**
	 * get the lose on human players matches
	 * 
	 * @return the lose
	 */
	public int getLose() {
		return lose;
	}

	/**
	 * set the lose on human player
	 * 
	 * @param number
	 *            of lose the lose to set
	 */
	public void setLose(int lose) {
		this.lose = lose;
	}

	/**
	 * get the draws on human players matches
	 * 
	 * @return the draw
	 */
	public int getDraw() {
		return draw;
	}

	/**
	 * set the draws on human players matches
	 * 
	 * @param number
	 *            of draw
	 */
	public void setDraw(int draw) {
		this.draw = draw;
	}

}