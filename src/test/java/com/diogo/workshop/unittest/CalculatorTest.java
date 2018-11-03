package com.diogo.workshop.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		//Given
		int a = 5;
		int b = 6;
		
		//When
		int result = new Calculator().add(a, b);
		
		//Then
		assertEquals(11, result);
	}
}
