package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Electricity_Meter_Initial_Risk_Assessment_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Initial_Risk_Assessment{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 14/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Initial Risk Assessment
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
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.lbl_Initial_Risk_Assessment(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Initial Risk Assessment label displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_Smell_Gas_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Can you smell Gas - Yes radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_Smell_Gas_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Can you smell Gas - No radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewElecInitialRiskAssessmentPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewSmellGasPage
	* Author: Iain Storrie
	* Date: 14/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Initial Risk Assessment
	* page after the Smell Gas - Yes radio button has been clicked button
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
	public static void viewSmellGasPage(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements of that are expected are displayed
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_Smell_Gas_Yes(driver).click();{
		Log.info(sTestCaseName + " | Smell Gas - Yes radio button clicked");
		}
		
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_Turned_Off_Gas_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Turned Off Gas - Yes radio button displayed as expected");
		}
		
		Thread.sleep(500);
		
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_Called_EGP_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Called EGP - Yes radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.txt_EGP_Ref_Number(driver).isDisplayed();{
		Log.info(sTestCaseName + " | EGP Ref Number textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_Reported_Incident_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Reported Incident - Yes radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_Reported_Incident_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Reported Incident - No radio button displayed as expected");
		}
		
		/*if (Objects_Electricity_Meter_Initial_Risk_Assessment_Page.txt_AIRline_Reference_Number(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | AIRline Reference Number textbox displayed");		
		}
				
		if (Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_OK_To_Proceed_Yes(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | OK to Proceed - Yes radio button displayed");		
		}
		
		if (Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_OK_To_Proceed_No(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | OK to Proceed - No radio button displayed");		
		}
		*/
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewSmellGasPage");
		
	//END OF VIEW SMELL GAS PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 14/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Initial risk Assessment page
	* in order to force a successful initial risk assessment
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
	
		//Add correct responses for a successful initial risk assessment
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_Smell_Gas_No(driver).click();{
		Log.info(sTestCaseName + " | Smell Gas - No radio button clicked");
		}
		
		/*Objects_Electricity_Meter_Initial_Risk_Assessment_Page.lbl_Initial_Risk_Assessment_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Initial Risk Assessment Complete Label displayed");
		
		}*/
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addAbortValues
	* Author: Paul Middleton
	* Date: 22/12/2017
	* Purpose: This method adds the required responses in the Electricity Meter Initial risk Assessment page
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
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_Smell_Gas_Yes(driver).click();{
		Log.info(sTestCaseName + " | Smell Gas - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_Turned_Off_Gas_Yes(driver).click();{
		Log.info(sTestCaseName + " | Turned Gas Off - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_Called_EGP_Yes(driver).click();{
		Log.info(sTestCaseName + " |Called EGP - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.txt_EGP_Ref_Number(driver).click();{
		Log.info(sTestCaseName + " | Text Box EGP Ref - clicked");
		}
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.txt_EGP_Ref_Number(driver).sendKeys("000554");{
		Log.info(sTestCaseName + " | Text Box EGP Ref - Ref Entered");
		}
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_Reported_Incident_Yes(driver).click();{
		Log.info(sTestCaseName + " | Reported Incident - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.txt_AIRline_Reference_Number(driver).click();{
		Log.info(sTestCaseName + " | Text Box Airline Ref - clicked");
		}
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.txt_AIRline_Reference_Number(driver).sendKeys("000554");{
		Log.info(sTestCaseName + " | Text Box Airline Ref - Ref Entered");
		}
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.btn_OK_To_Proceed_No(driver).click();{
		Log.info(sTestCaseName + " | OK to Proceed - No radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.lbl_Elec_Meter_Procedure_Fail(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Elec Meter Procedure Fail Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValues");
		
	//END OF ADD ABORT VALUES METHOD
	}
	
//END OF METHODS
}