package com.hms.pier.tests.cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hms.frameworks.selenium.DriverUtils;
import com.hms.generic.base.BaseTest;
import com.hms.generic.pageobjects.AppSelectorPage;
import com.hms.generic.pageobjects.ContextSelectionPage;
import com.hms.generic.pageobjects.LoginPageEcenter;
import com.hms.generic.pageobjects.SearchPage;
import com.hms.pier.pageobjects.reports.CheckQaReportsPage;


public class SearchPageTest  extends BaseTest {
		
		
		AppSelectorPage appSelectorPage;
		ContextSelectionPage contextSelectorPage;
		LoginPageEcenter loginpage;
		SearchPage searchPage;
		DriverUtils driverUtils;
		CheckQaReportsPage checkQaReportspage;
		
		public SearchPageTest() {
			super();
		}
		
		@BeforeMethod
		public void setUp() {
			Initialization();
			driverUtils= new DriverUtils();
			 loginpage=new LoginPageEcenter();
			 appSelectorPage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			 contextSelectorPage=appSelectorPage.selectApp();
			 searchPage=contextSelectorPage.selectContext(prop.getProperty("contex"));
		 
		}
		
		
		
		
		
		@Test(priority=1)
		public void searchCaseTest()
		{
		driverUtils.switchToWindow();
		checkQaReportspage=searchPage.searchCase();

	}
		@AfterMethod
		public void tearDown() {
			driver.quit();
	}
	}





