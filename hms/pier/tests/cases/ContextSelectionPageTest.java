package com.hms.pier.tests.cases;


	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import com.hms.generic.base.BaseTest;
import com.hms.generic.pageobjects.AppSelectorPage;
import com.hms.generic.pageobjects.ContextSelectionPage;
import com.hms.generic.pageobjects.LoginPageEcenter;
import com.hms.generic.pageobjects.SearchPage;


	public class ContextSelectionPageTest extends BaseTest {
		
		AppSelectorPage appSelectorPage;
		ContextSelectionPage contextSelectorPage;
		LoginPageEcenter loginpage;
		SearchPage searchPage;
		
		public ContextSelectionPageTest() {
			super();
		}
		
		@BeforeMethod
		public void setUp() {
			Initialization();
			 loginpage=new LoginPageEcenter();
			 appSelectorPage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			 contextSelectorPage=appSelectorPage.selectApp();
		  
		}
		
		
		@Test(priority=1)
		public void appTest() {
			searchPage=contextSelectorPage.selectContext(prop.getProperty("contex"));

	}
		@AfterMethod
		public void tearDown() {
			driver.quit();
	}
	}


