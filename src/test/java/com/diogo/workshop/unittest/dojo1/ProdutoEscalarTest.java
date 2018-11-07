package com.diogo.workshop.unittest.dojo1;

import static org.junit.Assert.assertEquals;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ProdutoEscalarTest {
	
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test
	public void calculaProdutoEscalar() throws Exception {
		List<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		
		arr1.add(2);
		arr2.add(3);
		
		
		Integer result = new ProdutoEscalar().calculaProdutoEscalar(arr1, arr2);
		assertEquals(Integer.valueOf(6), result);
	}

	@Test
	public void calculaProdutoEscalarWith2Numbers() throws Exception {
		List<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		
		arr1.add(2);
		arr1.add(4);
		arr2.add(2);
		arr2.add(3);
		
		
		Integer result = new ProdutoEscalar().calculaProdutoEscalar(arr1, arr2);
		assertEquals(Integer.valueOf(16), result);
	}
	
	@Test
	public void calculaProdutoEscalarWithZero() throws Exception {
		List<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		
		arr1.add(2);
		arr1.add(4);
		arr2.add(3);
		
		expectedEx.expect(InvalidParameterException.class);
		
		new ProdutoEscalar().calculaProdutoEscalar(arr1, arr2);
	}
}
