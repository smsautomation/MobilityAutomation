package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 07/06/2017
* Function: Objects_Gas_Meter_New_Regulator_Details_Page
* Purpose: This class contains all of the elements on the Gas Meter New Regulator page
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

public class Objects_Gas_Meter_New_Regulator_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Gas_Meter_New_Regulator_Page";

    public static WebElement lbl_Gas_New_Regulator(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/newregulator/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_New_Regulator not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Regulator_Serial_Number(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("btn_RegSNum1"));
			//element = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/newregulator/div/div[2]/div/div[2]/div[2]/div"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Regulator_Serial_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_Serial_Asset_Note(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("lbl_SerNote"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Scan_Asset_Now not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    public static WebElement btn_Scan_Asset_Now(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.className("confirm"));
			//element = driver.findElement(By.xpath("/html/body/div[3]/div[7]/div/div"));
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
    
    public static WebElement btn_Updated_OK(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.className("confirm"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Updated_OK not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_Gas_New_Regulator_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/newregulator/div/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_New_Regulator_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
