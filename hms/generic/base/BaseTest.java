package com.hms.generic.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.hms.frameworks.selenium.DriverUtils;
import com.hms.generic.domain.authentication.Authorization;
import com.hms.generic.domain.authentication.User;
import com.hms.generic.domain.dao.CredentialsDaoImpl;
import com.hms.generic.pageobjects.LoginPageEcenter;


public class BaseTest {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public BaseTest() {
		try {
			prop=new Properties();
			FileInputStream ip= new FileInputStream("C:\\Users\\EI11654\\Training\\COB-ARRecoveries_UI_Automation_pier\\src\\com\\hms\\pier\\config\\config.properties");
					prop.load(ip);
					
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
		
	}
	
	public void Initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",prop.getProperty("chromedriverpath") );
			 driver = new ChromeDriver();
			
		}else if (browserName.equals("IE")) {
		System.setProperty("webdriver.chrome.driver", prop.getProperty("IEdrivrerpath"));
		 driver = new InternetExplorerDriver();
	}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	protected void login() {
		LoginPageEcenter loginPage = new LoginPageEcenter(DriverUtils.getDriver());
		User userData = new 
().getLoginInfo();
		loginPage.goTo();
		loginPage.loginAs(userData.getUsername())
			.withPassword(Authorization.decryptPassword(userData.getPassword()))
			.login();
	}

	protected void setUp() {
		Initialization();
		login();
		
		
	}

	protected void setAppName() {
		// TODO Auto-generated method stub
		
	}
	
}
/*@BeforeSuite
	protected void setUp() {
		DriverUtils.initialize();
		setAppName();
		login();
	}

	@AfterSuite
	protected void tearDown() {
		DriverUtils.quit();
	}
	
	protected abstract void setAppName();
	
	private void login() {
		LoginPage loginPage = new LoginPage(DriverUtils.getDriver());
		User userData = new CredentialsDaoImpl().getLoginInfo();
		loginPage.goTo();
		loginPage.loginAs(userData.getUsername())
			.withPassword(Authorization.decryptPassword(userData.getPassword()))
			.login();
	}
	
	protected boolean getCheckResultWithScreenshotOnFail(boolean successCondition) {
		DriverUtils.captureImageOnFail(successCondition);
		return successCondition;
	}
}*/


