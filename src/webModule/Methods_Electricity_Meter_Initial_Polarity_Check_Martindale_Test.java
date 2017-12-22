package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page;
import utility.Log;
import utility.Utils;

public class Methods_Electricity_Meter_Initial_Polarity_Check_Martindale_Test{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Initial Polarity Check - 
	* Martindale Test page upon initial landing
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
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.lbl_Initial_Polarity_Check_Martindale_Test(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Initial Polarity Check Martindale Test label displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Carry_Out_Polarity_Check(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Carry Out Polarity Check combobox displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Initial Polarity Check - 
	* Martindale Test page in order to force a successful Martindale Test
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
	
		//Add correct responses for a successful initial polarity check - Martindale test
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Carry_Out_Polarity_Check(driver).click();
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Carry_Out_Polarity_Check(driver).sendKeys("Polarity");
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Carry_Out_Polarity_Check(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Polarity tested selected from the Carry Out Polarity Check combobox");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.btn_Socket_Safety_Test_Pass(driver).click();{
		Log.info(sTestCaseName + " | Socket Safety Test - Pass radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Socket_Test_Location(driver).click();
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Socket_Test_Location(driver).sendKeys("Kitchen");
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Socket_Test_Location(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Kitchen selected from the Carry Out Polarity Check combobox");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.btn_Sockets_Reverse_Polarity_No(driver).click();{
		Log.info(sTestCaseName + " | Sockets Reverse Polarity - No radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.lbl_Initial_Polarity_Check_Martindale_Test_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Initial Polarity Check - Martindale Test Complete Label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method adds the required responses in the Electricity Meter Initial Polarity Check - 
	* Martindale Test page in order to force a successful Martindale Test
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
	public static void addSuccessValuesSocket(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful initial polarity check - Martindale test
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Carry_Out_Polarity_Check(driver).click();
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Carry_Out_Polarity_Check(driver).sendKeys("Polarity");
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Carry_Out_Polarity_Check(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Polarity tested selected from the Carry Out Polarity Check combobox");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.btn_Socket_Safety_Test_Pass(driver).click();{
		Log.info(sTestCaseName + " | Socket Safety Test - Pass radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Socket_Test_Location(driver).click();
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Socket_Test_Location(driver).sendKeys("Kitchen");
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Socket_Test_Location(driver).sendKeys(Keys.TAB);{
		Log.info(sTestCaseName + " | Kitchen selected from the Carry Out Polarity Check combobox");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.btn_Sockets_Reverse_Polarity_Yes(driver).click();{
		Log.info(sTestCaseName + " | Sockets Reverse Polarity - No radio button clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Reverse_Polarity_Sockets_Location(driver).click();{
		Log.info(sTestCaseName + " | Sockets Reverse Polarity Location - Combo Box clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Reverse_Polarity_Sockets_Location(driver).sendKeys("Hallway");{
		Log.info(sTestCaseName + " | Sockets Reverse Polarity Location - Selected");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.cbx_Reverse_Polarity_Sockets_Location(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Sockets Reverse Polarity Location - Enter pressed");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.txt_Reverse_Polarity_Sockets_Number(driver).click();{
		Log.info(sTestCaseName + " | Sockets Reverse Polarity Number - Clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.txt_Reverse_Polarity_Sockets_Number(driver).sendKeys("3");{
		Log.info(sTestCaseName + " | Sockets Reverse Polarity Number - Clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.lbl_Sockets_Reverse_Polarity(driver).click();{
		Log.info(sTestCaseName + " | Sockets Reverse Polarity Number - Clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.btn_All_Sockets_Completed(driver).click();{
		Log.info(sTestCaseName + " | Sockets Reverse Polarity Number - Clicked");
		}
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.lbl_Initial_Polarity_Check_Martindale_Test_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Initial Polarity Check - Martindale Test Complete Label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
//END OF METHODS
}