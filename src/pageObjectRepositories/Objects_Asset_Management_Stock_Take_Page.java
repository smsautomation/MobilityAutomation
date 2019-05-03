package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 08/06/2017
* Function: Objects_Asset_Management_Stock_Take_Page
* Purpose: This class contains all of the elements on the Asset Management Stock Take page
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

public class Objects_Asset_Management_Stock_Take_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Asset_Management_Stock_Take_Page";

    public static WebElement lnk_Stock_Take(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("menu-item-stock"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Stock_Take not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Asset_Serial_1(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("stockid0"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Asset_Serial_1 not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Asset_Serial_2(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("stockid1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Asset_Serial_2 not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Asset_Serial_3(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("stockid2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Asset_Serial_3 not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement img_Trash(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/stocklist/div[2]/div/div/div[2]/div/div[2]/div"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | img_Trash not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Submit(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/stocklist/div[1]/div"));
			//element = driver.findElement(By.id("btn_StktkSub"));	
			element = driver.findElement(By.xpath("//*[text()='Submit']"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Submit not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_OK(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.className("confirm"));
			element = driver.findElement(By.xpath("//*[text()='SUBMIT STOCK TAKE']/..//button[@class='confirm']"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_OK not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Cancel(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.className("cancel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Cancel not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
     
    public static WebElement btn_Stock_Take_OK(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.className("confirm"));
			element = driver.findElement(By.xpath("//*[text()='Stock Take Ok']/..//button[@class='confirm']"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Stock_Take_OK not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
				
//END OF METHODS	    
}
