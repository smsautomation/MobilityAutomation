package webModule;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Appointments_List_Page;
import utility.Log;
import utility.Utils;

public class Methods_Appointments_List{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 12/06/2017
	* Purpose: This method checks the main page elements on the Appointments List page
	* Arguments: driver
	* 			sTestCaseName
	* 			iRow
	* 
	* Returns: void
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void viewPage(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		
		Log.info("&&&&&&&&&&&&&&&&&&&&&&&&&&&& START:  Methods_Appointments_List.viewPage &&&&&&&&&&&&&&&&&&&&&&&&&&&");
		Log.info(sTestCaseName + "This method checks the main page elements on the Appointments List page");
		Log.info("&&&&&&&&&&&&&&&&&&&&&&&&&&   START: Methods_Appointments_List.viewPage &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		//Declare our variables and instantiate 
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//WebDriverWait wait = new WebDriverWait(driver, 5);
			
<<<<<<< HEAD
		
		  try {
			//Check that all of the elements of that are expected are displayed
			  Objects_Appointments_List_Page.btn_Logout(driver).isDisplayed();{
			  Log.info(sTestCaseName + " | Logout button displayed as expected"); }
		} catch (NullPointerException  e) {
			
			e.getMessage();
=======
		//Check that all of the elements of that are expected are displayed
		try {
			Objects_Appointments_List_Page.btn_Logout(driver).isDisplayed();
		} catch(StaleElementReferenceException e) {
			Thread.sleep(2000);
		}
		Objects_Appointments_List_Page.btn_Logout(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Logout button displayed as expected");
>>>>>>> bf7b6d1c41ed9e6ebec79609ddf5787700cd98d0
		}
		 

		Objects_Appointments_List_Page.btn_Force_Sync(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Force Sync button displayed as expected");
		}
		
		Objects_Appointments_List_Page.btn_Asset_Management(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Asset Management button displayed as expected");
		}
		
		Objects_Appointments_List_Page.hdr_First_Appointment(driver).isDisplayed();{
			Log.info(sTestCaseName + " | First Appointment Header displayed as expected");
		}
		Log.info("&&&&&&&&&&&&&&&&&&&&&&&&&&&&END:  Methods_Appointments_List.viewPage &&&&&&&&&&&&&&&&&&&&&&&&&&&");
		Log.info(sTestCaseName + "This method checks the main page elements on the Appointments List page");
		Log.info("&&&&&&&&&&&&&&&&&&&&&&&&&& END: Methods_Appointments_List.viewPage &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		//Screenshot time
		Utils.takeScreenshot(driver, sTestCaseName + "-ViewPage");
		
	//END OF VIEW PAGE METHOD
	}
//END OF METHODS
}