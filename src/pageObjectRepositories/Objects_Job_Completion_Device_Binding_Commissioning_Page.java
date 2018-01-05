package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Job_Completion_Device_Binding_Commissioning_Page
* Purpose: This class contains all of the elements on the Job Completion Device Binding & Commissioning page
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

public class Objects_Job_Completion_Device_Binding_Commissioning_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Job_Completion_Device_Binding_Commissioning_Page";

    public static WebElement lbl_Device_Binding_Commissioning(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[1]/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("Title_DevBinComm"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Device_Binding_Commissioning not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_IHD_Accepted_Yes(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div/div[2]/div[1]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_IHDAcc_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_IHD_Accepted_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_IHD_Accepted_No(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div/div[2]/div[1]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_IHDAcc_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_IHD_Accepted_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Gas_Electricity_Meter_Paired_Successfully_Yes(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[1]/div[2]/div[3]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_GasElecMPairSuc_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Gas_Electricity_Meter_Paired_Successfully_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Gas_Electricity_Meter_Paired_Successfully_No(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[1]/div[2]/div[3]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_GasElecMPairSuc_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Gas_Electricity_Meter_Paired_Successfully_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_IHD_Paired_Successfully_Yes(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[1]/div[2]/div[5]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_IHDPaiSucc_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_IHD_Paired_Successfully_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_IHD_Paired_Successfully_No(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[1]/div[2]/div[5]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_IHDPaiSucc_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_IHD_Paired_Successfully_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Full_HAN_Established_Yes(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[1]/div[2]/div[7]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_FulHANEst_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Full_HAN_Established_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Full_HAN_Established_No(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[1]/div[2]/div[7]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_FulHANEst_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Full_HAN_Established_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Additional_Notes(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[1]/div[2]/div[9]/textarea"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
          
	public static WebElement lbl_Device_Binding_Commissioning_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[1]/div[1]/div[2]"));
			element = driver.findElement(By.id("Title_DevBinComm"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Device_Binding_Commissioning_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
