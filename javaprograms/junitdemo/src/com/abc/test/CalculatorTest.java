package com.abc.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.abc.service.Calculator;

public class CalculatorTest {

	@Test
	public void testSum() {		
		Calculator cal = new Calculator();
		int acutalResult = cal.sum(10, 20);		
		assertEquals(30,acutalResult);
	}
	
	@Test
	public void testSumWithNegative() {		
		Calculator cal = new Calculator();
		int acutalResult = cal.sum(-10, -20);		
		assertEquals(-30,acutalResult);
	}
	
	@Disabled
	@Test
	public void testSumWithOnePositiveNegative() {		
		Calculator cal = new Calculator();
		int acutalResult = cal.sum(10, -20);		
		assertEquals(-10,acutalResult);
	}
	
	@Test
	public void testDiv() {
		Calculator cal = new Calculator();
		int actual = cal.div(20, 10);
		assertEquals(2,actual);
	}
	
	@Test
	public void testDivWithZero() {
		Calculator cal = new Calculator();
		//int actual = cal.div(20, 0);
		
		//expecting exception
		assertThrows(ArithmeticException.class, ()-> cal.div(20, 0));
	}	
	
}
