package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Electricity_Meter_Initial_Meter_Reading_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Initial_Meter_Reading{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Initial Meter Reading 
	* page upon initial landing
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
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.lbl_Inital_Meter_Reading(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Initial Meter Reading label displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.txt_Capture_Meter_Reading(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture Meter Reading textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.btn_Unable_Read_Meter_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Unable to Read Meter - Yes radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Initial Meter Reading page
	* in order to force a successful initial meter reading scenario
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
	
		//Add correct responses for a successful additional tests scenario 
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.txt_Capture_Meter_Reading(driver).click();
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.txt_Capture_Meter_Reading(driver).sendKeys("1234567");{
		Log.info(sTestCaseName + " | Meter reading value entered in the Capture Meter Reading textbox");
		}
		
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.lbl_Inital_Meter_Reading(driver).click();{
		Log.info(sTestCaseName + " | Initial Meter Reading label clicked");
		}
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.lbl_Initial_Meter_Reading_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Initial Meter Reading label Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues2Registers
	* Author: Iain Storrie
	* Date: 05/07/2017
	* Purpose: This method adds the required responses in the Electricity Meter Initial Meter Reading page
	* in order to force a successful initial meter reading scenario where two meter registers are present
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
	public static void addSuccessValues2Registers(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful additional tests scenario 
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.txt_Capture_Meter_Reading(driver).click();
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.txt_Capture_Meter_Reading(driver).sendKeys("12345");{
		Log.info(sTestCaseName + " | Meter reading value entered in the Capture Meter Reading textbox");
		}
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.txt_Capture_Meter_Reading_Register_2(driver).click();
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.txt_Capture_Meter_Reading_Register_2(driver).sendKeys("34567");{
		Log.info(sTestCaseName + " | Meter reading value entered in the Capture Meter Reading textbox");
		}
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.lbl_Inital_Meter_Reading(driver).click();{
		Log.info(sTestCaseName + " | Initial Meter Reading label clicked");
		}
		Objects_Electricity_Meter_Initial_Meter_Reading_Page.lbl_Initial_Meter_Reading_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | New Meter Details Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
		
//END OF METHODS
}