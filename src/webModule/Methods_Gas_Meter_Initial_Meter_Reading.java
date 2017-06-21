package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Gas_Meter_Initial_Meter_Reading_Page;
import utility.Log;
import utility.Utils;

public class Methods_Gas_Meter_Initial_Meter_Reading{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method checks the main page elements on the Gas Meter Initial Meter Reading 
	* page upon initial landing
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
		Objects_Gas_Meter_Initial_Meter_Reading_Page.lbl_Gas_Inital_Meter_Reading(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Initial Meter Reading label displayed as expected");
		}
		
		Objects_Gas_Meter_Initial_Meter_Reading_Page.txt_Capture_Meter_Reading(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture Meter Reading textbox displayed as expected");
		}
		
		Objects_Gas_Meter_Initial_Meter_Reading_Page.btn_Unable_Read_Meter_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Unable to Read Meter - Yes radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Initial Meter Reading page
	* in order to force a successful initial meter reading scenario
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
	
		//Add correct responses for a successful additional tests scenario 
		Objects_Gas_Meter_Initial_Meter_Reading_Page.txt_Capture_Meter_Reading(driver).click();
		Objects_Gas_Meter_Initial_Meter_Reading_Page.txt_Capture_Meter_Reading(driver).sendKeys("12345");
		Objects_Gas_Meter_Initial_Meter_Reading_Page.txt_Capture_Meter_Reading(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Meter reading value entered in the Capture Meter Reading textbox");
		}
		
		Objects_Gas_Meter_Initial_Meter_Reading_Page.lbl_Gas_Inital_Meter_Reading(driver).click();{
		Log.info(sTestCaseName + " | Initial Meter Reading label clicked");
		}
		Objects_Gas_Meter_Initial_Meter_Reading_Page.lbl_Gas_Initial_Meter_Reading_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | New Meter Details Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}