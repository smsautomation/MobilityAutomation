package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 07/06/2017
* Function: Objects_Gas_Meter_Current_Meter_Details_Page
* Purpose: This class contains all of the elements on the Gas Meter Current Meter Details page
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

public class Objects_Gas_Meter_Current_Meter_Details_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Gas_Meter_Current_Meter_Details_Page";

    public static WebElement lbl_Gas_Current_Meter_Details(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/currentmeter/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Current_Meter_Details not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Update_Values(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btnUpdate"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Update_Values not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Manufacturer_Letter(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("selectcm1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Manufacturer_Letter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Meter_Type(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/currentmeter/div/div[2]/div[6]/div[2]/div[2]/select"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Meter_Type not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Meter_Location_Code(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("select3"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Meter_Location_Code not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Existing_Gas_Meter_Correct_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/currentmeter/div/div[2]/div[7]/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Existing_Meter_Correct_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Existing_Meter_Correct_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/currentmeter/div/div[2]/div[7]/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Existing_Meter_Correct_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Gas_Current_Meter_Details_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/currentmeter/div/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Current_Meter_Details_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
