package com.diogo.workshop.unittest.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.diogo.workshop.unittest.database.Database;
import com.diogo.workshop.unittest.utils.FintechUtils;

@RunWith(MockitoJUnitRunner.class)
public class MyControllerTest {

	@Mock
	private Database database;
	
	@Mock
	private FintechUtils fintech;
	
	@InjectMocks
	private MyController controller;
	
	@Test
	public void test() {
		
		Mockito.when(database.someQuery(5)).thenReturn(7);
		
		assertEquals(11, controller.someMethod(5));
		
		Mockito.verify(database, Mockito.times(1)).someQuery(5);
	}
}
