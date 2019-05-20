package webModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjectRepositories.Objects_Electricity_Meter_Commissioning_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Commissioning{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Commissioning page upon 
	* initial landing
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void viewPage(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements that are expected are displayed
		Objects_Electricity_Meter_Commissioning_Page.lbl_Commissioning(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Commissioning label displayed as expected");
		}
		
		Objects_Electricity_Meter_Commissioning_Page.cbx_Non_Serialised_Assets(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Non Serialised Assets checkbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Commissioning_Page.txt_Non_Serialised_Assets_Number(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Non Serialised Assets Number textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Commissioning_Page.img_Trash(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Trash Image displayed as expected");
		}
		
		Objects_Electricity_Meter_Commissioning_Page.btn_Add_Another_Asset(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Add Another Asset button displayed as expected");
		}
		/*
		Objects_Electricity_Meter_Commissioning_Page.btn_Next_Section(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Next Section button displayed as expected");
		}
		*/
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Commissioning page in 
	* order to force a successful commissioning scenario
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValues(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful commissioning scenario 
		Objects_Electricity_Meter_Commissioning_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Electricity_Meter_Commissioning_Page.lbl_Commissioning_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Commissioning Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValuesPrePaid
	* Author: Iain Storrie
	* Date: 05/07/2017
	* Purpose: This method adds the required responses in the Electricity Meter Commissioning page in 
	* order to force a successful commissioning scenario where a Pre-Paid meter is used
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	//public static void addSuccessValuesSmart(WebDriver driver, String sTestCaseName) throws Exception{
	public static void addSuccessValuesSmart(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful commissioning scenario 
		Thread.sleep(2000);
		Objects_Electricity_Meter_Commissioning_Page.btn_Comms_Hub_Connected_WAN_Yes(driver).click();{
		Log.info(sTestCaseName + " | Comms Hub Connected WAN - Yes radio button clicked");
		
		Thread.sleep(2000);
		 Actions act= new Actions(driver);
		 act.moveToElement( driver.findElement(By.xpath("//h4[contains(text(),'Commissioning')]"))).click().build().perform();
			Thread.sleep(2000);
		
		 act.moveToElement( driver.findElement(By.xpath("//button[contains(@id,'CbtnNextComm')]"))).click().build().perform();
	
	
		 
//
	
		 /*WebDriverWait wait= new WebDriverWait(driver ,10);
			 boolean element_Invisible =wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='socket collapse in']")));
			
		      if(element_Invisible) {
		    	  Thread.sleep(2000);
		    	 WebElement plorityMeterCkeckButton=  driver.findElement(By.xpath("//label[@id='rb_CarOutPolCk_y']/span"));
		    	 Actions act2= new Actions(driver);
		    	 plorityMeterCkeckButton.click();
			// driver.findElement(By.xpath("//label[@id='rb_CarOutPolCk_y']/span")).click();
*/		    // 
		 
		// WebDriverWait wait= new WebDriverWait(driver ,10);
					// boolean element_Invisible =wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='socket collapse in']")));
				     // if(element_Invisible) {
				 
		 driver.findElement(By.xpath("//textarea[@id='postpolnotes']")).click();
		 driver.findElement(By.xpath("//textarea[@id='postpolnotes']")).sendKeys("yes");

		 
				    	  Thread.sleep(2000);
				    	  //    //label[@id='rb_CarOutPolCk_y'][@class='radio']
				    	  Actions act2= new Actions(driver);
				    	  act2.moveToElement(driver.findElement(By.cssSelector("label#rb_CarOutPolCk_y"))).click().build().perform();		    	 
				    	
				    
		
			
		 
		 Thread.sleep(2000);
		WebElement element= driver.findElement(By.xpath("//select[@id='cbx_PolChkplg_sel']"));
		element.sendKeys("Polarity tested with plug in test device");
		element.sendKeys(Keys.ENTER);
		
		
		//  css=#rb_SocSafChk_pass > label.radio > span.outer
		//   //div[@id='rb_SocSafChk_pass']/label/span
		//   
		//   xpath=(.//*[normalize-space(text()) and normalize-space(.)='SUBMIT'])[1]/preceding::span[2]
		
		 WebDriverWait wait3= new WebDriverWait(driver ,5);
	//	 WebElement element3 =wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//posttest/div/div[2]/div[5]/div[2]/div/label/span")));
		 WebElement element3 =wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='rb_SocSafChk_pass']")));
		 element3.click();
		 
		 driver.findElement(By.xpath("//input[@id='txt_TestWtn']")).sendKeys("mike");
		 

		driver.findElement(By.xpath("//button[contains(@id,'btn_CapPhoMart_test')]")).click();
		
		
			/*
			 * WebDriverWait wait= new WebDriverWait(driver ,10); boolean element_Invisible
			 * =wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
			 * "//div[@class='contentTask']")));
			 * 
			 * if(element_Invisible)
			 */
	      
	     
		  driver.findElement(By.xpath("//h4[contains(.,'Send Message')]")).click();
		
		
		
	
		}
		Objects_Electricity_Meter_Commissioning_Page.cbx_Gas_Meter_Location(driver).click();
		Objects_Electricity_Meter_Commissioning_Page.cbx_Gas_Meter_Location(driver).sendKeys("03");
		Objects_Electricity_Meter_Commissioning_Page.cbx_Gas_Meter_Location(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | 03: Hall selected from Gas Meter Location combobox");
		}
		Objects_Electricity_Meter_Commissioning_Page.txt_Distance_Gas_Electric(driver).click();
		Objects_Electricity_Meter_Commissioning_Page.txt_Distance_Gas_Electric(driver).sendKeys("5");{
		Log.info(sTestCaseName + " | Value entered in the Distance Gas Electric textbox");
		}
		Objects_Electricity_Meter_Commissioning_Page.cbx_Electric_Meter_Signal(driver).click();
		Objects_Electricity_Meter_Commissioning_Page.cbx_Electric_Meter_Signal(driver).sendKeys("15");
		Objects_Electricity_Meter_Commissioning_Page.cbx_Electric_Meter_Signal(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | 15 selected from Electric Meter Signal combobox");
		}
		Objects_Electricity_Meter_Commissioning_Page.txt_Commissioning_Code(driver).click();
		Objects_Electricity_Meter_Commissioning_Page.txt_Commissioning_Code(driver).sendKeys("0005");
		Objects_Electricity_Meter_Commissioning_Page.txt_Distance_Gas_Electric(driver).click();{
		Log.info(sTestCaseName + " | Value entered in the Commissioing Code textbox");
		}
		Objects_Electricity_Meter_Commissioning_Page.cbx_Time_Taken_Commission_Meter(driver).click();
		Objects_Electricity_Meter_Commissioning_Page.cbx_Time_Taken_Commission_Meter(driver).sendKeys("5");
		Objects_Electricity_Meter_Commissioning_Page.cbx_Time_Taken_Commission_Meter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | 5-10 minutes selected from Time Taken Commission Meter combobox");
		}
		Objects_Electricity_Meter_Commissioning_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Electricity_Meter_Commissioning_Page.lbl_Commissioning_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Commissioning Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		}
		
		//END OF ADD SUCCESS VALUES METHOD
		
		
	/* **************************************************************************************************
	* Function: addSuccessValuesSpark
	* Author: Paul Middleton
	* Date: 16/01/2018
	* Purpose: This method adds the required responses in the Electricity Meter Commissioning page in 
	* order to force a successful commissioning scenario for Spark
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	//public static void addSuccessValuesSmart(WebDriver driver, String sTestCaseName) throws Exception{
	public static void addSuccessValuesSpark(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful commissioning scenario 
		Objects_Electricity_Meter_Commissioning_Page.btn_Comms_Hub_Connected_WAN_Yes(driver).click();{
		Log.info(sTestCaseName + " | Comms Hub Connected WAN - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Commissioning_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Electricity_Meter_Commissioning_Page.lbl_Commissioning_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Commissioning Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
		
	//END OF ADD SUCCESS VALUES METHOD
	}
		
//END OF METHODS
}