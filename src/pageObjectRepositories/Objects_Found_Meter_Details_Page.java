package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Current_Meter_Details_Page
* Purpose: This class contains all of the elements on the Electricity Meter Current Meter Details page
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

public class Objects_Found_Meter_Details_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Found_Meter_Details_Page";

    public static WebElement lbl_Found_Meter_Details(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("Title_Found_Meter"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Found_Meter_Details not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_Found_Meter_Serial_Number(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("lbl_FouMeter_SN"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Found_Meter_Serial_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

    public static WebElement txt_Found_Meter_Serial_No(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("txt_Found_Serial_Num"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Found_Meter_Serial_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	} 
    
    public static WebElement cbx_Found_Manufacturer_Letter(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("cbx_FouManu_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Found_Manufacturer_Letter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Found_Meter_Type(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("cbx_FouMetType_sel"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Found_Meter_Type not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Found_SSC_Code(WebDriver driver){
      	 
  		try{
  			element = driver.findElement(By.id("cbx_FouSSCCode_sel"));
   		}catch(Exception e){
  			Log.error(sRepositoryName + " | cbx_Found_Meter_Location_Code not found | Exception desc : "+e.getMessage());		
   		} 
  	    return element;
  	}
    
    public static WebElement cbx_Found_Meter_Location_Code(WebDriver driver){
   	 
  		try{
  			element = driver.findElement(By.id("cbx_FouMetLocCode_sel"));
   		}catch(Exception e){
  			Log.error(sRepositoryName + " | cbx_Found_Meter_Location_Code not found | Exception desc : "+e.getMessage());		
   		} 
  	    return element;
  	}
    
	public static WebElement btn_Found_Read_Meter_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("rb_ReadFou_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Found_Read_Meter_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement btn_Found_Read_Meter_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("rb_ReadFou_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Found_Read_Meter_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement btn_Continue_Job_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("rb_ConJob_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Continue_Job_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement btn_Continue_Job_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("rb_ConJob_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Continue_Job_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement btn_Capture_Found_Photo(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath("//text()[contains(.,'CAPTURE PHOTO OF CURRENT FULL METER INSTALLATION')]/ancestor::button[1]"));
			element = driver.findElement(By.id("btn_Found_Photo"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Found_Photo not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Found_Meter_Details_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/currentmeter/div/div[1]/div[2]"));
			element = driver.findElement(By.id("Title_Found_Meter"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Found_Meter_Details_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
