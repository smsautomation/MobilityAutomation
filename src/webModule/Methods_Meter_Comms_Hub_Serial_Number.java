package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Meter_Comms_Hub_Serial_Number_Page;
import utility.Log;
import utility.Utils;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

public class Methods_Meter_Comms_Hub_Serial_Number{
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Paul Middleton
	* Date: 07/12/2017
	* Purpose: This method checks the main page elements on the Meter Comms Hub Serial Number page 
	* upon initial landing
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
	
		//Check that all of the elements that are expected are displayed
		Objects_Meter_Comms_Hub_Serial_Number_Page.lbl_Comms_Hub_Serial_Number(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Comms Hub Serial Number Label displayed as expected");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Comms Hub Serial Number Combo Box displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Paul Middleton
	* Date: 07/12/2017
	* Purpose: This method adds the required responses in the Meter Comms Hub Details page
	* in order to force a successful selection of valid Comms Hub
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
	
		//Click on the Asset selection Combo box and select the first option
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver).click();{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Select - Select box clicked");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver).sendKeys(Keys.ARROW_DOWN);
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Select first option - Select box clicked");
		}
		//Define the Combobox element and get the text of the first option and assign to the variable selectedComboValue
		//Select comboBox = new Select(driver.findElement(By.id("cbx_CommHub_sel")));
		Select comboBox = new Select(Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver));
		String selectedComboValue = comboBox.getFirstSelectedOption().getText();{
		Log.info(sTestCaseName + " | Got data of the first option and assigned to variable");
		}
		//Click on the Serial Scan text box and enter in the Serial number assigned to the variable selectedComboValue 
		Objects_Meter_Comms_Hub_Serial_Number_Page.txt_Comms_Hub_Serial_Number(driver).click();{
		Log.info(sTestCaseName + " | Serial Number Box - Text Box clicked");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.txt_Comms_Hub_Serial_Number(driver).sendKeys(selectedComboValue);{
		Log.info(sTestCaseName + " | First Option of Combo Box - Text Entered");
		}	
		//Click on the Label bar to get out of the Text box and move on
		Objects_Meter_Comms_Hub_Serial_Number_Page.lbl_Comms_Hub_Serial_Number(driver).click();{
		Log.info(sTestCaseName + " | Click Away for the Text Box on the Label - Label clicked");
		}
		Thread.sleep(500);
		//Click Next on the Pop Up Dialog Box
		Objects_Meter_Comms_Hub_Serial_Number_Page.btn_Serial_Match_Next(driver).click();{
		Log.info(sTestCaseName + " | Matched Asset Next button clicked");
		}
		Thread.sleep(500);
		//Add correct responses for a successful selection of the Comms Hub Location
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Location(driver).click();{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Location - clicked");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Location(driver).sendKeys("C");
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Location(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Location Selection Entered");
		}	
		//Add correct responses for a successful selection of the Comms Hub Connection Method
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Connection_Method(driver).click();{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Connection_Method - clicked");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Connection_Method(driver).sendKeys("ESME");
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Connection_Method(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Connection_Method Selection Entered");
		}
		//Click the Next Section Button and check the section bar is closed
		Objects_Meter_Comms_Hub_Serial_Number_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.lbl_Comms_Hub_Serial_Number_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Current Meter Details Complete label displayed");
		}

		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}