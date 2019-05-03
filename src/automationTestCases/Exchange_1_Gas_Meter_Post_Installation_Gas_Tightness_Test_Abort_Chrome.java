/* *******************************************************************
* Test Case Name: Exchange_1_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome
* Author: Iain Storrie
* Date: 10/07/2017
* Purpose: This test ensure that a user can abort an appointment from the 
* Gas Meter Post Installation Gas Tightness Test page where the gas tightness test
* has not been performed on the Chrome browser for an Exchange 1 job
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
import pageObjectRepositories.Objects_Abort_Page;
import pageObjectRepositories.Objects_Appointment_Details_Page;
import pageObjectRepositories.Objects_Appointments_List_Page;
import pageObjectRepositories.Objects_Doorstep_Protocol_Page;
import pageObjectRepositories.Objects_Gas_Meter_Risk_Assessment_Gas_Page;
import pageObjectRepositories.Objects_Gas_Meter_Suitable_For_Smart_Installation_Page;
import pageObjectRepositories.Objects_Login_Page;
import pageObjectRepositories.Objects_Gas_Meter_Capture_Initial_Photo_Of_Gas_Installation_Page;
import pageObjectRepositories.Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page;
import pageObjectRepositories.Objects_Gas_Meter_Current_Meter_Details_Page;
import pageObjectRepositories.Objects_Gas_Meter_Remove_Meter_Page;
import pageObjectRepositories.Objects_Gas_Meter_Remove_Asset_Page;
import pageObjectRepositories.Objects_Gas_Meter_New_Regulator_Page;
import pageObjectRepositories.Objects_Gas_Meter_Initial_Meter_Reading_Page;
import pageObjectRepositories.Objects_Gas_Meter_Initial_Risk_Assessment_Page;
import pageObjectRepositories.Objects_Gas_Meter_Install_Kit_Page;
import pageObjectRepositories.Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page;


public class Exchange_1_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome {

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
		//driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[173]/div/div[1]/div/div[1]/span[1]/span")).click();
		driver.findElement(By.xpath("//*[contains(text(), ' MR. Test_9_EXCH1')]")).click();

		//Verify that we are on the Appointment Details page
		Objects_Appointment_Details_Page.btn_Call_Forward(driver).isDisplayed();
		Log.info("Appointment Details page displayed as expected");	
		
		Methods_Appointment_Details.viewPage(driver, sTestCaseName);
		
		//Verify correct Customer Details displayed
		Objects_Appointment_Details_Page.lnk_Customer_Details(driver).click();
		Methods_Appointment_Details.viewCustomerDetails(driver, sTestCaseName, 9);
				
		//Verify correct Job Details displayed
		Objects_Appointment_Details_Page.lnk_Job_Details(driver).click();
		Methods_Appointment_Details.viewJobDetails(driver, sTestCaseName, 9);
		
		//Verify correct Meter Details displayed
		Objects_Appointment_Details_Page.lnk_Meter_Details(driver).click();
		Methods_Appointment_Details.viewMeterDetails(driver, sTestCaseName, 9);
				
		//Click Call Forward to bring up Contact options
		Objects_Appointment_Details_Page.btn_Call_Forward(driver).click();
		
		//Complete Remaining Customer Contact questions
		Objects_Appointment_Details_Page.btn_Contact_Made_Yes(driver).click();
		Objects_Appointment_Details_Page.btn_Appointment_Confirm_Yes(driver).click();
		
		//Click Depart Button to progress to Doorstep Protocol Page
		Objects_Appointment_Details_Page.btn_Depart(driver).getLocation();
		Thread.sleep(2000);
		Objects_Appointment_Details_Page.btn_Depart(driver).click();
		Thread.sleep(2000);
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
		
		//Verify that we are on the Gas Meter Initial Risk Assessment page
		Objects_Gas_Meter_Initial_Risk_Assessment_Page.lbl_Initial_Risk_Assessment(driver).isDisplayed();
		Log.info("Gas Meter Initial Risk Assessment page displayed as expected");	
						
		//Invoke Method to complete a successful initial risk assessment 
		Methods_Gas_Meter_Initial_Risk_Assessment.addSuccessValues(driver, sTestCaseName);
						
		//Verify that we are on the Gas Meter Risk Assessment - Gas page
		Objects_Gas_Meter_Risk_Assessment_Gas_Page.lbl_Risk_Assessment_Gas(driver).isDisplayed();
		Log.info("Risk Assessment - Gas page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Gas_Meter_Risk_Assessment_Gas.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter Risk Assessment - Gas initial elements displayed as expected");
																												
		//Invoke Method to complete a successful risk assessment - gas 
		Methods_Gas_Meter_Risk_Assessment_Gas.addSuccessValues(driver, sTestCaseName);
		
		//Verify that we are on the Gas Meter Suitable for Smart Installation page
		Objects_Gas_Meter_Suitable_For_Smart_Installation_Page.lbl_Suitable_For_Smart_Installation(driver).isDisplayed();
		Log.info("Gas Meter Suitable For Smart Installation page displayed as expected");
	
		//Verify Initial page elements displayed
		Methods_Gas_Meter_Suitable_For_Smart_Installation.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter Suitable for Smart Installation initial elements displayed as expected");
				
		//Verify correct page elements displayed after Suitable For Smart Installation - Yes clicked
		Methods_Gas_Meter_Suitable_For_Smart_Installation.viewSuitableYesPage(driver, sTestCaseName);
		Log.info("Gas Meter Suitable for Smart Installation Yes elements displayed as expected");
			
		//Invoke Method to complete a successful suitable for smart installation 
		Methods_Gas_Meter_Suitable_For_Smart_Installation.addSuccessValues(driver, sTestCaseName);
													
		//Verify that we are on the Gas Meter Capture Initial Photo Of Gas Installation page
		Objects_Gas_Meter_Capture_Initial_Photo_Of_Gas_Installation_Page.lbl_Capture_Initial_Photo_Of_Gas_Installation(driver).isDisplayed();
		Log.info("Gas Meter Capture Initial Photo Of Gas Installation page displayed as expected");
	
		//Verify Initial page elements displayed
		Methods_Gas_Meter_Capture_Initial_Photo_Of_Gas_Installation.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter Suitable for Smart Installation initial elements displayed as expected");
					
		//Invoke Method to complete a successful photo capture 
		Methods_Gas_Meter_Capture_Initial_Photo_Of_Gas_Installation.addSuccessValues(driver, sTestCaseName);
		
		//Verify that we are on the Gas Meter Capture Pre Installation Gas Tightness Test page
		Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page.lbl_Pre_Installation_Gas_Tightness_Test(driver).isDisplayed();
		Log.info("Gas Meter Pre Installation Gas Tightness Test page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Gas_Meter_Pre_Installation_Gas_Tightness_Test.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter Pre Installation Gas Tightness Test initial elements displayed as expected");
							
		//Invoke Method to complete a successful gas tightness test
		Methods_Gas_Meter_Pre_Installation_Gas_Tightness_Test.addSuccessValues(driver, sTestCaseName);
				
		//Verify that we are on the Gas Meter Current Meter Details page
		Objects_Gas_Meter_Current_Meter_Details_Page.lbl_Gas_Current_Meter_Details(driver).isDisplayed();
		Log.info("Gas Meter Current Meter Details page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Gas_Meter_Current_Meter_Details.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter Current Meter Details initial elements displayed as expected");
														
		//Invoke Method to complete current meter details page 
		Methods_Gas_Meter_Current_Meter_Details.addSuccessValues(driver, sTestCaseName);
			
		//Verify that we are on the Gas Meter Remove Meter page
		Objects_Gas_Meter_Remove_Meter_Page.lbl_Gas_Remove_Meter(driver).isDisplayed();
		Log.info("Gas Remove Meter page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Gas_Meter_Remove_Meter.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter Remove Meter initial elements displayed as expected");
																
		//Invoke Method to complete remove meter page 
		Methods_Gas_Meter_Remove_Meter.addSuccessValues(driver, sTestCaseName);
					
		//Verify that we are on the Gas Meter Remove Asset page
		Objects_Gas_Meter_Remove_Asset_Page.lbl_Gas_Remove_Asset(driver).isDisplayed();
		Log.info("Gas Remove Asset page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Gas_Meter_Remove_Asset.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter Remove Asset initial elements displayed as expected");
																		
		//Invoke Method to complete remove asset page 
		Methods_Gas_Meter_Remove_Asset.addSuccessValues(driver, sTestCaseName);
							
		//Verify that we are on the Gas Meter New Regulator page
		Objects_Gas_Meter_New_Regulator_Page.lbl_Gas_New_Regulator(driver).isDisplayed();
		Log.info("Gas New Regulator page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Gas_Meter_New_Regulator.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter New Regulator initial elements displayed as expected");
																				
		//Invoke Method to complete New Regulator page 
		Methods_Gas_Meter_New_Regulator.addSuccessValues(driver, sTestCaseName);
									
		//Verify that we are on the Gas Meter New Meter Details page
		Objects_Gas_Meter_New_Regulator_Page.lbl_Gas_New_Regulator(driver).isDisplayed();
		Log.info("Gas New Meter Details page displayed as expected");
			
		//Verify Initial page elements displayed
		Methods_Gas_Meter_New_Meter_Details.viewPage(driver, sTestCaseName);
		Log.info("Gas New Meter Details initial elements displayed as expected");
																						
		//Invoke Method to complete Gas New Meter Details page 
		Methods_Gas_Meter_New_Meter_Details.addSuccessValues(driver, sTestCaseName);
											
		//Verify that we are on the Gas Meter Initial Meter Reading page
		Objects_Gas_Meter_Initial_Meter_Reading_Page.lbl_Gas_Inital_Meter_Reading(driver).isDisplayed();
		Log.info("Gas New Meter Details page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Gas_Meter_Initial_Meter_Reading.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter Initial Meter Reading initial elements displayed as expected");
																								
		//Invoke Method to complete Initial Meter Reading page 
		Methods_Gas_Meter_Initial_Meter_Reading.addSuccessValues(driver, sTestCaseName);
													
		//Verify that we are on the Gas Meter Install Kit page
		Objects_Gas_Meter_Install_Kit_Page.lbl_Gas_Install_Kit(driver).isDisplayed();
		Log.info("Gas Install Kit page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Gas_Meter_Install_Kit.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter Install Kit initial elements displayed as expected");
																										
		//Invoke Method to complete Install Kit page 
		Methods_Gas_Meter_Install_Kit.addSuccessValues(driver, sTestCaseName);
															
		//Verify that we are on the Gas Meter Post Installation Gas Tightness Test page
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.lbl_Post_Installation_Gas_Tightness_Test(driver).isDisplayed();
		Log.info("Gas Install Kit page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Gas_Meter_Post_Installation_Gas_Tightness_Test.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter Post Installation Gas Tightness Test initial elements displayed as expected");
		
		//Invoke Method to complete an aborted failed test 
		Methods_Gas_Meter_Post_Installation_Gas_Tightness_Test.addAbortValues(driver, sTestCaseName);
								
		//Click Abort button to bring up Abort page 
		Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page.btn_Abort(driver).click();
		Log.info("Abort button clicked");
							
		//Verify Abort page displayed
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Gas_Meter_Accessible_Yes(driver).isDisplayed();
		Log.info("Abort page displayed as expected");
		
		//Verify Abort elements displayed
		Methods_Aborts.viewPageAbortReasons(driver, sTestCaseName);
		Log.info("Abort page elements displayed as expected");
			
		//Invoke Method to complete Aborts questions for a success outcome 
		Methods_Aborts.addSuccessValuesReasonsRed(driver, sTestCaseName);
		
		//Verify that we have returned to the Appointments list page
	    Objects_Appointments_List_Page.hdr_First_Appointment(driver).isDisplayed();
		Log.info("First Appointment Header displayed");
		
		Log.info("Test 9 <<<<<<<<<<Completed By Paul Middleton>>>>>>>>>>Exchange_1_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome");
		
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

