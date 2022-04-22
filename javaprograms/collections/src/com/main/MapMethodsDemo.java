package com.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapMethodsDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("India", "NewDelhi");
		map.put("UK", "London");
		map.put("Russia", "Moscow");
		map.put("US", "WashingtonDC");
		
		// get all keys		
		Set<String> allKeys = map.keySet();
		
		for(String s: allKeys) {
			System.out.println(s);
		}
		
		//get all values		
		Collection<String> allValues = map.values();
		
		for(String s: allValues) {
			System.out.println(s);
		}	
		

	}

}
