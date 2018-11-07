package com.diogo.workshop.unittest.controller;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.diogo.workshop.unittest.database.Database;
import com.diogo.workshop.unittest.utils.FintechUtils;

@Stateless
public class MyController {

	@EJB
	private Database database;
	
	@EJB
	private FintechUtils fintech;
	
	public int someMethod(int a) {
		int b = database.someQuery(a);
		
		return a+b;
	}
}
