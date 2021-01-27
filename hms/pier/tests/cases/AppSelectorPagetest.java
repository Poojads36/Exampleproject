package com.hms.pier.tests.cases;

import org.testng.annotations.BeforeSuite;

import com.hms.frameworks.selenium.DriverUtils;
import com.hms.generic.base.BaseTest;
import com.hms.generic.pageobjects.AppSelectorPage;
import com.hms.generic.pageobjects.ContextSelectionPage;
import com.hms.generic.pageobjects.LoginPageEcenter;


public class AppSelectorPagetest extends BaseTest {
	
	private AppSelectorPage appSelectorPage;
	private ContextSelectionPage contextSelectorPage;
	private LoginPageEcenter loginpage;
	
	
	
	
	@BeforeSuite
	protected void setUp() {
		super.setUp();
		appSelectorPage = new AppSelectorPage();
		contextSelectorPage = new ContextSelectionPage();
	}

	protected void setAppName() {
		DriverUtils.setAppName("PIER");
	}
	
	public boolean isAppSelectorPageLoaded() {
		boolean check = appSelectorPage.isPageLoaded();
		//DriverUtils.captureImageOnFail(check);
		return check;
	}
	
	public boolean isARRecoveriesPageLoaded() {
		selectApp("PIER");
		boolean check = appSelectorPage.isPageLoaded();
		//DriverUtils.captureImageOnFail(check);
		return check;
	}
	
	public void selectApp(String appId) {
		appSelectorPage.selectApp(appId);
	}
}

	 
		
	


	
	

