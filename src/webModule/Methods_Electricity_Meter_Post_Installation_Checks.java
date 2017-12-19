package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Electricity_Meter_Post_Installation_Checks_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Post_Installation_Checks{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Post Installation Checks
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
	
		//Check that all of the elements that are expected are displayed
		Objects_Electricity_Meter_Post_Installation_Checks_Page.lbl_Post_Installation_Checks(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Post Installation Checks label displayed as expected");
		}
		
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Polarity_Check_Meter_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Polarity Check Meter - Yes radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Post_Installation_Checks_Page.txt_Additional_Notes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Notes textbox displayed as expected");
		}
		
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Post Installation Checks
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
	public static void viewPagePhotos(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements that are expected are displayed
		Objects_Electricity_Meter_Post_Installation_Checks_Page.lbl_Post_Installation_Photos(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Post Installation Photos label displayed as expected");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Capture_Photo_Martindale_Test(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Post Installation Photos label displayed as expected");
		}
		
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Post Installation Checks
	* page in order to force a successful post installation check scenario
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
	
		//Add correct responses for a successful commissioning scenario 
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Polarity_Check_Meter_Yes(driver).click();{
		Log.info(sTestCaseName + " | Polarity Check Meter - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.cbx_Polarity_Check_Plugin(driver).click();{
		Log.info(sTestCaseName + " | Polarity Check Plugin Combobox clicked");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.cbx_Polarity_Check_Plugin(driver).sendKeys("Polarity");{
		Log.info(sTestCaseName + " | Typed Polarity in Polarity Check Plugin Combobox");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.cbx_Polarity_Check_Plugin(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Polarity tested value selected from the Polarity Check Plugin Combobox");
		}
		Thread.sleep(400);
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Socket_Safety_Test_Pass(driver).click();{
		Log.info(sTestCaseName + " | Socket Safety Test - Pass radio button clicked");
		}
		Thread.sleep(400);
		Objects_Electricity_Meter_Post_Installation_Checks_Page.txt_Test_Witness_Name(driver).click();
		Objects_Electricity_Meter_Post_Installation_Checks_Page.txt_Test_Witness_Name(driver).sendKeys("Tester");{
		Log.info(sTestCaseName + " | Polarity tested Witness Name Entered");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Capture_Photo_Martindale_Test(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo Martindale Test button clicked");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Capture_Photo_Final_Meter_Installation(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo Final Meter Installation button clicked");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Capture_Photo_Close_Up_Meter(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo Close Up Meter button clicked");
		}
		Thread.sleep(2000);
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Submit(driver).click();{
		Log.info(sTestCaseName + " | Submit button clicked");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Post Installation Checks
	* page in order to force a successful post installation check scenario
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
	
		//Add correct responses for a successful commissioning scenario 
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Polarity_Check_Meter_Yes(driver).click();{
		Log.info(sTestCaseName + " | Polarity Check Meter - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.cbx_Polarity_Check_Plugin(driver).click();{
		Log.info(sTestCaseName + " | Polarity Check Plugin Combobox clicked");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.cbx_Polarity_Check_Plugin(driver).sendKeys("Polarity");{
		Log.info(sTestCaseName + " | Typed Polarity in Polarity Check Plugin Combobox");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.cbx_Polarity_Check_Plugin(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Polarity tested value selected from the Polarity Check Plugin Combobox");
		}
		Thread.sleep(400);
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Socket_Safety_Test_Pass(driver).click();{
		Log.info(sTestCaseName + " | Socket Safety Test - Pass radio button clicked");
		}
	if ("Exchange_20_End_To_End_Chrome".equals(sTestCaseName))
	{
		Objects_Electricity_Meter_Post_Installation_Checks_Page.txt_Test_Witness_Name(driver).click();
		Objects_Electricity_Meter_Post_Installation_Checks_Page.txt_Test_Witness_Name(driver).sendKeys("Tester");{
		Log.info(sTestCaseName + " | Polarity tested Witness Name Entered");
		}
	}
	else	
		{ 
			System.out.println("Doing the else "); 
		}
		//Check that all of the elements that are expected are displayed
		Objects_Electricity_Meter_Post_Installation_Checks_Page.lbl_Post_Installation_Checks_Completion(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Post Installation Checks Completion label displayed as expected");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Post Installation Checks
	* page in order to force a successful post installation check scenario
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
	public static void addSuccessValuesINST(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful commissioning scenario 
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Polarity_Check_Meter_Yes(driver).click();{
		Log.info(sTestCaseName + " | Polarity Check Meter - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.cbx_Polarity_Check_Plugin(driver).click();
		Objects_Electricity_Meter_Post_Installation_Checks_Page.cbx_Polarity_Check_Plugin(driver).sendKeys("Polarity");
		Objects_Electricity_Meter_Post_Installation_Checks_Page.cbx_Polarity_Check_Plugin(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Polarity tested value selected from the Polarity Check Plugin Combobox");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Socket_Safety_Test_Pass(driver).click();{
		Log.info(sTestCaseName + " | Socket Safety Test - Pass radio button clicked");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Submit(driver).click();{
		Log.info(sTestCaseName + " | Submit button clicked");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
			
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Post Installation Checks
	* page in order to force a successful post installation check scenario
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
	public static void addSuccessValuesSMETS2Photos(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for successful Post Installation Photos 
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Capture_Photo_Martindale_Test(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo Martindale Test button clicked");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Capture_Photo_Final_Meter_Installation(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo Final Meter Installation button clicked");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Capture_Photo_Close_Up_Meter(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo Close Up Meter button clicked");
		}
		Objects_Electricity_Meter_Post_Installation_Checks_Page.btn_Submit(driver).click();{
		Log.info(sTestCaseName + " | Submit button clicked");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
			
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}