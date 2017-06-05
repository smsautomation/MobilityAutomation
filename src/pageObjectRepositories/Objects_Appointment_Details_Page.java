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
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/callforwardform/div/div/div[1]/div[3]/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Contact_Made_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Contact_Made_No (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/callforwardform/div/div/div[1]/div[3]/div[2]/div[2]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Contact_Made_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Appointment_Confirm_Yes (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/callforwardform/div/div/div[1]/div[4]/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Appointment_Confirm_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Appointment_Confirm_No (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[3]/div/ng-switch/div/callforwardform/div/div/div[1]/div[4]/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Appointment_Confirm_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Depart (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[1]/div/div[2]/div[6]/div[1]"));
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
			element = driver.findElement(By.id("btnCall2"));
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
		
//END OF METHODS	    
}
