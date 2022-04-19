package com.abc;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Main starts....");

		int x = -10;
		
		try {
			test(x);
		}
		catch(NegativeNumberException ex) {
			//System.out.println("Negative number not allowed");
			
			//ex.printStackTrace();
			
			String msg = ex.getMessage();
			System.out.println(msg);
		}		
		
		System.out.println("Main ends....");
	}
	
	static void test(int x) throws NegativeNumberException {
		
		if(x < 0) {
			NegativeNumberException ex = new NegativeNumberException("Negattive number not allowed");
			throw ex;
		}		
		System.out.println("X value: "+x);			
	}
}
