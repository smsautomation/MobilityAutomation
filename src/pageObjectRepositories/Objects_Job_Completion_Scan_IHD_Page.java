package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Job_Completion_Scan_IHD_Page
* Purpose: This class contains all of the elements on the Job Completion Scan IHD page
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

public class Objects_Job_Completion_Scan_IHD_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Job_Completion_Scan_IHD_Page";

    public static WebElement lbl_Scan_IHD(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Scan_IHD not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Select_Valid_IHD_Asset(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("cbx_IHDIns_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Select_Valid_IHD_Asset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_IHD_Serial_No(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[2]/div[2]/div[2]/div/input"));
			element = driver.findElement(By.id("txt_IHDSer_num"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_IHD_Serial_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement btn_Serial_Match_Next(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.className("confirm"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Next_Section(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("btnNextihd"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Scan_Asset_Now(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.className("confirm"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Scan_Asset_Now not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Add_Asset_OK(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.className("confirm"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Add_Asset_OK not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Add_Asset_Cancel(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.className("cancel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Add_Asset_Cancel not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_OK(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.className("confirm"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_OK not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
          
	public static WebElement lbl_Scan_IHD_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Scan_IHD_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
