package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Determine_Emergency_Call_Out_Elec{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 04/07/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Determine Emergency Call
	* Out - Elec page upon initial landing
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
		Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page.lbl_Determine_Emergency_Call_Out_Elec(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Determine Emergency Call Out - Elec label displayed as expected");
		}
		
		Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page.btn_Elec_Meter_Supply_On(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Elec Meter Supply - On radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page.btn_Elec_Meter_Supply_Off(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Elec Meter Supply - Off radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 04/07/2017
	* Purpose: This method adds the required responses in the Electricity Meter Determine Emergency Call 
	* Out - Elec page in order to force a successful check
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
	
		//Add correct responses for a successful initial polarity check 
		Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page.btn_Elec_Meter_Supply_On(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Supply - On radio button clicked");
		}
		Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page.btn_Meter_Exchanged_Yes(driver).click();{
		Log.info(sTestCaseName + " | Meter Exchanged - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page.lbl_Determine_Emergency_Call_Out_Elec_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Determine Emergency Call Out - Elec Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addAbortValues
	* Author: Iain Storrie
	* Date: 04/07/2017
	* Purpose: This method adds the required responses in the Electricity Meter Determine Emergency Call 
	* Out - Elec page in order to force an aborted polarity check
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
	public static void addAbortValues(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for an aborted polarity check
		Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page.btn_Elec_Meter_Supply_Off(driver).click();{
		Log.info(sTestCaseName + " | elec Meter Supply - Off radio button clicked");
		}
		Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page.btn_Meter_Exchanged_No(driver).click();{
		Log.info(sTestCaseName + " | Meter Exchanged - No radio button clicked");
		}
		Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page.btn_Work_Meter_Installation_No(driver).click();{
		Log.info(sTestCaseName + " | Work Meter Installation - No radio button clicked");
		}
		Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page.btn_Complete_Job_No(driver).click();{
		Log.info(sTestCaseName + " | Complete Job - No radio button clicked");
		}
		Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page.btn_Abort(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Abort button displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
//END OF METHODS
}