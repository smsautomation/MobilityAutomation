package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Job_Completion_Smart_Education_Page;
import utility.Log;
import utility.Utils;

public class Methods_Job_Completion_Smart_Education{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 06/07/2017
	* Purpose: This method checks the main page elements on the Job Completion Smart Education page upon 
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
	
		//Check that all of the elements of that are expected are displayed
		Objects_Job_Completion_Smart_Education_Page.lbl_Smart_Education(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Smart Education label displayed as expected");
		}
		
		Objects_Job_Completion_Smart_Education_Page.btn_Smart_Literature_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Smart Literature - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Smart_Education_Page.btn_Smart_Literature_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Smart Literature - No radio button displayed as expected");
		}
		
		Objects_Job_Completion_Smart_Education_Page.btn_Customer_Provided_Help_Information_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Customer Provided Help Information - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Smart_Education_Page.btn_Customer_Provided_Help_Information_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Customer Provided Help Information - No radio button displayed as expected");
		}
		
		Objects_Job_Completion_Smart_Education_Page.btn_Demonstration_Equipment_Completed_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Demonstration Equipement Completed - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Smart_Education_Page.btn_Demonstration_Equipment_Completed_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Demonstration Equipement Completed - No radio button displayed as expected");
		}
		
		Objects_Job_Completion_Smart_Education_Page.txt_Additional_Notes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Notes textbox displayed as expected");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 06/07/2017
	* Purpose: This method adds the required responses in the Job Completion Smart Education page in order 
	* to force a successful scenario
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
	
		//Add correct responses for a successful installed meters configuration
		Objects_Job_Completion_Smart_Education_Page.btn_Demonstration_Equipment_Completed_Yes(driver).click();{
		Log.info(sTestCaseName + " | Demonstration Equipment Completed - Yes radio button clicked");
		}
		Objects_Job_Completion_Smart_Education_Page.lbl_Smart_Education_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Smart Education Complete Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
			
//END OF METHODS
}