package com.abc.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.abc.service.DemoService;

public class DemoSeriveParamTest {
	
	@ParameterizedTest
	@ValueSource(ints = {12321,1111,5445})
	public void testIsPalindrom(int num) {	
		DemoService demoService = new DemoService();
		boolean actual = demoService.isPalindrom(num);
		assertTrue(actual);
	}
	
}
