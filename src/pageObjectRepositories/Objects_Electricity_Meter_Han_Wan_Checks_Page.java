package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Han_Wan_Checks_Page
* Purpose: This class contains all of the elements on the Electricity Meter Han Wan Checks page
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

public class Objects_Electricity_Meter_Han_Wan_Checks_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Han_Wan_Checks_Page";

    public static WebElement lbl_Han_Wan_Checks(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/wanhantest/div[1]/div[1]/h4.//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/wanhantest/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Han_Wan_Checks not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Wan_Available_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/wanhantest/div[2]/div[1]/div[2]/div[1]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Wan_Available_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Wan_Available_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/wanhantest/div[2]/div[1]/div[2]/div[2]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Wan_Avaiable_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Signal_Strength_Vodafone(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Signal_Strength_Vodafone not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Signal_Strength_O2(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Signal_Strength_O2 not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Signal_Strength_Orange(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Signal_Strength_Orange not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Signal_Strength_TMobile(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Signal_Strength_TMobile not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Sufficient_Signal_Proceed_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/wanhantest/div[2]/div[3]/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Sufficient_Signal_Proceed_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Sufficient_Signal_Proceed_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/wanhantest/div[2]/div[3]/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Sufficient_Signal_Proceed_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Called_AIRline_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[2]/div[4]/div[6]/div[3]/div[2]/div[1]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Called_AIRline_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Han_Wan_Checks_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/wanhantest/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Han_Wan_Checks_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
