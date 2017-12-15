package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Paul Middleton
* Date: 06/06/2017
* Function: Objects_Job_Completion_SMETS2_IHD_Commissioning_Page
* Purpose: This class contains all of the elements on the IHD Meter Commissioning page
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

public class Objects_Job_Completion_SMETS2_IHD_Commissioning_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Job_Completion_SMETS2_IHD_Commissioning_Page";

    public static WebElement lbl_IHD_Commissioning(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/commission/div/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("Title_IHDCommission"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Install_Commissioning not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Install_XITTD(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("btn_IHDComm_eicom"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Install_EICOM not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_XITTD_Successful(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("btn_IHD_succ"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
      
	public static WebElement lbl_IHD_Commissioning_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/commission/div/div[1]/div[2]"));
			element = driver.findElement(By.id("Title_IHDCommission"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Commissioning_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
