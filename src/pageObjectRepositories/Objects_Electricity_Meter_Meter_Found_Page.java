package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 07/06/2017
* Function: Objects_Electiricty_Meter_Meter_Found_Page
* Purpose: This class contains all of the elements on the Electricity Meter Meter Found page
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

public class Objects_Electricity_Meter_Meter_Found_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Meter_Found_Page";

    public static WebElement lbl_Meter_Found(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/foundmeter/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Meter_Found not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

    public static WebElement txt_Elec_Meter_Serial_No(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("input1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Elec_Meter_Serial_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Manufacturer_Letter(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("select1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Manufacturer_Letter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Meter_Type(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("select2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Meter_Type not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Meter_Readings_Old_Meter_Yes(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/foundmeter/div/div[2]/div[4]/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Readings_Old_Meter_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Meter_Readings_Old_Meter_No(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/foundmeter/div/div[2]/div[4]/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Readings_Old_Meter_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Removed_Meter_Readings(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("input2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Removed_Meter_Readings not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Unable_Read_Meter_Yes(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/foundmeter/div/div[2]/div[5]/div[2]/div[2]/div/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Unable_Read_Meter_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Date_Old_Meter_Removed(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("input3"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Date_Old_Meter_Removed not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Installed_Meter_Readings(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("input4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Installed_Meter_Readings not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Continue_With_Job_Yes(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/foundmeter/div/div[2]/div[6]/div/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Continue_With_Job_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Continue_With_Job_No(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/foundmeter/div/div[2]/div[6]/div/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Continue_With_Job_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Capture_Photo(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("btn2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photo not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement btn_Abort(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Abort not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Meter_Found_Complete(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/foundmeter/div/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Meter_Found_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
				
//END OF METHODS	    
}
