package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Job_Completion_Device_Binding_Commissioning_Page
* Purpose: This class contains all of the elements on the Job Completion Device Binding & Commissioning page
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

public class Objects_Job_Completion_Device_Binding_Commissioning_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Job_Completion_Device_Binding_Commissioning_Page";

    public static WebElement lbl_Device_Binding_Commissioning(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[1]/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Device_Binding_Commissioning not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
          
	public static WebElement lbl_Device_Binding_Commissioning_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[1]/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Device_Binding_Commissioning_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
