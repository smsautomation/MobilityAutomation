package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_New_Meter_Details_Page
* Purpose: This class contains all of the elements on the Electricity Meter New Meter Details page
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

public class Objects_Electricity_Meter_New_Meter_Details_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_New_Meter_Details_Page";

    public static WebElement lbl_New_Meter_Details(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/newmeter/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_New_Meter_Details not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Manufacturer_Letter(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("cbx_NewManu_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Manufacturer_Letter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Meter_Type(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/newmeter/div/div[2]/div[2]/div[2]/select"));
			element = driver.findElement(By.id("cbx_MetType_sel"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Meter_Type not found | Exception desc : "+e.getMessage());		
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
    
    public static WebElement btn_Scan_Asset_Now(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.className("confirm"));
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
    
    public static WebElement cbx_SSC_Code(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/newmeter/div/div[2]/div[4]/div/div[2]/select"));
			element = driver.findElement(By.id("cbx_SSCCode_sel"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_SSC_Code not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Meter_Location_Code(WebDriver driver){
    	 
  		try{
  			element = driver.findElement(By.id("cbx_MetLocCode_sel"));
   		}catch(Exception e){
  			Log.error(sRepositoryName + " | cbx_Meter_Location_Code not found | Exception desc : "+e.getMessage());		
   		} 
  	    return element;
  	}
    
    public static WebElement txt_Certification(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("txt_Cert_year"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Certification not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lbl_New_Meter_Details_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/newmeter/div/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_New_Meter_Details_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
