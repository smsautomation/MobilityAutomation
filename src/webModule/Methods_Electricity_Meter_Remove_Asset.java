package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Electricity_Meter_Remove_Asset_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Remove_Asset{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Remove Asset page upon 
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
		Objects_Electricity_Meter_Remove_Asset_Page.lbl_Remove_Asset(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Remove Asset label displayed as expected");
		}
		
		Objects_Electricity_Meter_Remove_Asset_Page.cbx_Remove_Asset_Status(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Remove Asset Status combobox displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Remove Asset page in order
	* to force a successful asset removal
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
	
		//Add correct responses for a successful remove asset 
		Objects_Electricity_Meter_Remove_Asset_Page.cbx_Remove_Asset_Status(driver).click();
		Objects_Electricity_Meter_Remove_Asset_Page.cbx_Remove_Asset_Status(driver).sendKeys("Off");
		Objects_Electricity_Meter_Remove_Asset_Page.cbx_Remove_Asset_Status(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Off Circuit selected from Remove Asset Status combobox");
		}
		Objects_Electricity_Meter_Remove_Asset_Page.btn_Confirm_Asset_Removed(driver).click();{
		Log.info(sTestCaseName + " | Confirm Asset Removed - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Remove_Asset_Page.btn_Remove_Success_OK(driver).click();{
		Log.info(sTestCaseName + " | Remove Success OK button clicked");
		}
		Objects_Electricity_Meter_Remove_Asset_Page.lbl_Remove_Asset_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Remove Meter Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}