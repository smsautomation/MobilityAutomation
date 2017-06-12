/* *******************************************************************
* Test Case Name: Exchange_3_Return_To_Appointments_List_Page_From_Appointment_Details_Page_Chrome
* Author: Iain Storrie
* Date: 12/06/2017
* Purpose: This test ensure that a user can return to the Appointments List page from
* the Appointments Details page on the Chrome browser for an Exchange 3 job
*
**********************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
*********************************************************************/

package automationTestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utility.*;
import appModule.*;
import pageObjectRepositories.Objects_Appointments_List_Page;
import pageObjectRepositories.Objects_Appointment_Details_Page;

public class Exchange_3_Return_To_Appointments_List_Page_From_Appointment_Details_Page_Chrome {

	//Declare our test variables
	public WebDriver driver;	
	private String sTestCaseName;
	private int iTestCaseRow;
	
	//Get data and open the browser
	@BeforeMethod
	public void beforeMethod() throws Exception {
	
		DOMConfigurator.configure("log4j.xml");
	
	    sTestCaseName = this.toString();
	
	    sTestCaseName = Utils.getTestCaseName(this.toString());
	
	    Log.startTestCase(sTestCaseName);
	
	    ExcelUtils.setExcelFile(Constant.Path_TestData + sTestCaseName + ".xlsx","Sheet1");
	
	    iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
	
	    driver = Utils.openBrowser(iTestCaseRow);
	    
		//Verify that we are on the correct page
	    Objects_Appointments_List_Page.hdr_First_Appointment(driver).isDisplayed();
		Log.info("First Appointment Header displayed");
		
	}
	
	//Run the test
	@Test
	public void main() throws Exception {
			
		Methods_Appointments_List.viewPage(driver, sTestCaseName);
		
		Objects_Appointments_List_Page.btn_First_Appointment_Select(driver).click();
		
		//Verify that we are on the Appointment Details page
		Objects_Appointment_Details_Page.btn_Call_Forward(driver).isDisplayed();
		Log.info("Appointment Details page displayed as expected");	
		
		//Click List image to return to Appointments List page
		
		Objects_Appointment_Details_Page.img_List(driver).isDisplayed();
		Log.info("List icon displayed as expected");	
		
		Objects_Appointment_Details_Page.img_List(driver).click();
		
		//Verify that we are on the Appointments List page
	    Objects_Appointments_List_Page.hdr_First_Appointment(driver).isDisplayed();
		Log.info("First Appointment Header displayed");
		
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

