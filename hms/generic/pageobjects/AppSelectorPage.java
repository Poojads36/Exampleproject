package com.hms.generic.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.hms.frameworks.selenium.DriverUtils;
import com.hms.generic.base.BaseTest;


	
	
	public class AppSelectorPage extends BaseTest {
		
	  
		
	    public AppSelectorPage() {
			super();
			
		}
	    
	    public void selectApp(String key) {
	    	WebElement ConteList=driver.findElement(By.xpath("//a[contains(@href,'"+key+"')]"));
			ConteList.click();
			
	    }
	    
	
	    public boolean isPageLoaded() {
	    	By Xpathtext=By.xpath("//div[@class='cntPageTitle']");
	    	DriverUtils.waitUntilVisible(Xpathtext);
	    	return driver.getTitle().equalsIgnoreCase("eCenter");
	    }
	}
		
		
	
	


