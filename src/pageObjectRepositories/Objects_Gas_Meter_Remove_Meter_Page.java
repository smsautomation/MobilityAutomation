package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 07/06/2017
* Function: Objects_Gas_Meter_Remove_Meter_Page
* Purpose: This class contains all of the elements on the Gas Meter Remove Meter page
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

public class Objects_Gas_Meter_Remove_Meter_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Gas_Meter_Remove_Meter_Page";

    public static WebElement lbl_Gas_Remove_Meter(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/removemeter/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Remove_Meter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement cbx_Status_Of_Asset(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("select1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Status_Of_Asset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Removed_Meter_Readings(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input0"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Removed_Meter_Readings not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Unable_Read_Meter_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/removemeter/div/div[2]/div/div[3]/div[2]/div[2]/div/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Unable_Read_Meter_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Additional_Notes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("text1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Next_Session(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btnNextrmv"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Session not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
		
	public static WebElement lbl_Gas_Remove_Meter_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/removemeter/div/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Remove_Meter_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
