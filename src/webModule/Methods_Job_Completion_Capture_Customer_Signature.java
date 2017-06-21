package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Job_Completion_Capture_Customer_Signature_Page;
import utility.Log;
import utility.Utils;

public class Methods_Job_Completion_Capture_Customer_Signature{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method checks the main page elements on the Job Completion Capture Customer Signature page upon initial 
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
		Objects_Job_Completion_Capture_Customer_Signature_Page.lbl_Capture_Customer_Signature(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture Customer Signature label displayed as expected");
		}
		
		Objects_Job_Completion_Capture_Customer_Signature_Page.txt_Customer_Signature(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Customer Signature textbox displayed as expected");
		}
		
		Objects_Job_Completion_Capture_Customer_Signature_Page.btn_Reset(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Reset button displayed as expected");
		}
		
		Objects_Job_Completion_Capture_Customer_Signature_Page.cbx_Signed_Customer_Representative(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Signed Customer Representative combobox displayed as expected");
		}
		
		Objects_Job_Completion_Capture_Customer_Signature_Page.btn_Customer_Refused_Sign_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Customer Refused Sign - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Capture_Customer_Signature_Page.btn_Customer_Refused_Sign_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Customer Refused Sign - No radio button displayed as expected");
		}
		
		Objects_Job_Completion_Capture_Customer_Signature_Page.txt_Notes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Notes textbox displayed as expected");
		}
		
			
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method adds the required responses in the Job Completion Capture Customer Signature 
	* page in order to force a successful scenario
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
	
		//Add correct responses for a successful Customer signature scenario
		Objects_Job_Completion_Capture_Customer_Signature_Page.txt_Customer_Signature(driver).click();{
		Log.info(sTestCaseName + " | Customer Signature textbox clicked");
		}
		Objects_Job_Completion_Capture_Customer_Signature_Page.cbx_Signed_Customer_Representative(driver).click();
		Objects_Job_Completion_Capture_Customer_Signature_Page.cbx_Signed_Customer_Representative(driver).sendKeys("Customer");
		Objects_Job_Completion_Capture_Customer_Signature_Page.cbx_Signed_Customer_Representative(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Customer selected from Signed Customer Representative combobox");
		}
		Objects_Job_Completion_Capture_Customer_Signature_Page.btn_Customer_Refused_Sign_No(driver).click();{
		Log.info(sTestCaseName + " | Customer Refused Sign - No radio button clicked");
		}
		Objects_Job_Completion_Capture_Customer_Signature_Page.btn_Job_Complete_Submit(driver).click();{
		Log.info(sTestCaseName + " | Job Complete - Submit button clicked");
		}
		Objects_Job_Completion_Capture_Customer_Signature_Page.btn_Job_Complete_OK(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Job Complete OK button clicked");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
			
//END OF METHODS
}