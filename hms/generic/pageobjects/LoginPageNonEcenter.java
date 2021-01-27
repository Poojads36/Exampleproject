package com.hms.generic.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hms.frameworks.selenium.PageObjects;

public class LoginPageNonEcenter extends PageObjects {
	
	
	
	@FindBy(id = "username")
     WebElement usernameField;
    
    @FindBy(id = "password")
     WebElement passwordField;
    
    @FindBy(xpath=("//a[@class='btnCmdOn']"))
    WebElement loginBtn;
	
 
	
   /* public LoginPage(WebDriver webDriver) {
	PageFactory.initElements(driver, this);
	}*/
    
   private final static String pageUrl = "https://ecenterdev.hmsy.com"; 
	
    public LoginPageNonEcenter(WebDriver driver) {
		super(driver, pageUrl);
	}
    public LoginCommand loginAs(String userName) {
        return new LoginCommand(userName);
    }
         
    public class LoginCommand {
    	
        private String userName;
        private String password;
        
        public LoginCommand(String userName) {
            this.userName = userName;
        }
        
        public LoginCommand withPassword(String password) {
            this.password = password;
            return this;
        }
        
        public void login() {
            usernameField.sendKeys(userName);
            passwordField.sendKeys(password);
        loginBtn.click();
        
       
	}
    }

	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
}