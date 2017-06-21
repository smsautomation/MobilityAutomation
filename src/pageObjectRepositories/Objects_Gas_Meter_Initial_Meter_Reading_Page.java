package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 07/06/2017
* Function: Objects_Gas_Meter_Initial_Meter_Reading_Page
* Purpose: This class contains all of the elements on the Gas Meter Initial Meter Reading page
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

public class Objects_Gas_Meter_Initial_Meter_Reading_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Gas_Meter_Initial_Meter_Reading_Page";

    public static WebElement lbl_Gas_Inital_Meter_Reading(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/initialreadinggas/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Inital_Meter_Reading not found | Exception desc : "+e.getMessage());		
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
    
    public static WebElement btn_Unable_Read_Meter_Yes(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/initialreadinggas/div/div[2]/reading/div[3]/div[2]/div/label"));
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
    
    public static WebElement btn_Next_Section(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("btnNextread"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
      
	public static WebElement lbl_Gas_Initial_Meter_Reading_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/initialreadinggas/div/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Initial_Meter_Reading_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
