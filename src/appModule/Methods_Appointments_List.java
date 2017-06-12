package appModule;

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
	
		//Declare our variables and instantiate 
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		
			
		//Check that all of the elements of that are expected are displayed
		if(Objects_Appointments_List_Page.btn_Logout(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Logout button displayed as expected");
		}

		if(Objects_Appointments_List_Page.btn_Force_Sync(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Force Sync button displayed as expected");
		}
		
		if(Objects_Appointments_List_Page.btn_Asset_Management(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Asset Management button displayed as expected");
		}
		
		if(Objects_Appointments_List_Page.hdr_First_Appointment(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | First Appointment Header displayed as expected");
		}
		
		if(Objects_Appointments_List_Page.btn_First_Appointment_Select(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | First Appointment Select button displayed as expected");
		}
		
		if(Objects_Appointments_List_Page.btn_Second_Appointment_Select(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Second Appointment Select button displayed as expected");
		}
		
		if(Objects_Appointments_List_Page.btn_Third_Appointment_Select(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Third Appointment Select button displayed as expected");
		}
		
		if(Objects_Appointments_List_Page.btn_Fourth_Appointment_Select(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Fourth Appointment Select button displayed as expected");
		}
		
		if(Objects_Appointments_List_Page.btn_Fifth_Appointment_Select(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Fifth Appointment Select button displayed as expected");
		}
		
		if(Objects_Appointments_List_Page.btn_Sixth_Appointment_Select(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Sixth Appointment Select button displayed as expected");
		}
		
		if(Objects_Appointments_List_Page.btn_Seventh_Appointment_Select(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Seventh Appointment Select button displayed as expected");
		}
		
		if(Objects_Appointments_List_Page.btn_Eighth_Appointment_Select(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Eighth Appointment Select button displayed as expected");
		}
		
		if(Objects_Appointments_List_Page.btn_Ninth_Appointment_Select(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Ninth Appointment Select button displayed as expected");
		}
		
		if(Objects_Appointments_List_Page.btn_Tenth_Appointment_Select(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Tenth Appointment Select button displayed as expected");
		}
			
		//Screenshot time
		Utils.takeScreenshot(driver, sTestCaseName + "-ViewPage");
		
	//END OF VIEW PAGE METHOD
	}
//END OF METHODS
}