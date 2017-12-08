package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Electricity_Meter_Additional_Electricity_Tests_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Additional_Electricity_Tests{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Additional Electricity 
	* Tests page upon initial landing
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
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.lbl_Additional_Electricity_Tests(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Electricity Tests label displayed as expected");
		}
		
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_All_Seals_Intact_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | All Seals Intact - Yes radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Additional Electricity 
	* Tests page in order to force a successful additional tests scenario
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
	
		//Add correct responses for a successful additional tests scenario 
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_All_Seals_Intact_Yes(driver).click();{
		Log.info(sTestCaseName + " | All Seals Intact - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_Approved_Siemens_Cable_Markers_Yes(driver).click();{
		Log.info(sTestCaseName + " | Approved Siemens Cable Markers - Yes radio button clicked");
		}
		Thread.sleep(1000);
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_Terminal_Screw_Tightness_Yes(driver).click();{
		Log.info(sTestCaseName + " | Terminal Screw Tightness - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_Visual_Inspection_Completed_Yes(driver).click();{
		Log.info(sTestCaseName + " | Visual Inspection Completed - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.cbx_Cable_Marker(driver).click();
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.cbx_Cable_Marker(driver).sendKeys("1.");
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.cbx_Cable_Marker(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | LNNL selected from the Cable Marker Combobox");
		}
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.cbx_Earth_Type(driver).click();
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.cbx_Earth_Type(driver).sendKeys("1");
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.cbx_Earth_Type(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | TN-C-S (PME) selected from the Earth Type Combobox");
		}
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Electricity_Meter_Additional_Electricity_Tests_Page.lbl_Additional_Electricty_Checks_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | New Meter Details Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	
	//END OF ADD SUCCESS VALUES METHOD
		
	}
		
		/* **************************************************************************************************
		* Function: addSuccessValues
		* Author: Iain Storrie
		* Date: 19/06/2017
		* Purpose: This method adds the required responses in the Electricity Meter Additional Electricity 
		* Tests page in order to force a successful additional tests scenario for the INST5 workflow
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
		public static void addSuccessValuesINST5(WebDriver driver, String sTestCaseName) throws Exception{
		
			//Add correct responses for a successful additional tests scenario for the INST5 workflow 
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_Earth_Loop_Impedance_Yes(driver).click();{
			Log.info(sTestCaseName + " | Earth Loop Impedance - Yes radio button clicked");
			}
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_Visual_Check_PME_Bonding_Yes(driver).click();{
			Log.info(sTestCaseName + " | Visual Check PME Bonding - Yes radio button clicked");
			}
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_All_Seals_Intact_Yes(driver).click();{
			Log.info(sTestCaseName + " | All Seals Intact - Yes radio button clicked");
			}
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_Approved_Siemens_Cable_Markers_Yes(driver).click();{
			Log.info(sTestCaseName + " | Approved Siemens Cable Markers - Yes radio button clicked");
			}
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_Terminal_Screw_Tightness_Yes(driver).click();{
			Log.info(sTestCaseName + " | Terminal Screw Tightness - Yes radio button clicked");
			}
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_Capture_Photo(driver).click();{
			Log.info(sTestCaseName + " | Capture Photo button clicked");
			}
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_Visual_Inspection_Completed_Yes(driver).click();{
			Log.info(sTestCaseName + " | Visual Inspection Completed - Yes radio button clicked");
			}
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.cbx_Cable_Marker(driver).click();
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.cbx_Cable_Marker(driver).sendKeys("1.");
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.cbx_Cable_Marker(driver).sendKeys(Keys.ENTER);{
			Log.info(sTestCaseName + " | LNNL selected from the Cable Marker Combobox");
			}
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.cbx_Earth_Type(driver).click();
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.cbx_Earth_Type(driver).sendKeys("1");
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.cbx_Earth_Type(driver).sendKeys(Keys.ENTER);{
			Log.info(sTestCaseName + " | TN-C-S (PME) selected from the Earth Type Combobox");
			}
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.btn_Next_Section(driver).click();{
			Log.info(sTestCaseName + " | Next Section button clicked");
			}
			Objects_Electricity_Meter_Additional_Electricity_Tests_Page.lbl_Additional_Electricty_Checks_Complete(driver).isDisplayed();{
			Log.info(sTestCaseName + " | New Meter Details Complete label displayed");
			}
			
			//Take a screenshot to show what we've done
			Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
			
		//END OF ADD SUCCESS VALUES INST5 METHOD
	}
	
		
//END OF METHODS
}