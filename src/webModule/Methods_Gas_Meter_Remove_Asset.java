package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Gas_Meter_Remove_Asset_Page;
import utility.Log;
import utility.Utils;

public class Methods_Gas_Meter_Remove_Asset{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 20/06/2017
	* Purpose: This method checks the main page elements on the Gas Meter Remove Asset page upon 
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
		Objects_Gas_Meter_Remove_Asset_Page.lbl_Gas_Remove_Asset(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Remove Asset label displayed as expected");
		}
		
		Objects_Gas_Meter_Remove_Asset_Page.cbx_Remove_Asset_Status(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Remove Asset Status combobox displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 20/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Remove Asset page in order
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
		Log.info("addSuccessValues: Started");
		//Add correct responses for a successful remove asset 
		Objects_Gas_Meter_Remove_Asset_Page.cbx_Remove_Asset_Status(driver).click();
		Log.info(sTestCaseName + " | Removed Asset Status Clicked");
		Objects_Gas_Meter_Remove_Asset_Page.cbx_Remove_Asset_Status(driver).sendKeys("Off");
		Log.info(sTestCaseName + " | Removed Asset Status Select Off Circuit");
		Objects_Gas_Meter_Remove_Asset_Page.cbx_Remove_Asset_Status(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Off Circuit selected from Remove Asset Status combobox");
		}
		Objects_Gas_Meter_Remove_Asset_Page.btn_Confirm_Asset_Removed(driver).click();{
		Log.info(sTestCaseName + " | Confirm Asset Removed - Yes radio button clicked");
		}
		Objects_Gas_Meter_Remove_Asset_Page.btn_Remove_Success_OK(driver).click();{
		Log.info(sTestCaseName + " | Remove Success OK button clicked");
		}
		Objects_Gas_Meter_Remove_Asset_Page.lbl_Gas_Remove_Asset_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Remove Asset Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}