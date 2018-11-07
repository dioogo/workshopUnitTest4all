package com.diogo.workshop.unittest;

import java.security.InvalidParameterException;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int split(int a, int b) throws InvalidParameterException {
		
		if(b == 0) {
			throw new InvalidParameterException();
		}
		
		return a / b;
	}
}
