package com.abc;

import java.util.regex.Pattern;

public class RegExDemoTwo {

	public static void main(String[] args) {
		
		boolean result1 = Pattern.matches("[amn]", "k");
		System.out.println(result1);
		
		boolean result2 = Pattern.matches("[a-zA-Z]+", "dfdfJhuu");
		System.out.println(result2);

		//boolean result3 = Pattern.matches("[a-zA-Z_0-9]{5}", "KK9_t");
		
		boolean result3 = Pattern.matches("\\w{5}", "KK9_t");
		System.out.println(result3);
		
	   boolean result4 = Pattern.matches("[789][0-9]{9}", "8953038949");
	   System.out.println(result4);
	}

}
