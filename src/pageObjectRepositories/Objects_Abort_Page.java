package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 07/06/2017
* Function: Objects_Abort_Page
* Purpose: This class contains all of the elements on the Abort page
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

public class Objects_Abort_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Abort_Page";

    public static class Abort_Reasons{
    
    public static WebElement lbl_Risk_Failure(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[1]/label/div[2]"));
			element = driver.findElement(By.id("abdradio1"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Risk_Failure not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lbl_Tampering_Identified(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[2]/label/div[2]"));
			element = driver.findElement(By.id("abdradio2"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Tampering_Identified not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Job_Already_Done(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[3]/label/div[2]"));
			element = driver.findElement(By.id("abdradio3"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Job_Already_Done not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_No_Meter_Onsite(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[4]/label/div[2]"));
			element = driver.findElement(By.id("abdradio4"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_No_Meter_Onsite not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Wrong_Meter_Serial_Number(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[5]/label/div[2]"));
			element = driver.findElement(By.id("abdradio5"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Wrong_Meter_Serial_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Customer(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[6]/label/div[2]"));
			element = driver.findElement(By.id("abdradio6"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Customer not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_No_Signal_For_Smart(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[7]/label/div[2]"));
			element = driver.findElement(By.id("abdradio7"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_No_Signal_For_Smart not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_No_Room_For_Meter(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[8]/label/div[2]"));
			element = driver.findElement(By.id("abdradio8"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_No_Room_For_Meter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_No_Fault_Found(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[10]/label/div[2]"));
			element = driver.findElement(By.id("abdradio9"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_No_Fault_Found not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Recent_Job_Already_Done(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[29]/label/div[2]"));
			element = driver.findElement(By.id("abdradio10"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Recent_Job_Already_Done not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Incorrect_Skillset_For_Elec_Job_Type(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[30]/label/div[2]"));
			element = driver.findElement(By.id("abdradio11"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Incorrect_Skillset_For_Elec_Job_Type not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Warrant_Change_Of_Tenancy(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[14]/label/div[2]"));
			element = driver.findElement(By.id("abdradio12"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Warrant_Change_Of_Tenancy not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Warrant_Customer_Paid(WebDriver driver){
		try{
			//element = driver.findElement(By.id(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[15]/label/div[2]"));
			element = driver.findElement(By.id("abdradio13"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Warrant_Customer_Paid not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Warrant_Cancelled_By_Warrant_Officer(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[16]/label/div[2]"));
			element = driver.findElement(By.id("abdradio14"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Warrant_Cancelled_By_Warrant_Officer not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Job_Faulted(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[17]/label/div[2]"));
			element = driver.findElement(By.id("abdradio15"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Job_Faulted not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Meter_Blocked_Inaccessible(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[18]/label/div[2]"));
			element = driver.findElement(By.id("abdradio16"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Meter_Blocked_Inaccessible not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_New_Mains_Service_Not_Live(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[19]/label/div[2]"));
			element = driver.findElement(By.id("abdradio17"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_New_Mains_Service_Not_Live not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Meter_Worker_Not_Correct_Equipment(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[20]/label/div[2]"));
			element = driver.findElement(By.id("abdradio18"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Meter_Worker_Not_Correct_Equipment not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Service_Needs_Altered(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[21]/label/div[2]"));
			element = driver.findElement(By.id("abdradio19"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Service_Needs_Altered not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Customer_Refused_Resite(WebDriver driver){
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[22]/label/div[2]"));
			element = driver.findElement(By.id("abdradio20"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Customer_Refused_Resite not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Meter_Payment_Type_Different(WebDriver driver){
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[23]/label/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Meter_Payment_Type_Different not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Wrong_Supplier(WebDriver driver){
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[25]/label/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Wrong_Supplier not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Failed_Gas_By_Let_Test(WebDriver driver){
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[9]/label/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Failed_Gas_By_Let_Test not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Incorrect_Skillset_For_Gas_Job_Type(WebDriver driver){
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[11]/label/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Incorrect_Skillset_For_Gas_Job_Type not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Unable_Turn_Gas_Off(WebDriver driver){
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[12]/label/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Unable_Turn_Gas_Off not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_ECV_Not_Accessible(WebDriver driver){
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[13]/label/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_ECV_Not_Accessible not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Force_Majeure(WebDriver driver){
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[23]/label/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Force_Majeure not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Meter_Clamped(WebDriver driver){
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[26]/label/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Meter_Clamped not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Supply_Pipe_Not_Suitable(WebDriver driver){
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[27]/label/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Supply_Pipe_Not_Suitable not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_No_Live_Gas(WebDriver driver){
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[28]/label/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_No_Live_Gas not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
   }
	
//END OF ABORT_REASONS METHODS
    
    public static class Abort_No_Access_Reasons{
        
        public static WebElement lbl_Not_Convenient_With_Customer(WebDriver driver){
        	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[1]/label/div[2]"));
    			element = driver.findElement(By.id("abdradio1"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Not_Convenient_With_Customer not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Work_No_Longer_Required(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[2]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Work_No_Longer_Required not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Refused_Access(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[3]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Refused_Access not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_No_Access_Customer(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[4]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_No_Access_Customer not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Doorstep_Risk_Failure(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[5]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Doorstep_Risk_Failure not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Unable_Locate_Site(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[6]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Unable_Locate_Site not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Key_Not_Available(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[7]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Key_Not_Available not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Vacant_Property(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[8]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Vacant_Property not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Appt_Made_Customer(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[9]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Appt_Made_Customer not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Property_Demolished(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[10]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Property_Demolished not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_No_Access_To_Site(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[11]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_No_Access_To_Site not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Warden_Refused_Access(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[12]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Warden_Refused_Access not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Warden_Not_Available(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[13]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Warden_Not_Available not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Carer_Not_Onsite(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[14]/label/div[2"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Carer_Not_Onsite not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	} 
    
        public static WebElement btn_Cancel(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.id("btnCall3"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Cancel not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Next(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.id("btnCall3"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Next not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
    
    
    }
    
    
    
//END OF ABORT_NO_ACCESS_REASONS METHODS   
    
    public static class Abort_Risk_Reasons{
        
        public static WebElement lbl_A01_Cutout(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[1]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A01_Cutout not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_A02_Service_Cable(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[2]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A02_Service_Cable not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_A03_Defective_Fuse_Carrier_Contacts(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[3]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A03_Defective_Fuse_Carrier_Contacts not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_A04_Physical_Damage(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[3]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A04_Physical_Damage not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_A05_Visual_Indication_Burning_Smoke(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[5]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A05_Visual_Indication_Burning_Smoke not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_A06_Audible_Sounds_Arcing(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[6]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A06_Audible_Sounds_Arcing not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_A07_Exposed_Live_Conductors(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[7]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A07_Exposed_Live_Conductors not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_A08_Broken_Fuse_Carrier(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[8]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A08_Broken_Fuse_Carrier not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_A10_DB_Earthing_Issues(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[9]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A10_DB_Earthing_Issues not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_A12_Damaged_Asbestos_Components(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[10]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A12_Damaged_Asbestos_Components not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_A14_Polarity_Identified_Incorrect(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[11]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A14_Polarity_Identified_Incorrect not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_A15_Immediate_Risk_Public(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[12]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A15_Immediate_Risk_Public not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_A17_Live_Unearthed_Equipment(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[13]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_A17_Live_Unearthed_Equipment not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_B01_Fuse_Carrier_Welded(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[14]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_B01_Fuse_Carrier_Welded not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_B02_Cut_Out_Loose(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[15]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_B02_Cut_Out_Loose not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_B03_Damaged_Phase_Barriers(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[16]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_B03_Damaged_Phase_Barriers not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_B04_Damaged_Cut_Out_Terminals(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[17]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_B04_Damaged_Cut_Out_Terminals not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
    
        public static WebElement lbl_B05_Non_Withdrawalable_Fuses(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[18]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_B05_Non_Withdrawalable_Fuses not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_B06_Cutout_Unable_Accept_Meter_Tails(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[19]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_B06_Cutout_Unable_Accept_Meter_Tails not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_B07_Meter_Tails_Need_Replaced(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[20]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_B07_Meter_Tails_Need_Replaced not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_B08_Unhinged_Metal_Cutout_Cover(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[21]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_B08_Unhinged_Metal_Cutout_Cover not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_B10_Unearthed_DB_Equipment(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[22]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_B10_Unearthed_DB_Equipment not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_B11_Cutout_Fused_Neutral(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[23]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_B11_Cutout_Fused_Neutral not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C02_Bitumen_Compound_Leaking(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[24]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C02_Bitumen_Compound_Leaking not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C03_Lower_Rating_Fuse(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[25]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C03_Lower_Rating_Fuse not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C06_Metal_Encased_Cutout(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[26]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C06_Metal_Encased_Cutout not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C07_DB_Equipment_Unable_Sealed(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[27]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C07_DB_Equipment_Unable_Sealed not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C11_Asbestos_Barriers(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[28]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C11_Asbestos_Barriers not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C14_Fed_From_Distribution_Board(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[29]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_C14_Fed_From_Distribution_Board not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C15_DB_Cable_VIRMICC(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[30]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C15_DB_Cable_VIRMICC not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C16_DB_Equipment_Asbestos_Board(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[31]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C16_DB_Equipment_Asbestos_Board not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C92_Damaged_Meter_Box_Door(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[32]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C92_Damaged_Meter_Box_Door not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C93_Customer(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[33]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C93_Customer not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C94_Obstruction(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[34]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C94_Obstruction not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}   
        
        public static WebElement lbl_C95_Dangerous_Mtr_Pos(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[35]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C95_Dangerous_Mtr_Pos not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C96_Unsafe_Access(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[36]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C96_Unsafe_Access not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	} 
        
        public static WebElement lbl_C98_Severe_Rain_Ombx(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[37]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C98_Severe_Rain_Ombx not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_C99_Dangerous_Dog(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div[38]/label/div[2]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_C99_Dangerous_Dog not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Cancel(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.id("btnCall3"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Cancel not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Next(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.id("btnCallNext"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Next not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
    } 

  //END OF ABORT_RISK_REASONS METHODS
        
    public static class First_Utility_Additional_Questions{
        
        public static WebElement btn_Gas_Meter_Accessible_Yes(WebDriver driver){
        	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/label/span"));
    			element = driver.findElement(By.id("abdradiorai11"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Gas_Meter_Accessible_Yes not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}   

        public static WebElement btn_Gas_Meter_Accessible_No(WebDriver driver){
       	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/label/span"));
    			element = driver.findElement(By.id("abdradiorai12"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Gas_Meter_Accessible_No not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Gas_Meter_Exchanged_Yes(WebDriver driver){
          	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/label/span"));
    			element = driver.findElement(By.id("abdradiorai13"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Gas_Meter_Exchanged_Yes not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Gas_Meter_Exchanged_No(WebDriver driver){
         	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/label/span"));
    			element = driver.findElement(By.id("abdradiorai14"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Gas_Meter_Exchanged_No not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Contacted_First_Utility_Yes(WebDriver driver){
        	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/label/span"));
    			element = driver.findElement(By.id("abdradioFU1"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Contacted_First_Utility_Yes not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement cbx_First_Utility_Rep(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.id("cbx_FRST_rep"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | cbx_First_Utility_Rep not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}

        public static WebElement txt_Additional_Notes(WebDriver driver){
          	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[3]/div[2]/textarea"));
    			element = driver.findElement(By.id("txt_addNotAbort"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Capture_Photo(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.id("cameraBtn1"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Capture_Photo not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Elec_Meter_Accessible_Yes(WebDriver driver){
        	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/label/span"));
    			element = driver.findElement(By.id("abdradiorab5"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Elec_Meter_Accessible_Yes not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Elec_Meter_Accessible_No(WebDriver driver){
       	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/label/span"));
    			element = driver.findElement(By.id("abdradiorab6"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Elec_Meter_Accessible_No not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Martindale_Test_Passed_Yes(WebDriver driver){
          	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/label/span"));
    			element = driver.findElement(By.id("abdradiorab7"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Martindale_Test_Passed_Yes not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Martindale_Test_Passed_No(WebDriver driver){
         	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/label/span"));
    			element = driver.findElement(By.id("abdradiorab8"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Martindale_Test_Passed_No not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement txt_Signal_Test_Vodafone(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.id("inputSig1"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | txt_Signal_Test_Vodafone not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement txt_Signal_Test_O2(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.id("inputSig2"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | txt_Signal_Test_O2 not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement txt_Signal_Test_Orange(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.id("inputSig3"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | txt_Signal_Test_Orange not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement txt_Signal_Test_TMobile(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.id("inputSig4"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | txt_Signal_Test_TMobile not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Elec_Meter_Exchanged_Next_Visit_Yes(WebDriver driver){
        	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/label/span"));
    			element = driver.findElement(By.id("abdradiorab9"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Elec_Meter_Exchanged_Next_Visit_Yes not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Elec_Meter_Exchanged_Next_Visit_No(WebDriver driver){
       	 
    		try{
    			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/label/span"));
    			element = driver.findElement(By.id("abdradiorab10"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Elec_Meter_Exchanged_Next_Visit_No not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Back(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.id("btnCall3"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Back not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Abort_Appointment_Red(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.id("btnCallabr2"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Abort_Appointment not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Abort_Appointment_RedSpark(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.id("btn_drstp_abort"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Abort_Appointment not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Abort_Appointment_Orange(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.id("btnCall1"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Abort_Appointment not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
                
        public static WebElement btn_Cancel(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.id("btnCall3"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Cancel not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
       
        public static WebElement lbl_Abort_Gas_Meter_Reason_Codes(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[1]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Abort_Gas_Meter_Reason_Codes not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Abort_Elec_Meter_Reason_Codes(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[3]/div/div[1]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Abort_Elec_Meter_Reason_Codes not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement lbl_Abort_Risk_Reason_Codes(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[3]/div/div[1]"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Abort_Risk_Reason_Codes not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        public static WebElement btn_Abort_ReScan_Ok(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.className("sa-confirm-button-container"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Abort_Rescan_Ok not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
        
        
    }       
//END OF FIRST_UTILITY_ADDITIONAL_QUESTIONS METHODS


    
//END OF METHODS	    
}
