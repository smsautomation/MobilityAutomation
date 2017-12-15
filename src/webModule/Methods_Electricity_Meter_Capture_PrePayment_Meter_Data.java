package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Electricity_Meter_Capture_PrePayment_Data_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Capture_PrePayment_Meter_Data{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 07/07/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Meter Credit page upon 
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
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.lbl_Prepayment_Meter_Data(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture PrePayment Meter Data label displayed as expected");
		}
		
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Credit_Remaining_Meter(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Credit Remaining Meter textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Total_Value_Credit_Accepted(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Total Value Credit Accepted textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Standing_Charge_Weekly_Debt_Setting(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Standing charge Weekly Debt Setting textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Weekly_Debt_Charge(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Weekly Debt Charge textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Total_Debt_Remaining(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Total Debt Remaining textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Total_Debt_set(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Total Debt Set textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Fixed_Standing_Charge(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Fixed Standing Charge textbox displayed as expected");
		}
		
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.btn_Meter_Emergency_Credit_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Meter Set Emergency Credit - Yes radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.btn_Meter_Emergency_Credit_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Meter Set Emergency Credit - No radio button displayed as expected");
		}
	
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Additional_Notes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Notes textbox displayed as expected");
		}
		
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 07/07/2017
	* Purpose: This method adds the required responses in the Electricity Meter Meter Credit page in order 
	* to force a successful scenario
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

		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Credit_Remaining_Meter(driver).click();
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Credit_Remaining_Meter(driver).sendKeys("15.25");{
		Log.info(sTestCaseName + " | Credit value entered in the Credit Remaining Meter textbox");
		}
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Total_Value_Credit_Accepted(driver).click();
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Total_Value_Credit_Accepted(driver).sendKeys("20.00");{
		Log.info(sTestCaseName + " | Credit accepted value entered in the Total Value Credit Accpeted textbox");
		}
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Standing_Charge_Weekly_Debt_Setting(driver).click();
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Standing_Charge_Weekly_Debt_Setting(driver).sendKeys("5.00");{
		Log.info(sTestCaseName + " | Standing charge Weekly Debt Setting value entered in the Standing Charge textbox");
		}
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Weekly_Debt_Charge(driver).click();
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Weekly_Debt_Charge(driver).sendKeys("20.00");{
		Log.info(sTestCaseName + " | Total Weekly debt Charge value entered in the Total Debt Charge textbox");
		}
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Total_Debt_Remaining(driver).click();
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Total_Debt_Remaining(driver).sendKeys("11.29");{
		Log.info(sTestCaseName + " | Total debt remaining value entered in the Total Debt Remaining textbox");
		}
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Total_Debt_set(driver).click();
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Total_Debt_set(driver).sendKeys("2.00");{
		Log.info(sTestCaseName + " | Total debt set entered in the Total debt set textbox");
		}
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Fixed_Standing_Charge(driver).click();
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.txt_Fixed_Standing_Charge(driver).sendKeys("9.78");{
		Log.info(sTestCaseName + " | Standing charge value entered in the Fixed Standing Charge textbox");
		}
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.btn_Meter_Emergency_Credit_Yes(driver).click();{
		Log.info(sTestCaseName + " | Meter Set Emergency Credit - Yes radio button clicked");
		}
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Submit button clicked");
		}
		Objects_Electricity_Meter_Capture_PrePayment_Data_Page.lbl_Prepayment_Meter_Data(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Capture PrePayment Meter Data Complete label displayed as expected");
		}	
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}