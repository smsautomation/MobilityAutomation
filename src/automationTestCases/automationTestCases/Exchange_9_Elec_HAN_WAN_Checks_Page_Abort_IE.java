/* *******************************************************************
* Test Case Name: Exchange_9_Elec_HAN_WAN_Checks_Abort_IE
* Author: Iain Storrie
* Date: 06/07/2017
* Purpose: This test ensure that a user can abort an appointment from 
* the Elec HAN / WAN Checks page where the HAN / WAN check fails on 
* the Chrome browser for an Exchange 9 job
* 
***********************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
*********************************************************************/

package automationTestCases.automationTestCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utility.*;
import webModule.*;
import pageObjectRepositories.Objects_Appointment_Details_Page;
import pageObjectRepositories.Objects_Doorstep_Protocol_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Initial_Risk_Assessment_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Risk_Assessment_Elec_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page;
import pageObjectRepositories.Objects_Login_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Han_Wan_Checks_Page;

import pageObjectRepositories.Objects_Abort_Page;

public class Exchange_9_Elec_HAN_WAN_Checks_Page_Abort_IE {

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
	
	    ExcelUtils.setExcelFile(Constant.Path_TestData + "Mobility_Automation_Test_Data" + ".xlsm","Data");
		
	    iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_Test_Case_Name);
	
	    driver = Utils.openBrowser(iTestCaseRow);
	    
	    //Verify that we are on the correct page
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[66]/div/div[1]/div/div[1]/span[1]/span")).click();
		
		//Verify that we are on the Appointment Details page
		Objects_Appointment_Details_Page.btn_Call_Forward(driver).isDisplayed();
		Log.info("Appointment Details page displayed as expected");	
		
		Methods_Appointment_Details.viewPage(driver, sTestCaseName);
		
		//Verify correct Customer Details displayed
		Objects_Appointment_Details_Page.lnk_Customer_Details(driver).click();
		Methods_Appointment_Details.viewCustomerDetails(driver, sTestCaseName, 172);
				
		//Verify correct Job Details displayed
		Objects_Appointment_Details_Page.lnk_Job_Details(driver).click();
		Methods_Appointment_Details.viewJobDetails(driver, sTestCaseName, 172);
				
		//Verify correct Meter Details displayed
		Objects_Appointment_Details_Page.lnk_Meter_Details(driver).click();
		Methods_Appointment_Details.viewMeterDetails(driver, sTestCaseName, 172);
				
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
		
		//Invoke Method to complete doorstep protocol questions for a success outcome 
		Methods_Doorstep_Protocol.addSuccessValues(driver, sTestCaseName);
				
		//Verify that we are on the Electricity Meter Initial Risk Assessment page
		Objects_Electricity_Meter_Initial_Risk_Assessment_Page.lbl_Initial_Risk_Assessment(driver).isDisplayed();
		Log.info("Electricity Meter Initial Risk Assessment page displayed as expected");	
		
		//Invoke Method to complete a successful initial risk assessment 
		Methods_Electricity_Meter_Initial_Risk_Assessment.addSuccessValues(driver, sTestCaseName);
		
		//Verify that we are on the Electricity Meter Risk Assessment - Elec page
		Objects_Electricity_Meter_Risk_Assessment_Elec_Page.lbl_Risk_Assessment_Elec(driver).isDisplayed();
		Log.info("Risk Assessment - Elec page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Electricity_Meter_Risk_Assessment_Elec.viewPage(driver, sTestCaseName);
		Log.info("Electricity Meter Risk Assessment Elec initial elements displayed as expected");
				
		//Verify correct page elements displayed after Risk Assessment - Yes clicked
		Methods_Electricity_Meter_Risk_Assessment_Elec.viewRiskAssessmentYesPage(driver, sTestCaseName);
		Log.info("Electricity Meter Risk Assessment Yes elements displayed as expected");
				
		//Invoke Method to complete a successful risk assessment 
		Methods_Electricity_Meter_Risk_Assessment_Elec.addSuccessValues(driver, sTestCaseName);
			
		//Verify that we are on the Electricity Meter Suitable For Smart Installation page
		Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page.lbl_Suitable_For_Smart_Installation(driver).isDisplayed();
		Log.info("Risk Assessment - Elec page displayed as expected");	
			
		//Verify Initial page elements displayed
		Methods_Electricity_Meter_Suitable_For_Smart_Installation.viewPage(driver, sTestCaseName);
		Log.info("Electricity Meter Suitable for Smart Installation initial elements displayed as expected");
				
		//Verify correct page elements displayed after Suitable for Smart Installation - No clicked
		Methods_Electricity_Meter_Suitable_For_Smart_Installation.viewSuitableNoPage(driver, sTestCaseName);
		Log.info("Electricity Meter Suitable for Smart Installation No elements displayed as expected");
		
		//Invoke Method to complete a successful suitable for smart installation 
		Methods_Electricity_Meter_Suitable_For_Smart_Installation.addSuccessValues(driver, sTestCaseName);
			
		//Verify that we are on the Electricity Meter Capture Initial Photo Of Elec Installation page
		Objects_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation_Page.lbl_Capture_Initial_Photo_Of_Elec_Installation(driver).isDisplayed();
		Log.info("Capture Initial Photo Of Elec Installation page displayed as expected");
			
		//Verify Initial page elements displayed
		Methods_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation.viewPage(driver, sTestCaseName);
		Log.info("Electricity Meter Suitable for Smart Installation initial elements displayed as expected");
					
		//Invoke Method to complete a successful photo capture 
		Methods_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation.addSuccessValues(driver, sTestCaseName);
			
		//Verify that we are on the Electricity Meter Capture Initial Polarity Check - Martindale Test page
		Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page.lbl_Initial_Polarity_Check_Martindale_Test(driver).isDisplayed();
		Log.info("Initial Polarity Check - Martindale Test page displayed as expected");
			
		//Verify Initial page elements displayed
		Methods_Electricity_Meter_Initial_Polarity_Check_Martindale_Test.viewPage(driver, sTestCaseName);
		Log.info("Electricity Meter Initial Polarity Check - Martindale Test initial elements displayed as expected");
								
		//Invoke Method to complete a successful Martindale Test 
		Methods_Electricity_Meter_Initial_Polarity_Check_Martindale_Test.addSuccessValues(driver, sTestCaseName);
				
		//Verify that we are on the Electricity Meter Capture Initial Polarity Check - At Meter page
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.lbl_Initial_Polarity_Check_At_Meter(driver).isDisplayed();
		Log.info("Initial Polarity Check At Meter page displayed as expected");
				
		//Verify Initial page elements displayed
		Methods_Electricity_Meter_Initial_Polarity_Check_At_Meter.viewPage(driver, sTestCaseName);
		Log.info("Electricity Meter Initial Polarity check At Meter initial elements displayed as expected");
										
		//Invoke Method to complete a successful polarity check 
		Methods_Electricity_Meter_Initial_Polarity_Check_At_Meter.addSuccessValues(driver, sTestCaseName);
			
		//Verify that we are on the Electricity Meter HAN / WAN Check page
		Objects_Electricity_Meter_Han_Wan_Checks_Page.lbl_Han_Wan_Checks(driver).isDisplayed();
		Log.info("HAN / WAN Check page displayed as expected");
		
		//Invoke Method to complete an aborted HAN / WAN check 
		Methods_Electricity_Meter_HAN_WAN_Checks.addAbortValues(driver, sTestCaseName);
			
		//Click Abort button to bring up Abort page 
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Abort(driver).click();
		Log.info("Abort button clicked");
		
		//Verify Abort page displayed
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Elec_Meter_Accessible_Yes(driver).isDisplayed();
		Log.info("Abort page displayed as expected");
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

