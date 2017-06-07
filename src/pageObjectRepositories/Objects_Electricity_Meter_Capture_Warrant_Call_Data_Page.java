package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 07/06/2017
* Function: Objects_Electiricty_Meter_Capture_Warrant_Call_Data_Elec_Page
* Purpose: This class contains all of the elements on the Electricity Meter Capture Warrant Call Data - Elec page
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

public class Objects_Electricity_Meter_Capture_Warrant_Call_Data_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Capture_Warrant_Call_Data_Page";

    public static WebElement lbl_Capture_Warrant_Call_Data_Elec(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Capture_Warrant_Call_Data_Elec not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Meter_Exchanged(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[2]/div/div/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Exchanged not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Meter_DeEnergised(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[2]/div/div/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_DeEnergised not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	   public static WebElement lbl_Capture_Warrant_Call_Data_Elec_Completed(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[1]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Capture_Warrant_Call_Data_Elec_Completed not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
		
//END OF METHODS	    
}
