package org.hometask.designpatterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverWithCapabilities extends MyFirefoxDriver{

	public WebDriver firefoxDriverWithCapabilities(WebDriver driver) {
		initializeDriver(driver);
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setAcceptInsecureCerts(false);
		return driver;
	}	
}
