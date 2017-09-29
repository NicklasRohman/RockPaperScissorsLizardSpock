package model;
/**
 * 
 * @author Nicklas
 *	this Ai class will return a random answer from smartAi and Ai 
 */
public class NormalAi extends AbstractAi implements INewAi{

	String AiAnswer;
	
	AiFactory aiFactory = new AiFactory();
	INewAi easyAi = aiFactory.makingAAI("Easy");
	INewAi hardAi = aiFactory.makingAAI("hard");
	
	
	/**
	 * returns a answer that is random based on either easyAI or hardAi
	 */
	@Override
	public String theAnswer() {
		int result = randomMethod(1, 2);
		if (result == 1) {
			easyAi.aiCalculateAnswer();
			return easyAi.getAiAnswer();
		}
		else {
			hardAi.aiCalculateAnswer();
			return hardAi.getAiAnswer();
		}
	}

	/**
	 * Sends back the AiLevel
	 */
	@Override
	public int getAiLevel() {
		return 2;
	}
	/**
	 * Calculating a answer
	 */
	@Override
	public void aiCalculateAnswer() {
		this.AiAnswer = theAnswer();
		
	}
	/**
	 * return the aiAnswer
	 */
	@Override
	public String getAiAnswer() {
		return this.AiAnswer;
	}
	}
