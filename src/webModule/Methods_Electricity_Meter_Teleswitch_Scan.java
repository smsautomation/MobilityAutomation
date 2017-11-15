package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Electricity_Meter_Teleswitch_Scan_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Teleswitch_Scan{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 06/07/2017
	* Purpose: This method checks the main page elements on the Job Completion Scan IHD page upon initial 
	* landing
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
		Objects_Electricity_Meter_Teleswitch_Scan_Page.lbl_Scan_Teleswitch(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Scan Teleswitch label displayed as expected");
		}
		
		Objects_Electricity_Meter_Teleswitch_Scan_Page.txt_Teleswitch_Serial_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | IHD Serial No textbox displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 06/07/2017
	* Purpose: This method adds the required responses in the Job Completion Scan IHD page in order to 
	* force a successful scan
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
	
		//Add correct responses for a successful installed meters configuration
		Objects_Electricity_Meter_Teleswitch_Scan_Page.txt_Teleswitch_Serial_No(driver).click();
		Objects_Electricity_Meter_Teleswitch_Scan_Page.txt_Teleswitch_Serial_No(driver).sendKeys("12345");
		Objects_Electricity_Meter_Teleswitch_Scan_Page.lbl_Scan_Teleswitch(driver).click();{
		Log.info(sTestCaseName + " | Teleswitch Serial No entered");
		}
		Objects_Electricity_Meter_Teleswitch_Scan_Page.btn_Scan_Asset_Now(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");
		}
		Objects_Electricity_Meter_Teleswitch_Scan_Page.btn_Add_Asset_OK(driver).click();{
		Log.info(sTestCaseName + " | Add Asset - OK button clicked");
		}
		Objects_Electricity_Meter_Teleswitch_Scan_Page.btn_OK(driver).click();{
		Log.info(sTestCaseName + " | OK button clicked");
		}
		Objects_Electricity_Meter_Teleswitch_Scan_Page.lbl_Scan_Teleswitch_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Scan Teleswitch Complete Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
			
//END OF METHODS
}