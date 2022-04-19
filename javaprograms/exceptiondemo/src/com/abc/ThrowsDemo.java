package com.abc;

public class ThrowsDemo {

	public static void main(String[] args) {

		System.out.println("Main starts...");

		int a = 20;
		int b = 0;
		
		try {
			
			div(a,b);
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator should not be zero");
		}			
		System.out.println("Main ends...");

	}

	static void div(int a, int b) throws ArithmeticException {
		int c = a / b;
		System.out.println("Result: "+c);
	}

}
