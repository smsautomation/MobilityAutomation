package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Electricity_Meter_Commissioning_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Commissioning{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Commissioning page upon 
	* initial landing
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
		Objects_Electricity_Meter_Commissioning_Page.lbl_Commissioning(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Commissioning label displayed as expected");
		}
		
		Objects_Electricity_Meter_Commissioning_Page.cbx_Non_Serialised_Assets(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Non Serialised Assets checkbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Commissioning_Page.txt_Non_Serialised_Assets_Number(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Non Serialised Assets Number textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Commissioning_Page.img_Trash(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Trash Image displayed as expected");
		}
		
		Objects_Electricity_Meter_Commissioning_Page.btn_Add_Another_Asset(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Add Another Asset button displayed as expected");
		}
		
		Objects_Electricity_Meter_Commissioning_Page.btn_Next_Section(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Next Section button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Commissioning page in 
	* order to force a successful commissioning scenario
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
		Objects_Electricity_Meter_Commissioning_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Electricity_Meter_Commissioning_Page.lbl_Commissioning_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Commissioning Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValuesPrePaid
	* Author: Iain Storrie
	* Date: 05/07/2017
	* Purpose: This method adds the required responses in the Electricity Meter Commissioning page in 
	* order to force a successful commissioning scenario where a Pre-Paid meter is used
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
	public static void addSuccessValuesPrePaid(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful commissioning scenario 
		Objects_Electricity_Meter_Commissioning_Page.btn_Comms_Hub_Connected_WAN_Yes(driver).click();{
		Log.info(sTestCaseName + " | Comms Hub Connected WAN - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Commissioning_Page.cbx_Gas_Meter_Location(driver).click();
		Objects_Electricity_Meter_Commissioning_Page.cbx_Gas_Meter_Location(driver).sendKeys("03");
		Objects_Electricity_Meter_Commissioning_Page.cbx_Gas_Meter_Location(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | 03: Hall selected from Gas Meter Location combobox");
		}
		Objects_Electricity_Meter_Commissioning_Page.txt_Distance_Gas_Electric(driver).click();
		Objects_Electricity_Meter_Commissioning_Page.txt_Distance_Gas_Electric(driver).sendKeys("5");{
		Log.info(sTestCaseName + " | Value entered in the Distance Gas Electric textbox");
		}
		Objects_Electricity_Meter_Commissioning_Page.cbx_Electric_Meter_Signal(driver).click();
		Objects_Electricity_Meter_Commissioning_Page.cbx_Electric_Meter_Signal(driver).sendKeys("15");
		Objects_Electricity_Meter_Commissioning_Page.cbx_Electric_Meter_Signal(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | 15 selected from Electric Meter Signal combobox");
		}
		Objects_Electricity_Meter_Commissioning_Page.txt_Commissioning_Code(driver).click();
		Objects_Electricity_Meter_Commissioning_Page.txt_Commissioning_Code(driver).sendKeys("0005");
		Objects_Electricity_Meter_Commissioning_Page.txt_Distance_Gas_Electric(driver).click();{
		Log.info(sTestCaseName + " | Value entered in the Commissioing Code textbox");
		}
		Objects_Electricity_Meter_Commissioning_Page.cbx_Time_Taken_Commission_Meter(driver).click();
		Objects_Electricity_Meter_Commissioning_Page.cbx_Time_Taken_Commission_Meter(driver).sendKeys("5");
		Objects_Electricity_Meter_Commissioning_Page.cbx_Time_Taken_Commission_Meter(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | 5-10 minutes selected from Time Taken Commission Meter combobox");
		}
		Objects_Electricity_Meter_Commissioning_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Electricity_Meter_Commissioning_Page.lbl_Commissioning_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Commissioning Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
		
//END OF METHODS
}