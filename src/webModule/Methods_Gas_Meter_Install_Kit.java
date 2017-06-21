package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Gas_Meter_Install_Kit_Page;
import utility.Log;
import utility.Utils;

public class Methods_Gas_Meter_Install_Kit{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method checks the main page elements on the Gas Meter Install Kit page upon initial 
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
	
		//Check that all of the elements that are expected are displayed
		Objects_Gas_Meter_Install_Kit_Page.lbl_Gas_Install_Kit(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Install Kit label displayed as expected");
		}
		
		Objects_Gas_Meter_Install_Kit_Page.btn_Install_Kit_Used_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Install Kit Used - Yes radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Install_Kit_Page.btn_Install_Kit_Used_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Install Kit Used - No radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Install Kit page in order to 
	* force a successful install kit scenario
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
	
		//Add correct responses for a successful install kit scenario 
		Objects_Gas_Meter_Install_Kit_Page.btn_Install_Kit_Used_Yes(driver).click();{
		Log.info(sTestCaseName + " | Install Kit Used - Yes radio button clicked");
		}
		Objects_Gas_Meter_Install_Kit_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Gas_Meter_Install_Kit_Page.lbl_Gas_Install_Kit_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Install Kit Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}