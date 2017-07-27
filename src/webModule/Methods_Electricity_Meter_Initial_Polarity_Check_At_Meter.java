package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Initial_Polarity_Check_At_Meter{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Initial Polarity Check At 
	* Meter page upon initial landing
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
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.lbl_Initial_Polarity_Check_At_Meter(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Initial Polarity Check At Meter label displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Polarity_Check_At_Cut_Out_Pass(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Polarity Check At Cut Out - Pass radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Polarity_Check_At_Cut_Out_Fail(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Polarity Check At Cut Out - Fail radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Initial Polarity Check At 
	* Meter page in order to force a successful check
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
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Polarity_Check_At_Cut_Out_Pass(driver).click();{
		Log.info(sTestCaseName + " | Polarity Check At Cut Out - Pass radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Polarity_Check_At_Meter_Pass(driver).click();{
		Log.info(sTestCaseName + " | Polarity Check At Cut Out - Pass radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.lbl_Initial_Polarity_Check_At_Meter_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Initial Polarity Check At Meter Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addAbortValues
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Initial Polarity Check At
	* Meter page in order to force an aborted polarity check
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
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Polarity_Check_At_Cut_Out_Fail(driver).click();{
		Log.info(sTestCaseName + " | Polarity Check At Cut Out - Fail radio button clicked");
		}
		/*
		 * Thread.sleep(2000);
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Polarity_Check_At_Meter_Fail(driver).click();{
		Log.info(sTestCaseName + " | Polarity Check At Cut Out - Fail radio button clicked");
		}
		*/
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Reported_Team_Manager_Yes(driver).click();{
		Log.info(sTestCaseName + " | Reported To Team Manager - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.txt_Team_Manager_Name(driver).click();
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.txt_Team_Manager_Name(driver).sendKeys("Test Manager");{
		Log.info(sTestCaseName + " | Team Manager entered in the Team Manager Name textbox");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Team_Manager_Authorisation_No(driver).click();{
		Log.info(sTestCaseName + " | Team Manager Authorisation - No radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Abort(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Abort button displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
//END OF METHODS
}