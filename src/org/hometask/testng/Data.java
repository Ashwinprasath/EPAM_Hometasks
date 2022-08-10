package org.hometask.testng;

import org.testng.annotations.DataProvider;

public class Data {

	@DataProvider(name = "InputData")
	public static Object[][] getDataFromDataprovider() {
		return new Object[][] { { 10, 30 } };
	}
}
