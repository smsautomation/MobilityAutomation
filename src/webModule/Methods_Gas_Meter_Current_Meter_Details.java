package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Gas_Meter_Current_Meter_Details_Page;
import utility.Log;
import utility.Utils;

public class Methods_Gas_Meter_Current_Meter_Details{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 20/06/2017
	* Purpose: This method checks the main page elements on the Gas Meter Current Meter Details page 
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
		Objects_Gas_Meter_Current_Meter_Details_Page.lbl_Gas_Current_Meter_Details(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Current Meter Details label displayed as expected");
		}
		
		Objects_Gas_Meter_Current_Meter_Details_Page.btn_Update_Values(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Update Values button displayed as expected");
		}
		
		Objects_Gas_Meter_Current_Meter_Details_Page.btn_Existing_Gas_Meter_Correct_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Existing Meter Details correct - Yes radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Current_Meter_Details_Page.btn_Existing_Gas_Meter_Correct_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Existing Meter Details correct - No radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 20/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Current Meter Details page
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
		Objects_Gas_Meter_Current_Meter_Details_Page.btn_Existing_Gas_Meter_Correct_Yes(driver).click();{
		Log.info(sTestCaseName + " | Existing Meter Details correct - Yes radio button clicked");
		}
		Objects_Gas_Meter_Current_Meter_Details_Page.lbl_Gas_Current_Meter_Details_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Current Meter Details Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValuesFound
	* Author: Paul Middleton
	* Date: 16/03/2018
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
	public static void addSuccessValuesFound(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful current meter confirmation 
		Objects_Gas_Meter_Current_Meter_Details_Page.btn_Existing_Gas_Meter_Correct_No(driver).click();{
		Log.info(sTestCaseName + " | Existing Meter Details correct - Yes radio button clicked");
		}
		Objects_Gas_Meter_Current_Meter_Details_Page.lbl_Gas_Current_Meter_Details_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Current Meter Details Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}