package model;

/**
 * @author Nicklas This class should only contain things whit the Ai player.
 */
public class Ai extends Players implements AiAlgoritms/* , PlayerInterface */ {

	private String name = "Ai";
	private String answer;

	static Ai ai;

	private Ai() {
	}
	/**
	 * Singleton pattern, it can only be one Ai player.
	 * @return ai
	 */
	public static Ai getInstance() {
		if (ai == null) {
			ai = new Ai();
		}
		return ai;
	}
	
	public void aiCalculateAnswer() {
		Answer answer = new Answer();
		this.answer = answer.theAnswer();
	}

	/**
	 * gets the name of Ai
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * gets what the Ai answered
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
}
