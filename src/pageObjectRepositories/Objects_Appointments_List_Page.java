package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 31/05/2017
* Function: Objects_Appointments_List_Page
* Purpose: This class contains all of the elements on the Appointments List page
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

public class Objects_Appointments_List_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Appointments_List_Page";

    public static WebElement btn_Logout(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.className("logout-icon"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Logout not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Force_Sync(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/siemensheader/div[1]/div/div[3]/div[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Force_Sync not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Asset_Management (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.className("menu-open-button"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Asset_Management not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	
//END OF METHODS	    
}
