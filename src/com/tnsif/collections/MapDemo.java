package com.tnsif.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("DS", 69);
		mp.put("AI", 49);
		mp.put("CNS", 79);
		mp.put("IS", 89);
		mp.put("CC", 55);
		mp.put("DS", 69); // HashMap does not  allow duplicates but it takes and don't return multiple times 
		
		for (Map.Entry<String, Integer> e:mp.entrySet()) {
			String Key = e.getKey();
			int Value = e.getValue();
			System.out.println(" "+Key+ " " +Value);
		}
	}

}
