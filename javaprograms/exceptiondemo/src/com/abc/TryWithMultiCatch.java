package com.abc;

public class TryWithMultiCatch {

	public static void main(String[] args) {
		
		System.out.println("Main starts...");	
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("Result: "+c);		
		}		
		catch(ArithmeticException e) {
			System.out.println("Denominator should not be zero");
		}	
		catch(NumberFormatException e) {
			System.out.println("pass correct type of arguments");
		}	
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("pass correct number of arguments");
		}	
//		
//		catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
//			
		
		
//		}
		
		System.out.println("Main endss...");
	}

}
