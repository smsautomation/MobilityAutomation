package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Remove_Asset_Details_Page
* Purpose: This class contains all of the elements on the Electricity Meter Remove Asset page
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

public class Objects_Electricity_Meter_Remove_Asset_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Remove_Asset_Page";
	private static WebElement element1;

    public static WebElement lbl_Remove_Asset(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath("//h4[contains(text(),'Remove Meter')]"));
			//element = driver.findElement(By.id("Title_Remove_Ass"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Remove_Asset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Remove_Asset_Status(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("cbx_RAss_Status"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Remove_Asset_Status not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Confirm_Asset_Removed(WebDriver driver){
      	 
		try{
			
			element = driver.findElement(By.id("rb_CAssRem_y"));
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/removeasset/div/div[2]/div[2]/div[2]/div/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Confirm_Asset_Removed not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Remove_Success_OK(WebDriver driver){
     	 
		try{
			
			///////////////////////////////////////
		    WebDriverWait wait= new WebDriverWait(driver ,5);
			setElement1(wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[tabindex='1']"))));
			
			 
			//element= driver.findElement(By.cssSelector(""));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Remove_Success_OK not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lbl_Remove_Asset_Complete(WebDriver driver){
	   	 
		try{//is this
			element = driver.findElement(By.xpath("//h4[contains(text(),'Remove Asset')]"));
			//element = driver.findElement(By.id("Title_Remove_Ass"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Remove_Asset_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement getElement1() {
		return element1;
	}

	public static void setElement1(WebElement element1) {
		Objects_Electricity_Meter_Remove_Asset_Page.element1 = element1;
	}
	
			
//END OF METHODS	    
}
