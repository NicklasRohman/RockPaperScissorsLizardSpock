package model;

/**
 * 
 * @author Nicklas
 * a factory class that makes a instance of ai
 */
public class AiFactory {

	/**
	 * The method makes a instance of an Ai
	 * @param newAiTyp witch Ai it will make
	 * @return EasyAI , NormalAi or HardAi
	 */
	public INewAi makingAAI(String newAiTyp) {
		if (newAiTyp == null) {
			return null;
		}
		if (newAiTyp.equalsIgnoreCase("easy")) {
			return new EasyAi();
		} else if (newAiTyp.equalsIgnoreCase("normal")) {
			return new NormalAi();
		} else if (newAiTyp.equalsIgnoreCase("hard")) {
			return new HardAi();
		} 
			return null;
	}
}