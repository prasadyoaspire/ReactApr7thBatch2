package com.abc;

public class EqualsDemo {

	public static void main(String[] args) {
		
		String st1 = "abc";
		String st2 = new String("abc");
		
		//StringBuffer st3 = new StringBuffer("abc");
		
		if(st1.equals(st2)) {
			System.out.println("both objects content equals");
		}
		else {
			System.out.println("both objects content not equals");
		}
		
		T t1 = new T(10);
		
		T t2 = new T(10);
		
		if(t1.equals(t2)) {
			System.out.println("equals");
		}
		else {
			System.out.println(" not equals");
		}	
		
	}
}

class T {
	
	int i; 
	
	T(int i) {
		this.i = i;
	}
	
	
	
}

