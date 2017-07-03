package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Electricity_Meter_Capture_Warrant_Call_Data_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Capture_Warrant_Call_Data_Elec{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 03/07/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Capture Warrant Call Data 
	* - Elec page upon initial landing
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
		Objects_Electricity_Meter_Capture_Warrant_Call_Data_Page.lbl_Capture_Warrant_Call_Data_Elec(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture Warrant Call Data Elec label displayed as expected");
		}
		
		Objects_Electricity_Meter_Capture_Warrant_Call_Data_Page.btn_Meter_Exchanged(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Meter Exchanged radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Capture_Warrant_Call_Data_Page.btn_Meter_DeEnergised(driver).isDisplayed();{
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
	* Purpose: This method adds the required responses in the Electricity Meter Capture Warrant Call Data 
	* - Elec page in order to force a successful outcome
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
		Objects_Electricity_Meter_Capture_Warrant_Call_Data_Page.btn_Meter_Exchanged(driver).click();{
		Log.info(sTestCaseName + " | Meter Exchanged radio button clicked");
		}
		Objects_Electricity_Meter_Capture_Warrant_Call_Data_Page.lbl_Capture_Warrant_Call_Data_Elec_Completed(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture Warrant Call Data - Elec Complete Label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	
	
//END OF METHODS
}