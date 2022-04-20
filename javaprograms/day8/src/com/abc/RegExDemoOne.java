package com.abc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemoOne {

	public static void main(String[] args) {
		
		String input = "2s";
		
		Pattern p = Pattern.compile(".s"); // . means any character 
		
		Matcher m = p.matcher(input);
		
		boolean result = m.matches();		
		
		System.out.println(result);
		
		//2nd way
		
		boolean b = Pattern.matches(".s", input);
		System.out.println(b);

	}

}
