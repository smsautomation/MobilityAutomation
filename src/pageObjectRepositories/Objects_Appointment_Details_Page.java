package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 02/06/2017
* Function: Objects_Appointment_Details_Page
* Purpose: This class contains all of the elements on the Appointment Details page
* Arguments: 
* 			
* Returns: 
**********************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
*********************************************************************/

public class Objects_Appointment_Details_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Appointment_Details_Page";

    public static WebElement img_List(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.className("logout-icon"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | img_List not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lnk_Customer_Details(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[1]/ul/li[1]/a"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Customer_Details not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lnk_Job_Details (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[1]/ul/li[2]/a"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Job_Details not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Meter_Details (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[1]/ul/li[3]/a"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Meter_Details not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Call_Forward (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btnCall1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Call_Forward not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Contact_Made_Yes (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/callforwardform/div/div/div[1]/div[3]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Contact_Made_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Contact_Made_No (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/callforwardform/div/div/div[1]/div[3]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Contact_Made_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Appointment_Confirm_Yes (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/callforwardform/div/div/div[1]/div[4]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Appointment_Confirm_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Appointment_Confirm_No (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/callforwardform/div/div/div[1]/div[4]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Appointment_Confirm_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Customer_Contact_Supplier_Yes (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/callforwardform/div/div/div[1]/div[5]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Customer_Contact_Supplier_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Customer_Contact_Supplier_No (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/callforwardform/div/div/div[1]/div[5]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Customer_Contact_Supplier_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Appointment_Reschedule_Yes (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/callforwardform/div/div/div[1]/div[7]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Appointment_Reschedule_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Appointment_Reschedule_No (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/callforwardform/div/div/div[1]/div[7]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Appointment_Reschedule_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Depart (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("//*[@ng-click='depart()']"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Depart not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Additional_Access_Details (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("notes"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Access_Details not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Depart_For_Appointment_OK (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("//*[@ng-click='departOK()']"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Depart_ForAppointment_OK not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Depart_For_Appointment_Cancel (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btnCall3"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Depart_ForAppointment_Cancel not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Additional_Notes (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("notes"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Abort_No_Access (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btnCall2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Abort_No_Access not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
//END OF APPOINTMENT DETAILS PAGE METHODS

	public static class Job_Details{
	    
	    public static WebElement lbl_MPAN(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wojob/div/div/div/div[1]/div[1]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_MPAN not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_MPRN(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wojob/div/div/div/div[1]/div[2]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_MPRN not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Customer_Name(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wojob/div/div/div/div[1]/div[2]/div[2]/div"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Customer_Name not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Post_Code(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wojob/div/div/div/div[1]/div[3]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Post_Code not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Supplier(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wojob/div/div/div/div[1]/div[4]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Supplier not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Meter_Type_Elec(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wojob/div/div/div/div[2]/div[1]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Meter_Type_Elec not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Job_Description_Elec(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wojob/div/div/div/div[2]/div[2]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Job_Description_Elec not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Meter_Location_Elec(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wojob/div/div/div/div[2]/div[3]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Meter_Location_Elec not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Meter_Type_Gas(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wojob/div/div/div/div[3]/div[1]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Meter_Type_Gas not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Job_Description_Gas(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wojob/div/div/div/div[2]/div[2]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Job_Description_Gas not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	   /* 
	    public static WebElement lbl_Meter_Location_Gas(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wojob/div/div/div/div[3]/div[3]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Meter_Location_Gas not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
		*/
	}

//END OF JOB DETAILS METHODS
	
public static class Customer_Details{
	    
	    public static WebElement lbl_Customer_Name(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[2]/div[1]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Customer_Name not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Customer_Address(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[2]/div[2]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Customer_Address not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Customer_Post_Code(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[2]/div[3]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Customer_Post_Code not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Contact_Number(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[2]/div[4]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Contact_Number not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Work_Contact_Number(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[2]/div[5]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Work_Contact_Number not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_MPAN(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[2]/div[6]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_MPAN not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_MPRN(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[2]/div[7]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_MPRN not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Supplier(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[2]/div[8]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Supplier not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Site_Contact_Details(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[4]/div[1]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Site_Contact_Details not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Customer_Doorstep_Password(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[4]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Customer_Doorstep_Password not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Access_Details(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[4]/div[3]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Access_Details not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Customer_Special_Needs(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[6]/div[1]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Customer_Special_Needs not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Special_Instructions(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[6]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Special_Instructions not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Additional_Equipment(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[6]/div[3]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Additional_Equipment not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Previous_Risk_Assess(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[6]/div[4]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Previous_Risk_Assess not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Booking_Remarks(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[6]/div[5]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Booking_Remarks not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	    
	    public static WebElement lbl_Previous_Visits(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wocustomer/div/div/div/div[6]/div[6]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Previous_Visits not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
}

//END OF CUSTOMER DETAILS METHODS

public static class Meter_Details{
    
    public static WebElement lbl_Customer_Name_Elec(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wometer/div/div/div[1]/div/div[2]/div[1]/div[2]/div"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Customer_Name_Elec not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_Post_Code_Elec(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wometer/div/div/div[1]/div/div[2]/div[2]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Post_Code_Elec not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_Elec_Meter_Serial_Number(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wometer/div/div/div[1]/div/div[2]/div[4]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Elec_Meter_Serial_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_Meter_Type_Elec(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wometer/div/div/div[1]/div/div[2]/div[5]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Meter_Type_Elec not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_SSC_Code(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wometer/div/div/div[1]/div/div[2]/div[6]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_SSC_Code not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_Meter_Location_Elec(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wometer/div/div/div[1]/div/div[2]/div[7]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Meter_Location_Elec not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_Customer_Name_Gas(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wometer/div/div/div/div/div[2]/div[1]/div[2]/div"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Customer_Name_Gas not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_Post_Code_Gas(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wometer/div/div/div/div/div[2]/div[2]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Post_Code_Gas not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_Gas_Meter_Serial_Number(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wometer/div/div/div/div/div[2]/div[3]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Meter_Serial_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    /*
    public static WebElement lbl_Meter_Type_Gas(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wometer/div/div/div[2]/div/div[2]/div[4]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Meter_Type_Gas not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	*/
   
    /*
    public static WebElement lbl_Meter_Location_Gas(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/wometer/div/div/div[2]/div/div[2]/div[5]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Meter_Location_Gas not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	} 
     */
 
}

//END OF METER DETAILS METHODS

//END OF METHODS	    
}
