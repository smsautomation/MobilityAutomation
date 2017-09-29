package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 04/07/2017
* Function: Objects_Electiricty_Meter_Determine_Emergency_Call_Out_Elec_Page
* Purpose: This class contains all of the elements on the Electricity Meter Determine Emergency Call Out - Elec page
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

public class Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Determine_Emergency_Call_Out_Elec_Page";

    public static WebElement lbl_Determine_Emergency_Call_Out_Elec(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("Title_Warrant_Data"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Determine_Emergency_Call_Out_Elec not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Elec_Meter_Supply_On(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[2]/div/div[1]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_EMetOnSup_on"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Elec_Meter_Supply_On not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Elec_Meter_Supply_Off(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[2]/div/div[1]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_EMetOnSup_off"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Elec_Meter_Supply_Off not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Meter_Exchanged_Yes(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[2]/div/div[2]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_MetExchg_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Exchanged_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Meter_Exchanged_No(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[2]/div/div[2]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_MetExchg_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Exchanged_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Work_Meter_Installation_Yes(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[2]/div/div[3]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_WorkMetInst_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Work_Meter_Installation_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Work_Meter_Installation_No(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[2]/div/div[3]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_WorkMetInst_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Work_Meter_Installation_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Complete_Job_Yes(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[2]/div/div[4]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_CompJob_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Complete_Job_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Complete_Job_No(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[2]/div/div[4]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_CompJob_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Complete_Job_No not found | Exception desc : "+e.getMessage());		
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
    
         
	public static WebElement lbl_Determine_Emergency_Call_Out_Elec_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/assessflty/div[1]/div[2]"));
			element = driver.findElement(By.id("Title_Warrant_Data"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Determine_Emergency_Call_Out_Elec_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
