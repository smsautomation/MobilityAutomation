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
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys("P");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | P: Polymeters selected from Manufacturer Letter combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys("Secure Liberty 100-E1SOB1 1R");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Secure Liberty selected from Meter Type combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).sendKeys("12345");
		Objects_Electricity_Meter_New_Meter_Details_Page.lbl_New_Meter_Details(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Serial Number entered in the Elec Meter Serial number textbox");
		}
		Thread.sleep(500);
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Scan_Asset_Now(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");
		}
		Thread.sleep(500);
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Add_Asset_OK(driver).click();{
		Log.info(sTestCaseName + " | Add Asset OK button clicked");
		}
		Thread.sleep(500);
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Updated_OK(driver).click();{
		Log.info(sTestCaseName + " | Updated OK button clicked");
		}
		Thread.sleep(5000);
		/*
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys("0393");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | CCS Code selected from the SSC Code Combobox");
		}*/
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys("H");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Hall Meter location code selected from the Meter Location Code Combobox");
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
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEXCH5
	* Author: Iain Storrie
	* Date: 05/07/2017
	* Purpose: This method adds the required responses in the Electricity Meter New Meter Details page in 
	* order to force a successful new meter scenario for the EXCH5 workflow
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
	public static void addSuccessValuesEXCH5(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful new meter details 
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys("Z");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Z: Ampy selected from Manufacturer Letter combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys("5028A");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | 5028A (credit) selected from Meter Type combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).sendKeys("12345");
		Objects_Electricity_Meter_New_Meter_Details_Page.lbl_New_Meter_Details(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Serial Number entered in the Elec Meter Serial number textbox");
		}
		Thread.sleep(5000);
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Scan_Asset_Now(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Add_Asset_OK(driver).click();{
		Log.info(sTestCaseName + " | Add Asset OK button clicked");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Updated_OK(driver).click();{
		Log.info(sTestCaseName + " | Updated OK button clicked");
		}
		Thread.sleep(5000);
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys("0126");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | CCS Code selected from the SSC Code Combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys("H");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Hall Meter location code selected from the Meter Location Code Combobox");
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
		
	public static void addSuccessValuesEXCH9(WebDriver driver, String sTestCaseName) throws Exception{
		
		//Add correct responses for a successful new meter details 
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys("Z");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | P: Polymer selected from Manufacturer Letter combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).click();{
		Log.info(sTestCaseName + " | Clicked Meter Type combobox");	
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys("5236J-Y 1ph mr Cr/PP (2rt Cr)");{
		Log.info(sTestCaseName + " | 5236J-Y 2rt selected from Meter Type combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | 5236J-Y 1ph mr Cr/PP (2rt Cr) selected from Meter Type combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).click();{
		Log.info(sTestCaseName + " | Clicked Meter Serial Number text Box");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).sendKeys("12345");{
		Log.info(sTestCaseName + " | Enter Serial Number in text Box");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.lbl_New_Meter_Details(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Serial Number entered in the Elec Meter Serial number textbox");
		}
		Thread.sleep(500);
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Scan_Asset_Now(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");
		}
		Thread.sleep(500);
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Add_Asset_OK(driver).click();{
		Log.info(sTestCaseName + " | Add Asset OK button clicked");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Updated_OK(driver).click();{
		Log.info(sTestCaseName + " | Updated OK button clicked");
		}
		Thread.sleep(1000);
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys("0953");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | CCS Code selected from the SSC Code Combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys("H");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Hall Meter location code selected from the Meter Location Code Combobox");
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
		}
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEXCH5
	* Author: Iain Storrie
	* Date: 05/07/2017
	* Purpose: This method adds the required responses in the Electricity Meter New Meter Details page in 
	* order to force a successful new meter scenario for the EXCH5 workflow
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
	public static void addSuccessValuesEXCH11(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful new meter details 
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys("S");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | S : Sang/Schlum/Actaris selected from Manufacturer Letter combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys("KBD (1 rate)KBD (1 rate)");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | KBD (1 rate) selected from Meter Type combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).sendKeys("12345");
		Objects_Electricity_Meter_New_Meter_Details_Page.lbl_New_Meter_Details(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Serial Number entered in the Elec Meter Serial number textbox");
		}
		Thread.sleep(5000);
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Scan_Asset_Now(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Add_Asset_OK(driver).click();{
		Log.info(sTestCaseName + " | Add Asset OK button clicked");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Updated_OK(driver).click();{
		Log.info(sTestCaseName + " | Updated OK button clicked");
		}
		Thread.sleep(5000);
		/*Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys("0126");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | CCS Code selected from the SSC Code Combobox");
		}*/
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys("H");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Location_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Hall Meter location code selected from the Meter Location Code Combobox");
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
		}
	//END OF ADD SUCCESS VALUES METHOD
//END OF METHODS
}