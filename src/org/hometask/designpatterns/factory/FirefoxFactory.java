package org.hometask.designpatterns.factory;

import org.openqa.selenium.WebDriver;

public class FirefoxFactory {

	public WebDriver returnDriver(String driverType, WebDriver driver) {

		if (driverType.equalsIgnoreCase("firefox")) {
			MyFirefoxDriver my = new MyFirefoxDriver();
			return my.initializeDriver(driver);
		} else if (driverType.equalsIgnoreCase("firefoxWithCapabilities")) {
			FirefoxDriverWithCapabilities myWithCapabilities = new FirefoxDriverWithCapabilities();
			return myWithCapabilities.firefoxDriverWithCapabilities(driver);
		}
		return driver;
	}
}
