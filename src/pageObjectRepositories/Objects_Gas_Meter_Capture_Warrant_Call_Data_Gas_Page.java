package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 07/06/2017
* Function: Objects_Gas_Meter_Capture_Warrant_Call_Data_Gas_Page
* Purpose: This class contains all of the elements on the Gas Meter Capture Warrant Call Data - Gas page
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

public class Objects_Gas_Meter_Capture_Warrant_Call_Data_Gas_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Gas_Meter_Capture_Warrant_Call_Data_Gas_Page";

    public static WebElement lbl_Capture_Warrant_Call_Data_Gas(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/assessflty/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("Title_Warrant_Data"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Capture_Warrant_Call_Data_Gas not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Meter_Exchanged(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/assessflty/div[2]/div/div/div[2]/div[1]/label/span"));
			
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Exchanged not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Capped_Gas_Meter(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/assessflty/div[2]/div/div/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capped_Gas_Meter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Meter_Type_Smart_Prepayment(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/assessflty/div[2]/div/div[2]/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Type_Smart_Prepayment not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Meter_Type_Dumb_Prepayment(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/assessflty/div[2]/div/div[2]/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Type_Dumb_Prepayment not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	   public static WebElement lbl_Capture_Warrant_Call_Data_Gas_Completed(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/assessflty/div[1]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Capture_Warrant_Call_Data_Gas_Completed not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
		
//END OF METHODS	    
}
