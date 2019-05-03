package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Paul Middleton
* Date: 07/12/2017
* Function: Objects_Meter_Comms_Hub_Serial_Number_Page
* Purpose: This class contains all of the elements on the Meter Comm Hub Serial Number page
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

public class Objects_Meter_Comms_Hub_Serial_Number_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Meter_Comms_Hub_Serial_Number_Page";

    public static WebElement lbl_Comms_Hub_Serial_Number(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.id("Title_CommHub_num"));
			element = driver.findElement(By.id("Title_chubInstall"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Comms_Hub_Serial_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
    }

	public static WebElement cbx_Comms_Hub_Select(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.id("cbx_CommHub_sel"));
			element = driver.findElement(By.id("chubInstall_selectAsset"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Comms_Hub_Select not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	
	//Added by Shiva Pasham
	public static String txt_Comms_CHF_ID(WebDriver driver){
	   	 
		String chf_id=null;
		try{
			element = driver.findElement(By.xpath("//*[@id='chubInstall_selectAsset']/option[1]"));
			chf_id = element.getAttribute("value");
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Comms_CHF_ID not found | Exception desc : "+e.getMessage());		
 		} 
	    return chf_id;
	}
	
	//Added by Shiva Pasham
	public static WebElement btn_Aerial_Installed_Yes(WebDriver driver){
		try{
			element = driver.findElement(By.id("chubInstall_aerialInstalled_y"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Aerial_Installed_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	//Added by Shiva Pasham
	public static WebElement btn_Capture_Photographic_Evidence(WebDriver driver){
		try{
			element = driver.findElement(By.id("chubInstall_photoEvidence"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photographic_Evidence not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement txt_Comms_Hub_Serial_Number(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.id("txt_CommsHub_ser"));
			element = driver.findElement(By.id("chubInstall_CHbarcode"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Comms_Hub_Serial_Number not found | Exception desc : "+e.getMessage());		
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
	
	public static WebElement cbx_Comms_Hub_Location(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.id("cbx_CommHubLoc_sel"));
			element = driver.findElement(By.id("chubInstall_chubLocationSelect"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Comms_Hub_Location not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Comms_Hub_Connection_Method(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.id("cbx_CommHubConM_sel"));
			element = driver.findElement(By.id("chubInstall_connectionMethodSelect"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Comms_Hub_Connection_Method not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Next_Section(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.id("btnNextPol"));
			element = driver.findElement(By.id("chubInstall_nextSectionBtn"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Comms_Hub_Serial_Number_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.id("Title_CommHub_num"));
			element = driver.findElement(By.id("Title_chubInstall"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Comms_Hub_Serial_Number_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
