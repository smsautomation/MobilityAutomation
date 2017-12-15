package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page;
import utility.Log;
import utility.Utils;

public class Methods_Gas_Meter_Post_Installation_Gas_Tightness_Test{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method checks the main page elements on the Gas Meter Post Installation Gas Tightness 
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
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.lbl_Post_Installation_Gas_Tightness_Test(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Post Installation Gas Tightness Test label displayed as expected");
		}
		
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Contact_GT_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Contact GT - Yes radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Contact_GT_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Contact GT - No radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Additional_Work_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Work - Yes radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Additional_Work_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Work - No radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Gas_Tightness_Test_Performed_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Tightness Test Performed - Yes radio button displayed as expected");
		}
		
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Gas_Tightness_Test_Performed_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Tightness Test Performed - No radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Post Installation Gas Tightness Test 
	* page in order to force a successful post installation gas tightness test 
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
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Gas_Tightness_Test_Performed_Yes(driver).click();{
		Log.info(sTestCaseName + " | Gas Tightness Test Carried Out - Yes radio button clicked");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Drop_In_Pressure_No(driver).click();{
		Log.info(sTestCaseName + " | Drop In Pressure - No radio button clicked");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Gas_Tightness_Test_Passed_Yes(driver).click();{
		Log.info(sTestCaseName + " | Gas Tightness Test Passed - Yes radio button clicked");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.txt_Test_Witness_Name(driver).click();
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.txt_Test_Witness_Name(driver).sendKeys("Tester");{
		Log.info(sTestCaseName + " | Value entered in the Additional notes textbox");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Capture_Photo_Installation(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo Installation button clicked");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.lbl_Post_Installation_Gas_Tightness_Test_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Post Installation Gas Tightness Test Complete Label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addAbortValues
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Post Installation Gas Tightness 
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
	public static void addAbortValues(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a Gas Meter Procedure Fail Abort
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Gas_Tightness_Test_Performed_No(driver).click();{
		Log.info(sTestCaseName + " | Gas Tightness Test Carried Out - No radio button clicked");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.lbl_Gas_Meter_Procedure_Fail(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Meter Procedure Fail Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValues");
	}
	
	/* **************************************************************************************************
	* Function: addAbortPressureDropValues
	* Author: Paul Middleton
	* Date: 21/06/2017
	* Purpose: This method adds the required responses in the Gas Meter Post Installation Gas Tightness 
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
	public static void addAbortPressureDropValues(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a Gas Meter Procedure Fail Abort
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Drop_In_Pressure_Yes(driver).click();{
		Log.info(sTestCaseName + " | Gas Tightness Test Carried Out - No radio button clicked");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.cbx_DIP_Gas_Pressure(driver).click();
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.cbx_DIP_Gas_Pressure(driver).sendKeys("3.5");
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.cbx_DIP_Gas_Pressure(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | 3.5 Selected from the Dip Gas Pressure combobox");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.cbx_Select_Meter_Type(driver).click();
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.cbx_Select_Meter_Type(driver).sendKeys("P2");
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.cbx_Select_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | P2 Selected from the Meter Type combobox");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Gas_Tightness_Test_Passed_Yes(driver).click();{
		Log.info(sTestCaseName + " | Smell Gas - Yes radio button clicked");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.txt_Test_Witness_Name(driver).click();
		Log.info(sTestCaseName + " | Additional Notes TextBox clicked");
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.txt_Test_Witness_Name(driver).sendKeys("Tester");{
		Log.info(sTestCaseName + " | Value entered in the Additional notes textbox");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Capture_Photo_Installation(driver).click();{
		Log.info(sTestCaseName + " | Test Failure Outcome GT Issue radio button clicked");
		}
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.lbl_Gas_Meter_Procedure_Fail(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Gas Meter Procedure Fail Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValues");
	
		
	//END OF ADD ABORT VALUES METHOD
	}
		
//END OF METHODS
}