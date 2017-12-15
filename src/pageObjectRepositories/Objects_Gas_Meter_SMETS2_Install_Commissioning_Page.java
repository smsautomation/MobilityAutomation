package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Paul Middleton
* Date: 06/06/2017
* Function: Objects_Gas_Meter_SMETS2_Install_Commissioning_Page
* Purpose: This class contains all of the elements on the Gas Meter Commissioning page
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

public class Objects_Gas_Meter_SMETS2_Install_Commissioning_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Gas_Meter_SMETS2_Install_Commissioning_Page";

    public static WebElement lbl_Install_Commissioning(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/commission/div/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("Title_InsCommission_g"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Install_Commissioning not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Install_GICOM(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("btn_InsComm_gicom"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Install_GICOM not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_GICOM_Successful(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("btn_GICOM_succ"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
      
	public static WebElement lbl_Install_Commissioning_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/commission/div/div[1]/div[2]"));
			element = driver.findElement(By.id("Title_Commission_g"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Commissioning_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
    public static WebElement btn_Submit(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("btn_Gas_Submit"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Submit not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
