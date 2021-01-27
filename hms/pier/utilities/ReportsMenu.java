package com.hms.pier.utilities;

import com.hms.generic.base.BaseTest;

public class ReportsMenu extends BaseTest {
	
	

	
	
	
public void switchTOCheckQaReportWindow() {
		
		String currentWindow = driver.getWindowHandle();  //will keep current window to switch back
		for(String winHandle : driver.getWindowHandles()){
		   if (driver.switchTo().window(winHandle).getTitle().equals("PIER2 - Alaska - check QA Report")) {
		     //This is the one you're looking for
		     break;
		   } 
		   else {
		      driver.switchTo().window(currentWindow);
		   } 
		}
	}
}
