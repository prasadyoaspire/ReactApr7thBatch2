package com.abc.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.abc.service.DemoService;

public class DemoServiceTest {
	
	private DemoService demoService;
	
	@BeforeAll
	public static void beforeAllTest() {
		System.out.println("initial ....");
	}
	
	@AfterAll
	public static void afterAllTest() {
		System.out.println("destroy ....");
	}
	
	@BeforeEach
	public void beforeTest() {
		System.out.println("before each");
		demoService = new DemoService();
	}
	
	@AfterEach
	public void afterTest() {
		System.out.println("after each");
		demoService = null;
	}	

	@Test
	public void testIsPalindrom() {
		System.out.println("testIsPalindrom");
		//DemoService demoService = new DemoService();
		boolean actual = demoService.isPalindrom(12321);
		assertTrue(actual);
	}
	
	@Test
	public void testIsPalindromFails() {
		System.out.println("testIsPalindromFails");
		//DemoService demoService = new DemoService();
		boolean actual = demoService.isPalindrom(12345);
		assertFalse(actual);
	}
	
	@Test
	public void testSortAry() {
		System.out.println("testSortAry");
		//DemoService demoService = new DemoService();
		
		int[] inputAry = {20,35,10,28,43};
		int[] actual = demoService.sort(inputAry);
		
		int[] expected = {10,20,28,35,43};		
		assertArrayEquals(expected,actual);
		
	}
}





