package model;

import java.util.Random;

/**
 * 
 * @author Nicklas
 * class that is returning random number.
 */
public class RandomClass {
	
	static public int randomMethod(int min, int max) {
		Random rand = new Random();
		int test = rand.nextInt(max + 1 - min) + min;
		return test;
	}

}
