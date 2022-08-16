package org.hometask.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

@Listeners(TestListener.class)
public class TestNG {

	Calculator calculator = new Calculator();

	@BeforeMethod
	public void before() {
		System.out.println("Entering in to new method");
	}

	@AfterMethod
	public void after() {
		System.out.println("Exiting the method");
	}

	@Test(groups = "Positive", dataProvider = "InputData", dataProviderClass = Data.class)
	public void addition(long a, long b) {
		long result = calculator.sum(a, b);
		assertEquals(result, (a + b));

	}

	@Test(groups = "Positive", dataProvider = "InputData", dataProviderClass = Data.class)
	public void substraction(long a, long b) {
		long result = calculator.sub(b, a);
		assertEquals(result, (b - a));
	}

	@Test(groups = "Positive", dataProvider = "InputData", dataProviderClass = Data.class)
	public void multiplication(long a, long b) {
		long result = calculator.mult(a, b);
		assertEquals(result, 300);
	}

	@Test(groups = "Positive", dataProvider = "InputData", dataProviderClass = Data.class)
	public void divison(long a, long b) {
		long result = calculator.div(b, a);
		assertEquals(result, b / a);
	}

	@Test(groups = "Positive")
	public void pow() {
		double result = calculator.pow(2, 2);
		assertEquals(result, (Math.pow(2, 2)));
	}

	@Test(groups = "Negative", dataProvider = "InputData", dataProviderClass = Data.class)
	public void subtract(long a, long b) {
		long result = calculator.sub(a, b);
		assertEquals(result, (a - b));
	}

	@Test(groups = "Negative")
	public void isNegative() {
		boolean result = calculator.isNegative(-5);
		assertTrue(result);
	}

	@Test(expectedExceptions = NumberFormatException.class, groups = "Negative")
	public void divNegative() {
		long result = calculator.div(10, 0);
		System.out.println(result);
	}

	@Test(groups = "Negative")
	public void sqrt() {
		double result = calculator.sqrt(25);
		assertEquals(result, Math.sqrt(25));
	}

	@Test(groups = "Negative")
	public void isPositive() {
		boolean result = calculator.isPositive(-10);
		assertFalse(result);
	}
}
