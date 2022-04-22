package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList courses = new ArrayList();
		courses.add("java");
		courses.add("c++");
		courses.add("html");
		courses.add("javascript");
		courses.add(2, "sql");
		courses.add("html");
		
		System.out.println(courses);
		
		//traversing 
		
		System.out.println("using enhanced for loop");
		
		for(Object obj : courses) {
			String st = (String) obj;
			System.out.println(st);	   
		}
		
		
		System.out.println("using Iterator");
		
		int k = 0;		
		//using Iterator
		Iterator i = courses.iterator();
		while(i.hasNext()) {
			Object obj = i.next();
			String st = (String) obj;
			//System.out.println(st);
		    if(st.equals("html")) {
		    	System.out.println("Found at index : "+k);		    	
		    }
		    k++;
		    
		    //i.remove();
		}	
		
		
		System.out.println("java 8 for-each");
		
		courses.forEach(x->System.out.println(x));
		

	}

}
