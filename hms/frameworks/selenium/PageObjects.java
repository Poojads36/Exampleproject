package com.hms.frameworks.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.hms.generic.base.BaseTest;

public class PageObjects extends BaseTest {
	
	protected WebDriver driver;
	private String pageUrl = "";
	
	 public void goTo() {
	        driver.navigate().to(prop.getProperty("url"));
	       // AngularWebDriverUtils.waitForAngularRequestsToFinish();
	    }
	 public PageObjects(WebDriver driver, String url) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			pageUrl = url;
		}
		
		
    
	
	public String getTitle() {
		String browserTitle = driver.getTitle();
		return browserTitle;
	}
}