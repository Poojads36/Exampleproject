package com.hms.generic.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.generic.base.BaseTest;

public class ContextSelectionPage extends BaseTest{
	
	@FindBy(xpath=("//a[@href=\"javascript: submitForm('100150123', 'PIERHIPPAK');\"]"))
	WebElement pierAKBtn;
	
	@FindBy(xpath=("//a[@href=\"javascript: submitForm('100150123', 'PIERHIPPAL');\"]"))
	WebElement pierALBtn;
	
	
	@FindBy(xpath=("//a[@href=\"javascript: submitForm('100150123', 'PIERHIPPAR');\"]"))
	WebElement pierARBtn;
	
	
	@FindBy(xpath=("//a[@href=\"javascript: submitForm('100150123', 'PIERHIPPWV');\"]"))
	WebElement pierWVBtn;
	
	
	@FindBy(xpath=("//a[@href=\"javascript: submitForm('100150123', 'PIERHIPPCO');\"]"))
	WebElement pierCOBtn;
	
	
	@FindBy(xpath=("//a[@href=\"javascript: submitForm('100150123', 'PIERHIPPMA');\"]"))
	WebElement pierMABtn;
	
	@FindBy(xpath=("//a[@href=\"javascript: submitForm('100150123', 'PIERHIPPFL');\"]"))
	WebElement pierFLBtn;
	
	
	@FindBy(xpath=("//a[@href=\"javascript: submitForm('100150123', 'PIERHIPPGA');\"]"))
	WebElement pierGABtn;
	
	
	@FindBy(xpath=("//a[@href=\"javascript: submitForm('100150123', 'PIERCHIPRAGA');\"]"))
	WebElement pierCHIPRAGABtn;
	
	
	@FindBy(xpath=("//a[@href=\"javascript: submitForm('100150123', 'PIERHIPPNV');\"]"))
	WebElement pierNVBtn;
	
	@FindBy(xpath=("//a[@href=\"javascript: submitForm('100150123', 'PIERHIPPNC');\"]"))
	WebElement pierNCBtn;
	
	
	public ContextSelectionPage() {
		PageFactory.initElements(driver, this);
		
		}
	
	public SearchPage selectContext(String Contex)
	{
		switch (Contex) {
		case "AK":
			pierAKBtn.click();
			break;
		case "AL":
			pierALBtn.click();
			break;
		case "AR":
			pierARBtn.click();
			break;
		case "WV":
			pierWVBtn.click();
			break;
		case "CO":
			pierCOBtn.click();
			break;
		case "MA":
			pierMABtn.click();
			break;
		case "FL":
			pierFLBtn.click();
			break;
		case "NV":
			pierNVBtn.click();
			break;
		case "GA":
			pierGABtn.click();
			break;
		case "CHIPRAGA":
			pierCHIPRAGABtn.click();
			break;
		case "NC":
			pierNCBtn.click();
			break;
		
		}
		return new SearchPage();
	}
	
	
	

}
