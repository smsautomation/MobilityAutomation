package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjectRepositories.Objects_Electricity_Meter_New_Meter_Details_Page;
import pageObjectRepositories.Objects_Meter_Comms_Hub_Serial_Number_Page;
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
	* Function: viewPageSMETS2
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter New Meter Details page 
	* upon initial landing for SMETS2
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
	
		//Check that all of the elements that are expected are displayed
		Objects_Electricity_Meter_New_Meter_Details_Page.lbl_New_Meter_Details(driver).isDisplayed();{
		Log.info(sTestCaseName + " | New Meter Details label displayed as expected");
		}
		
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Valid_Elec_Meter(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Manufacturer Letter combobox displayed as expected");
		}
		
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).isDisplayed();{
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
		
	/* **************************************************************************************************
	* Function: addSuccessValuesEXCH9
	* Author: Paul Middleton
	* Date: 05/07/2017
	* Purpose: This method adds the required responses in the Electricity Meter New Meter Details page in 
	* order to force a successful new meter scenario for the EXCH9 workflow
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
	public static void addSuccessValuesR1SMETS2(WebDriver driver, String sTestCaseName) throws Exception{
		
		//Click on the Asset selection Combo box and select the first option
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Valid_Elec_Meter(driver).click();{
		Log.info(sTestCaseName + " | cbx_Valid_Elec_Meter - Select box clicked");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Valid_Elec_Meter(driver).sendKeys(Keys.ARROW_DOWN);
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Valid_Elec_Meter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | cbx_Valid_Elec_Meter first option - Select box clicked");
		}
		//Define the Combobox element and get the text of the first option and assign to the variable selectedComboValue
		//Select comboBox = new Select(Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Valid_Elec_Meter(driver));
		//String selectedComboValue = comboBox.getFirstSelectedOption().getText();
		String elecMeterNumber = Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_Number(driver); {
		Log.info(sTestCaseName + " | Got data of the first option and assigned to variable");
		}
		//Click on the Serial Scan text box and enter in the Serial number assigned to the variable selectedComboValue 
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).click();{
		Log.info(sTestCaseName + " | Serial Number Box - Text Box clicked");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).sendKeys(elecMeterNumber);{
		Log.info(sTestCaseName + " | First Option of Combo Box - Text Entered");
		}
		//click some object to invoke popup confirm - Shiva Pasham
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_EUI_Device_ID(driver).click();{
		Log.info(sTestCaseName + " | txt_EUI_Device_ID clicked");
		}
		//Click on the Label bar to get out of the Text box and move on
		Objects_Electricity_Meter_New_Meter_Details_Page.txt_Elec_Meter_Serial_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Click Away for the Text Box on the Label - Label clicked");
		}
		Thread.sleep(500);
		//Click Next on the Pop Up Dialog Box
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Serial_Match_Next(driver).click();{
		Log.info(sTestCaseName + " | Matched Asset Next button clicked");
		}
		Thread.sleep(500);
		/* Redundant - Shiva Pasham
		//Add correct responses for a successful new meter details 
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys("J");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Manufacturer_Letter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | J: KAIFA selected from Manufacturer Letter combobox");
		}*/
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).click();
		//Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys("Kaifa MA120 1 Rate");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys("L");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Kaifa MA120 1 Rate selected from Meter Type combobox");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys("0393");
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
		//Click the Next Section Button and check the section bar is closed
		Objects_Electricity_Meter_New_Meter_Details_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");
		}
		Objects_Electricity_Meter_New_Meter_Details_Page.lbl_New_Meter_Details_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | New Meter Details Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		}
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEXCH9
	* Author: Paul Middleton
	* Date: 05/07/2017
	* Purpose: This method adds the required responses in the Electricity Meter New Meter Details page in 
	* order to force a successful new meter scenario for the EXCH9 workflow
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
	* Function: addSuccessValuesEXCH11
	* Author: Paul Middleton
	* Date: 05/07/2017
	* Purpose: This method adds the required responses in the Electricity Meter New Meter Details page in 
	* order to force a successful new meter scenario for the EXCH11 workflow
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