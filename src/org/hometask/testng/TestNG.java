package org.hometask.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


@Listeners(TestListener.class)
public class TestNG {

	Calculator calculator = new Calculator();
	static ExtentTest test;
	static ExtentReports report = new ExtentReports(System.getProperty("user.dir"+"\\ExtentReportResults.html"));

	@BeforeSuite(groups = { "SmokeTest" })
	public void sum() {
		long result = calculator.sum(10, 10);
		test = report.startTest("ExtentDemo");
		assertEquals(result, 20);
		test.log(LogStatus.PASS, "Sum Long:-" + result);
		report.endTest(test);
		report.flush();
	}

	@BeforeTest(groups = { "SmokeTest" })
	public void pow() {
		double result = calculator.pow(10, 10);
		System.out.println("pow" + result);
		assertEquals(result, 1.0E10);
		test.log(LogStatus.PASS, "Power:- " + result);
	}

	@AfterTest(groups = { "FunctionalTest" })
	public void substraction() {
		long result = calculator.sub(10, 5);
		assertEquals(result, 5);
		test.log(LogStatus.PASS, "Substraction:-" + result);
	}

	@BeforeMethod(groups = { "FunctionalTest" })
	public void isNegative() {
		boolean result = calculator.isNegative(10);
		assertFalse(result);
		test.log(LogStatus.PASS, "Is Negative value:-" + result);
	}

	@Test(expectedExceptions = NumberFormatException.class, groups = { "NegativeTest" })
	public void divNegative() {
		long result = calculator.div(10, 0);
		test.log(LogStatus.FAIL, "Division:-" + result);
	}

	@Test(dataProvider = "InputData", dataProviderClass = Data.class, groups = { "SmokeTest" })
	public void multiplication(long a, long b) {
		long result = calculator.mult(a, b);
		assertEquals(result, 300);
		test.log(LogStatus.PASS, "Multiplication value is :-" + result);
	}

	@AfterSuite(groups = { "FunctionalTest" })
	public void sqrt() {
		double result = calculator.sqrt(5);
		assertEquals(result, 25);
		test.log(LogStatus.PASS, "Square root:-" + result);
	}

	@AfterMethod(groups = { "FunctionalTest" })
	public void cos() {
		double result = calculator.cos(10);
		assertEquals(result, -0.5440211108893698);
		test.log(LogStatus.PASS, "Cos value is:-" + result);
	}

	@Test(groups = { "FunctionalTest" })
	public void isPositive() {
		boolean result = calculator.isPositive(5);
		assertTrue(result);
		test.log(LogStatus.PASS, "Is positive value is :-" + result);
	}

	@Test(groups = { "SanityTest" })
	public void sin() {
		double result = calculator.sin(5);
		assertEquals(result, -0.9589242746631385);
		test.log(LogStatus.PASS, "Sin value is :-" + result);
	}
	
	
	@AfterClass
	public void tearDown() {
		report.endTest(test);
		report.flush();
	}
}
