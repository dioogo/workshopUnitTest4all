package com.diogo.workshop.unittest.dojo1;

import java.security.InvalidParameterException;
import java.util.List;

public class ProdutoEscalar {

	public Integer calculaProdutoEscalar(List<Integer> arr1, List<Integer> arr2) throws InvalidParameterException{
		
		if(arr1.size() != arr2.size()) {
			throw new InvalidParameterException();
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr1.size(); i++) {
			
			sum += arr1.get(i) * arr2.get(i);
			
		}
		
		return sum;
	}
}
