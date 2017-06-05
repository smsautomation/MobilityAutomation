package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Risk_Assessment_Elec_Page
* Purpose: This class contains all of the elements on the Electricity Meter Risk Assessment - Elec page
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

public class Objects_Electricity_Meter_Risk_Assessment_Elec_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Risk_Assessment_Elec_Page";

    public static WebElement lbl_Risk_Assessment_Elec(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[1]/div/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Risk_Assessment_Elec not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Perform_Risk_Assessment_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div/div[2]/div/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Perform_Risk_Assessment_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement cbx_Risk_Reason_Code(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("select1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Risk_Reason_Code not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Risk_Assessment_Pass_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div[2]/div[2]/div[2]/div[1]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Risk_Assessment_Pass_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Risk_Assessment_Pass_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div[2]/div[2]/div[2]/div[2]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Risk_Assessment_Pass_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Additional_Notes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("ranotes"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Capture_Photo(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photo not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Next_Section(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btnNextrae"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
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
