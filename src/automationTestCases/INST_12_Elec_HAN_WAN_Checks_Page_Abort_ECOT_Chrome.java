/* *******************************************************************
* Test Case Name: INST_12_Elec_HAN_WAN_Checks_Page_Abort_ECOT_Chrome
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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//Add for Grid session
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import pageObjectRepositories.Objects_Abort_Page;
import pageObjectRepositories.Objects_Appointment_Details_Page;
import pageObjectRepositories.Objects_Appointments_List_Page;
import pageObjectRepositories.Objects_Doorstep_Protocol_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Han_Wan_Checks_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Initial_Risk_Assessment_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Risk_Assessment_Elec_Page;
import pageObjectRepositories.Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page;
import pageObjectRepositories.Objects_Found_Meter_Details_Page;
import pageObjectRepositories.Objects_Gas_Meter_Capture_Initial_Photo_Of_Gas_Installation_Page;
import pageObjectRepositories.Objects_Gas_Meter_Current_Meter_Details_Page;
import pageObjectRepositories.Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page;
import pageObjectRepositories.Objects_Gas_Meter_Initial_Meter_Reading_Page;
import pageObjectRepositories.Objects_Gas_Meter_Install_Kit_Page;
import pageObjectRepositories.Objects_Gas_Meter_New_Regulator_Page;
import pageObjectRepositories.Objects_Gas_Meter_Post_Installation_Gas_Tightness_Test_Page;
import pageObjectRepositories.Objects_Gas_Meter_Risk_Assessment_Gas_Page;
import pageObjectRepositories.Objects_Gas_Meter_Suitable_For_Smart_Installation_Page;
import pageObjectRepositories.Objects_Job_Completion_Capture_Customer_Signature_Page;
import pageObjectRepositories.Objects_Job_Completion_Configure_All_Meters_Installed_Page;
import pageObjectRepositories.Objects_Job_Completion_Device_Binding_Commissioning_Page;
import pageObjectRepositories.Objects_Job_Completion_Energy_Efficiency_Information_Page;
import pageObjectRepositories.Objects_Job_Completion_Scan_IHD_Page;
import pageObjectRepositories.Objects_Job_Completion_Smart_Education_Page;
import pageObjectRepositories.Objects_Job_Completion_Summary_Page;
import pageObjectRepositories.Objects_Login_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
import webModule.Methods_Aborts;
import webModule.Methods_Appointment_Details;
import webModule.Methods_Appointments_List;
import webModule.Methods_Doorstep_Protocol;
import webModule.Methods_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation;
import webModule.Methods_Electricity_Meter_HAN_WAN_Checks;
import webModule.Methods_Electricity_Meter_Initial_Polarity_Check_At_Meter;
import webModule.Methods_Electricity_Meter_Initial_Risk_Assessment;
import webModule.Methods_Electricity_Meter_Risk_Assessment_Elec;
import webModule.Methods_Electricity_Meter_Suitable_For_Smart_Installation;
import webModule.Methods_Found_Meter_Details;
import webModule.Methods_Gas_Meter_Capture_Initial_Photo_Of_Gas_Installation;
import webModule.Methods_Gas_Meter_Current_Meter_Details;
import webModule.Methods_Gas_Meter_Gas_Appliance_Safety_Checks;
import webModule.Methods_Gas_Meter_Initial_Meter_Reading;
import webModule.Methods_Gas_Meter_Install_Kit;
import webModule.Methods_Gas_Meter_New_Meter_Details;
import webModule.Methods_Gas_Meter_New_Regulator;
import webModule.Methods_Gas_Meter_Post_Installation_Gas_Tightness_Test;
import webModule.Methods_Gas_Meter_Risk_Assessment_Gas;
import webModule.Methods_Gas_Meter_Suitable_For_Smart_Installation;
import webModule.Methods_Job_Completion_Capture_Customer_Signature;
import webModule.Methods_Job_Completion_Configure_All_Meters_Installed;
import webModule.Methods_Job_Completion_Device_Binding_Commissioning;
import webModule.Methods_Job_Completion_Energy_Efficient_Information;
import webModule.Methods_Job_Completion_Scan_IHD;
import webModule.Methods_Job_Completion_Smart_Education;
import webModule.Methods_Job_Completion_Summary;
import webModule.Methods_Login;


public class INST_12_Elec_HAN_WAN_Checks_Page_Abort_ECOT_Chrome {

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
		//driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[15]/div/div[1]/div/div[1]/span[1]/span")).click();
		driver.findElement(By.xpath("//*[contains(text(), ' MR. Test_209_INST12')]")).click();
	
		//Verify that we are on the Appointment Details page
		Objects_Appointment_Details_Page.btn_Call_Forward(driver).isDisplayed();
		Log.info("Appointment Details page displayed as expected");	
		
		Methods_Appointment_Details.viewPage(driver, sTestCaseName);
		
		//Verify correct Customer Details displayed
		Objects_Appointment_Details_Page.lnk_Customer_Details(driver).click();
		Methods_Appointment_Details.viewCustomerDetails(driver, sTestCaseName, 211);
				
		//Verify correct Job Details displayed
		Objects_Appointment_Details_Page.lnk_Job_Details(driver).click();
		Methods_Appointment_Details.viewJobDetails(driver, sTestCaseName, 211);
				
		//Verify correct Meter Details displayed
		Objects_Appointment_Details_Page.lnk_Meter_Details(driver).click();
		Methods_Appointment_Details.viewMeterDetails(driver, sTestCaseName, 211);
				
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
		Log.info("Suitable for Smart Installation page displayed as expected");	
		
		//Verify Initial page elements displayed
		Methods_Electricity_Meter_Suitable_For_Smart_Installation.viewPage(driver, sTestCaseName);
		Log.info("Electricity Meter Suitable for Smart Installation initial elements displayed as expected");
		
		//Verify correct page elements displayed after Suitable For Smart Installation - Yes clicked
		Methods_Electricity_Meter_Suitable_For_Smart_Installation.viewSuitableYesPage(driver, sTestCaseName);
		Log.info("Electricity Meter Suitable for Smart Installation Yes elements displayed as expected");
	
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
		
		//Verify that we are on the Electricity Meter Capture Initial Polarity Check - At Meter page
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.lbl_Initial_Polarity_Check_At_Meter(driver).isDisplayed();
		Log.info("Initial Polarity Check At Meter page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Electricity_Meter_Initial_Polarity_Check_At_Meter.viewPage(driver, sTestCaseName);
		Log.info("Electricity Meter Initial Polarity check At Meter initial elements displayed as expected");
								
		//Invoke Method to complete a successful polarity check 
		Methods_Electricity_Meter_Initial_Polarity_Check_At_Meter.addSuccessValuesINST(driver, sTestCaseName);
		
		//Verify that we are on the Electricity Meter HAN / WAN Check page
		Objects_Electricity_Meter_Han_Wan_Checks_Page.lbl_Han_Wan_Checks(driver).isDisplayed();
		Log.info("HAN / WAN Check page displayed as expected");
		
		//Invoke Method to complete an aborted HAN / WAN check 
		Methods_Electricity_Meter_HAN_WAN_Checks.addSPRKAbortValues(driver, sTestCaseName);
			
		//Click Abort button to bring up Abort page 
		Objects_Electricity_Meter_Han_Wan_Checks_Page.btn_Abort(driver).click();
		Log.info("Abort button clicked");
		
		//Verify Abort page displayed
		Objects_Abort_Page.First_Utility_Additional_Questions.lbl_Abort_Elec_Meter_Reason_Codes(driver).isDisplayed();
		Log.info("Abort page displayed as expected");
		Utils.takeScreenshot(driver, sTestCaseName + "-AbortPage");
		
		//Verify Abort elements displayed
		Methods_Aborts.viewPageAbortReasons(driver, sTestCaseName);
		Log.info("Abort page elements displayed as expected");
			
		//Invoke Method to complete Aborts questions for a success outcome 
		Methods_Aborts.addSuccessValuesSPRKRiskReasonsRed(driver, sTestCaseName);
											
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
				
		//Verify that we are on the Gas Meter Current Meter Details page
		Objects_Gas_Meter_Current_Meter_Details_Page.lbl_Gas_Current_Meter_Details(driver).isDisplayed();
		Log.info("Gas Meter Current Meter Details page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Gas_Meter_Current_Meter_Details.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter Current Meter Details initial elements displayed as expected");
														
		//Invoke Method to complete current meter details page 
		Methods_Gas_Meter_Current_Meter_Details.addSuccessValuesFound(driver, sTestCaseName);
		
		//Verify that we are on the Meter Found Meter Details page
		Objects_Found_Meter_Details_Page.lbl_Found_Meter_Details(driver).isDisplayed();
		Log.info("Found Meter Details page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Found_Meter_Details.viewPage(driver, sTestCaseName);
		Log.info("Meter Found Meter Details initial elements displayed as expected");
												
		//Invoke Method to complete Found meter details page 
		Methods_Found_Meter_Details.addSuccessValuesGas(driver, sTestCaseName);
							
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
		Log.info("Gas Meter New Regulator initial elements displayed as expected");
																						
		//Invoke Method to complete New Regulator page 
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
																												
		//Invoke Method to complete Install Kit page 
		Methods_Gas_Meter_Post_Installation_Gas_Tightness_Test.addSuccessValues(driver, sTestCaseName);
																	
		//Verify that we are on the Gas Meter Gas Appliance Safety Checks page
		Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page.lbl_Gas_Appliance_Safety_Checks(driver).isDisplayed();
		Log.info("Gas Appliance Safety Checks page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Gas_Meter_Gas_Appliance_Safety_Checks.viewPage(driver, sTestCaseName);
		Log.info("Gas Meter Post Installation Gas Tightness Test initial elements displayed as expected");
																														
		//Invoke Method to complete Gas Appliance Safety Checks page 
		Methods_Gas_Meter_Gas_Appliance_Safety_Checks.addSuccessValues(driver, sTestCaseName);
		
		//Verify that we are on the Job Completion Device Binding & Commissioning page
		Objects_Job_Completion_Device_Binding_Commissioning_Page.lbl_Device_Binding_Commissioning(driver).isDisplayed();
		Log.info("Job Completion Device Binding Commissioning page displayed as expected");
			
		//Verify Initial page elements displayed
		Methods_Job_Completion_Device_Binding_Commissioning.viewPage(driver, sTestCaseName);
		Log.info("Job Completion Device Binding Commissioning initial elements displayed as expected");
																																		
		//Invoke Method to complete Device Binding & Commissioning page 
		Methods_Job_Completion_Device_Binding_Commissioning.addSuccessValues(driver, sTestCaseName);
		
		//Verify that we are on the Job Completion Scan IHD page
		Objects_Job_Completion_Scan_IHD_Page.lbl_Scan_IHD(driver).isDisplayed();
		Log.info("Job Completion Scan IHD page displayed as expected");
					
		//Verify Initial page elements displayed
		Methods_Job_Completion_Scan_IHD.viewPage(driver, sTestCaseName);
		Log.info("Job Completion Scan IHD initial elements displayed as expected");
																																				
		//Invoke Method to complete Scan IHD page 
		Methods_Job_Completion_Scan_IHD.addSuccessValues(driver, sTestCaseName);
																			
		//Verify that we are on the Job Completion Configure All Meters Installed page
		Objects_Job_Completion_Configure_All_Meters_Installed_Page.lbl_Configure_All_Meters_Installed(driver).isDisplayed();
		Log.info("Job Completion Configure All Meters Installed page displayed as expected");
	
		//Verify Initial page elements displayed
		Methods_Job_Completion_Configure_All_Meters_Installed.viewPage(driver, sTestCaseName);
		Log.info("Job Completion Configure All Meters Installed initial elements displayed as expected");
																																
		//Invoke Method to complete Configure All Meters Installed page 
		Methods_Job_Completion_Configure_All_Meters_Installed.addSuccessValues(driver, sTestCaseName);
																			
		//Verify that we are on the Job Completion Energy Efficiency Information page
		Objects_Job_Completion_Energy_Efficiency_Information_Page.lbl_Energy_Efficiency_Information(driver).isDisplayed();
		Log.info("Job Completion Energy Efficient Information page displayed as expected");
	
		//Verify Initial page elements displayed
		Methods_Job_Completion_Energy_Efficient_Information.viewPage(driver, sTestCaseName);
		Log.info("Job Completion Enerfy Efficiency Information initial elements displayed as expected");
																																		
		//Invoke Method to complete Energy Efficiency information page 
		Methods_Job_Completion_Energy_Efficient_Information.addSuccessValues(driver, sTestCaseName);
		
		//Verify that we are on the Job Completion Summary page
		Objects_Job_Completion_Smart_Education_Page.lbl_Smart_Education(driver).isDisplayed();
		Log.info("Job Completion Smart Education displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Job_Completion_Smart_Education.viewPage(driver, sTestCaseName);
		Log.info("Job Completion Summary initial elements displayed as expected");
																																				
		//Invoke Method to complete Summary page 
		Methods_Job_Completion_Smart_Education.addSuccessValues(driver, sTestCaseName);
																				
		//Verify that we are on the Job Completion Summary page
		Objects_Job_Completion_Summary_Page.lbl_Summary(driver).isDisplayed();
		Log.info("Job Completion Summary page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Job_Completion_Summary.viewPage(driver, sTestCaseName);
		Log.info("Job Completion Summary initial elements displayed as expected");
																																				
		//Invoke Method to complete Energy Efficiency information page 
		Methods_Job_Completion_Summary.addSuccessValues(driver, sTestCaseName);
																						
		//Verify that we are on the Job Completion Capture Customer Signature page
		Objects_Job_Completion_Capture_Customer_Signature_Page.lbl_Capture_Customer_Signature(driver).isDisplayed();
		Log.info("Job Completion Summary page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Job_Completion_Capture_Customer_Signature.viewPage(driver, sTestCaseName);
		Log.info("Job Completion Capture Customer Signature initial elements displayed as expected");
																																						
		//Invoke Method to complete Energy Efficiency information page 
		Methods_Job_Completion_Capture_Customer_Signature.addSuccessValues(driver, sTestCaseName);
	
		//Verify that we have returned to the Appointments list page
	    Objects_Appointments_List_Page.hdr_First_Appointment(driver).isDisplayed();
		Log.info("First Appointment Header displayed");
		
		Log.info("Test 209 <<<<<<<<<<Completed By Paul Middleton>>>>>>>>>>INST_12_Elec_HAN_WAN_Checks_Page_Abort_ECOT_Chrome");
		
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

