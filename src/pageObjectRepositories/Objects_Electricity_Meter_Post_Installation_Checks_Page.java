package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Electiricty_Meter_Post_Installation_Checks_Page
* Purpose: This class contains all of the elements on the Electricity Meter Post Installation Checks page
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

public class Objects_Electricity_Meter_Post_Installation_Checks_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Post_Installation_Checks_Page";

    public static WebElement lbl_Post_Installation_Checks(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/posttest/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Post_Installation_Checks not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Polarity_Check_Meter_Yes(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/posttest/div/div[3]/div[2]/div/label"));
			element = driver.findElement(By.id("rb_CarOutPolCk_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Polarity_Check_Meter_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Additional_Notes(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("postpolnotes"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Polarity_Check_Plugin(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("cbx_PolChkplg_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Polarity_Check_Plugin not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Socket_Safety_Test_Pass(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/posttest/div/div[7]/div[2]/div/label"));
			element = driver.findElement(By.id("rb_SocSafChk_pass"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Socket_Safety_Test_Pass not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Test_Witness_Name(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("txt_TestWtn"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Test_Witness_Name not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Capture_Photo_Martindale_Test(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("btn_CapPhoMart_test"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photo_Martindale_Test not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Capture_Photo_Final_Meter_Installation(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("btn_CapPhoFinMet_inst"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photo_Final_Meter_Installation not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Capture_Photo_Close_Up_Meter(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("btn_CapPhoCloUp_met"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photo_Close_Up_Meter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Submit(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("btn_Submit_elec"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Submit not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
      
	public static WebElement lbl_Post_Installation_Checks_Completion(WebDriver driver){
	   	 
		try{
		element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/posttest/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Post_Installation_Checks_Completion not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Commissioning_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("input1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Commissioning_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
