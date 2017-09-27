package model;
/**
 * 
 * @author Nicklas
 *	this Ai class will return a random answer from smartAi and Ai 
 */
public class NormalAi extends AbstractAi {

	static NormalAi normalAi;

	private NormalAi() {
	}

	/**
	 * Singleton pattern, it can only be one Ai player.
	 * 
	 * @return ai
	 */
	public static NormalAi getInstance() {
		if (normalAi == null) {
			normalAi = new NormalAi();
		}
		return normalAi;
	}


	@Override
	public String theAnswer() {
		int result = randomMethod(1, 2);
		if (result == 1) {
			EasyAi ai = EasyAi.getInstance();
			return ai.theAnswer();
			
		}
		else {
			HardAi smartAi = HardAi.getInstance();
			return smartAi.getAnswer();
		}
	}

	}
