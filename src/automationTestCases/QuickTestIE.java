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


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

import utility.Log;

public class QuickTestIE {

	//Declare our test variables
	public static WebDriver driver;	
		
	public static void main(String[] args) {
		
			 
		
		// objects and variables instantiation
		
		DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        cap.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
        cap.setCapability("ignoreZoomSetting", true);
        
        System.setProperty("webdriver.ie.driver","C:\\IE Driver\\IEDriverServer.exe"); 

        driver = new InternetExplorerDriver(cap);
        Log.info("New IE driver instantiated");
       
        /*
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
        Log.info("Implicit wait applied on the driver for 20 seconds");
        
        //WebDriverWait = new WebDriverWait(driver, 10);   
        //WebDriverWait(driver, 10000);
       
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		*/
		String appUrl = "https://siemens-og-bykrw4c6spfh7rcf452vdehd-sdg1-test.mbaas1.sdg.feedhenry.com/#/login";
		
	   // launch the ie browser and open the application url
		
	   driver.get(appUrl);

	   // maximize the browser window
		
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   System.out.println("driver =" + driver);
	   driver.findElement(By.id("input1")).click();
	   driver.findElement(By.id("input1")).sendKeys("automation");
	   driver.findElement(By.id("input2")).click();
	   driver.findElement(By.id("input2")).sendKeys("Aut0m4t1on");
	   //driver.findElement(By.id("input2")).sendKeys("000000");
	   driver.findElement(By.id("btn")).click();
	
	   driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	   
	   //driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[1]/div/div[1]/div/div[2]/div[2]")).click();
	   driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[25]/div/div[1]/div/div[1]/span[1]/span")).click();
	 
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	       
	
	}
}

