package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Found_Meter_Details_Page;
import utility.Log;
import utility.Utils;

public class Methods_Found_Meter_Details{
	
		
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
		Objects_Found_Meter_Details_Page.lbl_Found_Meter_Details(driver).isDisplayed();{
		Log.info(sTestCaseName + " | New Meter Details label displayed as expected");
		}
		
		Objects_Found_Meter_Details_Page.txt_Found_Meter_Serial_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Serial Number text box displayed as expected");
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
		
		Objects_Found_Meter_Details_Page.txt_Found_Meter_Serial_No(driver).click();
		Objects_Found_Meter_Details_Page.txt_Found_Meter_Serial_No(driver).sendKeys("12345");
		Objects_Found_Meter_Details_Page.lbl_Found_Meter_Details(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Serial Number entered in the Elec Meter Serial number textbox");
		}
		//Add correct responses for a successful new meter details 
		Objects_Found_Meter_Details_Page.cbx_Found_Manufacturer_Letter(driver).click();
		Objects_Found_Meter_Details_Page.cbx_Found_Manufacturer_Letter(driver).sendKeys("P");
		Objects_Found_Meter_Details_Page.cbx_Found_Manufacturer_Letter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | P: Polymeters selected from Manufacturer Letter combobox");
		}
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Type(driver).click();
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Type(driver).sendKeys("Secure Liberty 100-E1SOB1 1R");
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Secure Liberty selected from Meter Type combobox");
		}
		/*
		Objects_Found_Meter_Details_Page.cbx_SSC_Code(driver).click();
		Objects_Found_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys("0393");
		Objects_Found_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | CCS Code selected from the SSC Code Combobox");
		}*/
		
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Location_Code(driver).click();
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Location_Code(driver).sendKeys("H");
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Location_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Hall Meter location code selected from the Meter Location Code Combobox");
		}

		Objects_Found_Meter_Details_Page.btn_Found_Read_Meter_No(driver).click();{
		Log.info(sTestCaseName + " | Know Meter reading from found meter No");
		}
		
		Objects_Found_Meter_Details_Page.btn_Continue_Job_Yes(driver).click();{
		Log.info(sTestCaseName + " | Continue Job Yes");
		}
		Objects_Found_Meter_Details_Page.btn_Capture_Found_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture photo of found meter");
		}

		Objects_Found_Meter_Details_Page.lbl_Found_Meter_Details_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Found Meter Details Complete label displayed");
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
	
		Objects_Found_Meter_Details_Page.txt_Found_Meter_Serial_No(driver).click();
		Objects_Found_Meter_Details_Page.txt_Found_Meter_Serial_No(driver).sendKeys("12345");
		Objects_Found_Meter_Details_Page.lbl_Found_Meter_Details(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Serial Number entered in the Elec Meter Serial number textbox");
		}
		//Add correct responses for a successful new meter details 
		Objects_Found_Meter_Details_Page.cbx_Found_Manufacturer_Letter(driver).click();
		Objects_Found_Meter_Details_Page.cbx_Found_Manufacturer_Letter(driver).sendKeys("Z");
		Objects_Found_Meter_Details_Page.cbx_Found_Manufacturer_Letter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Z: Ampy selected from Manufacturer Letter combobox");
		}
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Type(driver).click();
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Type(driver).sendKeys("5028A");
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | 5028A (credit) selected from Meter Type combobox");
		}
		Objects_Found_Meter_Details_Page.cbx_Found_SSC_Code(driver).click();
		Objects_Found_Meter_Details_Page.cbx_Found_SSC_Code(driver).sendKeys("0126");
		Objects_Found_Meter_Details_Page.cbx_Found_SSC_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | CCS Code selected from the SSC Code Combobox");
		}
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Location_Code(driver).click();
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Location_Code(driver).sendKeys("H");
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Location_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Hall Meter location code selected from the Meter Location Code Combobox");
		}

		Objects_Found_Meter_Details_Page.btn_Found_Read_Meter_No(driver).click();{
		Log.info(sTestCaseName + " | Know Meter reading from found meter No");
		}
		
		Objects_Found_Meter_Details_Page.btn_Continue_Job_Yes(driver).click();{
		Log.info(sTestCaseName + " | Continue Job Yes");
		}
		Objects_Found_Meter_Details_Page.btn_Capture_Found_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture photo of found meter");
		}

		Objects_Found_Meter_Details_Page.lbl_Found_Meter_Details_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Found Meter Details Complete label displayed");
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
	public static void addSuccessValuesEXCH9(WebDriver driver, String sTestCaseName) throws Exception{
		
		Objects_Found_Meter_Details_Page.txt_Found_Meter_Serial_No(driver).click();{
		Log.info(sTestCaseName + " | Clicked Meter Serial Number text Box");
		}
		Objects_Found_Meter_Details_Page.txt_Found_Meter_Serial_No(driver).sendKeys("12345");{
		Log.info(sTestCaseName + " | Enter Serial Number in text Box");
		}
		Objects_Found_Meter_Details_Page.lbl_Found_Meter_Details(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Serial Number entered in the Elec Meter Serial number textbox");
		}
		//Add correct responses for a successful new meter details 
		Objects_Found_Meter_Details_Page.cbx_Found_Manufacturer_Letter(driver).click();
		Objects_Found_Meter_Details_Page.cbx_Found_Manufacturer_Letter(driver).sendKeys("Z");
		Objects_Found_Meter_Details_Page.cbx_Found_Manufacturer_Letter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | P: Polymer selected from Manufacturer Letter combobox");
		}
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Type(driver).click();{
		Log.info(sTestCaseName + " | Clicked Meter Type combobox");	
		}
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Type(driver).sendKeys("5236J-Y 1ph mr Cr/PP (2rt Cr)");{
		Log.info(sTestCaseName + " | 5236J-Y 2rt selected from Meter Type combobox");
		}
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | 5236J-Y 1ph mr Cr/PP (2rt Cr) selected from Meter Type combobox");
		}
		/*
		Objects_Found_Meter_Details_Page.cbx_SSC_Code(driver).click();
		Objects_Found_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys("0953");
		Objects_Found_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | CCS Code selected from the SSC Code Combobox");
		}*/
		
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Location_Code(driver).click();
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Location_Code(driver).sendKeys("H");
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Location_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Hall Meter location code selected from the Meter Location Code Combobox");
		}

		Objects_Found_Meter_Details_Page.btn_Found_Read_Meter_No(driver).click();{
		Log.info(sTestCaseName + " | Know Meter reading from found meter No");
		}
		
		Objects_Found_Meter_Details_Page.btn_Continue_Job_Yes(driver).click();{
		Log.info(sTestCaseName + " | Continue Job Yes");
		}
		Objects_Found_Meter_Details_Page.btn_Capture_Found_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture photo of found meter");
		}

		Objects_Found_Meter_Details_Page.lbl_Found_Meter_Details_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Found Meter Details Complete label displayed");
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
	
		Objects_Found_Meter_Details_Page.txt_Found_Meter_Serial_No(driver).click();
		Objects_Found_Meter_Details_Page.txt_Found_Meter_Serial_No(driver).sendKeys("12345");
		Objects_Found_Meter_Details_Page.lbl_Found_Meter_Details(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Serial Number entered in the Elec Meter Serial number textbox");
		}
		//Add correct responses for a successful new meter details 
		Objects_Found_Meter_Details_Page.cbx_Found_Manufacturer_Letter(driver).click();
		Objects_Found_Meter_Details_Page.cbx_Found_Manufacturer_Letter(driver).sendKeys("S");
		Objects_Found_Meter_Details_Page.cbx_Found_Manufacturer_Letter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | S : Sang/Schlum/Actaris selected from Manufacturer Letter combobox");
		}
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Type(driver).click();
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Type(driver).sendKeys("KBD (1 rate)KBD (1 rate)");
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | KBD (1 rate) selected from Meter Type combobox");
		}
		/*Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).click();
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys("0126");
		Objects_Electricity_Meter_New_Meter_Details_Page.cbx_SSC_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | CCS Code selected from the SSC Code Combobox");
		}*/
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Location_Code(driver).click();
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Location_Code(driver).sendKeys("H");
		Objects_Found_Meter_Details_Page.cbx_Found_Meter_Location_Code(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Hall Meter location code selected from the Meter Location Code Combobox");
		}

		Objects_Found_Meter_Details_Page.btn_Found_Read_Meter_No(driver).click();{
		Log.info(sTestCaseName + " | Know Meter reading from found meter No");
		}
		
		Objects_Found_Meter_Details_Page.btn_Continue_Job_Yes(driver).click();{
		Log.info(sTestCaseName + " | Continue Job Yes");
		}
		Objects_Found_Meter_Details_Page.btn_Capture_Found_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture photo of found meter");
		}

		Objects_Found_Meter_Details_Page.lbl_Found_Meter_Details_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Found Meter Details Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		}
	//END OF ADD SUCCESS VALUES METHOD
//END OF METHODS
}