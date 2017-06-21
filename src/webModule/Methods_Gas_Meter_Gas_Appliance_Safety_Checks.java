package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page;
import utility.Log;
import utility.Utils;

public class Methods_Gas_Meter_Gas_Appliance_Safety_Checks{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method checks the main page elements on the Gas Meter Gas Appliance Safety Checks page
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
	
		//Check that all of the elements of that are expected are displayed
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.lbl_Gas_Appliance_Safety_Checks(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Appliance Safety Checks Test label displayed as expected");
		}
		
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.btn_Earth_Bonding_Installed_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Earth Bonding Installed - Yes radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.btn_Earth_Bonding_Installed_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Earth Bonding Installed - No radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.btn_Landlord_Property_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Landlord Property - Yes radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.btn_Landlord_Property_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Landlord Property - No radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.btn_Add_Appliance(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Add Appliance button displayed as expected");
		}
		
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.btn_All_Appliances_Tested(driver).isDisplayed();{
		Log.info(sTestCaseName + " | All Appliances Tested button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Gas Appliance Safety Checks page 
	* in order to force a successful gas appliance safety check
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
	
		//Add correct responses for a successful gas appliance safety check
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.btn_Earth_Bonding_Installed_Yes(driver).click();{
		Log.info(sTestCaseName + " | Earth Bonding Installed - Yes radio button clicked");
		}
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.btn_Landlord_Property_No(driver).click();{
		Log.info(sTestCaseName + " | Landlord Property - No radio button clicked");
		}
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.btn_All_Appliances_Tested(driver).click();{
		Log.info(sTestCaseName + " | All Appliances Tested button clicked");
		}
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.lbl_Gas_Appliance_Safety_Checks_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Appliance Safety Checks Complete Label displayed");
		}
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.btn_Submit(driver).click();{
		Log.info(sTestCaseName + " | Submit button clicked");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
			
//END OF METHODS
}