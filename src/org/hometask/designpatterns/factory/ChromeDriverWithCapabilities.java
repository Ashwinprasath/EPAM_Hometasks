package org.hometask.designpatterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverWithCapabilities extends MyChromeDriver{

	public WebDriver addCapabilities(WebDriver driver) {
		initializeDriver(driver);
		ChromeOptions handlingSSL = new ChromeOptions();
		handlingSSL.setAcceptInsecureCerts(true);
		return driver;
	}
}
