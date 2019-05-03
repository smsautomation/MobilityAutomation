package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 08/06/2017
* Function: Objects_Asset_Management_Van_List_Page
* Purpose: This class contains all of the elements on the Asset Management Van List page
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

public class Objects_Asset_Management_Van_List_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Asset_Management_Van_List_Page";

    public static WebElement lnk_Van_List(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("menu-item-vanList"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Van_List not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Add_Van_Asset(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/vanlist/div[3]/div/div/h2/img"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Add_Van_Asset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Serial_Number(WebDriver driver){
      	 
		try{
			//driver.findElement(By.linkText(" MR. Test_107_EXCH3_9900990148"));
			//element= driver.findElement(By.xpath("//span[contains (text(),'continue') and @class='turq'] "));
			element= driver.findElement(By.id("addVanAsset0"));
			//span[contains (text(),'continue')] or @class='turq'] 
			//element = driver.findElement(By.id("addVanAsset"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Serial_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	    
	/*}
    
    public static WebElement txt_Serial_Number2(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("addVanAsset"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Serial_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;*/
	}
    
    
    public static WebElement txt_Notes(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/vanlist/div[3]/div/div/div[2]/input"));
			element = driver.findElement(By.id("addVanAssetNotes"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Add_Asset(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/vanlist/div[3]/div/div/div[3]/div[2]/div/button"));
			element = driver.findElement(By.id("addAssetToVanList"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Add_Asset not found | Exception desc : "+e.getMessage());		
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
    
    public static WebElement img_Edit_Current_Asset(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/vanlist/div[2]/div/div/div/div/div[2]/img"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | img_Edit_Current_Asset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Edit_Notes(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/vanlist/div[4]/div/div[1]/div[2]/input"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Edit_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Update_Asset(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/vanlist/div[4]/div/div[2]/div[1]/div/button"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Update_Asset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Cancel(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/vanlist/div[4]/div/div[2]/div[2]/div/button"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Cancel not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement img_Return_Asset(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/assettab/div/div[1]/div/div/ng-switch/div/vanlist/div[2]/div/div/div/div/div[3]/img"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | img_Return_Asset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
       
				
//END OF METHODS	    
}
