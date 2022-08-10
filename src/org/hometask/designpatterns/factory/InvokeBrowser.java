package org.hometask.designpatterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	static WebDriver driver;

	public static void main(String[] args) {
		ChromeFactory chromeFactory = new ChromeFactory();
		driver = chromeFactory.getInstance("chrome browser", driver);
		driver = new ChromeDriver();
		driver.get("http://google.com");
	}
}
