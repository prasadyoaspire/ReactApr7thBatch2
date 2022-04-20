package com.abc;

public class StringRegEx {

	public static void main(String[] args) {
		
		String st2 = "Hello Smith. How are you?";
		
		String result = st2.replaceAll("o", "#");
		
		System.out.println(result);
		
		//split method:
		
		String st3 = "How#are#you?";
		
		String[] strAry = st3.split("#");
		
		for(String s : strAry) {
			System.out.println(s);
		}

	}

}
