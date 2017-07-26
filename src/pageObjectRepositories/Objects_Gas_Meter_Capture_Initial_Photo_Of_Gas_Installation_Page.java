package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Gas_Meter_Capture_Initial_Photo_Of_Gas_Installation_Page
* Purpose: This class contains all of the elements on the Gas Meter Capture Initial Photo Of Gas Installation page
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

public class Objects_Gas_Meter_Capture_Initial_Photo_Of_Gas_Installation_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Gas_Meter_Capture_Initial_Photo_Of_Gas_Installation_Page";

    public static WebElement lbl_Capture_Initial_Photo_Of_Gas_Installation(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/initialphoto/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Capture_Initial_Photo_Of_Gas_Installation not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Capture_Photo(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='btn1']"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photo not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	   public static WebElement lbl_Capture_Initial_Photo_Of_Gas_Installation_Completed(WebDriver driver){
	    	 
			try{
				element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/initialphoto/div/div[1]/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lbl_Capture_Initial_Photo_Of_Gas_Installation_Completed not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
		
//END OF METHODS	    
}
