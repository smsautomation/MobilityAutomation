package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Capture Initial Photo
	* Of Elec Installation page upon initial landing
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
		Objects_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation_Page.lbl_Capture_Initial_Photo_Of_Elec_Installation(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Suitable for Smart Installation label displayed as expected");
		}
		
		Objects_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation_Page.btn_Capture_Photo(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Suitable For Smart Installation - Yes radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Capture Initial Photo Of
	* Elec Installation page in order to force a successful outcome
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
	
		//Add correct responses for a successful suitable for smart installation
		Objects_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation_Page.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation_Page.lbl_Capture_Initial_Photo_Of_Elec_Installation_Completed(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture Initial Photo Of Elec Installation Complete Label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	
	
//END OF METHODS
}