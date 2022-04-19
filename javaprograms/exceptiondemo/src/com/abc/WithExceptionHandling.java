package com.abc;

public class WithExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Main starts...");
		
		int a = 20;
		int b = 10;
		
		try {		
			
			int c = a/b;	//   	ArithmeticExcepiton ex = new ArithmeticException();
			                //       throw ex;
			System.out.println("Result:"+c);
		}
		catch(ArithmeticException e) {
			//System.out.println("denominator should not be zero.");	
			System.out.println(e.getMessage());
		}
		finally {
			
		}
				
		System.out.println("Main ends...");
	
	}

}
