package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Electricity_Meter_Han_Wan_Checks_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_HAN_WAN_Checks{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter HAN / WAN Checks page 
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
		Objects_Electricity_Meter_Han_Wan_Checks_Page.lbl_Han_Wan_Checks(driver).isDisplayed();{
		Log.info(sTestCaseName + " | HAN / WAN Checks label displayed as expected");
		}
		
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Wan_Available_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | WAN Available - Yes radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Wan_Available_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | WAN Available - No radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter HAN / WAN Checks page in 
	* order to force a successful check
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
	
		//Add correct responses for a successful HAN / WAN check 
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Wan_Available_Yes(driver).click();{
		Log.info(sTestCaseName + " | WAN Available - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Vodafone(driver).click();{
		Log.info(sTestCaseName + " | Signal Strength Values Vodafone clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Vodafone(driver).sendKeys("100");{
		Log.info(sTestCaseName + " | Signal Strength Value entered for Vodafone");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_O2(driver).click();{
		Log.info(sTestCaseName + " | Signal Strength Value O2 clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_O2(driver).sendKeys("90");{
		Log.info(sTestCaseName + " | Signal Strength Value entered for O2");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Orange(driver).click();{
		Log.info(sTestCaseName + " | Signal Strength Value Orange clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Orange(driver).sendKeys("80");{
		Log.info(sTestCaseName + " | Signal Strength Value entered for Orange");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_TMobile(driver).click();{
		Log.info(sTestCaseName + " | Signal Strength Value TMobile clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_TMobile(driver).sendKeys("70");{
		Log.info(sTestCaseName + " | Signal Strength Values entered for TMobile");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Sufficient_Signal_Proceed_Yes(driver).click();{
		Log.info(sTestCaseName + " | Sufficient Signal Proceed - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.lbl_Han_Wan_Checks_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | HAN / WAN Checks Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessSPRKValues
	* Author: Paul Middleton
	* Date: 16/01/2018
	* Purpose: This method adds the required responses in the Electricity Meter HAN / WAN Checks page in 
	* order to force a successful check
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
	public static void addSuccessSPRKValues(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful HAN / WAN check 
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Wan_Available_Yes(driver).click();{
		Log.info(sTestCaseName + " | WAN Available - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Vodafone(driver).click();{
		Log.info(sTestCaseName + " | Signal Strength Values Vodafone clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Vodafone(driver).sendKeys("100");{
		Log.info(sTestCaseName + " | Signal Strength Value entered for Vodafone");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_O2(driver).click();{
		Log.info(sTestCaseName + " | Signal Strength Value O2 clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_O2(driver).sendKeys("90");{
		Log.info(sTestCaseName + " | Signal Strength Value entered for O2");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Orange(driver).click();{
		Log.info(sTestCaseName + " | Signal Strength Value Orange clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Orange(driver).sendKeys("80");{
		Log.info(sTestCaseName + " | Signal Strength Value entered for Orange");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_TMobile(driver).click();{
		Log.info(sTestCaseName + " | Signal Strength Value TMobile clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_TMobile(driver).sendKeys("70");{
		Log.info(sTestCaseName + " | Signal Strength Values entered for TMobile");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_HAN_Available_Yes(driver).click();{
		Log.info(sTestCaseName + " | Sufficient Signal Proceed - Yes radio button clicked");
		}	
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Hub_ElecMeter_Pass(driver).click();{
		Log.info(sTestCaseName + " | Sufficient Signal Proceed - Yes radio button clicked");
		}		
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Hub_GasMeter_Pass(driver).click();{
		Log.info(sTestCaseName + " | Sufficient Signal Proceed - Yes radio button clicked");
		}			
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Hub_IHD_Pass(driver).click();{
		Log.info(sTestCaseName + " | Sufficient Signal Proceed - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.lbl_Han_Wan_Checks_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | HAN / WAN Checks Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addAbortValues
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter HAN / WAN Checks Page in 
	* order to force an aborted HAN / WAN check
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
	
		//Add correct responses for an aborted HAN/WAN Check check
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Wan_Available_No(driver).click();{
		Log.info(sTestCaseName + " | WAN Available - No radio button clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Vodafone(driver).click();
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Vodafone(driver).sendKeys("5");
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_O2(driver).click();
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_O2(driver).sendKeys("4");
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Orange(driver).click();
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Orange(driver).sendKeys("3");
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_TMobile(driver).click();
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_TMobile(driver).sendKeys("2");{
		Log.info(sTestCaseName + " | Signal Strength Values entered");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Sufficient_Signal_Proceed_No(driver).click();{
		Log.info(sTestCaseName + " | Sufficient Signal Proceed - No radio button clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.cbx_Cancellation_Abort_Reason(driver).click();
		Objects_Electricity_Meter_Han_Wan_Checks_Page.cbx_Cancellation_Abort_Reason(driver).sendKeys("No WAN");
		Objects_Electricity_Meter_Han_Wan_Checks_Page.cbx_Cancellation_Abort_Reason(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Cancellation/Abort reason selected from combobox");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Abort(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Abort button displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addAbortValues
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter HAN / WAN Checks Page in 
	* order to force an aborted HAN / WAN check
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
	public static void addSPRKAbortValues(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for an aborted HAN/WAN Check check
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Wan_Available_No(driver).click();{
		Log.info(sTestCaseName + " | WAN Available - No radio button clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Vodafone(driver).click();
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Vodafone(driver).sendKeys("5");
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_O2(driver).click();
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_O2(driver).sendKeys("4");
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Orange(driver).click();
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_Orange(driver).sendKeys("3");
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_TMobile(driver).click();
		Objects_Electricity_Meter_Han_Wan_Checks_Page.txt_Signal_Strength_TMobile(driver).sendKeys("2");{
		Log.info(sTestCaseName + " | Signal Strength Values entered");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_HAN_Available_No(driver).click();{
		Log.info(sTestCaseName + " | Sufficient Signal Proceed - No radio button clicked");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.cbx_Cancellation_Abort_Reason(driver).click();
		Objects_Electricity_Meter_Han_Wan_Checks_Page.cbx_Cancellation_Abort_Reason(driver).sendKeys("No WAN");
		Objects_Electricity_Meter_Han_Wan_Checks_Page.cbx_Cancellation_Abort_Reason(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Cancellation/Abort reason selected from combobox");
		}
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Abort(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Abort button displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
//END OF METHODS
}