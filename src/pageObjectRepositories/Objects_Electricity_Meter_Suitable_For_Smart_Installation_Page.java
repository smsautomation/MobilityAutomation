package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Suitable_For_Smart_Installation_Page
* Purpose: This class contains all of the elements on the Electricity Meter Suitable for Smart Installation page
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

public class Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Suitable_For_Smart_Installation_Page";

    public static WebElement lbl_Suitable_For_Smart_Installation(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/smartcheck/div/div[1]/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Suitable_For_Smart_Installation not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Suitable_For_Smart_Installation_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/smartcheck/div/div[1]/div[2]/div[1]/div[2]/div[1]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Suitable_For_Smart_Installation_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Suitable_For_Smart_Installation_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/smartcheck/div/div[1]/div[2]/div[1]/div[2]/div[2]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Suitable_For_Smart_Installation_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Equipment_Reposition_Required(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("repositionSelect"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Equipment_Reposition_Required not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Additional_Notes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("smartnotes"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Risk_Assessment_Pass_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Suitable_For_Smart_Installation_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/smartcheck/div/div[1]/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Suitable_For_Smart_Installation_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Suitable_For_Dumb_Instalation_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/smartcheck/div/div[1]/div[2]/div[2]/div[2]/div[1]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Suitable_For_Dumb_Instalation_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Suitable_For_Dumb_Instalation_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/smartcheck/div/div[1]/div[2]/div[2]/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Suitable_For_Dumb_Instalation_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Risk_Assessment_Elec_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[1]/div/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Risk_Assessment_Elec_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
