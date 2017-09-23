package model;

public class Ai implements AiAlgoritms, PlayerInterface {

	private String name = "Ai";
	private String aiAnswer;

	static Ai ai;

	private Ai() {
	}

	public static Ai getInstance() {
		if (ai == null) {
			ai = new Ai();
		}
		return ai;
	}

	public void aiCalculateAnswer() {
		Answer answer = new Answer();
		aiAnswer = answer.theAnswer();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the aiAnswer
	 */
	public String getAiAnswer() {
		return aiAnswer;
	}

	/**
	 * @param aiAnswer
	 *            the aiAnswer to set
	 */
	public void setAiAnswer(String aiAnswer) {
		this.aiAnswer = aiAnswer;
	}
}
