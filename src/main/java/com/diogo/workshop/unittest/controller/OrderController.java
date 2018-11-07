package com.diogo.workshop.unittest.controller;

import java.security.InvalidParameterException;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.diogo.workshop.unittest.dto.OrderDTO;
import com.diogo.workshop.unittest.utils.CatalogUtils;
import com.diogo.workshop.unittest.utils.FintechUtils;

@Stateless
public class OrderController {

	@EJB
	private CatalogUtils catalogUtils;
	@EJB
	private FintechUtils fintechUtils;
	
	public int createOrder(OrderDTO order) throws Exception {
		
		if(!catalogUtils.verifyIfProductsExist(order.getItems().get(0).getId(), order.getItems().get(1).getId() )) {
			throw new Exception();
		}
		
		if(fintechUtils.createAndPayTransaction(order.getUserId(), order.getCardId(), order.getTotal()) != 200) {
			throw new InvalidParameterException();
		}
		
		if(order.getItems().get(0).getTotal() != (order.getItems().get(0).getPrice() * order.getItems().get(0).getQtd())) {
			throw new Exception();
		}
		
		return 0;
	}
	
}
