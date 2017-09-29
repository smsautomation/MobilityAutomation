package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Electiricty_Meter_Initial_Meter_Reading_Page
* Purpose: This class contains all of the elements on the Electricity Meter Initial Meter Reading page
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

public class Objects_Electricity_Meter_Initial_Meter_Reading_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Initial_Meter_Reading_Page";

    public static WebElement lbl_Inital_Meter_Reading(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/initialreadingelec/div/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("Title_InitMet_Read"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Inital_Meter_Reading not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Capture_Meter_Reading(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("reg0"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Capture_Meter_Reading not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Capture_Meter_Reading_Register_2(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("reg1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Capture_Meter_Reading_Register_2 not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Unable_Read_Meter_Yes(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div[2]/div[2]/div/label"));
			element = driver.findElement(By.id("rb_UnReadMet_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Unable_Read_Meter_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Additional_Notes(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("txt_AddNotNoMet_read"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Next_Section(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("btn_Next_read"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
      
	public static WebElement lbl_Initial_Meter_Reading_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/initialreadingelec/div/div[1]/div[2]"));
			element = driver.findElement(By.id("Title_InitMet_Read"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Initial_Meter_Reading_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
