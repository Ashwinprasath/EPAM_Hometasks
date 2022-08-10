package org.hometask.designpatterns.factory;

import org.openqa.selenium.WebDriver;

public class ChromeFactory {

	public WebDriver getInstance(String driverType, WebDriver driver) {
		if (driverType.equalsIgnoreCase("chrome browser")) {
			MyChromeDriver mychromedriver = new MyChromeDriver();
			return mychromedriver.initializeDriver(driver);
		} else if (driverType.equalsIgnoreCase("chromeWithCapabilities")) {
			ChromeDriverWithCapabilities chromedriverWithCapabilities = new ChromeDriverWithCapabilities();
			return chromedriverWithCapabilities.addCapabilities(driver);
		}
		return driver;
	}
}
