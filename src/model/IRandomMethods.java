package model;

import java.util.Random;
/**
 * 
 * @author Nicklas
 *	a interface that makes a random number between min and max
 */
public interface IRandomMethods {
	Random rand = new Random();
	public int randomMethod(int min, int max);
}
