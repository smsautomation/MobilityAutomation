package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Paul Middleton
* Date: 06/06/2017
* Function: Objects_Electiricty_Meter_Commissioning_Page
* Purpose: This class contains all of the elements on the Electricity Meter Commissioning page
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

public class Objects_Electricity_Meter_SMETS2_Install_Commissioning_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_SMETS2_Install_Commissioning_Page";

    public static WebElement lbl_Install_Commissioning(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/commission/div/div[1]/div[1]/h4"));
			//element = driver.findElement(By.id("Title_InsCommission_e"));
			element = driver.findElement(By.xpath("//*[@id='app']/div[2]/div/div/div[2]/ng-switch/div/electask/div/div/eicom/div[1]/div[1]/h4"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Install_Commissioning not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Install_EICOM(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("btn_InsComm_eicom"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Install_EICOM not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_EICOM_Successful(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("btn_EICOM_succ"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
      
	public static WebElement lbl_Install_Commissioning_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/commission/div/div[1]/div[2]"));
			//element = driver.findElement(By.id("Title_Commission_e"));
			element = driver.findElement(By.xpath(".//*[@id='app']/div[2]/div/div/div[2]/ng-switch/div/electask/div/div/eicom/div[1]/div[1]/h4"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Commissioning_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
    public static WebElement btn_Submit(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("btn_Elec_Submit"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Submit not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    //Added by Shiva Pasham
    public static WebElement btn_Send_Message(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath("//*[text()='Send Message']"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Send_Message not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Awaiting_Response(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath("//*[text()='Awaiting Response']"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Awaiting_Response not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
