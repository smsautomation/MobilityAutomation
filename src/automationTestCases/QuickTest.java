/* *******************************************************************
* Test Case Name: Exchange_3_Appointment_Details_Page_Abort_No_Access_Chrome
* Author: Iain Storrie
* Date: 13/06/2017
* Purpose: This test ensure that a user can abort an appointment from the 
* Appointments Details page where there is no access on the Chrome browser 
* for an Exchange 3 job
*
**********************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
*********************************************************************/

package automationTestCases;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import utility.Log;

public class QuickTest {

	//Declare our test variables
	public WebDriver driver;	
		
	public static void main(String[] args) {
		
			 
		
		// objects and variables instantiation
		
		ChromeOptions options = new ChromeOptions();
    	options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
    	File file = new File("C:\\ChromeDriver\\chromedriver.exe"); 
    	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
    	//DesiredCapabilities Capability = DesiredCapabilities.chrome();
    	System.setProperty("webdriver.chrome.logfile", "C:\\eclipse\\chromedriver.log");
    	WebDriver driver = new ChromeDriver(options);	
    	//driver.get("http://www.google.co.uk");
    	Log.info("New Chrome driver instantiated");
		
		String appUrl = "https://siemens-og-bykrw4c6spfh7rcf452vdehd-sdg1-test.mbaas1.sdg.feedhenry.com/#/login";
		
			 
		
	   // launch the chrome browser and open the application url
		
	   driver.get(appUrl);

	   // maximize the browser window
		
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   		
	   driver.findElement(By.id("input1")).click();
	   driver.findElement(By.id("input1")).sendKeys("automation");
	   driver.findElement(By.id("input2")).click();
	   driver.findElement(By.id("input2")).sendKeys("Aut0m4t1on");
	   driver.findElement(By.id("btn")).click();
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	       
	
	}
}

