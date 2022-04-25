package java8project;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
//		FunctionDemo fd = new FunctionDemo();		
//		int len1 = fd.findLen("hello");
//		System.out.println("Lenght: "+len1);
		
		// arguments is string and return the length (integer)
		
		Function<String,Integer> fun1 = x -> x.length();
		
		int len = fun1.apply("Hello Java");		
		System.out.println("lenght: "+len);
		
		// argument int[]  and return sum of all the elements inside array
		
		Function<Integer[],Integer> fun2 = x-> {
			int sum = 0;
			for(int i=0;i<x.length;i++) {
				sum = sum + x[i];
			}
			return sum;			
		};
		
		int sumOfAry = fun2.apply(new Integer[] {10,20,30,40});
		System.out.println("Sum: "+sumOfAry);
		
		


	}
	
//	public int applySum(int[] num) {
//		int sum = 0;
//		for(int i=0;i<num.length;i++) {
//			sum = sum + num[i];
//		}
//		return sum;		
//	}
//	
//	public int findLen(String s) {
//		int len = s.length();
//		return len;
//	}

}
