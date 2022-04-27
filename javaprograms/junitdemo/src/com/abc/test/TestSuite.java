package com.abc.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@SelectClasses({
	CalculatorTest.class,
	DemoServiceTest.class	
})
@Suite
public class TestSuite {

}
