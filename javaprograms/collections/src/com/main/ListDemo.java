package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {		
		
		ArrayList courses = new ArrayList(); 
		
		//LinkedList courses = new LinkedList();
		
		courses.add("java");
		courses.add("c++");		
		courses.add("html");
		courses.add("javascript");
		courses.add(2, "sql");
		courses.add("html");
		
		System.out.println(courses); //courses.toString()
		
		int size = courses.size();
		
		System.out.println("Size: "+size);	
		
		//how to store primitives ?  convert primitive into wrapper class object and store it
		
		ArrayList marks = new ArrayList();
		marks.add(new Integer(58));
		marks.add(new Integer(78));
		marks.add(new Integer(68));
		marks.add(72);   // =>   marks.add(new Integer(72)) .. auto boxing
		
		System.out.println(marks);
		
		Iterator i = marks.iterator();
		
		while(i.hasNext()) {
			Object obj = i.next();
			Integer k = (Integer) obj;
			System.out.println(k);
		}
		

	}

}
