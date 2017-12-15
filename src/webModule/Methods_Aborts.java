package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Abort_Page;
import utility.Log;
import utility.Utils;

public class Methods_Aborts{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Aborts screen 
	* Tests page upon initial landing
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
	public static void viewPageNoAccess(WebDriver driver, String sTestCaseName) throws Exception{
		
	
		//Check that all of the elements that are expected are displayed
		Objects_Abort_Page.Abort_No_Access_Reasons.lbl_Not_Convenient_With_Customer(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Electricity Tests label displayed as expected");
		}
		
		Objects_Abort_Page.Abort_No_Access_Reasons.btn_Cancel(driver).isDisplayed();{
		Log.info(sTestCaseName + " | All Seals Intact - Yes radio button displayed as expected");
		}
		
		Objects_Abort_Page.Abort_No_Access_Reasons.btn_Next(driver).isDisplayed();{
		Log.info(sTestCaseName + " | All Seals Intact - Yes radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Aborts screen 
	* Tests page upon initial landing
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
	public static void viewPageAbortReasons(WebDriver driver, String sTestCaseName) throws Exception{
		
	
		//Check that all of the elements that are expected are displayed
		Objects_Abort_Page.Abort_Reasons.lbl_Job_Already_Done(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Electricity Tests label displayed as expected");
		}
		
		Objects_Abort_Page.Abort_No_Access_Reasons.btn_Cancel(driver).isDisplayed();{
		Log.info(sTestCaseName + " | All Seals Intact - Yes radio button displayed as expected");
		}
		
		Objects_Abort_Page.Abort_No_Access_Reasons.btn_Next(driver).isDisplayed();{
		Log.info(sTestCaseName + " | All Seals Intact - Yes radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
	}
		
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method checks the main page elements on the Aborts screen 
	* Tests page upon initial landing
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
	public static void viewPageAbortRiskReasons(WebDriver driver, String sTestCaseName) throws Exception{
		
	
		//Check that all of the elements that are expected are displayed
		Objects_Abort_Page.Abort_Reasons.lbl_Risk_Failure(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Additional Electricity Tests label displayed as expected");
		}
		
		Objects_Abort_Page.Abort_No_Access_Reasons.btn_Cancel(driver).isDisplayed();{
		Log.info(sTestCaseName + " | All Seals Intact - Yes radio button displayed as expected");
		}
		
		Objects_Abort_Page.Abort_No_Access_Reasons.btn_Next(driver).isDisplayed();{
		Log.info(sTestCaseName + " | All Seals Intact - Yes radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: AddSuccessValuesNoAccess
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Aborts Page 
	* in order to force a successful additional tests scenario for the NoAccessAbort workflow
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
	public static void addSuccessValuesNoAccess(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful additional tests scenario 
		Objects_Abort_Page.Abort_No_Access_Reasons.lbl_Not_Convenient_With_Customer(driver).click();{
		Log.info(sTestCaseName + " | Not Convenient with Customer radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Contacted_First_Utility_Yes(driver).click();{
		Log.info(sTestCaseName + " | Contacted First Utility - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).click();{
		Log.info(sTestCaseName + " | First Utility Rep box clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys("Nina Moran");{
		Log.info(sTestCaseName + " | First Utility Rep name Entered");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | First Utility Rep entered");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).click();{
		Log.info(sTestCaseName + " | Additional Notes box clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).sendKeys("The Customer refused entry as not convenient");{
		Log.info(sTestCaseName + " | Typed message in text box");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Abort_Appointment_Red(driver).click();{
		Log.info(sTestCaseName + " | Abort Button Red clicked");
		}
		//Take a screenshot to show what we've done
		/*Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");*/
		
	
	//END OF ADD SUCCESS VALUES METHOD
		
	}
	
	/* **************************************************************************************************
	* Function: AddSuccessValuesNoAccess
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Aborts Page 
	* in order to force a successful additional tests scenario for the NoAccessAbort workflow
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
	public static void addSuccessValuesRefusedAccess(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful additional tests scenario 
		Objects_Abort_Page.Abort_No_Access_Reasons.lbl_Not_Convenient_With_Customer(driver).click();{
		Log.info(sTestCaseName + " | Not Convenient with Customer radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Contacted_First_Utility_Yes(driver).click();{
		Log.info(sTestCaseName + " | Contacted First Utility - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).click();{
		Log.info(sTestCaseName + " | First Utility Rep box clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys("Nina Moran");{
		Log.info(sTestCaseName + " | First Utility Rep name Entered");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | First Utility Rep entered");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).click();{
		Log.info(sTestCaseName + " | Additional Notes box clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).sendKeys("The Customer refused entry as not convenient");{
		Log.info(sTestCaseName + " | Typed message in text box");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Abort_Appointment_Red(driver).click();{
		Log.info(sTestCaseName + " | Abort Button Red clicked");
		}
		Thread.sleep(500);
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Abort_ReScan_Ok(driver).click();{
		Log.info(sTestCaseName + " | Aborting Rescanning Assets Button Red clicked");
		}
				
		//Take a screenshot to show what we've done
		/*Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");*/
		
	
	//END OF ADD SUCCESS VALUES METHOD
		
	}
		
	/* **************************************************************************************************
	* Function: AddSuccessValuesReasons
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Aborts Page 
	* in order to force a successful additional tests scenario for the Abort Reason workflow
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
	public static void addSuccessValuesReasonsRed(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful additional tests scenario 
		Objects_Abort_Page.Abort_Reasons.lbl_Job_Already_Done(driver).click();{
		Log.info(sTestCaseName + " | Job Already done - button clicked");
		}
	
	if ("Exchange_1_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome".equals(sTestCaseName)
			||("Exchange_1_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Failed_Test_Abort_Chrome".equals(sTestCaseName))
			||("Exchange_1_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Low_Pressure_Abort_Chrome".equals(sTestCaseName)))
	{ 
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Gas_Meter_Accessible_Yes(driver).click();{
		Log.info(sTestCaseName + " | Is Gas meter - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Gas_Meter_Exchanged_Yes(driver).click();{
		Log.info(sTestCaseName + " | Can Gas be installed on next visit - Yes radio button clicked");
		}	
	}
	else if ("Exchange_11_Elec_Initial_Polarity_Check_At_Meter_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_2_Elec_HAN_WAN_Checks_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_2_Elec_Initial_Polarity_Check_At_Meter_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_2_Elec_Suitable_For_Smart_Installation_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_5_Elec_Initial_Polarity_Check_At_Meter_Page_Abort_Chrome".equals(sTestCaseName)
			||"FLTY_2_Elec_Determine_Emergency_Call_Out_Page_Abort_Chrome".equals(sTestCaseName)
			||"FLTY_2_Elec_Initial_Polarity_Check_At_Meter_Page_Abort_Chrome".equals(sTestCaseName)
			||"INST_5_Elec_Initial_Polarity_Check_At_Meter_Page_Abort_Chrome".equals(sTestCaseName)) 
	{ 
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Elec_Meter_Accessible_Yes(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Accessible - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Martindale_Test_Passed_No(driver).click();{
		Log.info(sTestCaseName + " | Martindale Test Passed - No radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Vodafone(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Vodafone(driver).sendKeys("2");{
		Log.info(sTestCaseName + " | Entered Vadafone Signal");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_O2(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_O2(driver).sendKeys("3");{
		Log.info(sTestCaseName + " | Entered O2 Signal");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Orange(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Orange(driver).sendKeys("1");{
		Log.info(sTestCaseName + " | Entered Orange Signal");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_TMobile(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_TMobile(driver).sendKeys("4");{
		Log.info(sTestCaseName + " | Entered TMobile Signal");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Elec_Meter_Exchanged_Next_Visit_Yes(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Exchanged Next Visit - Yes radio button clicked");
		}
		
	} 
	else 
	{ 
			System.out.println("Doing the else "); 
		}
		
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Contacted_First_Utility_Yes(driver).click();{
		Log.info(sTestCaseName + " | Contacted First Utility - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys("Nina Moran");
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Entered First Utility Rep Name");
		}		
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).click();{
		Log.info(sTestCaseName + " | Additional Notes box clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).sendKeys("The Customer refused entry as not convenient");{
		Log.info(sTestCaseName + " | Typed message in text box");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Abort_Appointment_Red(driver).click();{
		Log.info(sTestCaseName + " | Abort Button Red clicked");
		}
		Thread.sleep(500);
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Abort_ReScan_Ok(driver).click();{
		Log.info(sTestCaseName + " | Aborting Rescanning Assets Button Red clicked");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
	}
		
	/* **************************************************************************************************
	* Function: AddSuccessValuesRiskReason
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Aborts Page 
	* in order to force a successful additional tests scenario for the Risk Abort workflow
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
	public static void addSuccessValuesRiskReasonsRed(WebDriver driver, String sTestCaseName) throws Exception{
	
	if ("Exchange_1_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome".equals(sTestCaseName)
		||("Exchange_1_Gas_Risk_Assessment_Gas_Abort_Low_Pressure_Chrome".equals(sTestCaseName))
		||("Exchange_1_Gas_Risk_Assessment_Gas_Abort_Med_Pressure_Chrome".equals(sTestCaseName))
		||("Exchange_1_Gas_Meter_Initial_Risk_Assessment_Gas_Abort_Chrome".equals(sTestCaseName))
		||("Exchange_3_Elec_Initial_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName))
		||("Exchange_3_Elec_Initial_Polarity_Check_At_Meter_Page_Abort_Chrome".equals(sTestCaseName))
		||("Exchange_9_Elec_Initial_Polarity_Check_At_Meter_Page_Abort_Chrome".equals(sTestCaseName))
		||("Exchange_9_Elec_Initial_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName))
		||("Exchange_3_Elec_Suitable_For_Smart_Installation_Page_Abort_Chrome".equals(sTestCaseName))
		||("Exchange_9_Elec_Suitable_For_Smart_Installation_Page_Abort_Chrome".equals(sTestCaseName))
		||("FLTY_17_Elec_Initial_Polarity_Check_At_Meter_Page_Abort_Chrome".equals(sTestCaseName))
		||("FLTY_17_Elec_Initial_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName))
		||("FLTY_17_Elec_Suitable_For_Smart_Installation_Page_Abort_Chrome".equals(sTestCaseName))
		||("RMVE_1_Gas_Meter_Initial_Risk_Assessment_Gas_Abort_Chrome".equals(sTestCaseName))
		||("RMVE_1_Gas_Risk_Assessment_Gas_Abort_Low_Pressure_Chrome".equals(sTestCaseName))
		||("RMVE_1_Gas_Risk_Assessment_Gas_Abort_Med_Pressure_Chrome".equals(sTestCaseName)))
	{ 
		//Add correct responses for a successful additional tests scenario 
		Objects_Abort_Page.Abort_Reasons.lbl_Risk_Failure(driver).click();{
		Log.info(sTestCaseName + " | Risk Failure button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Gas_Meter_Accessible_Yes(driver).click();{
		Log.info(sTestCaseName + " | Is Gas meter - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Gas_Meter_Exchanged_Yes(driver).click();{
		Log.info(sTestCaseName + " | Can Gas be installed on next visit - Yes radio button clicked");
		}	
	}
	else if ("Exchange_3_Elec_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			|| "Exchange_9_Elec_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			|| "FLTY_17_Elec_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName))
	{
		Objects_Abort_Page.Abort_Risk_Reasons.btn_Next(driver).click();{
		Log.info(sTestCaseName + " | Next button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Gas_Meter_Accessible_Yes(driver).click();{
		Log.info(sTestCaseName + " | Is Gas meter Accessible - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Gas_Meter_Exchanged_Yes(driver).click();{
		Log.info(sTestCaseName + " | Can Gas be installed on next visit - Yes radio button clicked");
		}
	}
	else if ("Exchange_11_Elec_Initial_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			|| "Exchange_2_Elec_Initial_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			|| "Exchange_5_Elec_Initial_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			|| "FLTY_2_Elec_Initial_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			|| "INST_5_Elec_Initial_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			|| "NMEX_5_Elec_Initial_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)) 
	{ 
		//Add correct responses for a successful additional tests scenario 
		Objects_Abort_Page.Abort_Reasons.lbl_Risk_Failure(driver).click();{
		Log.info(sTestCaseName + " | Risk Failure button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Elec_Meter_Accessible_Yes(driver).click();{
		Log.info(sTestCaseName + " | Terminal Screw Tightness - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Martindale_Test_Passed_No(driver).click();{
		Log.info(sTestCaseName + " | Terminal Screw Tightness - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Vodafone(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Vodafone(driver).sendKeys("1");{
		Log.info(sTestCaseName + " | TN-C-S (PME) selected from the Earth Type Combobox");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_O2(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_O2(driver).sendKeys("2");{
		Log.info(sTestCaseName + " | TN-C-S (PME) selected from the Earth Type Combobox");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Orange(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Orange(driver).sendKeys("4");{
		Log.info(sTestCaseName + " | TN-C-S (PME) selected from the Earth Type Combobox");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_TMobile(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_TMobile(driver).sendKeys("5");{
		Log.info(sTestCaseName + " | TN-C-S (PME) selected from the Earth Type Combobox");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Elec_Meter_Exchanged_Next_Visit_Yes(driver).click();{
		Log.info(sTestCaseName + " | Approved Siemens Cable Markers - Yes radio button clicked");
		}
		
	} 
	else 
	{ 
			System.out.println("Doing the else "); 
		}
	
		Thread.sleep(500);
		
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Contacted_First_Utility_Yes(driver).click();{
		Log.info(sTestCaseName + " | Contacted First Utility - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).click();{
		Log.info(sTestCaseName + " | First Utility Rep box clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys("Nina Moran");{
		Log.info(sTestCaseName + " | First Utility Rep name Entered");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | First Utility Rep entered");
		}		
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).sendKeys("The Customer refused entry as not convenient");{
		Log.info(sTestCaseName + " | LNNL selected from the Cable Marker Combobox");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Abort_Appointment_Red(driver).click();{
		Log.info(sTestCaseName + " | New Meter Details Complete label displayed");
		}
		Thread.sleep(500);
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Abort_ReScan_Ok(driver).click();{
		Log.info(sTestCaseName + " | Aborting Rescanning Assets Button Red clicked");
		}
			
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
	}
	
	/* **************************************************************************************************
	* Function: AddSuccessValuesRiskReason
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Aborts Page 
	* in order to force a successful additional tests scenario for the Risk Abort workflow
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
	public static void addSuccessValuesElecRiskReasonsRed(WebDriver driver, String sTestCaseName) throws Exception{
	
	
	if ("Exchange_11_Elec_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_2_Elec_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_5_Elec_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			||"FLTY_2_Elec_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			||"INST_5_Elec_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			||"NMEX_5_Elec_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName))
	{ 
		Objects_Abort_Page.Abort_Risk_Reasons.btn_Next(driver).click();{
		Log.info(sTestCaseName + " | Next button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Elec_Meter_Accessible_Yes(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Accessible - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Martindale_Test_Passed_No(driver).click();{
		Log.info(sTestCaseName + " | Martindale Test Passed - No radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Vodafone(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Vodafone(driver).sendKeys("2");{
		Log.info(sTestCaseName + " | Entered Vadafone Signal");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_O2(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_O2(driver).sendKeys("3");{
		Log.info(sTestCaseName + " | Entered O2 Signal");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Orange(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Orange(driver).sendKeys("1");{
		Log.info(sTestCaseName + " | Entered Orange Signal");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_TMobile(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_TMobile(driver).sendKeys("4");{
		Log.info(sTestCaseName + " | Entered TMobile Signal");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Elec_Meter_Exchanged_Next_Visit_Yes(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Exchanged Next Visit - Yes radio button clicked");
		}	
	}
	else 
	{ 
			System.out.println("Doing the else "); 
	}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Contacted_First_Utility_Yes(driver).click();{
		Log.info(sTestCaseName + " | Contacted First Utility - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).click();{
		Log.info(sTestCaseName + " | First Utility Rep box clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys("Nina Moran");{
		Log.info(sTestCaseName + " | First Utility Rep name Entered");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | First Utility Rep entered");
		}	
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).click();{
		Log.info(sTestCaseName + " | Additional Notes box clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).sendKeys("The Customer refused entry as not convenient");{
		Log.info(sTestCaseName + " | Typed message in text box");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Abort_Appointment_Red(driver).click();{
		Log.info(sTestCaseName + " | Abort Button Red clicked");
		}
		Thread.sleep(500);
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Abort_ReScan_Ok(driver).click();{
		Log.info(sTestCaseName + " | Aborting Rescanning Assets Button Red clicked");
		}
			
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
	}
	
	/* **************************************************************************************************
	* Function: AddSuccessValuesReasons
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Aborts Page 
	* in order to force a successful additional tests scenario for the Abort Reason workflow
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
	public static void addSuccessValuesReasonsOrange(WebDriver driver, String sTestCaseName) throws Exception{
	
	if ("Exchange_3_Appointment_Details_Page_Abort_No_Access_Chrome".equals(sTestCaseName)
			||"Exchange_3_Doorstep_Protocol_Page_Abort_Doorstep_Procedure_Fail_Chrome".equals(sTestCaseName)
			||"Exchange_3_Elec_HAN_WAN_Checks_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_3_Elec_Initial_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_3_Elec_Initial_Polarity_Check_At_Meter_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_3_Elec_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_3_Elec_Suitable_For_Smart_Installation_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_9_Elec_HAN_WAN_Checks_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_9_Elec_Initial_Polarity_Check_At_Meter_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_9_Elec_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_9_Elec_Initial_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			||"Exchange_9_Elec_Suitable_For_Smart_Installation_Page_Abort_Chrome".equals(sTestCaseName)
			||"FLTY_17_Elec_Initial_Polarity_Check_At_Meter_Page_Abort_Chrome".equals(sTestCaseName)
			||"FLTY_17_Elec_Initial_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			||"FLTY_17_Elec_Risk_Assessment_Page_Abort_Chrome".equals(sTestCaseName)
			||"FLTY_17_Elec_Suitable_For_Smart_Installation_Page_Abort_Chrome".equals(sTestCaseName))
	{
		//Add correct responses for a successful additional tests scenario 
		Objects_Abort_Page.Abort_Reasons.lbl_Job_Already_Done(driver).click();{
		Log.info(sTestCaseName + " | Job Already done button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Elec_Meter_Accessible_Yes(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Accessible - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Martindale_Test_Passed_No(driver).click();{
		Log.info(sTestCaseName + " | Martindale test Passed - No radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Vodafone(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Vodafone(driver).sendKeys("26");{
		Log.info(sTestCaseName + " | Entered Vodafone Signal test");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_O2(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_O2(driver).sendKeys("50");{
		Log.info(sTestCaseName + " | Entered O2 Signal test");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Orange(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_Orange(driver).sendKeys("90");{
		Log.info(sTestCaseName + " | Entered Orange Signal test");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_TMobile(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Signal_Test_TMobile(driver).sendKeys("65");{
		Log.info(sTestCaseName + " | Entered TMobile Signal test");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Elec_Meter_Exchanged_Next_Visit_Yes(driver).click();{
		Log.info(sTestCaseName + " | Elec Meter Exchanged on Next Visit - Yes radio button clicked");
		}
	}
		else if ("Exchange_3_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome".equals(sTestCaseName)
				||"Exchange_3_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Failed_Test_Abort_Chrome".equals(sTestCaseName)
				||"Exchange_3_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Low_Pressure_Abort_Chrome".equals(sTestCaseName)
				||"Exchange_3_Gas_Risk_Assessment_Gas_Abort_Low_Pressure_Chrome".equals(sTestCaseName)
				||"Exchange_3_Gas_Risk_Assessment_Gas_Abort_Med_Pressure_Chrome".equals(sTestCaseName)
				||"Exchange_3_Gas_SMeter_Post_Installation_Pressure_Drop_Abort_Chrome".equals(sTestCaseName)
				||"Exchange_9_Gas_Meter_Initial_Risk_Assessment_Gas_Abort_Chrome".equals(sTestCaseName)
				||"Exchange_9_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome".equals(sTestCaseName)
				||"Exchange_9_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Failed_Test_Abort_Chrome".equals(sTestCaseName)
				||"Exchange_9_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Low_Pressure_Abort_Chrome".equals(sTestCaseName)
				||"Exchange_9_Gas_Risk_Assessment_Gas_Abort_Low_Pressure_Chrome".equals(sTestCaseName)
				||"Exchange_9_Gas_Risk_Assessment_Gas_Abort_Med_Pressure_Chrome".equals(sTestCaseName)
				||"FLTY_17_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome".equals(sTestCaseName)
				||"FLTY_17_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Failed_Test_Abort_Chrome".equals(sTestCaseName)
				||"FLTY_17_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Low_Pressure_Abort_Chrome".equals(sTestCaseName)
				||"FLTY_17_Gas_Risk_Assessment_Gas_Abort_Low_Pressure_Chrome".equals(sTestCaseName)
				||"FLTY_17_Gas_Risk_Assessment_Gas_Abort_Med_Pressure_Chrome".equals(sTestCaseName)
				||"FLTY_17_Gas_Suitable_For_Smart_Installation_Abort_Chrome".equals(sTestCaseName))
	{	
		//Add correct responses for a successful additional tests scenario 
		Objects_Abort_Page.Abort_Reasons.lbl_Job_Already_Done(driver).click();{
		Log.info(sTestCaseName + " | Job Already done button clicked");
		}	
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Gas_Meter_Accessible_Yes(driver).click();{
		Log.info(sTestCaseName + " | Is Gas meter Accessible - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Gas_Meter_Exchanged_Yes(driver).click();{
		Log.info(sTestCaseName + " | Can Gas be installed on next visit - Yes radio button clicked");
		}		
	}
		else 
	{ 
			System.out.println("Doing the else "); 
	}
		
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Contacted_First_Utility_Yes(driver).click();{
		Log.info(sTestCaseName + " | Contacted First Utility - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys("Nina Moran");
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Nina Moran selected from the First Utility Rep Combobox");
		}		
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).sendKeys("The Customer refused entry as not convenient");{
		Log.info(sTestCaseName + " | Text entered into Additional Notes Textbox");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Abort_Appointment_Orange(driver).click();{
		Log.info(sTestCaseName + " | Abort Orange button clicked");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
	}
		
	/* **************************************************************************************************
	* Function: AddSuccessValuesRiskReason
	* Author: Paul Middleton
	* Date: 19/06/2017
	* Purpose: This method adds the required responses in the Aborts Page 
	* in order to force a successful additional tests scenario for the Risk Abort workflow
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
	public static void addSuccessValuesRiskReasonsOrange(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful additional tests scenario 
		Objects_Abort_Page.Abort_No_Access_Reasons.lbl_Not_Convenient_With_Customer(driver).click();{
		Log.info(sTestCaseName + " | All Seals Intact - Yes radio button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Contacted_First_Utility_Yes(driver).click();{
		Log.info(sTestCaseName + " | Approved Siemens Cable Markers - Yes radio button clicked");
		}
		Thread.sleep(200);
		
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys("Nina Moran");
		Objects_Abort_Page.First_Utility_Additional_Questions.cbx_First_Utility_Rep(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | TN-C-S (PME) selected from the Earth Type Combobox");
		}		
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).click();
		Objects_Abort_Page.First_Utility_Additional_Questions.txt_Additional_Notes(driver).sendKeys("The Customer refused entry as not convenient");{
		Log.info(sTestCaseName + " | LNNL selected from the Cable Marker Combobox");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Abort_Page.First_Utility_Additional_Questions.btn_Abort_Appointment_Orange(driver).click();{
		Log.info(sTestCaseName + " | New Meter Details Complete label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
				
		//END OF ADD SUCCESS VALUES INST5 METHOD
	}
	
		
//END OF METHODS
}