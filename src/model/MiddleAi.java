package model;
/**
 * 
 * @author Nicklas
 *	this Ai class will return a random answer from smartAi and Ai 
 */
public class MiddleAi extends AbstractAi {

	static MiddleAi middleAi;

	private MiddleAi() {
	}

	/**
	 * Singleton pattern, it can only be one Ai player.
	 * 
	 * @return ai
	 */
	public static MiddleAi getInstance() {
		if (middleAi == null) {
			middleAi = new MiddleAi();
		}
		return middleAi;
	}


	@Override
	public String theAnswer() {
		MostOfClass moc = new MostOfClass();
		int result = RandomClass.randomMethod(1, 2);
		if (result == 1) {
			Ai ai = Ai.getInstance();
			return ai.theAnswer();
			
		}
		else {
			SmartAi smartAi = SmartAi.getInstance();
			return smartAi.getAnswer();
		}
	}}
