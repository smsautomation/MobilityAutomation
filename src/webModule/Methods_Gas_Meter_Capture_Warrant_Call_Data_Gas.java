package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Gas_Meter_Capture_Warrant_Call_Data_Gas_Page;
import utility.Log;
import utility.Utils;

public class Methods_Gas_Meter_Capture_Warrant_Call_Data_Gas{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 03/07/2017
	* Purpose: This method checks the main page elements on the Gas Meter Capture Warrant Call Data 
	* - Gas page upon initial landing
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
	
		//Check that all of the elements of that are expected are displayed
		Objects_Gas_Meter_Capture_Warrant_Call_Data_Gas_Page.lbl_Capture_Warrant_Call_Data_Gas(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture Warrant Call Data Elec label displayed as expected");
		}
		
		Objects_Gas_Meter_Capture_Warrant_Call_Data_Gas_Page.btn_Meter_Exchanged(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Meter Exchanged radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Capture_Warrant_Call_Data_Gas_Page.btn_Capped_Gas_Meter(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Meter De-Energised radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 03/07/2017
	* Purpose: This method adds the required responses in the Gas Meter Capture Warrant Call Data 
	* - Gas page in order to force a successful outcome
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
	
		//Add correct responses for a successful Meter Exchange
		Objects_Gas_Meter_Capture_Warrant_Call_Data_Gas_Page.btn_Meter_Exchanged(driver).click();{
		Log.info(sTestCaseName + " | Meter Exchanged radio button clicked");
		}
		Objects_Gas_Meter_Capture_Warrant_Call_Data_Gas_Page.btn_Meter_Type_Smart_Prepayment(driver).click();{
		Log.info(sTestCaseName + " | Meter Type Smart Prepayment radio button clicked");
		}
		Objects_Gas_Meter_Capture_Warrant_Call_Data_Gas_Page.lbl_Capture_Warrant_Call_Data_Gas_Completed(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture Warrant Call Data - Elec Complete Label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	
	
//END OF METHODS
}