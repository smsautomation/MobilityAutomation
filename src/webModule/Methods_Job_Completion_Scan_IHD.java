package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Job_Completion_Scan_IHD_Page;
import utility.Log;
import utility.Utils;

public class Methods_Job_Completion_Scan_IHD{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 06/07/2017
	* Purpose: This method checks the main page elements on the Job Completion Scan IHD page upon initial 
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
		Objects_Job_Completion_Scan_IHD_Page.lbl_Scan_IHD(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Scan IHD label displayed as expected");
		}
		
		Objects_Job_Completion_Scan_IHD_Page.txt_IHD_Serial_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | IHD Serial No textbox displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 06/07/2017
	* Purpose: This method adds the required responses in the Job Completion Scan IHD page in order to 
	* force a successful scan
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
		Objects_Job_Completion_Scan_IHD_Page.txt_IHD_Serial_No(driver).click();
		Objects_Job_Completion_Scan_IHD_Page.txt_IHD_Serial_No(driver).sendKeys("12345");{
		Log.info(sTestCaseName + " | IHD Serial No entered");
		}
		Objects_Job_Completion_Scan_IHD_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Thread.sleep(500);
		Objects_Job_Completion_Scan_IHD_Page.btn_Scan_Asset_Now(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");
		}
		Thread.sleep(500);
		Objects_Job_Completion_Scan_IHD_Page.btn_Add_Asset_OK(driver).click();{
		Log.info(sTestCaseName + " | Add Asset - OK button clicked");
		}
		Thread.sleep(500);
		Objects_Job_Completion_Scan_IHD_Page.btn_OK(driver).click();{
		Log.info(sTestCaseName + " | OK button clicked");
		}
		Objects_Job_Completion_Scan_IHD_Page.lbl_Scan_IHD_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Scan IHD Complete Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
			
//END OF METHODS
}