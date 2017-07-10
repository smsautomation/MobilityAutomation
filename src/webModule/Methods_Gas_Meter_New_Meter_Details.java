package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Gas_Meter_New_Meter_Details_Page;
import utility.Log;
import utility.Utils;

public class Methods_Gas_Meter_New_Meter_Details{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 20/06/2017
	* Purpose: This method checks the main page elements on the Gas Meter New Meter Details page 
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
		Objects_Gas_Meter_New_Meter_Details_Page.lbl_Gas_New_Meter_Details(driver).isDisplayed();{
		Log.info(sTestCaseName + " | New Meter Details label displayed as expected");
		}
		
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Regulator Serial Number textbox displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 20/06/2017
	* Purpose: This method adds the required responses in the Gas Meter New Meter Details page in 
	* order to force a successful new meter scenario
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
	
		//Add correct responses for a successful new meter details 
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).click();
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys("ACT");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | LPG: Landis + GYR selected from Manufacturer Letter combobox");
		}
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).click();
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys("L&G");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | L&G PP METLG210 selected from Meter Type combobox");
		}
		Objects_Gas_Meter_New_Meter_Details_Page.txt_Gas_Meter_Serial_No(driver).click();
		Objects_Gas_Meter_New_Meter_Details_Page.txt_Gas_Meter_Serial_No(driver).sendKeys("54321");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).click();{
		Log.info(sTestCaseName + " | Gas Meter Serial Number entered in the Gas Meter Serial number textbox");
		}
		Objects_Gas_Meter_New_Meter_Details_Page.btn_Scan_Asset_Now(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");
		}
		Objects_Gas_Meter_New_Meter_Details_Page.btn_Add_Asset_OK(driver).click();{
		Log.info(sTestCaseName + " | Add Asset OK button clicked");
		}
		Objects_Gas_Meter_New_Meter_Details_Page.btn_Updated_OK(driver).click();{
		Log.info(sTestCaseName + " | Updated OK button clicked");
		}
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).click();
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys("03");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Hall selected from Manufacturer Letter combobox");
		}
		Objects_Gas_Meter_New_Meter_Details_Page.lbl_Gas_New_Meter_Details_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | New Meter Details Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}