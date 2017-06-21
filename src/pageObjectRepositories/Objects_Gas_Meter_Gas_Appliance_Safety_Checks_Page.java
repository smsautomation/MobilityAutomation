package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 07/06/2017
* Function: Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page
* Purpose: This class contains all of the elements on the Gas Meter Gas Appliance Safety Checks Test page
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

public class Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Gas_Meter_Gas_Appliance_Safety_Checks_Page";

    public static WebElement lbl_Gas_Appliance_Safety_Checks(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/appliancelist/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Appliance_Safety_Checks not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Earth_Bonding_Installed_Yes(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/appliancelist/div/div[2]/div[1]/div[2]/label[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Earth_Bonding_Installed_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Earth_Bonding_Installed_No(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/appliancelist/div/div[2]/div[1]/div[2]/label[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Earth_Bonding_Installed_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Landlord_Property_Yes(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/appliancelist/div/div[2]/div[2]/div[2]/label[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Landlord_Property_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Landlord_Property_No(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/appliancelist/div/div[2]/div[2]/div[2]/label[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Landlord_Property_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
     
    public static WebElement txt_Address(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("input1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Address not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Add_Appliance(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("btn1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Add_Appliance not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Flue_Type(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath("select1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Flue_Type not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Ventilation_Satisfactory_Yes(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/appliancelist/div/appliance/div/div[2]/div/div[2]/div[2]/label[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Ventilation_Satisfactory_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Ventilation_Satisfactory_No(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/appliancelist/div/appliance/div/div[2]/div/div[2]/div[2]/label[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Ventilation_Satisfactory_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Purge_Relight_Gas_App_Test_Yes(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/appliancelist/div/appliance/div/div[2]/div/div[3]/div[2]/label[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Purge_Relight_Gas_App_Test_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Purge_Relight_Gas_App_Test_No(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/appliancelist/div/appliance/div/div[2]/div/div[3]/div[2]/label[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Purge_Relight_Gas_App_Test_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Appliance_Type(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("select2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Appliance_Type not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Appliance_Location(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("select3"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Appliance_Location not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Appliance_Condition(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("select4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Appliance_Condition not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
         
    public static WebElement btn_Appliance_Safe_Use_Yes(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/appliancelist/div/appliance/div/div[2]/div/div[5]/div[2]/label[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Appliance_Safe_Use_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Appliance_Safe_Use_No(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/appliancelist/div/appliance/div/div[2]/div/div[5]/div[2]/label[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Appliance_Safe_Use_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Add_Another_Appliance(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("btn1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Add_Another_Appliance not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_All_Appliances_Tested(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("btn2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_All_Appliances_Tested not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Submit(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("btn1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Submit not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement lbl_Gas_Appliance_Safety_Checks_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/appliancelist/div/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Appliance_Safety_Checks_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
