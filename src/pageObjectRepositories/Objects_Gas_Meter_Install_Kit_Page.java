package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 07/06/2017
* Function: Objects_Gas_Meter_Install_Kit_Page
* Purpose: This class contains all of the elements on the Gas Meter Install Kit page
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

public class Objects_Gas_Meter_Install_Kit_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Gas_Meter_Install_Kit_Page";

    public static WebElement lbl_Gas_Install_Kit(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/installphoto/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Install_Kit not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Install_Kit_Used_Yes(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/installphoto/div/div[2]/div[1]/div/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Install_Kit_Used_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Install_Kit_Used_No(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/installphoto/div/div[2]/div[1]/div/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Install_Kit_Used_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Non_Serial_Assets(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("assetselect0"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Non_Serial_Assets not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Non_Serial_Assets_Number(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("assetinput0"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Non_Serial_Assets_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement img_Trash(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/installphoto/div/div[2]/div[2]/div[2]/div/div[3]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | img_Trash not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Add_Another_Asset(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("btn1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Add_Another_Asset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Next_Section(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("btnNextrmmip"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
      
	public static WebElement lbl_Gas_Install_Kit_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/installphoto/div/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Install_Kit_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
