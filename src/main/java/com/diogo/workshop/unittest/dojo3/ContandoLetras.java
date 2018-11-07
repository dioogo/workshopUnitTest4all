package com.diogo.workshop.unittest.dojo3;

import java.util.HashMap;
import java.util.Map;

public class ContandoLetras {

	public int contar(int valor) throws Exception {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "um");
		map.put(2, "dois");
		map.put(3, "tres");
		map.put(4, "quatro");
		map.put(5, "cinco");
		map.put(6, "seis");
		map.put(7, "sete");
		map.put(8, "oito");
		map.put(9, "nove");
		map.put(10, "dez");
		
		int result = 0;
		
		for (int i = 1; i <= valor; i++) {
			result += map.get(i).length();
		}
		
		return result;
	}
}
