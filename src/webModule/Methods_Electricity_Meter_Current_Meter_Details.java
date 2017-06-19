package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Electricity_Meter_Current_Meter_Details_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Current_Meter_Details{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Current Meter Details page 
	* upon initial landing
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
		Objects_Electricity_Meter_Current_Meter_Details_Page.lbl_Current_Meter_Details(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Current Meter Details label displayed as expected");
		}
		
		Objects_Electricity_Meter_Current_Meter_Details_Page.btn_Update_Values(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Update Values button displayed as expected");
		}
		
		Objects_Electricity_Meter_Current_Meter_Details_Page.btn_Existing_Meter_Correct_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Existing Meter Details correct - Yes radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Current_Meter_Details_Page.btn_Existing_Meter_Correct_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Existing Meter Details correct - No radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Current Meter Details page
	* in order to force a successful meter confirmation
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
	
		//Add correct responses for a successful current meter confirmation 
		Objects_Electricity_Meter_Current_Meter_Details_Page.btn_Existing_Meter_Correct_Yes(driver).click();{
		Log.info(sTestCaseName + " | Existing Meter Details correct - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Current_Meter_Details_Page.lbl_Current_Meter_Details_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Current Meter Details Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}