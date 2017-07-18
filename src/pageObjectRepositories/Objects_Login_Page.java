package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 31/05/2017
* Function: Objects_Login_Page
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

public class Objects_Login_Page {
   
	private static WebElement element = null;
    private static String sRepositoryName = "Objects_Login_Page";

    public static WebElement Username(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("input1"));
			}catch(Exception e){
			Log.error(sRepositoryName + " | Username field not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement Password(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | Password field not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Login (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Login not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	
//END OF METHODS	    
}
