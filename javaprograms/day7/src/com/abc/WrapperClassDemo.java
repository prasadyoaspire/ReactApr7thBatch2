package com.abc;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		int i = 10; //primitive
	
		//convert primitive into wrapper object
		Integer j = new Integer(i);  //boxing
		
		//get primitive value from wrapper object
		int k = j.intValue(); //unboxing
		
		
		//java5 introduced - auto boxing and unboxing
		
		Integer p1 = 20;   //internally , Integer p1 = new Integer(20);
		
		int z = p1;  // int z = p1.intValue();
		

	}

}
