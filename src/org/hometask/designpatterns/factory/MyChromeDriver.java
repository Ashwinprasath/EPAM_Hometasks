package org.hometask.designpatterns.factory;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyChromeDriver implements InitBrowser {

	WebDriver driver;
	
	@Override
	public WebDriver initializeDriver(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
        return driver;
	}
}
