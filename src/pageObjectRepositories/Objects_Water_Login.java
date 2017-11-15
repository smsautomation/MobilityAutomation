package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Greg Bliss
* Date: 08/11/2017
* Function: Objects_Water_Login_Page
* Purpose: This class contains all of the elements on the Login page
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

public class Objects_Water_Login {
   
	private static WebElement element = null;
    private static String sRepositoryName = "Objects_Login_Page";

    public static WebElement Username(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("input-user"));
			}catch(Exception e){
			Log.error(sRepositoryName + " | Username field not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement Password(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input-password"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | Password field not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Login (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn-login"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Login not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	
//END OF METHODS	    
}
