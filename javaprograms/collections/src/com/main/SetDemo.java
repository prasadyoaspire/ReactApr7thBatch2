package com.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//HashSet courses = new HashSet(); // unordered and unsorted collection
		
		//LinkedHashSet courses = new LinkedHashSet(); // ordered collection -  maintains insertion order
		
		TreeSet courses = new TreeSet(); //sorted collection
		
		courses.add("java");
		courses.add("c++");		
		courses.add("html");
		courses.add("javascript");
		courses.add("html");
		
		System.out.println(courses);	

	}

}
