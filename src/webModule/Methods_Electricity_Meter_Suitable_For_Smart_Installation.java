package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Risk_Assessment_Elec_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Suitable_For_Smart_Installation{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Suitable For Smart 
	* Installation page upon initial landing
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
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.lbl_Suitable_For_Smart_Installation(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Suitable for Smart Installation label displayed as expected");
		}
		
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.btn_Suitable_For_Smart_Installation_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Suitable For Smart Installation - Yes radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.btn_Suitable_For_Smart_Installation_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Suitable For Smart Installation - No radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewSuitableYesPage
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Suitable for Smart 
	* Installation page after the Suitable for Smart Installation - Yes radio button has been clicked 
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
	public static void viewSuitableYesPage(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements of that are expected are displayed
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.btn_Suitable_For_Smart_Installation_Yes(driver).click();{
		Log.info(sTestCaseName + " | Suitable For Smart Installation - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.cbx_Equipment_Reposition_Required(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Equipment Reposition Required combobox displayed");
		}
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.txt_Additional_Notes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Notes textbox displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewSuitableYesPage");
		
	//END OF VIEW SUITABLE YES PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewSuitableNoPage
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Suitable for Smart 
	* Installation page after the Suitable for Smart Installation - No radio button has been clicked 
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
	public static void viewSuitableNoPage(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements of that are expected are displayed
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.btn_Suitable_For_Smart_Installation_No(driver).click();{
		Log.info(sTestCaseName + " | Risk Assessment - No radio button clicked");
		}
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.btn_Suitable_For_Dumb_Instalation_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Suitable for Dumb Installation - Yes radio button displayed as expected");
		}
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.btn_Suitable_For_Dumb_Instalation_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Suitable for Dumb Installation - No radio button displayed as expected");
		}
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.txt_Additional_Notes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Notes textbox displayed as expected");
		}
		
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewSuitableNoPage");
		
	//END OF VIEW SUITABLE NO PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Suitable for Smart 
	* Installation page in order to force a successful smart installation
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
	
		//Add correct responses for a successful suitable for smart installation
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.cbx_Equipment_Reposition_Required(driver).click();
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.cbx_Equipment_Reposition_Required(driver).sendKeys("NO");
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.cbx_Equipment_Reposition_Required(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | No Reposition Required selected");
		}
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.btn_Next_Section(driver).getLocation();
		Thread.sleep(2000);
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.lbl_Suitable_For_Smart_Installation_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Suitable for Smart Installation Complete Label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addAbortValues
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Suitable For Smart 
	* Installation page in order to force an Elec Meter Procedure Fail Abort
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
	public static void addAbortValues(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for an Elec Meter Procedure Fail Abort
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.btn_Suitable_For_Dumb_Instalation_No(driver).click();{
		Log.info(sTestCaseName + " | Suitable for Dumb Installation - No radio button clicked");
		}
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.btn_Reschedule_Job_Yes(driver).click();{
		Log.info(sTestCaseName + " | Risk Assessment Pass - No radio button clicked");
		}
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.lbl_Elec_Meter_Procedure_Fail(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Elec Meter Procedure Fail Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValues");
		
	//END OF ADD ABORT VALUES METHOD
	}
	
//END OF METHODS
}