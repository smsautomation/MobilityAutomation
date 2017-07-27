package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Electricity_Meter_Remove_Meter_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Remove_Meter{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Remove Meter page upon 
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
		Objects_Electricity_Meter_Remove_Meter_Page.lbl_Remove_Meter(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Remove Meter label displayed as expected");
		}
		
		Objects_Electricity_Meter_Remove_Meter_Page.cbx_Status_Of_Asset(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Status of Asset combobox displayed as expected");
		}
		
		Objects_Electricity_Meter_Remove_Meter_Page.txt_Removed_Meter_Readings(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Removed Meter Readings textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Remove_Meter_Page.btn_Unable_Read_Meter_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Unable to Read Meter radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Remove Meter page in order
	* to force a successful meter removal
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
	
		//Add correct responses for a successful remove meter 
		/*
		 Thread.sleep(2000);
		Objects_Electricity_Meter_Remove_Meter_Page.cbx_Status_Of_Asset(driver).click();
		Objects_Electricity_Meter_Remove_Meter_Page.cbx_Status_Of_Asset(driver).sendKeys("No");
		Objects_Electricity_Meter_Remove_Meter_Page.cbx_Status_Of_Asset(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | No Fault Found selected from Status of Asset combobox");
		}
		*/
		Objects_Electricity_Meter_Remove_Meter_Page.txt_Removed_Meter_Readings(driver).click();
		Objects_Electricity_Meter_Remove_Meter_Page.txt_Removed_Meter_Readings(driver).sendKeys("12345");
		Objects_Electricity_Meter_Remove_Meter_Page.txt_Removed_Meter_Readings(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Meter Readings entered in the Removed Meter Readings textbox");
		}
		Objects_Electricity_Meter_Remove_Meter_Page.lbl_Remove_Meter_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Remove Meter Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}