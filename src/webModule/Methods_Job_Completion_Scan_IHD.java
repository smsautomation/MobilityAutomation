package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjectRepositories.Objects_Meter_Comms_Hub_Serial_Number_Page;
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
	public static void viewPageSMETS2(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements of that are expected are displayed
		Objects_Job_Completion_Scan_IHD_Page.lbl_Scan_IHD(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Scan IHD label displayed as expected");
		}
		
		Objects_Job_Completion_Scan_IHD_Page.cbx_Select_Valid_IHD_Asset(driver).isDisplayed();{
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
		public static void addSuccessValuesSMETS2(WebDriver driver, String sTestCaseName) throws Exception{
		
			//Click on the Asset selection Combo box and select the first option
			Objects_Job_Completion_Scan_IHD_Page.cbx_Select_Valid_IHD_Asset(driver).click();{
			Log.info(sTestCaseName + " | cbx_Comms_Hub_Select - Select box clicked");
			}
			Objects_Job_Completion_Scan_IHD_Page.cbx_Select_Valid_IHD_Asset(driver).sendKeys(Keys.ARROW_DOWN);
			Objects_Job_Completion_Scan_IHD_Page.cbx_Select_Valid_IHD_Asset(driver).sendKeys(Keys.ENTER);{
			Log.info(sTestCaseName + " | cbx_Comms_Hub_Select first option - Select box clicked");
			}
			//Define the Combobox element and get the text of the first option and assign to the variable selectedComboValue
			//Select comboBox = new Select(driver.findElement(By.id("cbx_CommHub_sel")));
			Select comboBox = new Select(Objects_Job_Completion_Scan_IHD_Page.cbx_Select_Valid_IHD_Asset(driver));
			String selectedComboValue = comboBox.getFirstSelectedOption().getText();{
			Log.info(sTestCaseName + " | Got data of the first option and assigned to variable");
			}
			//Click on the Serial Scan text box and enter in the Serial number assigned to the variable selectedComboValue 
			Objects_Job_Completion_Scan_IHD_Page.txt_IHD_Serial_No(driver).click();{
			Log.info(sTestCaseName + " | Serial Number Box - Text Box clicked");
			}
			Objects_Job_Completion_Scan_IHD_Page.txt_IHD_Serial_No(driver).sendKeys(selectedComboValue);{
			Log.info(sTestCaseName + " | First Option of Combo Box - Text Entered");
			}
			//Click on the Label bar to get out of the Text box and move on
			Objects_Job_Completion_Scan_IHD_Page.lbl_Scan_IHD(driver).click();{
			Log.info(sTestCaseName + " | Click Away for the Text Box on the Label - Label clicked");
			}
			Thread.sleep(500);
			//Click Next on the Pop Up Dialog Box
			Objects_Job_Completion_Scan_IHD_Page.btn_Serial_Match_Next(driver).click();{
			Log.info(sTestCaseName + " | Matched Asset Next button clicked");
			}	
			//Click the Next Section Button and check the section bar is closed
			Objects_Meter_Comms_Hub_Serial_Number_Page.btn_Next_Section(driver).click();{
			Log.info(sTestCaseName + " | Scan Asset Now button clicked");
			}		
			//Click on the Label bar to get out of the Text box and move on
			Objects_Job_Completion_Scan_IHD_Page.lbl_Scan_IHD_Complete(driver).click();{
			Log.info(sTestCaseName + " | Click Away for the Text Box on the Label - Label clicked");
			}
					
			//Take a screenshot to show what we've done
			Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
			
	//END OF ADD SUCCESS VALUES METHOD
	}
			
//END OF METHODS
}