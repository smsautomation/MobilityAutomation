package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Appointment_Details_Page;
import utility.Log;
import utility.Utils;

public class Methods_Appointment_Details{
	
	//Declare variables 
	private static String sMPAN; 
	private static String sMPRN;
	private static String sCustomerName;
	private static String sPostCode;
	private static String sSupplier;
	private static String sMeterTypeElec;
	private static String sJobDescriptionElec;
	private static String sMeterLocationElec;
	private static String sMeterTypeGas;
	private static String sJobDescriptionGas;
	private static String sCustomerAddress;
	private static String sContactNumber;
	private static String sWorkContactNumber;
	private static String sSiteContactDetails;
	private static String sCustomerDoorstepPassword;
	private static String sAccessDetails;
	private static String sCustomerSpecialNeeds;
	private static String sSpecialInstructions;
	private static String sAdditionalEquipment;
	private static String sPreviousRiskAssess;
	private static String sBookingRemarks;
	private static String sPreviousVisits;
	private static String sElecMeterSerialNumber;
	private static String sSSCCode;
	private static String sGasMeterSerialNumber;
	private static String sMeterLocationGas;	
	
	
	/* **************************************************************************************************
	* Function: getTableValues
	* Author: Iain Storrie
	* Date: 13/06/2017
	* Purpose: This method gets values for all of the associated variables
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
	public static void getTableValues(int iRow) {
		
		sMPAN = Utils.assignStringVariable("MPAN", iRow); 
		sMPRN = Utils.assignStringVariable("MPRN", iRow);
		sCustomerName = Utils.assignStringVariable("Customer Name", iRow);
		sPostCode = Utils.assignStringVariable("Post Code", iRow);
		sSupplier = Utils.assignStringVariable("Supplier", iRow);
		sMeterTypeElec = Utils.assignStringVariable("Meter Type Elec", iRow);
		sJobDescriptionElec = Utils.assignStringVariable("Job Description Elec", iRow);
		sMeterLocationElec = Utils.assignStringVariable("Meter Location Elec", iRow);
		sMeterTypeGas = Utils.assignStringVariable("Meter Type Gas", iRow);
		sJobDescriptionGas = Utils.assignStringVariable("Job Description Gas", iRow);
		sCustomerAddress = Utils.assignStringVariable("Customer Address", iRow);
		sContactNumber = Utils.assignStringVariable("Contact Number", iRow);
		sWorkContactNumber = Utils.assignStringVariable("Work Contact Number", iRow);
		sSiteContactDetails = Utils.assignStringVariable("Site Contact Details", iRow);
		sCustomerDoorstepPassword = Utils.assignStringVariable("Customer Doorstep Password", iRow);
		sAccessDetails = Utils.assignStringVariable("Access Details", iRow);
		sCustomerSpecialNeeds = Utils.assignStringVariable("Customer Special Needs", iRow);
		sSpecialInstructions = Utils.assignStringVariable("Special Instructions", iRow);
		sAdditionalEquipment = Utils.assignStringVariable("Additional Equipment", iRow);
		sPreviousRiskAssess = Utils.assignStringVariable("Previous Risk Assess", iRow);
		sBookingRemarks = Utils.assignStringVariable("Booking Remarks", iRow);
		sPreviousVisits = Utils.assignStringVariable("Previous Visits", iRow);
		sElecMeterSerialNumber = Utils.assignStringVariable("Elec Meter Serial Number", iRow);
		sSSCCode = Utils.assignStringVariable("SSC Code", iRow);
		sGasMeterSerialNumber = Utils.assignStringVariable("Gas Meter Serial Number", iRow);
		sMeterLocationGas = Utils.assignStringVariable("Gas Meter Serial Number", iRow);
		
	//END OF GET TABLE VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewJobDetailsItem
	* Author: Iain Storrie
	* Date: 13/06/2017
	* Purpose: This method checks the Job Details elements on the Appointment Details page
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
	public static void viewJobDetails(WebDriver driver, String sTestCaseName) throws Exception{
	
				
		//Check that the MPAN is shown
		if (sMPAN.length() > 0){
			sMPAN = Objects_Appointment_Details_Page.Job_Details.lbl_MPAN(driver).getText();
			Log.info(sTestCaseName + " | \"" + sMPAN + "\" displayed as MPAN");
		}
		
		//Check that the MPRN is shown
		if (sMPRN.length() > 0){
			sMPRN = Objects_Appointment_Details_Page.Job_Details.lbl_MPRN(driver).getText();
			Log.info(sTestCaseName + " | \"" + sMPRN + "\" displayed as MPRN");
		}
		
		//Check that the Customer Name is shown
		if (sCustomerName.length() > 0){
			sCustomerName = Objects_Appointment_Details_Page.Job_Details.lbl_Customer_Name(driver).getText();
			Log.info(sTestCaseName + " | \"" + sCustomerName + "\" displayed as Customer Name");
		}
		
		//Check that the Post Code is shown
		if (sPostCode.length() > 0){
			sPostCode = Objects_Appointment_Details_Page.Job_Details.lbl_Post_Code(driver).getText();
		Log.info(sTestCaseName + " | \"" + sPostCode + "\" displayed as Post Code");
		}
		
		//Check that the Supplier is shown
		if (sSupplier.length() > 0){
			sSupplier = Objects_Appointment_Details_Page.Job_Details.lbl_Supplier(driver).getText();
		Log.info(sTestCaseName + " | \"" + sSupplier + "\" displayed as Supplier");
		}
		
		//Check that the Meter Type Elec is shown
		if (sMeterTypeElec.length() > 0){
			sMeterTypeElec = Objects_Appointment_Details_Page.Job_Details.lbl_Meter_Type_Elec(driver).getText();
		Log.info(sTestCaseName + " | \"" + sMeterTypeElec + "\" displayed as Meter Type Elec");
		}
		
		//Check that the Job Description Elec is shown
		if (sJobDescriptionElec.length() > 0){
			sJobDescriptionElec = Objects_Appointment_Details_Page.Job_Details.lbl_Job_Description_Elec(driver).getText();
		Log.info(sTestCaseName + " | \"" + sJobDescriptionElec + "\" displayed as Job Description Elec");
		}
		
		//Check that the Meter Location Elec is shown
		if (sMeterLocationElec.length() > 0){
			sMeterLocationElec = Objects_Appointment_Details_Page.Job_Details.lbl_Meter_Location_Elec(driver).getText();
		Log.info(sTestCaseName + " | \"" + sMeterLocationElec + "\" displayed as Meter Location Elec");
		}
		
		//Check that the Meter Type Gas is shown
		if (sMeterTypeGas.length() > 0){
			sMeterTypeGas = Objects_Appointment_Details_Page.Job_Details.lbl_Meter_Type_Gas(driver).getText();
		Log.info(sTestCaseName + " | \"" + sMeterTypeGas + "\" displayed as Meter Type Gas");
		}
		
		//Check that the Job Description Gas is shown
		if (sJobDescriptionGas.length() > 0){
			sJobDescriptionGas = Objects_Appointment_Details_Page.Job_Details.lbl_Job_Description_Gas(driver).getText();
		Log.info(sTestCaseName + " | \"" + sJobDescriptionGas + "\" displayed as Job Description Gas");
		}
		
		//Check that the Meter Location Gas is shown
		if (sMeterLocationGas.length() > 0){
			sMeterLocationGas = Objects_Appointment_Details_Page.Job_Details.lbl_Meter_Location_Gas(driver).getText();
		Log.info(sTestCaseName + " | \"" + sMeterLocationGas + "\" displayed as Meter Location Gas");
		}

		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewJobDetails");
		
	//END OF VIEW JOB DETAILS METHOD	
	}
	
	/* **************************************************************************************************
	* Function: viewCustomerDetailsItem
	* Author: Iain Storrie
	* Date: 13/06/2017
	* Purpose: This method checks the Customer Details elements on the Appointment Details page
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
	public static void viewCustomerDetails(WebDriver driver, String sTestCaseName) throws Exception{
	
				
		//Check that the Customer Name is shown
		if (sCustomerName.length() > 0){
			sCustomerName = Objects_Appointment_Details_Page.Customer_Details.lbl_Customer_Name(driver).getText();
			Log.info(sTestCaseName + " | \"" + sCustomerName + "\" displayed as Customer Name");
		}
		
		//Check that the Customer Address is shown
		if (sCustomerAddress.length() > 0){
			sCustomerAddress = Objects_Appointment_Details_Page.Customer_Details.lbl_Customer_Address(driver).getText();
			Log.info(sTestCaseName + " | \"" + sCustomerAddress + "\" displayed as Customer Address");
		}
		
		//Check that the Post Code is shown
		if (sPostCode.length() > 0){
			sPostCode = Objects_Appointment_Details_Page.Customer_Details.lbl_Customer_Post_Code(driver).getText();
			Log.info(sTestCaseName + " | \"" + sPostCode + "\" displayed as Post Code");
		}
		
		//Check that the Contact Number is shown
		if (sContactNumber.length() > 0){
			sContactNumber = Objects_Appointment_Details_Page.Customer_Details.lbl_Contact_Number(driver).getText();
			Log.info(sTestCaseName + " | \"" + sContactNumber + "\" displayed as Contact Number");
		}
		
		//Check that the Work Contact Number is shown
		if (sWorkContactNumber.length() > 0){
			sWorkContactNumber = Objects_Appointment_Details_Page.Customer_Details.lbl_Work_Contact_Number(driver).getText();
			Log.info(sTestCaseName + " | \"" + sWorkContactNumber + "\" displayed as Contact Number");
		}
		
		//Check that the MPAN is shown
		if (sMPAN.length() > 0){
			sMPAN = Objects_Appointment_Details_Page.Customer_Details.lbl_MPAN(driver).getText();
			Log.info(sTestCaseName + " | \"" + sMPAN + "\" displayed as MPAN");
		}
		
		//Check that the MPRN is shown
		if (sMPRN.length() > 0){
			sMPRN = Objects_Appointment_Details_Page.Customer_Details.lbl_MPRN(driver).getText();
			Log.info(sTestCaseName + " | \"" + sMPRN + "\" displayed as MPRN");
		}
		
		//Check that the Supplier is shown
		if (sSupplier.length() > 0){
			sSupplier = Objects_Appointment_Details_Page.Customer_Details.lbl_Supplier(driver).getText();
		Log.info(sTestCaseName + " | \"" + sSupplier + "\" displayed as Supplier");
		}
		
		//Check that the Site Contact Details is shown
		if (sSiteContactDetails.length() > 0){
			sSiteContactDetails = Objects_Appointment_Details_Page.Customer_Details.lbl_Site_Contact_Details(driver).getText();
		Log.info(sTestCaseName + " | \"" + sSiteContactDetails + "\" displayed as Site Contact Details");
		}
		
		//Check that the Customer Doorstep Password is shown
		if (sCustomerDoorstepPassword.length() > 0){
			sCustomerDoorstepPassword = Objects_Appointment_Details_Page.Customer_Details.lbl_Customer_Doorstep_Password(driver).getText();
		Log.info(sTestCaseName + " | \"" + sCustomerDoorstepPassword + "\" displayed as Customer Doorstep Password");
		}
		
		//Check that the Access Details is shown
		if (sAccessDetails.length() > 0){
			sAccessDetails = Objects_Appointment_Details_Page.Customer_Details.lbl_Access_Details(driver).getText();
		Log.info(sTestCaseName + " | \"" + sAccessDetails + "\" displayed as Access Details");
		}
		
		//Check that the Customer Special Needs is shown
		if (sCustomerSpecialNeeds.length() > 0){
			sCustomerSpecialNeeds = Objects_Appointment_Details_Page.Customer_Details.lbl_Customer_Special_Needs(driver).getText();
		Log.info(sTestCaseName + " | \"" + sCustomerSpecialNeeds + "\" displayed as Customer Special Needs");
		}
		
		//Check that the Special Instructions is shown
		if (sSpecialInstructions.length() > 0){
			sSpecialInstructions = Objects_Appointment_Details_Page.Customer_Details.lbl_Special_Instructions(driver).getText();
		Log.info(sTestCaseName + " | \"" + sSpecialInstructions + "\" displayed as Special Instructions");
		}
		
		//Check that the Additional Equipment is shown
		if (sAdditionalEquipment.length() > 0){
			sAdditionalEquipment = Objects_Appointment_Details_Page.Customer_Details.lbl_Additional_Equipment(driver).getText();
		Log.info(sTestCaseName + " | \"" + sAdditionalEquipment + "\" displayed as Additional Equipment");
		}
		
		//Check that the Previous Risk Assess is shown
		if (sPreviousRiskAssess.length() > 0){
			sPreviousRiskAssess = Objects_Appointment_Details_Page.Customer_Details.lbl_Previous_Risk_Assess(driver).getText();
		Log.info(sTestCaseName + " | \"" + sPreviousRiskAssess + "\" displayed as Previous Risk Assess");
		}
		
		//Check that the Booking Remarks is shown
		if (sBookingRemarks.length() > 0){
			sBookingRemarks = Objects_Appointment_Details_Page.Customer_Details.lbl_Booking_Remarks(driver).getText();
		Log.info(sTestCaseName + " | \"" + sBookingRemarks + "\" displayed as Booking Remarks");
		}
		
		//Check that the Previous Visits is shown
		if (sPreviousVisits.length() > 0){
			sPreviousVisits = Objects_Appointment_Details_Page.Customer_Details.lbl_Previous_Visits(driver).getText();
		Log.info(sTestCaseName + " | \"" + sPreviousVisits + "\" displayed as Previous Visits");
		}
	
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewJobDetails");
		
	//END OF VIEW CUSTOMER DETAILS METHOD	
	}

	/* **************************************************************************************************
	* Function: viewMeterDetailsItem
	* Author: Iain Storrie
	* Date: 13/06/2017
	* Purpose: This method checks the Meter Details elements on the Appointment Details page
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
	public static void viewMeterDetails(WebDriver driver, String sTestCaseName) throws Exception{
	
				
		//Check that the Customer Name Elec is shown
		if (sCustomerName.length() > 0){
			sCustomerName = Objects_Appointment_Details_Page.Meter_Details.lbl_Customer_Name_Elec(driver).getText();
			Log.info(sTestCaseName + " | \"" + sCustomerName + "\" displayed as Customer Name Elec");
		}
		
		//Check that the Post Code Elec is shown
		if (sPostCode.length() > 0){
			sPostCode = Objects_Appointment_Details_Page.Meter_Details.lbl_Post_Code_Elec(driver).getText();
			Log.info(sTestCaseName + " | \"" + sPostCode + "\" displayed as Post Code Elec");
		}
		
		//Check that the Elec Meter Serial Number is shown
		if (sElecMeterSerialNumber.length() > 0){
			sElecMeterSerialNumber = Objects_Appointment_Details_Page.Meter_Details.lbl_Elec_Meter_Serial_Number(driver).getText();
			Log.info(sTestCaseName + " | \"" + sElecMeterSerialNumber + "\" displayed as Elec Meter Serial Number");
		}
		
		//Check that the Meter Type Elec is shown
		if (sMeterTypeElec.length() > 0){
			sMeterTypeElec = Objects_Appointment_Details_Page.Meter_Details.lbl_Meter_Type_Elec(driver).getText();
			Log.info(sTestCaseName + " | \"" + sMeterTypeElec + "\" displayed as Meter Type Elec");
		}
		
		//Check that the SSC Code is shown
		if (sSSCCode.length() > 0){
			sSSCCode = Objects_Appointment_Details_Page.Meter_Details.lbl_SSC_Code(driver).getText();
			Log.info(sTestCaseName + " | \"" + sSSCCode + "\" displayed as SSC Code");
		}
		
		//Check that the Meter Location Elec is shown
		if (sMeterLocationElec.length() > 0){
			sMeterLocationElec = Objects_Appointment_Details_Page.Meter_Details.lbl_Meter_Location_Elec(driver).getText();
			Log.info(sTestCaseName + " | \"" + sMeterLocationElec + "\" displayed as Meter Location Elec");
		}
		
		//Check that the Customer Name Gas is shown
		if (sCustomerName.length() > 0){
			sCustomerName = Objects_Appointment_Details_Page.Meter_Details.lbl_Customer_Name_Gas(driver).getText();
			Log.info(sTestCaseName + " | \"" + sCustomerName + "\" displayed as Customer Name Gas");
		}
			
		//Check that the Post Code Gas is shown
		if (sPostCode.length() > 0){
			sPostCode = Objects_Appointment_Details_Page.Meter_Details.lbl_Post_Code_Gas(driver).getText();
			Log.info(sTestCaseName + " | \"" + sPostCode + "\" displayed as Post Code Gas");
		}
		
		//Check that the Gas Meter Serial Number is shown
		if (sGasMeterSerialNumber.length() > 0){
			sGasMeterSerialNumber = Objects_Appointment_Details_Page.Meter_Details.lbl_Gas_Meter_Serial_Number(driver).getText();
		Log.info(sTestCaseName + " | \"" + sGasMeterSerialNumber + "\" displayed as Gas Meter Serial Number");
		}
		
		//Check that the Meter Type Gas is shown
		if (sMeterTypeGas.length() > 0){
			sMeterTypeGas = Objects_Appointment_Details_Page.Meter_Details.lbl_Meter_Type_Gas(driver).getText();
		Log.info(sTestCaseName + " | \"" + sMeterTypeGas + "\" displayed as Meter Type Gas");
		}
		
		//Check that the Meter Location Gas is shown
		if (sMeterLocationGas.length() > 0){
			sMeterLocationGas = Objects_Appointment_Details_Page.Meter_Details.lbl_Meter_Location_Gas(driver).getText();
		Log.info(sTestCaseName + " | \"" + sMeterLocationGas + "\" displayed as Meter Location Gas");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewJobDetails");
		
	//END OF VIEW METER DETAILS METHOD	
	}	
	
	
	
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 13/06/2017
	* Purpose: This method checks the main page elements on the Appointment Details page
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
		Objects_Appointment_Details_Page.img_List(driver).isDisplayed();{
		Log.info(sTestCaseName + " | List Image displayed as expected");
		}
		
		Objects_Appointment_Details_Page.lnk_Customer_Details(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Customer Details Link displayed as expected");
			}
		
		Objects_Appointment_Details_Page.lnk_Job_Details(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Job Details Link displayed as expected");
			}
		
		Objects_Appointment_Details_Page.lnk_Meter_Details(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Meter Details Link displayed as expected");
			}
		
		Objects_Appointment_Details_Page.btn_Call_Forward(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Call Forward Button displayed as expected");
			}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewMainPage");
		
	//END OF VIEW PAGE METHOD
	}
//END OF METHODS
}