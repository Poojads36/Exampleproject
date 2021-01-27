package com.hms.pier.pageobjects.reports;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hms.generic.base.BaseTest;

	public class CheckQaReportsPage extends BaseTest{
		
		@FindBy(xpath=("//input[@id='generateReportBtn']"))
		WebElement generateBtn;
		@FindBy(xpath=(("//input[@id='exportReportBtn'")))
		WebElement exportBtn;
		
		 public CheckQaReportsPage() {
				PageFactory.initElements(driver, this);
				}
		 
		

		public ReportHistoryPage checkQaReportGenerate() {
			 Select drpreportFormat = new Select(driver.findElement(By.name("repFormat")));
			  drpreportFormat.selectByValue("XLS");
			  //click on generate button
			  generateBtn.click();
			  return new ReportHistoryPage();
			
			
		}
		public  ReportHistoryPage checkQaReportExport() {
			 Select drpreportFormat = new Select(driver.findElement(By.name("repFormat")));
			  drpreportFormat.selectByValue("XLS");
			  //click on generate button
			  exportBtn.click();
			  return new ReportHistoryPage();
			
			
			
		}



		
		}

	



