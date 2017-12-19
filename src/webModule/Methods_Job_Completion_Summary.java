package webModule;

import org.openqa.selenium.WebDriver;

//import pageObjectRepositories.Objects_Job_Completion_Device_Binding_Commissioning_Page;
import pageObjectRepositories.Objects_Job_Completion_Summary_Page;
import utility.Log;
import utility.Utils;

public class Methods_Job_Completion_Summary{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method checks the main page elements on the Job Completion Summary page upon initial 
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
		Objects_Job_Completion_Summary_Page.lbl_Summary(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Summary label displayed as expected");
		}

		if ("Exchange_1_End_To_End_Chrome".equals(sTestCaseName)
				||"INST_14_End_To_End_Chrome".equals(sTestCaseName)
				||"Exchange_19_End_To_End_Chrome".equals(sTestCaseName))
		{ 
			Objects_Job_Completion_Summary_Page.lbl_Gas_Meter_Mprn(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Gas Meter MPRN label displayed as expected");
			}		
		}
		else if ("Exchange_2_End_To_End_Chrome".equals(sTestCaseName)
				|| "NMEX_5_End_To_End_Chrome".equals(sTestCaseName)
				|| "INST_15_End_To_End_Chrome".equals(sTestCaseName)
				|| "Exchange_20_End_To_End_Chrome".equals(sTestCaseName))
		{ 
			Objects_Job_Completion_Summary_Page.lbl_Electricity_Meter_Mpan(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Electricity Meter MPAN label displayed as expected");
			}
			System.out.println("Doing the elseif"); 
		}
		else if ("Exchange_3_End_To_End_Chrome".equals(sTestCaseName)
				|| "Exchange_9_End_To_End_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Elec_HAN_WAN_Checks_Page_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Failed_Test_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Low_Pressure_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Gas_Risk_Assessment_Gas_Abort_Low_Pressure_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Gas_Risk_Assessment_Gas_Abort_Med_Pressure_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Gas_SMeter_Post_Installation_Pressure_Drop_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Elec_HAN_WAN_Checks_Page_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Gas_Meter_Initial_Risk_Assessment_Gas_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Failed_Test_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Low_Pressure_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Gas_Risk_Assessment_Gas_Abort_Low_Pressure_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Gas_Risk_Assessment_Gas_Abort_Med_Pressure_Chrome".equals(sTestCaseName)
				|| "FLTY_17_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome".equals(sTestCaseName)
				|| "FLTY_17_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Failed_Test_Abort_Chrome".equals(sTestCaseName)
				|| "FLTY_17_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Low_Pressure_Abort_Chrome".equals(sTestCaseName)
				|| "FLTY_17_Gas_Risk_Assessment_Gas_Abort_Low_Pressure_Chrome".equals(sTestCaseName)
				|| "FLTY_17_Gas_Risk_Assessment_Gas_Abort_Med_Pressure_Chrome".equals(sTestCaseName)
				|| "FLTY_17_Gas_Suitable_For_Smart_Installation_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_21_End_To_End_Chrome".equals(sTestCaseName)
				|| "INST_16_End_To_End_Chrome".equals(sTestCaseName))
		{ 
			Objects_Job_Completion_Summary_Page.lbl_Electricity_Meter_Mpan(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Electricity Meter MPAN label displayed as expected");
			}
		 
			Objects_Job_Completion_Summary_Page.lbl_Gas_Meter_Mprn(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Gas Meter MPRN label displayed as expected");
			}
			System.out.println("Doing the elseif"); 
		} 
		else 		
		{ 
			System.out.println("Doing the else "); 
		}						
		Objects_Job_Completion_Summary_Page.btn_Potential_Customer_Vulnerability_Identified_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Potential Customer Vulnerability Identified - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Summary_Page.txt_Additional_Notes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional notes textbox displayed as expected");
		}
		
		Objects_Job_Completion_Summary_Page.btn_Customer_Agreement_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Customer Agreement - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Summary_Page.btn_Customer_Agreement_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Customer Agreement - No radio button displayed as expected");
		}
		
			
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method adds the required responses in the Job Completion Summary page in order to force
	* a successful scenario
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
	
		//Add correct responses for a successful energy efficiency provided scenario
		Objects_Job_Completion_Summary_Page.btn_Customer_Agreement_Yes(driver).click();{
		Log.info(sTestCaseName + " | Customer Agreement - Yes radio button clicked");
		}
		Objects_Job_Completion_Summary_Page.lbl_Summary_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Summary Complete Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
			
//END OF METHODS
}