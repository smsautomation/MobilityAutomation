package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Initial_Risk_Assessment_Page
* Purpose: This class contains all of the elements on the Electricity Meter Initial Risk Assessment page
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

public class Objects_Electricity_Meter_Initial_Risk_Assessment_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Initial_Risk_Assessment_Page";

    public static WebElement lbl_Initial_Risk_Assessment(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.className("riskassess"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Initial_Risk_Assessment not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Smell_Gas_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassessinitial/div/div[2]/div/div[2]/div[1]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Smell_Gas_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Smell_Gas_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassessinitial/div/div[2]/div/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Smell_Gas_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Turned_Off_Gas_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassessinitial/div/div[2]/div[2]/div[2]/div/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Turned_Off_Gas_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Called_EGP_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassessinitial/div/div[2]/div[3]/div[2]/div/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Called_EGP_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_EGP_Ref_Number(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_EGP_Ref_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Reported_Incident_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassessinitial/div/div[2]/div[5]/div/div[2]/div[1]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Reported_Incident_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Reported_Incident_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassessinitial/div/div[2]/div[5]/div/div[2]/div[2]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Reported_Incident_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_AIRline_Reference_Number(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_AIRline_Reference_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_OK_To_Proceed_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassessinitial/div/div[2]/div[6]/div[2]/div[1]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_OK_To_Proceed_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_OK_To_Proceed_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassessinitial/div/div[2]/div[6]/div[2]/div[2]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_OK_To_Proceed_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement img_Abort(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.className("logout-icon"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | img_Abort not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Elec_Meter_Procedure_Fail(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/div[3]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Elec_Meter_Procedure_Fail not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Abort(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Abort not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Initial_Risk_Assessment_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassessinitial/div/div[1]/div/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Initial_Risk_Assessment_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
