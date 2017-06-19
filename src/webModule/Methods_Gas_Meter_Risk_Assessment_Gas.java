package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Gas_Meter_Risk_Assessment_Gas_Page;
import utility.Log;
import utility.Utils;

public class Methods_Gas_Meter_Risk_Assessment_Gas{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Gas Meter Risk Assessment - Gas page upon
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
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.lbl_Risk_Assessment_Gas(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Risk Assessment - Gas label displayed as expected");
		}
		
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Capture_Meter_Pressure_Low(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture Meter Pressure - Low radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Capture_Meter_Pressure_Med(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture Meter Pressure - Med radio button displayed as expected");
		}
		
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Risk Assessment - Gas page in 
	* order to force a successful risk assessment - gas scenario
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
	
		//Add correct responses for a successful risk assessment - gas scenario 
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Capture_Meter_Pressure_Low(driver).click();{
		Log.info(sTestCaseName + " | Capture Meter Pressure - Low radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Volt_Stick_Check_Pass(driver).click();{
		Log.info(sTestCaseName + " | Volt Stick Check - Pass radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Check_Signs_Tampering_Pass(driver).click();{
		Log.info(sTestCaseName + " | Check Signs Tampering - Pass radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_ECV_Checks_Pass(driver).click();{
		Log.info(sTestCaseName + " | ECV Checks - Pass radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Work_Area_Safety_Check_Pass(driver).click();{
		Log.info(sTestCaseName + " | Work Area Safety Check - Pass radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Safe_To_Continue_Yes(driver).click();{
		Log.info(sTestCaseName + " | Safe To Continue - Yes radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.lbl_Risk_Assessment_Gas_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Risk Assessment Gas Completed label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addAbortValuesLowGas
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Risk Assessment - Gas page in 
	* order to force an aborted risk assessment - gas with low pressure scenario
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
	public static void addAbortValuesLowGas(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for an aborted low gas risk assessment scenario 
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Capture_Meter_Pressure_Low(driver).click();{
		Log.info(sTestCaseName + " | Capture Meter Pressure - Low radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Volt_Stick_Check_Fail(driver).click();{
		Log.info(sTestCaseName + " | Volt Stick Check - Fail radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Check_Signs_Tampering_Fail(driver).click();{
		Log.info(sTestCaseName + " | Check Signs Tampering - Fail radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_ECV_Checks_Fail(driver).click();{
		Log.info(sTestCaseName + " | ECV Checks - Fail radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Work_Area_Safety_Check_Fail(driver).click();{
		Log.info(sTestCaseName + " | Work Area Safety Check - Pass radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Safe_To_Continue_No(driver).click();{
		Log.info(sTestCaseName + " | Safe To Continue - No radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.lbl_Gas_Meter_Procedure_Fail(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Meter Procedure Fail label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValuesLowGas");
		
	//END OF ADD ABORT VALUES LOW GAS METHOD
	}	
	
	/* **************************************************************************************************
	* Function: addAbortValuesMedGas
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Risk Assessment - Gas page in 
	* order to force an aborted risk assessment - gas with med pressure scenario
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
	public static void addAbortValuesMedGas(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for an aborted med gas risk assessment  scenario 
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Capture_Meter_Pressure_Med(driver).click();{
		Log.info(sTestCaseName + " | Capture Meter Pressure - Med radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.btn_Med_Pressure_Perform_Job_No(driver).click();{
		Log.info(sTestCaseName + " | Volt Stick Check - Fail radio button clicked");
		}
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.lbl_Gas_Meter_Procedure_Fail(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Meter Procedure Fail label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValuesMedGas");
		
	//END OF ADD ABORT VALUES MED GAS METHOD
	}
		
//END OF METHODS
}