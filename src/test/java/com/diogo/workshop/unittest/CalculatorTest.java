package com.diogo.workshop.unittest;

import static org.junit.Assert.assertEquals;

import java.security.InvalidParameterException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {
	

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

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
	
	@Test
	public void testSplit10By2() throws Exception {
		int a = 10;
		int b = 2;
		
		int result = new Calculator().split(a, b);
		
		assertEquals(5, result);
	}
	
	@Test
	public void testSplit50by5() throws Exception {
		int a = 50;
		int b = 5;
		
		int result = new Calculator().split(a, b);
		
		assertEquals(10, result);	
	}
	
	@Test
	public void testSplit50by0() throws Exception {
		int a = 50;
		int b = 0;
		
		expectedEx.expect(InvalidParameterException.class);
		new Calculator().split(a, b);
	}
	
}
