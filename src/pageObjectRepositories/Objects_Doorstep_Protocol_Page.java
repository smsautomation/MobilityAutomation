package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Doorstep_Protocol_Page
* Purpose: This class contains all of the elements on the Doorstep Protocol page
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

public class Objects_Doorstep_Protocol_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Doorstep_Protocol_Page";

public static class Sidebar{
	
		public static WebElement lbl_Customer_Details(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[1]/div[1]/div[1]/h2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Customer_Details not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
		}
    	
    	public static WebElement lbl_Customer_Details_More_Details(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[1]/div[1]/div[2]/div"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Customer_Details_More_Details not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}	

    	public static WebElement lbl_Customer_Details_Less_Details(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[1]/div[1]/div[4]/div"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Customer_Details_Less_Details not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}	

    	public static WebElement lbl_Job_Details(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[1]/div[2]/div[1]/h2"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Job_Details not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
    	
    	public static WebElement lbl_Job_Details_More_Details(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[1]/div[2]/div[2]/div"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Job_Details_More_Details not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}

    	public static WebElement lbl_Job_Details_Less_Details(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[1]/div[2]/div[4]/div"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Job_Details_Less_Details not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
    	
    	public static WebElement lbl_Meter_Details(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[1]/div[3]/div[1]/h2"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Meter_Details not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
    	
    //END OF SIDEBAR METHODS
    }    
    
    public static WebElement btn_Arrive(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("btnCall1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Arrive not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lbl_Warning_Info(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.className("warning-info"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Warning_Info not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement cbx_Risks_Identified (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("selectInput"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Risks_Identified not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Access_Site_Gained_Yes (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/doorstep/div/div/div/div[2]/div[4]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Access_Site_Gained_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Access_Site_Gained_No (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/doorstep/div/div/div/div[2]/div[4]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Access_Site_Gained_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Customer_Onsite_Yes (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/doorstep/div/div/div/div[3]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Customer_Onsite_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Customer_Onsite_No (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/doorstep/div/div/div/div[3]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Customer_Onsite_No not found | Exception desc : "+e.getMessage());		
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
	
	public static WebElement btn_Onsite (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btnCall4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Onsite not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Capture_Photo (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/doorstep/div/div/div/div[4]/div[1]/div[1]/div/button"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photo not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_No_Access_Card_Left_Yes (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/doorstep/div/div/div/div[4]/div[2]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_No_Access_Card_Left_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_No_Access_Card_Left_No (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/doorstep/div/div/div/div[4]/div[2]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_No_Access_Card_Left_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Doorstep_Procedure_Fail (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/doorstep/div/div/div/div[5]/div[1]/div/div/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Doorstep_Procedure_Fail not found | Exception desc : "+e.getMessage());		
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
			
//END OF METHODS	    
}
