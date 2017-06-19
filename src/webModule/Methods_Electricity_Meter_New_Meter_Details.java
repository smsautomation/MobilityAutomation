package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Electricity_Meter_New_Meter_Details_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_New_Meter_Details{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter New Meter Details page 
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
		Objects_Electricity_Meter_New_Meter_Details_Page.lbl_New_Meter_Details(driver).isDisplayed();{
		Log.info(sTestCaseName + " | New Meter Details label displayed as expected");
		}
		
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Manufacturer Letter combobox displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter New Meter Details page in 
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
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys("A");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Aron selected from Manufacturer Letter combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys("e");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | el selected from Meter Type combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).sendKeys("12345");
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Elec Meter Serial Number entered in the Elec Meter Serial number textbox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Scan_Asset_Now(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Add_Asset_OK(driver).click();{
		Log.info(sTestCaseName + " | Add Asset OK button clicked");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Updated_OK(driver).click();{
		Log.info(sTestCaseName + " | Updated OK button clicked");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys("0393");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | CCS Code selected from the SSC Code Combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys("A");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Attic Meter location code selected from the Meter Location Code Combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Certification(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Certification(driver).sendKeys("17/06");
		Objects_Electricity_Meter_New_Meter_Details_Page.lbl_New_Meter_Details(driver).click();{
		Log.info(sTestCaseName + " | Certification Date entered in the Certification Year / Month textbox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.lbl_New_Meter_Details_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | New Meter Details Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}