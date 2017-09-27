package model;

import java.util.Random;

public interface IRandomMethods {
	Random rand = new Random();
	public int randomMethod(int min, int max);
}
