/* *******************************************************************
* Test Case Name: INST_12_Doorstep_Protocol_Page_Abort_Doorstep_Procedure_Fail_ECOT_Chrome
* Author: Paul Middleton
* Date: 09/03/2018
* Purpose: This test carries out the end to end Mobility workflow on 
* the Chrome browser for an Install 12 job
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
//Add for Grid session
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utility.*;
import webModule.*;
import pageObjectRepositories.Objects_Appointments_List_Page;
import pageObjectRepositories.Objects_Abort_Page;
import pageObjectRepositories.Objects_Appointment_Details_Page;
import pageObjectRepositories.Objects_Doorstep_Protocol_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Initial_Risk_Assessment_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Risk_Assessment_Elec_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Han_Wan_Checks_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Current_Meter_Details_Page;
import pageObjectRepositories.Objects_Electricity_Meter_New_Meter_Details_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Additional_Electricity_Tests_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Initial_Meter_Reading_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Commissioning_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Post_Installation_Checks_Page;
import pageObjectRepositories.Objects_Gas_Meter_Risk_Assessment_Gas_Page;
import pageObjectRepositories.Objects_Gas_Meter_Suitable_For_Smart_Installation_Page;
import pageObjectRepositories.Objects_Gas_Meter_Capture_Initial_Photo_Of_Gas_Installation_Page;
import pageObjectRepositories.Objects_Gas_Meter_Current_Meter_Details_Page;
import pageObjectRepositories.Objects_Gas_Meter_New_Regulator_Page;
import pageObjectRepositories.Objects_Gas_Meter_Initial_Meter_Reading_Page;
import pageObjectRepositories.Objects_Gas_Meter_Install_Kit_Page;
import pageObjectRepositories.Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page;
import pageObjectRepositories.Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page;
import pageObjectRepositories.Objects_Job_Completion_Configure_All_Meters_Installed_Page;
import pageObjectRepositories.Objects_Job_Completion_Device_Binding_Commissioning_Page;
import pageObjectRepositories.Objects_Job_Completion_Energy_Efficiency_Information_Page;
import pageObjectRepositories.Objects_Job_Completion_Scan_IHD_Page;
import pageObjectRepositories.Objects_Job_Completion_Smart_Education_Page;
import pageObjectRepositories.Objects_Job_Completion_Summary_Page;
import pageObjectRepositories.Objects_Login_Page;
import pageObjectRepositories.Objects_Job_Completion_Capture_Customer_Signature_Page;


public class INST_12_Doorstep_Protocol_Page_Abort_Doorstep_Procedure_Fail_ECOT_Chrome {

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
	
	    ExcelUtils.setExcelFile(Constant.Path_TestData +  Constant.File_TestData,"Data");		
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
		//driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[15]/div/div[1]/div/div[1]/span[1]/span")).click();
		driver.findElement(By.xpath("//*[contains(text(), ' MR. Test_208_INST12')]")).click();
	
		//Verify that we are on the Appointment Details page
		Objects_Appointment_Details_Page.btn_Call_Forward(driver).isDisplayed();
		Log.info("Appointment Details page displayed as expected");	
		
		Methods_Appointment_Details.viewPage(driver, sTestCaseName);
		
		//Verify correct Customer Details displayed
		Objects_Appointment_Details_Page.lnk_Customer_Details(driver).click();
		Methods_Appointment_Details.viewCustomerDetails(driver, sTestCaseName, 209);
				
		//Verify correct Job Details displayed
		Objects_Appointment_Details_Page.lnk_Job_Details(driver).click();
		Methods_Appointment_Details.viewJobDetails(driver, sTestCaseName, 209);
				
		//Verify correct Meter Details displayed
		Objects_Appointment_Details_Page.lnk_Meter_Details(driver).click();
		Methods_Appointment_Details.viewMeterDetails(driver, sTestCaseName, 209);
				
		//Click Call Forward to bring up Contact options
		Objects_Appointment_Details_Page.btn_Call_Forward(driver).click();
		
		//Complete Remaining Customer Contact questions
		Objects_Appointment_Details_Page.btn_Contact_Made_Yes(driver).click();
		Objects_Appointment_Details_Page.btn_Appointment_Confirm_Yes(driver).click();
		
		//Click Depart Button to progress to Doorstep Protocol Page
		Objects_Appointment_Details_Page.btn_Depart(driver).click();
		Objects_Appointment_Details_Page.btn_Depart_For_Appointment_OK(driver).click();
		
		//Verify that we are on the Doorstep Protocol page
		Objects_Doorstep_Protocol_Page.btn_Arrive(driver).isDisplayed();
		Log.info("Doorstep Protocol page displayed as expected");	
				
		//Verify that Doorstep Sidebar displayed
		Methods_Doorstep_Protocol.viewSidebar(driver, sTestCaseName);
			
		//Verify Arrive button displayed
		Methods_Doorstep_Protocol.viewPage(driver, sTestCaseName);
		Objects_Doorstep_Protocol_Page.btn_Arrive(driver).click();
			
		//Verify Arrive elements displayed
		Methods_Doorstep_Protocol.viewArrivePage(driver, sTestCaseName);
		Log.info("Doorstep Protocol page arrive elements displayed as expected");
			
		//Invoke Method to complete doorstep protocol questions for no access to site granted
		Methods_Doorstep_Protocol.addAbortValuesSPRK(driver, sTestCaseName);
		
		//Click Abort No Access button to bring up Abort page 
		Objects_Doorstep_Protocol_Page.btn_Abort_No_Access(driver).click();
			
		//Verify Abort No Access page displayed
		Objects_Abort_Page.Abort_No_Access_Reasons.lbl_Not_Convenient_With_Customer(driver).isDisplayed();
		Log.info("Abort No Access page displayed as expected");
		Utils.takeScreenshot(driver, sTestCaseName + "-AbortPage");	
		
		//Verify Abort elements displayed
		Methods_Aborts.viewPageNoAccess(driver, sTestCaseName);
		Log.info("Abort page elements displayed as expected");
			
		//Invoke Method to complete Aborts questions for a success outcome 
		Methods_Aborts.addSuccessValuesRefusedAccessSPRK(driver, sTestCaseName);
		
		//Verify that we have returned to the Appointments list page
	    Objects_Appointments_List_Page.hdr_First_Appointment(driver).isDisplayed();
		Log.info("First Appointment Header displayed");
		
		Log.info("Test 208 <<<<<<<<<<Completed By Paul Middleton>>>>>>>>>>INST_12_Doorstep_Protocol_Page_Abort_Doorstep_Procedure_Fail_ECOT_Chrome");
		
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

