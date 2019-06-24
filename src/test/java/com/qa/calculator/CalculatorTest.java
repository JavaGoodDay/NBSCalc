package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

	@Test
	public void addTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2,2);
		Assert.assertEquals(4, result);
	}
	public void multiplyTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(2,2);
		Assert.assertEquals(4, result);
	}

	public void divideTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(2,2);
		Assert.assertEquals(4, result);
	}

	public void subtractTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(2,2);
		Assert.assertEquals(4, result);
	}


}
