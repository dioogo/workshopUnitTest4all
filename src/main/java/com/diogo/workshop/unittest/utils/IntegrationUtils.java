package com.diogo.workshop.unittest.utils;

import javax.ejb.Stateless;

import com.diogo.workshop.unittest.dto.OrderDTO;

@Stateless
public class IntegrationUtils {

	public int sentOrderToIntegration(OrderDTO order) {
		return 0;
	}
}
