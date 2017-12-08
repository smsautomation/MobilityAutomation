package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page;
import utility.Log;
import utility.Utils;

public class Methods_Gas_Meter_Pre_Installation_Gas_Tightness_Test{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 20/06/2017
	* Purpose: This method checks the main page elements on the Gas Meter Pre Installation Gas Tightness 
	* Test page upon initial landing
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
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.lbl_Pre_Installation_Gas_Tightness_Test(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Pre Installation Gas Tightness Test label displayed as expected");
		}
		
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Gas_Tightness_Test_Carried_Out_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Tightness Test Carried Out - Yes radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Gas_Tightness_Test_Carried_Out_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Tightness Test Carried Out - No radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 20/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Pre Installation Gas Tightness Test 
	* page in order to force a successful pre installation gas tightness test 
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
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Gas_Tightness_Test_Carried_Out_Yes(driver).click();{
		Log.info(sTestCaseName + " | Gas Tightness Test Carried Out - Yes radio button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Drop_In_Pressure_No(driver).click();{
		Log.info(sTestCaseName + " | Drop In Pressure - No radio button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.lbl_Pre_Installation_Gas_Tightness_Test_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Pre Installation Gas Tightness Test Complete Label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addAbortValuesFailedTest
	* Author: Iain Storrie
	* Date: 20/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Pre Installation Gas Tightness 
	* Test page in order to force an Gas Meter Procedure Fail Abort
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
	public static void addAbortValuesFailedTest(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a Gas Meter Procedure Fail Abort
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Gas_Tightness_Test_Carried_Out_No(driver).click();{
		Log.info(sTestCaseName + " | Gas Tightness Test Carried Out - No radio button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.lbl_Gas_Meter_Procedure_Fail(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Meter Procedure Fail Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValuesFailedTest");
		
	//END OF ADD ABORT VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addAbortValuesPressureDrop
	* Author: Iain Storrie
	* Date: 20/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Pre Installation Gas Tightness 
	* Test page in order to force an Gas Meter Procedure Fail Abort
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
	public static void addAbortValuesPressureDrop(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a Gas Meter Procedure Fail Abort
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Gas_Tightness_Test_Carried_Out_Yes(driver).click();{
		Log.info(sTestCaseName + " | Gas Tightness Test Carried Out - Yes radio button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Drop_In_Pressure_Yes(driver).click();{
		Log.info(sTestCaseName + " | Drop In Pressure - Yes radio button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.cbx_Dip_Gas_Pressure(driver).click();
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.cbx_Dip_Gas_Pressure(driver).sendKeys("3.5");
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.cbx_Dip_Gas_Pressure(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | 3.5 Selected from the Dip Gas Pressure combobox");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.cbx_Meter_Type(driver).click();
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.cbx_Meter_Type(driver).sendKeys("P2");
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.cbx_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | P2 Selected from the Meter Type combobox");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Smell_Gas_Yes(driver).click();{
		Log.info(sTestCaseName + " | Smell Gas - Yes radio button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.txt_Additional_Notes(driver).click();
		Log.info(sTestCaseName + " | Additional Notes TextBox clicked");
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.txt_Additional_Notes(driver).sendKeys("Test");{
		Log.info(sTestCaseName + " | Value entered in the Additional notes textbox");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Test_Failure_Outcome_GT_Issue(driver).click();{
		Log.info(sTestCaseName + " | Test Failure Outcome GT Issue radio button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Reported_Incident_GT_Yes(driver).click();{
		Log.info(sTestCaseName + " | Reported Incident GT - Yes radio button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Reported_Incident_AIRline_No(driver).click();{
		Log.info(sTestCaseName + " | Reported Incident AIRline - No radio button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_Wait_GT_Attendance_Yes(driver).click();{
		Log.info(sTestCaseName + " | Wait GT Attendance - Yes radio button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.btn_GT_Resolve_Issue_No(driver).click();{
		Log.info(sTestCaseName + " | GT Resolve Issue - No radio button clicked");
		}
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.lbl_Gas_Meter_Procedure_Fail(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Meter Procedure Fail Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValuesPressureDrop");
		
	//END OF ADD ABORT VALUES METHOD
	}
	
//END OF METHODS
}