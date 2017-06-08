package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 08/06/2017
* Function: Objects_Asset_Management_Job_List_Page
* Purpose: This class contains all of the elements on the Asset Management Job List page
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

public class Objects_Asset_Management_Job_List_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Asset_Management_Job_List_Page";

    public static WebElement lnk_Job_List(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("menu-item-job"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Job_List not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    
     
				
//END OF METHODS	    
}
