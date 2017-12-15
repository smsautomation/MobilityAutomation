package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Job_Completion_SMETS2_IHD_Commissioning_Page;
import utility.Log;
import utility.Utils;

public class Methods_Job_Completion_SMETS2_IHD_Commissioning{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Install & Commissioning page upon 
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
		Objects_Job_Completion_SMETS2_IHD_Commissioning_Page.lbl_IHD_Commissioning(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Install & Commissioning label displayed as expected");
		}
		
		//Check that all of the elements that are expected are displayed
		Objects_Job_Completion_SMETS2_IHD_Commissioning_Page.btn_Install_XITTD(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Install & Commissioning label displayed as expected");
		}

		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Paul Middleton
	* Date: 05/07/2017
	* Purpose: This method adds the required responses in the Electricity Meter Install & Commissioning page in 
	* order to force a successful commissioning scenario with EICOM DCC message is generated
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
		Objects_Job_Completion_SMETS2_IHD_Commissioning_Page.btn_Install_XITTD(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
	    Thread.sleep(2000);
		//Add correct responses for a successful commissioning scenario 
	    Objects_Job_Completion_SMETS2_IHD_Commissioning_Page.btn_XITTD_Successful(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");

	//END OF ADD SUCCESS VALUES METHOD
	}
		
//END OF METHODS
}