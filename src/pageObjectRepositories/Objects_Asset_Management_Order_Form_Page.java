package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 08/06/2017
* Function: Objects_Asset_Management_Order_Form_Page
* Purpose: This class contains all of the elements on the Asset Management Order Form page
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

public class Objects_Asset_Management_Order_Form_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Asset_Management_Order_Form_Page";

    public static WebElement lnk_Order_Form(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("menu-item-order"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Order_Form not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Add_Order_Item(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/orderform/div[3]/div/h2/img"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Add_Order_Item not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Serial_Number(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/orderform/div[3]/div/div[1]/div/div/input"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Serial_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Quantity(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/orderform/div[3]/div/div[2]/div[1]/input"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Quantity not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Add_Order(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/orderform/div[3]/div/div[2]/div[2]/div/button"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Add_Order not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
     
    public static WebElement btn_OK(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.className("confirm"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_OK not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement img_Cancel_Order(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/orderform/div[2]/div/div/div/div/div[2]/img"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | img_Cancel_Order not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement img_Trash(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/orderform/div[2]/div/div/div/div/div[3]/img"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | img_Trash not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Cancel_Delete(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.className("cancel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Cancel_Delete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Confirm_Delete(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.className("confirm"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Confirm_Delete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
     
				
//END OF METHODS	    
}
