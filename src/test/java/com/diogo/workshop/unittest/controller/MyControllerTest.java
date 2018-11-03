package com.diogo.workshop.unittest.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.diogo.workshop.unittest.database.Database;

@RunWith(MockitoJUnitRunner.class)
public class MyControllerTest {

	@Mock
	private Database database;
	
	@InjectMocks
	private MyController controller;
	
	@Test
	public void test() {
		
		Mockito.when(database.someQuery(5)).thenReturn(6);
		
		assertEquals(11, controller.someMethod(5));
		
		Mockito.verify(database, Mockito.times(1)).someQuery(5);
	}
}
