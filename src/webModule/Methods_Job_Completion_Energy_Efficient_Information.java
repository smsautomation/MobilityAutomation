package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Job_Completion_Energy_Efficiency_Information_Page;
import utility.Log;
import utility.Utils;

public class Methods_Job_Completion_Energy_Efficient_Information{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method checks the main page elements on the Job Completion Energy Efficient Information 
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
		Objects_Job_Completion_Energy_Efficiency_Information_Page.lbl_Energy_Efficiency_Information(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Energy Efficiency Information label displayed as expected");
		}
		
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Energy_Efficiency_Information_Provided_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Energy Efficiency Information Provided - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Energy_Efficiency_Information_Provided_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Energy Efficiency Information Provided - No radio button displayed as expected");
		}
		
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Energy_Efficiency_Documentation_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Energy Efficiency Documentation - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Energy_Efficiency_Documentation_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Energy Efficiency Documentation - No radio button displayed as expected");
		}
		
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Customer_Happy_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Customer Happy - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Customer_Happy_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Customer Happy - No radio button displayed as expected");
		}
		
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Additional_Energy_Efficiency_Information_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Efficiency Information - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Additional_Energy_Efficiency_Information_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Efficiency Information - No radio button displayed as expected");
		}
		
		Objects_Job_Completion_Energy_Efficiency_Information_Page.txt_Additional_Notes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Notes textbox displayed as expected");
		}
		
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Next_Section(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Next Section button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 21/06/2017
	* Purpose: This method adds the required responses in the Job Completion Configure All Meters Installed 
	* page in order to force a successful meter configuration
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
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Energy_Efficiency_Information_Provided_Yes(driver).click();{
		Log.info(sTestCaseName + " | Energy Efficiency Information Provided - Yes radio button clicked");
		}
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Energy_Efficiency_Documentation_Yes(driver).click();{
		Log.info(sTestCaseName + " | Energy Efficiency Documenation - Yes radio button clicked");
		}
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Customer_Happy_Yes(driver).click();{
		Log.info(sTestCaseName + " | Customer Happy - Yes radio button clicked");
		}
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Additional_Energy_Efficiency_Information_No(driver).click();{
		Log.info(sTestCaseName + " | Additional Energy Information - No radio button clicked");
		}
		Objects_Job_Completion_Energy_Efficiency_Information_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Job_Completion_Energy_Efficiency_Information_Page.lbl_Energy_Efficiency_Information_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Configure All Meters Installed Complete Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
			
//END OF METHODS
}