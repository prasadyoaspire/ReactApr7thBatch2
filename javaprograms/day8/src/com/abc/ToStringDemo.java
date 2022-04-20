package com.abc;

public class ToStringDemo {

	public static void main(String[] args) {
		
		int i = 10;
		
		A a1 = new A();
		
		//a1.m1();
		
		//String st = a1.toString();
		//System.out.println(st);
		
		System.out.println(i); 
		
		System.out.println(a1);   // a1.toString();
		

	}

}

class A extends Object {
	
	int i;
	
	void m1() {
		System.out.println("m1 inside A");
	}
		
	@Override
	public String toString() {		
		return "A object ref.";
	}
}
