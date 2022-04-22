package com.main;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		//HashMap<String,String> map = new HashMap<>(); // unordered and unsorted 
		
		//LinkedHashMap<String,String> map = new LinkedHashMap<>(); // ordered which maintains insertion order
		
		//TreeMap<String,String> map = new TreeMap<>(); //sorted by key
		
		Hashtable<String,String> map = new Hashtable<>(); // similar to HashMap but null values are not allowed. (neither key or value)
		
		map.put("India", "NewDelhi");
		map.put("UK", "London");
		map.put("Russia", "Moscow");
		map.put("US", "WashingtonDC");
		map.put("USA", "WashingtonDC");
		//map.put("Russia", "Moscow");
		//map.put(null, null);
		//map.put("Pak", null);
		
		System.out.println(map);
		
		String countryName = "US";
		
		String capital = map.get(countryName);
		
		if(capital!=null) {
			System.out.println(capital);
		}
		else {
			System.out.println("No country found");
		}
		
	}

}
