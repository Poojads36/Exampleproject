package com.hms.frameworks.selenium;
import org.openqa.selenium.WebElement;



public class AngularWebDriverUtils extends DriverUtils {

	//private static WebDriver webDriver;
	
	/*public static void setWebDriver(WebDriver driver) {
		WebDriver = driver; 
	}*/
	
	public static void click(WebElement element) {
		element.click();
		//WebDriver.waitForAngularRequestsToFinish();
	}
	
}