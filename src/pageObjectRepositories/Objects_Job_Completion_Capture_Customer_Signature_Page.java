package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Job_Completion_Capture_Customer_Signature_Page
* Purpose: This class contains all of the elements on the Job Completion Capture Customer Signature page
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

public class Objects_Job_Completion_Capture_Customer_Signature_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Job_Completion_Capture_Customer_Signature_Page";

    public static WebElement lbl_Capture_Customer_Signature(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[5]/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Capture_Customer_Signature not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Customer_Signature(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("signaturePad"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Customer_Signature not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Reset(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("btnSig"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Reset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Signed_Customer_Representative(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[5]/div[2]/div[2]/div[2]/select"));
			element = driver.findElement(By.id("cbx_SigByCus_sel"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Signed_Customer_Representative not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Customer_Refused_Sign_Yes(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[5]/div[2]/div[3]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Customer_Refused_Sign_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Customer_Refused_Sign_No(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[5]/div[2]/div[3]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Customer_Refused_Sign_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Notes(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("notes"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Job_Complete_Submit(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[5]/div[2]/div[4]/div/button"));
			element = driver.findElement(By.id("btn_Comp_submit"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Job_Complete_Submit not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Job_Complete_Cancel(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.className("cancel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Job_Complete_Cancel not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Job_Complete_OK(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.className("confirm"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Job_Complete_OK not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
       
				
//END OF METHODS	    
}
