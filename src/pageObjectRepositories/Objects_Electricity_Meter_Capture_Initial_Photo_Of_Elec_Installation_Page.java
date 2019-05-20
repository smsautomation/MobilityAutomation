package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Capture_Initial_Photo_Of_Elec_Installation_Page
* Purpose: This class contains all of the elements on the Electricity Meter Capture Initial Photo Of Elec Installation page
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

public class Objects_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation_Page {
   
    public static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Capture_Initial_Photo_Of_Elec_Installation_Page";

    public static WebElement lbl_Capture_Initial_Photo_Of_Elec_Installation(WebDriver driver){
    	 //WebElement
		try{
			element = driver.findElement(By.id("Title_Init_Photo"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Capture_Initial_Photo_Of_Elec_Installation not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Capture_Photo(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath("//text()[contains(.,'CAPTURE PHOTO OF CURRENT FULL METER INSTALLATION')]/ancestor::button[1]"));
			element = driver.findElement(By.id("btn_Init_Photo"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photo not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	   public static WebElement lbl_Capture_Initial_Photo_Of_Elec_Installation_Completed(WebDriver driver){
	    	 
			try{
				//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/initialphoto/div/div[1]/div[2]"));
				element = driver.findElement(By.id("Title_Init_Photo"));
			}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Capture_Initial_Photo_Of_Elec_Installation_Completed not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
		
//END OF METHODS	    
}
