package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 07/06/2017
* Function: Objects_Gas_Meter_Remove_Asset_Page
* Purpose: This class contains all of the elements on the Gas Meter Remove Asset page
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

public class Objects_Gas_Meter_Remove_Asset_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Gas_Meter_Remove_Asset_Page";

    public static WebElement lbl_Gas_Remove_Asset(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/removeasset/div/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("Title_Remove_Ass"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Remove_Asset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Remove_Asset_Status(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='select1']"));
			element = driver.findElement(By.id("cbx_RAss_Status"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Remove_Asset_Status not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Confirm_Asset_Removed(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("rb_CAssRem_y"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Confirm_Asset_Removed not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Remove_Success_OK(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.className("confirm"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Remove_Success_OK not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

    public static WebElement btn_Capture_Final_Photo(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("btn_CapFin_Pho"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Final_Photo not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
 
	public static WebElement btn_Gas_Remove_Asset_Submit(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/removeasset/div/div[1]/div[2]"));
			element = driver.findElement(By.id("btn_Subm_gas"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Gas_Remove_Asset_Submit not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Gas_Remove_Asset_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/removeasset/div/div[1]/div[2]"));
			element = driver.findElement(By.id("Title_Remove_Ass"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Remove_Asset_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
