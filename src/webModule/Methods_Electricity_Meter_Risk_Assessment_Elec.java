package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Electricity_Meter_Risk_Assessment_Elec_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Risk_Assessment_Elec{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 14/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter  Risk Assessment - Elec
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
	
		//Check that all of the elements of that are expected are displayed
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.lbl_Risk_Assessment_Elec(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Risk Assessment - Elec label displayed as expected");
		}
		
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Perform_Risk_Assessment_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Perform Risk Assessment - Yes radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewRiskAssessmentYesPage
	* Author: Iain Storrie
	* Date: 14/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Risk Assessment - Elec
	* page after the Perform Risk Assessment - Yes radio button has been clicked 
	* has been clicked
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
	public static void viewRiskAssessmentYesPage(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements of that are expected are displayed
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Perform_Risk_Assessment_Yes(driver).click();{
		Log.info(sTestCaseName + " | Perform Risk Assessment - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.cbx_Risk_Reason_Code(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Risk Reason Code combobox displayed as expected");
		}
		
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Risk_Assessment_Pass_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Risk Assessment Pass - Yes radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Risk_Assessment_Pass_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Risk Assessment Pass - No radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.txt_Additional_Notes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Notes textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Capture_Photo(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture Photo button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewRiskAssessmentYesPage");
		
	//END OF VIEW RISK ASSESSMENT YES PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 14/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Risk Assessment - Elec page
	* in order to force a successful risk assessment
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
	
		//Add correct responses for a successful risk assessment - elec
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.cbx_Risk_Reason_Code(driver).click();{
		Log.info(sTestCaseName + " | Risk code - Combobox clicked");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.cbx_Risk_Reason_Code(driver).sendKeys("C99");{
		Log.info(sTestCaseName + " | Risk Code C99 - Selected");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.cbx_Risk_Reason_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Risk Code accepted - Enter pressed");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Risk_Assessment_Pass_Yes(driver).click();{
		Log.info(sTestCaseName + " | Risk Assessment - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.txt_Additional_Notes(driver).click();{
		Log.info(sTestCaseName + " | Risk Assessment Text box clicked - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.txt_Additional_Notes(driver).sendKeys("Dog under control");{
		Log.info(sTestCaseName + " | Risk Assessment Text box - Typed Reason");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.lbl_Risk_Assessment_Elec_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Risk Assessment - Elec Complete Label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		Thread.sleep(500);
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addAbortValues
	* Author: Iain Storrie
	* Date: 14/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Risk Assessment - Elec page
	* in order to force an Elec Meter Procedure Fail Abort
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
	
		//Add correct responses for an Elec Meter Procedure Fail Abort
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.cbx_Risk_Reason_Code(driver).click();{
		Log.info(sTestCaseName + " | Risk Reason Code combobox opened");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.cbx_Risk_Reason_Code(driver).sendKeys("A01");
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.cbx_Risk_Reason_Code(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Risk Reason Code selected");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Risk_Assessment_Pass_No(driver).click();{
		Log.info(sTestCaseName + " | Risk Assessment Pass - No radio button clicked");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Capture_Photo_Hazards(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo of Hazards button clicked");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Called_AIRline_Yes(driver).click();{
		Log.info(sTestCaseName + " | Called AIRline - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Reported_Risk_DNO_Yes(driver).click();{
		Log.info(sTestCaseName + " | Reported Risk DNO - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.btn_Stay_On_Site_No(driver).click();{
		Log.info(sTestCaseName + " | Stay On Site - No radio button clicked");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.lbl_Elec_Meter_Procedure_Fail(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Elec Meter Procedure Fail Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValues");
		
	//END OF ADD ABORT VALUES METHOD
	}
	
//END OF METHODS
}