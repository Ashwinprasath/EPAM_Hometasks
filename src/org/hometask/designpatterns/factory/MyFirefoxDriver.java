package org.hometask.designpatterns.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirefoxDriver implements InitBrowser {

	@Override
	public WebDriver initializeDriver(WebDriver driver) {
		WebDriverManager.firefoxdriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}
}
