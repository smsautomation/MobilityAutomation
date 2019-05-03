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
    
    public static WebElement UsernameWater(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("input-user"));
			}catch(Exception e){
			Log.error(sRepositoryName + " | Username field not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement UsernameWaypoint(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath("./html/body/section/div/div/div/div[1]/form/fieldset/input[1]"));
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
	
	public static WebElement PasswordWater(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input-password"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | Password field not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement PasswordWaypoint(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("./html/body/section/div/div/div/div[1]/form/fieldset/input[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | Password field not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Login (WebDriver driver){
	   	 
		try{
			Thread.sleep(200);
			
			element = driver.findElement(By.xpath("//button[@id='btn' and @ class='btnLogin']"));
			Thread.sleep(200);
			
			//element = driver.findElement(By.xpath("//[text()'LOGIN']"));
			element = driver.findElement(By.xpath("//button[@id='btn' and @ class='btnLogin']"));
			
		
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Login not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_LoginWater (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn-login"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Login not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_LoginWaypoint (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("./html/body/section/div/div/div/div[1]/form/fieldset/button"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Login not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	
	
	
//END OF METHODS	    
}
