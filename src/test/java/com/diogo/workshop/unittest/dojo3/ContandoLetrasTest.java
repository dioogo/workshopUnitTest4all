package com.diogo.workshop.unittest.dojo3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContandoLetrasTest {

	@Test
	public void contandoLetrasWith1() throws Exception {
		int result = new ContandoLetras().contar(1);
		assertEquals(2, result);
	}

	@Test
	public void contandoLetrasWith2() throws Exception {
		int result = new ContandoLetras().contar(2);
		assertEquals(6, result);
	}
	
	@Test
	public void contandoLetrasWith3() throws Exception {
		int result = new ContandoLetras().contar(3);
		assertEquals(10, result);
	}
	
	@Test
	public void contandoLetrasWith4() throws Exception {
		int result = new ContandoLetras().contar(4);
		assertEquals(16, result);
	}
	
	@Test
	public void contandoLetrasWith5() throws Exception {
		int result = new ContandoLetras().contar(5);
		assertEquals(21, result);
	}
	
	@Test
	public void contandoLetrasWith6() throws Exception {
		int result = new ContandoLetras().contar(6);
		assertEquals(25, result);
	}
	@Test
	public void contandoLetrasWith7() throws Exception {
		int result = new ContandoLetras().contar(7);
		assertEquals(29, result);
	}
	@Test
	public void contandoLetrasWith8() throws Exception {
		int result = new ContandoLetras().contar(8);
		assertEquals(33, result);
	}
	@Test
	public void contandoLetrasWith9() throws Exception {
		int result = new ContandoLetras().contar(9);
		assertEquals(37, result);
	}
	@Test
	public void contandoLetrasWith10() throws Exception {
		int result = new ContandoLetras().contar(10);
		assertEquals(40, result);
	}
}
