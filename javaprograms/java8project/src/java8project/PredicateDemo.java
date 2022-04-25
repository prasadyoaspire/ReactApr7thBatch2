package java8project;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
//		PredicateDemo pdemo = new PredicateDemo();		
//		boolean r1 = pdemo.isPrime(52);		
//		System.out.println(r1);	
		
		
		Predicate<Integer>  p = (x) -> {
			
			for(int i=2;i<x/2;i++) {
				if(x%i == 0) {
					return false;
				}
			}
			return true;
		};
		
		boolean r2 = p.test(52);		
		System.out.println(r2);	
		
		

	}
	
//	public boolean isPrime(int num) {
//		
//		for(int i=2;i<num/2;i++) {
//			if(num%i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
}
