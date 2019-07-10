/* *******************************************************************
* Test Case Name: INST_8_Appointment_Details_Page_Abort_No_Access_ECOT_Chrome
* Author: Paul Middleton
* Date: 16/03/2018
* Purpose: This test carries out the end to end Mobility workflow on 
* the Chrome browser for an Install 5 job
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//Add for Grid session
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import pageObjectRepositories.Objects_Abort_Page;
import pageObjectRepositories.Objects_Appointment_Details_Page;
import pageObjectRepositories.Objects_Appointments_List_Page;
import pageObjectRepositories.Objects_Login_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
import webModule.Methods_Aborts;
import webModule.Methods_Appointment_Details;
import webModule.Methods_Appointments_List;
import webModule.Methods_Login;


public class INST_8_Appointment_Details_Page_Abort_No_Access_ECOT_Chrome {

	//Declare our test variables
	public WebDriver driver;	
	//Add for Grid session
	//public RemoteWebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
	//Get data and open the browser
	@BeforeMethod
	public void beforeMethod() throws Exception {
	
		DOMConfigurator.configure("log4j.xml");
	
	    sTestCaseName = this.toString();
	
	    sTestCaseName = Utils.getTestCaseName(this.toString());
	
	    Log.startTestCase(sTestCaseName);
	
	    ExcelUtils.setExcelFile(Constant.Path_TestData + "Mobility_Automation_Test_Data" + ".xlsm","Data");
		
	    iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_Test_Case_Name);
	
	    driver = Utils.openBrowser(iTestCaseRow);
	    //Add for Grid session
	    //driver = (RemoteWebDriver) Utils.openGridBrowser(iTestCaseRow);
	     
	    //Verify that we are on the correct page
	    Thread.sleep(2000);
	    Objects_Login_Page.btn_Login(driver).isDisplayed();
	    Log.info("Login button displayed");
		
	}
	
	//Run the test
	@Test
	public void main() throws Exception {
			
		Methods_Login.viewPage(driver, sTestCaseName);
		
		Methods_Login.addSuccessValues(driver, sTestCaseName);
		
		Methods_Appointments_List.viewPage(driver, sTestCaseName);
		
		//Select the correct appointment
		//driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[162]/div/div[1]/div/div[1]/span[1]/span")).click();
		driver.findElement(By.xpath("//*[contains(text(), ' MR. Test_226_INST8')]")).click();
	
		//Verify that we are on the Appointment Details page
		Objects_Appointment_Details_Page.btn_Call_Forward(driver).isDisplayed();
		Log.info("Appointment Details page displayed as expected");	
		
		Methods_Appointment_Details.viewPage(driver, sTestCaseName);
		
		//Verify correct Customer Details displayed
		Objects_Appointment_Details_Page.lnk_Customer_Details(driver).click();
		Methods_Appointment_Details.viewCustomerDetails(driver, sTestCaseName, 115);
				
		//Verify correct Job Details displayed
		Objects_Appointment_Details_Page.lnk_Job_Details(driver).click();
		Methods_Appointment_Details.viewJobDetails(driver, sTestCaseName, 115);
			
		//Verify correct Meter Details displayed
		Objects_Appointment_Details_Page.lnk_Meter_Details(driver).click();
		Methods_Appointment_Details.viewMeterDetails(driver, sTestCaseName, 115);
				
		//Click Call Forward to bring up Contact options
		Objects_Appointment_Details_Page.btn_Call_Forward(driver).click();
		
		//Complete Remaining Customer Contact questions
		Objects_Appointment_Details_Page.btn_Contact_Made_Yes(driver).click();
		Objects_Appointment_Details_Page.btn_Appointment_Confirm_No(driver).click();
		Objects_Appointment_Details_Page.btn_Appointment_Reschedule_No(driver).click();
		
		//Verify Abort No Access Button displayed
		Objects_Appointment_Details_Page.btn_Abort_No_Access(driver).isDisplayed();
		Log.info("Abort No Access Button displayed as expected");	
		
		//Click Abort No Access button to bring up Abort page 
		Objects_Appointment_Details_Page.btn_Abort_No_Access(driver).click();
		
		//Verify Abort No Access page displayed
		Objects_Abort_Page.Abort_No_Access_Reasons.lbl_Not_Convenient_With_Customer(driver).isDisplayed();
		Log.info("Abort No Access page displayed as expected");
		Utils.takeScreenshot(driver, sTestCaseName + "-AbortPage");
		
		//Verify Abort elements displayed
		Methods_Aborts.viewPageNoAccess(driver, sTestCaseName);
		Log.info("Abort page elements displayed as expected");
			
		//Invoke Method to complete Aborts questions for a success outcome 
		Methods_Aborts.addSuccessValuesNoAccessSPRK(driver, sTestCaseName);
		
		//Verify that we have returned to the Appointments list page
	    Objects_Appointments_List_Page.hdr_First_Appointment(driver).isDisplayed();
		Log.info("First Appointment Header displayed");
								
		Log.info("Test 226 <<<<<<<<<<Completed By Paul Middleton>>>>>>>>>>INST_8_Appointment_Details_Page_Abort_No_Access_ECOT_Chrome");
		
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

