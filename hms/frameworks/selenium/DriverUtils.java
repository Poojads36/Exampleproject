package com.hms.frameworks.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hms.generic.base.BaseTest;

public class DriverUtils extends BaseTest {
	private static WebDriver driver;
	private static WebDriverWait wait;
	private static String appName;
	
	public void switchToWindow()
	{
		//driver.switchTo().window("PIER2 - Alaska - Search");
		//String your_title = "PIER2 - Alaska - Search";
		String currentWindow = driver.getWindowHandle();  //will keep current window to switch back
		for(String winHandle : driver.getWindowHandles()){
		   if (driver.switchTo().window(winHandle).getTitle().equals("PIER2 - Alaska - Search")) {
		     //This is the one you're looking for
		     break;
		   } 
		   else {
		      driver.switchTo().window(currentWindow);
		   } 
		}
	}
	public static void waitUntilClickable(By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitUntilClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitUntilVisible(By xpath) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
	}
	
public void SwitchTOCheckQaReportWindow() {
		
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
		
	
public static WebDriver getDriver() {
	return driver;
} 
	
public static void setAppName(String pAppName) {
	appName = pAppName;
	//screenshotDir = screenshotDirRoot + appName + "\\";
}




	//private static ChromeDriver driver;
	//private static WebDriverWait wait;
	
	//private static String screenshotDirRoot = "\\\\hmsdalfile\\general\\EnterpriseITQA\\Selenium_Automation\\Screenshots\\";
	//private static String screenshotDir;
	
	//private static String prevWindowHandle;
	//private static String appName;


	
	/*public static void setScreenshotDir(String dir) {
		screenshotDirRoot = dir;
	}
	
	public static void setAppName(String pAppName) {
		appName = pAppName;
		
		
		screenshotDir = screenshotDirRoot + appName + "\\";
	}

	public static void captureImage() {
		AngularWebDriverUtils.waitForAngularRequestsToFinish();
		TakesScreenshot ss = ((TakesScreenshot) driver);
		File source = ss.getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		try {
			FileUtils.copyFile(source, new File(screenshotDir + appName + "_" + timeStamp + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void captureImageOnFail(boolean successCondition) {
		if(!successCondition) {
			captureImage();
		}
	}

	public static void quit() {
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
/*	public static void waitUntilClickable(By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitUntilClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitUntilVisible(By xpath) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
	}*/
	
	//Requires an element that when clicked will open a new window
	//Follow up with closeWindow() call after complete
/*	public static void openAndSwitchWindow(WebElement element) {
		prevWindowHandle = driver.getWindowHandle();
		AngularWebDriverUtils.waitAndClick(element);

		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	}*/
	
	/*public static void closeWindow() {
		driver.close();
		switchToPrevWindow();
	}
	
	/*public static void switchToPrevWindow() {
		driver.switchTo().window(prevWindowHandle);
	}*/
	
	
		
		
		/* public void SwtichToWindow(IWebDriver driver, string strTitle)
	        {
	            var currentWindow = driver.GetWindowHandle();
	            var availableWindows = driver.GetWindowHandles();
	            if (availableWindows.Count != 0)
	            {
	                foreach (string windowId in availableWindows)
	                {
	                    if (driver.SwitchTo().Window(windowId).Title == strTitle)
	                        return true;
	                }
	                {
	                    driver.SwitchTo().Window(currentWindow);
       /* //use getWindowHandles() to get the window handles
        //of all the browsers during current execution
        Set<String> wndHandles = driver.getWindowHandles();
        //Use an Iterator
        Iterator<String> it = wndHandles.iterator();
        //Loop through the collection
        while(it.hasNext()){
            //Switch to each window
            driver.switchTo().window(it.next());
            //Check the title of the window. If it matches
            //with the expected title, break the loop
            if(driver.getTitle().equals(expectedTitle)){
                break;
            }
        }*/
	
		/*String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			 
			  if(!childWindowHandle.equals(mainWindowHandle)){
			  driver.switchTo().window(childWindowHandle);
			  }
		}*/
		//driver.switchTo().window("CDwindow-7DDE99EA146699A890477504E427A475");
		/*for (String childWindowHandle : driver.getWindowHandles()) {
			  //If window handle is not main window handle then close it 
			  if(!childWindowHandle.equals(childWindowHandle)){
			  driver.switchTo().window(childWindowHandle);
			  }*/
	
	public static void selectValueInSelector(WebElement element, String value) {
		Select selector = new Select(element);
		selector.selectByVisibleText(value);
	}

}
