package com.diogo.workshop.unittest.controller;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.diogo.workshop.unittest.dto.ItemDTO;
import com.diogo.workshop.unittest.dto.OrderDTO;
import com.diogo.workshop.unittest.utils.CatalogUtils;
import com.diogo.workshop.unittest.utils.FintechUtils;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
	
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	@Mock
	private CatalogUtils catalogUtils;
	@Mock
	private FintechUtils fintechUtils;
	
	
	@InjectMocks
	private OrderController orderController;
	
	@Test
	public void testCreateOrderIfProductValid() throws Exception {
		Mockito.when(catalogUtils.verifyIfProductsExist(0, 1)).thenReturn(true);
		Mockito.when(fintechUtils.createAndPayTransaction(1, 2, 100)).thenReturn(200);
		
		List<ItemDTO> items = new ArrayList<ItemDTO>();
		
		items.add(new ItemDTO(0, 10, 2, 20));
		items.add(new ItemDTO(1, 5, 3, 15));
		
		orderController.createOrder(new OrderDTO(100, items, 65, 1, 2));
	}
	
	@Test
	public void testCreateOrderIfProductNotValid() throws Exception {
		Mockito.when(catalogUtils.verifyIfProductsExist(1, 2)).thenReturn(false);
		
		List<ItemDTO> items = new ArrayList<ItemDTO>();
		
		items.add(new ItemDTO(0, 10, 2, 20));
		items.add(new ItemDTO(1, 5, 3, 15));
		
		expectedEx.expect(Exception.class);
		
		orderController.createOrder(new OrderDTO(100, items, 65, 0, 0));
	}
	
	@Test
	public void testCreateOrderIfInvalidPayment() throws Exception {
		Mockito.when(catalogUtils.verifyIfProductsExist(0, 1)).thenReturn(true);
		Mockito.when(fintechUtils.createAndPayTransaction(1, 2, 100)).thenReturn(500);
		
		List<ItemDTO> items = new ArrayList<ItemDTO>();
		
		items.add(new ItemDTO(0, 10, 2, 20));
		items.add(new ItemDTO(1, 5, 3, 15));
		
		expectedEx.expect(InvalidParameterException.class);
		
		orderController.createOrder(new OrderDTO(100, items, 65, 1, 2));
	}
	
	@Test
	public void testCreateOrderInvalidTotal() throws Exception {
		Mockito.when(catalogUtils.verifyIfProductsExist(0, 1)).thenReturn(true);
		Mockito.when(fintechUtils.createAndPayTransaction(1, 2, 100)).thenReturn(200);
		
		List<ItemDTO> items = new ArrayList<ItemDTO>();
		
		items.add(new ItemDTO(0, 10, 2, 40));
		items.add(new ItemDTO(1, 5, 3, 15));
		
		expectedEx.expect(Exception.class);
		orderController.createOrder(new OrderDTO(100, items, 65, 1, 2));
	}
	
}
