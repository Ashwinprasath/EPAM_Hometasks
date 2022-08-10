package org.hometask.designpatterns.factory;

import org.openqa.selenium.WebDriver;

public interface InitBrowser {

	public WebDriver initializeDriver(WebDriver driver);
}
