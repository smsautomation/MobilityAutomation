package webModule;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Function;
import com.google.common.base.Functions;

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
		 WebElement element3 =wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#rb_SocSafChk_pass .outer")));
		 element3.click();
		 
		 
		 driver.findElement(By.cssSelector("input#txt_TestWtn")).sendKeys("mike");
		 

		driver.findElement(By.xpath("//button[contains(@id,'btn_CapPhoMart_test')]")).click();
		
		//SEND DCC_MESSAGE
		Thread.sleep(5000);
		      driver.findElement(By.xpath("//h4[contains(.,'Send Message')]")).click();
		 
			
			 //veryfy that follwing label bars are presen
			 
		      //New  Meter Details
		      Thread.sleep(5000);
			  driver.findElement(By.cssSelector("#Title_newMeter h4")).isDisplayed();
			 
			// Commissioning
			  Thread.sleep(5000); 			 
			 driver.findElement(By.cssSelector("#Title_commissioning h4")).isDisplayed();
			
			 Thread.sleep(500);
			  driver.findElement(By.cssSelector("#Title_newMeter h4")).isDisplayed();
			 
			  Thread.sleep(500);
			 // Commissioning
			 driver.findElement(By.cssSelector("#Title_commissioning h4")).isDisplayed();
			 
			
			/*
			 * Thread.sleep(5000); //Post Installation Checks
			 * driver.findElement(By.xpath("//?/h4[@innertext='Post Installation Checks']"))
			 * .isDisplayed(); Thread.sleep(5000); // Electric Install & Commissioning
			 * driver.findElement(By.
			 * xpath("//?/h4[@innertext='Electric Install & Commissioning']")).isDisplayed()
			 * ;
			 */
	      
		Wait<WebDriver> wait2= new FluentWait<WebDriver>(driver)
		 .withTimeout(30, TimeUnit.SECONDS)
		 .pollingEvery(5, TimeUnit.SECONDS)
		 .ignoring(NoSuchElementException.class);
		WebElement element2 =wait2.until(new Function<WebDriver, WebElement>(){
				public WebElement apply(WebDriver driver) {
			WebElement commssionLabel = driver.findElement(By.xpath("//button[contains(.,'Commissioning')]"));
			if(commssionLabel.isDisplayed()) {
				
				
			}
			return commssionLabel;
		}
<<<<<<< HEAD
		});
		element2.click();
=======
		
		// Shiva: Redundant for Exch21 scenario (confirmed from Paul M)
		/*
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
		}*/
		Objects_Electricity_Meter_Commissioning_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Electricity_Meter_Commissioning_Page.lbl_Commissioning_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Commissioning Complete label displayed");
		}
