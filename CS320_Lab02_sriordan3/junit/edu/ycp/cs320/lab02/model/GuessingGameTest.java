package edu.ycp.cs320.lab02.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02.model.GuessingGame;

public class GuessingGameTest {
	private GuessingGame model;
	
	@Before
	public void setUp() {
		model = new GuessingGame();
	}
	
	@Test
	public void testSetMin() {
		model.setMin(1);
		assertEquals(1, model.getMin());
	}
	@Test
	public void testSetMax() {
		model.setMax(100);
		assertEquals(100, model.getMax());
	}
	//verify that guess decreases when it is less than the current value
	@Test
	public void testSetIsGreaterThan() {
		int oldGuess=model.getGuess();
		model.setIsGreaterThan(oldGuess);
		assertTrue(oldGuess<model.getGuess());
	}
	@Test
	public void testSetIsLessThan() {
		//the new guess needs to be less than the parameter passed, 55 is our example
		model.setIsLessThan(55);
		assertTrue(55>model.getGuess());
	}
	@Test
	public void testIsDone() {
		//is done is true if the max and min are equal
		model.setMax(5);
		model.setMin(5);
		assertTrue(model.isDone());
	}
	
}
