package com.abc.main;

import com.abc.service.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int sum = cal.sum(0, 0);
		
		System.out.println("Sum: "+sum);		

	}

}
