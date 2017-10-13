package webModule;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Gas_Meter_New_Regulator_Page;
import utility.Log;
import utility.Utils;

public class Methods_Gas_Meter_New_Regulator{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 20/06/2017
	* Purpose: This method checks the main page elements on the Gas Meter New Regulator page 
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
		Objects_Gas_Meter_New_Regulator_Page.lbl_Gas_New_Regulator(driver).isDisplayed();{
		Log.info(sTestCaseName + " | New Meter Details label displayed as expected");
		}
		
		Objects_Gas_Meter_New_Regulator_Page.txt_Regulator_Serial_Number(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Regulator Serial Number textbox displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 20/06/2017
	* Purpose: This method adds the required responses in the Gas Meter New Regulator page in 
	* order to force a successful new regulator scenario
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
	
		//Add correct responses for a successful new regulator
		Objects_Gas_Meter_New_Regulator_Page.txt_Regulator_Serial_Number(driver).click();
		Log.info(sTestCaseName + " | Clicked into box I think");
		Objects_Gas_Meter_New_Regulator_Page.txt_Regulator_Serial_Number(driver).sendKeys("12345");
		Log.info(sTestCaseName + " | Number 1234 in");
		Objects_Gas_Meter_New_Regulator_Page.lbl_Serial_Asset_Note(driver).click();{
		Log.info(sTestCaseName + " | Regulator Serial Number entered in the Regulator Serial number textbox");
		}
		Objects_Gas_Meter_New_Regulator_Page.btn_Scan_Asset_Now(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");
		}
		Objects_Gas_Meter_New_Regulator_Page.btn_Add_Asset_OK(driver).click();{
		Log.info(sTestCaseName + " | Add Asset OK button clicked");
		}
		Objects_Gas_Meter_New_Regulator_Page.btn_Updated_OK(driver).click();{
		Log.info(sTestCaseName + " | Updated OK button clicked");
		}
		Objects_Gas_Meter_New_Regulator_Page.lbl_Gas_New_Regulator_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | New Meter Details Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}