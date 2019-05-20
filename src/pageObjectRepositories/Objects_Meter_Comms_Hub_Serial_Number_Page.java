package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
			element = driver.findElement(By.cssSelector("#Title_chubInstall h4"));
			//element= driver.findElement(By.xpath("//div[@id='Title_chubInstall']/h4[.='Install Comms Hub']"));
			//element = driver.findElement(By.id("Title_CommHub_num"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Comms_Hub_Serial_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
    }

  	public static WebElement cbx_Comms_Hub_Select(WebDriver driver){
  		///html//select[@id='chubInstall_selectAsset']
  	   	 
  		try{
  			 element= driver.findElement(By.id("chubInstall_selectAsset"));
  			//element = driver.findElement(By.id("cbx_CommHub_sel"));
   		}catch(Exception e){
  			Log.error(sRepositoryName + " | cbx_Comms_Hub_Select not found | Exception desc : "+e.getMessage());		
   		} 
  	    return element;
  	}
	    
	    /////////////////////////////////////////////////////////////
   /* }

	public static WebElement cbx_Comms_Hub_Select(WebDriver driver){
	   	 
		try{
		
			//element= driver.findElement(By.xpath("//select[#'chubInstall_selectAsset']"));
			/////////////////////////////////////////////////////////////
			
			 WebDriverWait wait2= new WebDriverWait(driver ,5);
				 WebElement element2 =wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[#'chubInstall_selectAsset']")));
				
			
			////////////////////////////////////////////////////////////
			//element = driver.findElement(By.id("chubInstall_selectAsset"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Comms_Hub_Select not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}*/
	////////////////////////////////////////////////////////////////////
    
	public static WebElement txt_Comms_Hub_Serial_Number(WebDriver driver){
	   	 
		try{
			element=driver.findElement(By.cssSelector("#chubInstall_CHbarcode"));
			//element = driver.findElement(By.id("chubInstall_CHbarcode"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Comms_Hub_Serial_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Serial_Match_Next(WebDriver driver){
	   	 
		try{
			element= driver.findElement(By.cssSelector("[tabindex='1']"));
			//element = driver.findElement(By.className("confirm"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Comms_Hub_Location(WebDriver driver){
	   	 
		try{//
			element = driver.findElement(By.id("chubInstall_chubLocationSelect"));
			//element = driver.findElement(By.id("cbx_CommHubLoc_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Comms_Hub_Location not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Comms_Hub_Connection_Method(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("chubInstall_connectionMethodSelect"));
			//element = driver.findElement(By.id("cbx_CommHubConM_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Comms_Hub_Connection_Method not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Next_Section(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("chubInstall_nextSectionBtn"));
			//element = driver.findElement(By.id("btnNextPol"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Comms_Hub_Serial_Number_Complete(WebDriver driver){
	   	 
		try{
			
			//element = driver.findElement(By.id("Title_CommHub_num"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Comms_Hub_Serial_Number_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
