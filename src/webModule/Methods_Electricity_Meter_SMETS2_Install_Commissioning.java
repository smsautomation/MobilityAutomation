package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Electricity_Meter_SMETS2_Install_Commissioning_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_SMETS2_Install_Commissioning{
	
		
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
		Objects_Electricity_Meter_SMETS2_Install_Commissioning_Page.lbl_Install_Commissioning(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Install & Commissioning label displayed as expected");
		}
		
		//Check that all of the elements that are expected are displayed
		Objects_Electricity_Meter_SMETS2_Install_Commissioning_Page.btn_Install_EICOM(driver).isDisplayed();{
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
	public static void addSuccessValuesINST(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful commissioning scenario 
		Objects_Electricity_Meter_SMETS2_Install_Commissioning_Page.btn_Install_EICOM(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
	    Thread.sleep(2000);
		//Add correct responses for a successful commissioning scenario 
		Objects_Electricity_Meter_SMETS2_Install_Commissioning_Page.btn_EICOM_Successful(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Thread.sleep(2000);
		Objects_Electricity_Meter_SMETS2_Install_Commissioning_Page.btn_Submit(driver).click();{
		Log.info(sTestCaseName + " | Submit button clicked");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		

	//END OF ADD SUCCESS VALUES METHOD
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
	public static void addSuccessValuesEXCH(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful commissioning scenario 
		Objects_Electricity_Meter_SMETS2_Install_Commissioning_Page.btn_Install_EICOM(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
	    Thread.sleep(2000);
		//Add correct responses for a successful commissioning scenario 
		Objects_Electricity_Meter_SMETS2_Install_Commissioning_Page.btn_EICOM_Successful(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	//Added by Shiva Pasham
	public static void addSuccessValuesEXCH21(WebDriver driver, String sTestCaseName) throws Exception{
		
		//Click Send Message Button
		Objects_Electricity_Meter_SMETS2_Install_Commissioning_Page.btn_Send_Message(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
	    Thread.sleep(2000);
		
		//Click Send Message Button
		Objects_Electricity_Meter_SMETS2_Install_Commissioning_Page.btn_Awaiting_Response(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Awaiting Response button is displayed");
		}
	    Thread.sleep(2000);
	    
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
		
//END OF METHODS
}