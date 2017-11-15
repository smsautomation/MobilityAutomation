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
		Log.info(sTestCaseName + " | New Gas Meter Serial Number textbox displayed as expected");
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
		Log.info(sTestCaseName + " | Manufacturer letter click");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys("LG");
		Log.info(sTestCaseName + " | Manufacturer letter LG");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | LG: LANDIS & GYR selected from Manufacturer Letter combobox");
		}
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).click();
		Log.info(sTestCaseName + " | Meter Type click");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys("Libra 310P Credit");
		Log.info(sTestCaseName + " | Meter Type Libra 310P Credit");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Libra 310P Credit Smart selected from Meter Type combobox");
		}
		Objects_Gas_Meter_New_Meter_Details_Page.txt_Gas_Meter_Serial_No(driver).click();
		Log.info(sTestCaseName + " | Gas Meter Serial No. click");
		Objects_Gas_Meter_New_Meter_Details_Page.txt_Gas_Meter_Serial_No(driver).sendKeys("54321");
		Log.info(sTestCaseName + " | Gas Meter Serial No. Enter");
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
		Thread.sleep(2000);
		}
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).click();
		Log.info(sTestCaseName + " | Meter Location Click");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys("03");
		Log.info(sTestCaseName + " | Meter Location 03");
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
	public static void addSuccessValuesPPMeter(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful new meter details 
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).click();
		Log.info(sTestCaseName + " | Manufacturer letter click");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys("LG");
		Log.info(sTestCaseName + " | Manufacturer letter LG");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | LG: LANDIS & GYR selected from Manufacturer Letter combobox");
		}
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).click();
		Log.info(sTestCaseName + " | Meter Type click");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys("Libra 310P PP SMART");
		Log.info(sTestCaseName + " | Meter Type Libra 310P PP SMART");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Libra 310P PP Smart selected from Meter Type combobox");
		}
		Objects_Gas_Meter_New_Meter_Details_Page.txt_Gas_Meter_Serial_No(driver).click();
		Log.info(sTestCaseName + " | Gas Meter Serial No. click");
		Objects_Gas_Meter_New_Meter_Details_Page.txt_Gas_Meter_Serial_No(driver).sendKeys("54321");
		Log.info(sTestCaseName + " | Gas Meter Serial No. Enter");
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
		Thread.sleep(2000);
		}
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).click();
		Log.info(sTestCaseName + " | Meter Location Click");
		Objects_Gas_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys("03");
		Log.info(sTestCaseName + " | Meter Location 03");
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