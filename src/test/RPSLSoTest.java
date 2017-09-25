package test;


import org.junit.Before;
import org.junit.Test;

import model.AiAlgoritms.Answer;

public class RPSLSoTest {

	Answer ai;
	@Before
	public void startTest(){
		ai = new Answer();
	}
	
	@Test
	public void aiAlgoritmTest() {
		equals(ai.theAnswer());
	}

}
