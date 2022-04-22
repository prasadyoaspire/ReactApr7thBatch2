package com.main;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		//ArrayList<Integer> list2 = new ArrayList<>();
		//ArrayList<Double> list3 = new ArrayList<>();	
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Iphone");
		list.add("Samsung");
		list.add("Oppo");
	
		//list.add(10); //compiler error
		//list.add(10.2); //compiler error
		
		System.out.println(list);
		
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {			
			String st = i.next();
			System.out.println(st);
		}	

	}

}