>>>>>>> bf7b6d1c41ed9e6ebec79609ddf5787700cd98d0
		
		
				
				
			
			/*
			 * WebDriverWait wait= new WebDriverWait(driver ,10); WebElement element_Visible
			 * =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			 * "//button[contains(.,'Commissioning')]"))); element_Visible.click();
			 * 
			 */
			  
			  
			  
			  
			  
			  
			  //CAPTURE PHOTO OF HAZARDS IDENTIFIED 
		
			/*
			 * ///////////// WebDriverWait wait4= new WebDriverWait(driver, 10); WebElement
			 * element4
			 * =wait4.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
			 * "button#btn1.cameraBtn2line.grey.mandatoryWhite"))); element4.click();
			 */
		  //New  Meter Details
	      Thread.sleep(5000);
		  driver.findElement(By.cssSelector("#Title_newMeter h4")).isDisplayed();
		 
		// Commissioning
		  Thread.sleep(2000); 			 
		 driver.findElement(By.cssSelector("#Title_commissioning h4")).isDisplayed();
		
		
		         Thread.sleep(5000);
		         Actions act_CapturePhoto= new Actions(driver);
				 act_CapturePhoto.moveToElement(driver.findElement(By.cssSelector("button#btn1.cameraBtn2line.grey.mandatoryWhite"))).click().build().perform();

		
			  
			  //PHOTO OF FINAL_ELEC_METER_
				
			  driver.findElement(By.cssSelector("button#btn1.cameraBtn.grey.mandatoryWhite")).click();
			  
			  // PHOTO_FINAL_ELEC_METER_INSTALL_CLOSEUP WITNESS STICKER LABELL.
			  driver.findElement(By.
			  cssSelector("[collapse] .ng-scope:nth-of-type(3) .mandatoryWhite")).click();
			  
			  //submit eletric task button
			  driver.findElement(By.cssSelector("button#btn_Submit_elec.btnCall.green")). click();
			  
			 
		 
			
			
			
			//click on gas_no radio button
			driver.findElement(By.cssSelector("#rb_SmelGas_n .outer")).click();
			
			//capture meter pressue low
			driver.findElement(By.cssSelector("[collapse='task\\.riskassessgasCollapsed'] .radioWidth:nth-of-type(1) .outer")).click();
			
			//capture meter pressue Volt Stick Check
			driver.findElement(By.cssSelector("[collapse] .ng-scope:nth-of-type(2) .radioWidth:nth-of-type(1) .outer")).click();
			
			//check signs of tamparing_pass
			driver.findElement(By.cssSelector("[collapse] .ng-scope:nth-of-type(3) .radioWidth:nth-of-type(1) .outer")).click();
			
			//ECV Check_pass
			driver.findElement(By.cssSelector("[collapse] .ng-scope:nth-of-type(4) .radioWidth:nth-of-type(1) .outer")).click();
			
			//work area saftely check_pass
			driver.findElement(By.cssSelector("[collapse] .ng-scope:nth-of-type(5) .radioWidth:nth-of-type(1) .outer")).click();
			
			// PHOTO_TYPES.RISK_ASSESS_GAS_SAFE
			driver.findElement(By.cssSelector("#btn1")).click();
			
			//save to countinue
			driver.findElement(By.cssSelector("[collapse] .ng-scope:nth-of-type(6) .radioWidth:nth-of-type(1) .outer")).click();
			
			//site suitable for smart meter installation
			driver.findElement(By.cssSelector("#rb_SuitFS_y .outer")).click();
			//Equipment reposition agreed
			WebElement equ_Position =driver.findElement(By.cssSelector("#repositionSelect"));
			equ_Position.click();
			equ_Position.sendKeys("Yes-Customer-Agree");
			
			//click next section button
			driver.findElement(By.cssSelector("button#btn_Next_Section")).click();
			
			//CAPTURE PHOTO OF CURRENT FULL METER INSTALLATION
			driver.findElement(By.id("btn_Init_Photo")).click();
			
			//preinstall Gas tighness carry out
			driver.findElement(By.cssSelector("#rb_PreGasTigTCarOut_y .outer")).click();
			
			// PHOTO_OF U-GUAGE ATTACH TO GAS METER
	       driver.findElement(By.cssSelector("#btn1.cameraBtn2line.grey.mandatoryWhite")).click();
	       
	       //was there a drop in pressure_NO
	       driver.findElement(By.cssSelector("#rb_WasDropPress_n .outer")).click();
	       
	       //existing gas meter detail correct
	       driver.findElement(By.cssSelector("label#rb_ExMetDetCorrt_y.radio")).click();
	       
	       //status of asset
	       WebElement asset_status= driver.findElement(By.cssSelector("select#cbx_StaAss_sel"));
	       asset_status.click();
	       asset_status.sendKeys("Meter Faliure");
		
			
			
			
			
			
			
			
			
		
		
			
		
		}
		
	
		}
	/*
	 * Objects_Electricity_Meter_Commissioning_Page.cbx_Gas_Meter_Location(driver).
	 * click();
	 * Objects_Electricity_Meter_Commissioning_Page.cbx_Gas_Meter_Location(driver).
	 * sendKeys("03");
	 * Objects_Electricity_Meter_Commissioning_Page.cbx_Gas_Meter_Location(driver).
	 * sendKeys(Keys.ENTER);{ Log.info(sTestCaseName +
	 * " | 03: Hall selected from Gas Meter Location combobox"); }
	 * Objects_Electricity_Meter_Commissioning_Page.txt_Distance_Gas_Electric(driver
	 * ).click();
	 * Objects_Electricity_Meter_Commissioning_Page.txt_Distance_Gas_Electric(driver
	 * ).sendKeys("5");{ Log.info(sTestCaseName +
	 * " | Value entered in the Distance Gas Electric textbox"); }
	 * Objects_Electricity_Meter_Commissioning_Page.cbx_Electric_Meter_Signal(driver
	 * ).click();
	 * Objects_Electricity_Meter_Commissioning_Page.cbx_Electric_Meter_Signal(driver
	 * ).sendKeys("15");
	 * Objects_Electricity_Meter_Commissioning_Page.cbx_Electric_Meter_Signal(driver
	 * ).sendKeys(Keys.ENTER);{ Log.info(sTestCaseName +
	 * " | 15 selected from Electric Meter Signal combobox"); }
	 * Objects_Electricity_Meter_Commissioning_Page.txt_Commissioning_Code(driver).
	 * click();
	 * Objects_Electricity_Meter_Commissioning_Page.txt_Commissioning_Code(driver).
	 * sendKeys("0005");
	 * Objects_Electricity_Meter_Commissioning_Page.txt_Distance_Gas_Electric(driver
	 * ).click();{ Log.info(sTestCaseName +
	 * " | Value entered in the Commissioing Code textbox"); }
	 * Objects_Electricity_Meter_Commissioning_Page.cbx_Time_Taken_Commission_Meter(
	 * driver).click();
	 * Objects_Electricity_Meter_Commissioning_Page.cbx_Time_Taken_Commission_Meter(
	 * driver).sendKeys("5");
	 * Objects_Electricity_Meter_Commissioning_Page.cbx_Time_Taken_Commission_Meter(
	 * driver).sendKeys(Keys.ENTER);{ Log.info(sTestCaseName +
	 * " | 5-10 minutes selected from Time Taken Commission Meter combobox"); }
	 * Objects_Electricity_Meter_Commissioning_Page.btn_Next_Section(driver).click()
	 * ;{ Log.info(sTestCaseName + " | Next Section button clicked"); }
	 * Objects_Electricity_Meter_Commissioning_Page.lbl_Commissioning_Complete(
	 * driver).isDisplayed();{ Log.info(sTestCaseName +
	 * " | Commissioning Complete label displayed"); }
	 * 
	 * //Take a screenshot to show what we've done Utils.takeScreenshot(driver,
	 * sTestCaseName + "-addSuccessValues"); }
	 */
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