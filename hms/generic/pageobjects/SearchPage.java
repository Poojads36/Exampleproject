package com.hms.generic.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.generic.base.BaseTest;
import com.hms.pier.pageobjects.reports.CheckQaReportsPage;

public class SearchPage extends BaseTest {
	
	
	@FindBy(xpath=("//input[@name=\"caseId\"]"))
	WebElement searchCaseId;
	
	@FindBy(xpath=("//input[@name='Member1stName']"))
	WebElement memName;
	
	@FindBy(xpath=("//div[contains(@class, 'm0l0i') and text( )='Reports']"))
	WebElement reportMenu;
	
	@FindBy(xpath=("//div[contains(@class, 'm0l1i') and text( )='Client']"))
	WebElement clientSubMenu;
	
	@FindBy(xpath=("//div[contains(@class, 'm0l2i') and text( )='SLA Reports']"))
	WebElement slaSubMenu;
	
	@FindBy(xpath=("//div[contains(@class, 'm0l1i') and text( )='Production']"))
	WebElement productionSubMenu;
	
	@FindBy(xpath=("//div[contains(@class, 'm0l2i') and text( )='Check QA Report']"))
	WebElement checkQAReport;
	
	
	 public SearchPage() {
			PageFactory.initElements(driver, this);
			}
	 
	 public CheckQaReportsPage searchCase() {
		
		memName.sendKeys("test");
		 return new CheckQaReportsPage();
	 }
		    
public void AKReportTest() {
	Actions action = new Actions(driver);
	  action.moveToElement(reportMenu).perform();
	  action.moveToElement(productionSubMenu).perform();
	  action.moveToElement(checkQAReport).click().perform();
			
}
}
