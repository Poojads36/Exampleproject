package com.hms.pier.tests.cases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.hms.frameworks.selenium.DriverUtils;
import com.hms.generic.base.BaseTest;
import com.hms.generic.pageobjects.AppSelectorPage;
import com.hms.generic.pageobjects.LoginPageEcenter;

public class LoginPageTest extends BaseTest {
	
	LoginPageEcenter loginpageEcenter;
	AppSelectorPage appSelectorPage;
	
	public LoginPageTest() {
		super();
	}
	@BeforeSuite
	public void setUp() {
		Initialization();
		 login();
		
}

@Test
public void loginPageTitleText() {
	
		Assert.assertEquals(loginpageEcenter.validateLoginPageTitle(),"eCenter");

	
}

/*@Test(priority=1)
public void loginTest() {
	//appSelectorPage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	appSelectorPage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	
	
}*/

@AfterSuite
public void tearDown() {
	driver.quit();
}
}