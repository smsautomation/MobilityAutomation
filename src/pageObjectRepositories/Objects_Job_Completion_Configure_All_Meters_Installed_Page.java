package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Job_Completion_Configure_All_Meters_Installed_Page
* Purpose: This class contains all of the elements on the Job Completion Configure All Meters Installed (Includes Gas & Elec) page
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

public class Objects_Job_Completion_Configure_All_Meters_Installed_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Job_Completion_Configure_All_Meters_Installed_Page";

    public static WebElement lbl_Configure_All_Meters_Installed(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Configure_All_Meters_Installed not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Full_Wan_Established_Yes(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_FulWANEst_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Full_Wan_Established_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Full_Wan_Established_No(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_FulWANEst_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Full_Wan_Established_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Full_Configuration_Applied_Electricity_Yes(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_FullCFigE_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Full_Configuration_Applied_Electricity_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Full_Configuration_Applied_Electricity_No(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_FullCFigE_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Full_Configuration_Applied_Electricity_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Full_Configuration_Applied_Gas_Yes(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[2]/div[3]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_FullCFigG_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Full_Configuration_Applied_Gas_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Full_Configuration_Applied_Gas_No(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[2]/div[3]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_FullCFigG_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Full_Configuration_Applied_Gas_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Full_Configuration_Applied_IHD_Yes(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_FullCFigIHD_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Full_Configuration_Applied_Electricity_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Full_Configuration_Applied_IHD_No(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_FullCFigIHD_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Full_Configuration_Applied_Electricity_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Capture_Photo_Joined_Asset(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("btn_CPhoJoinAss"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photo_Joined_Ass not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
     
    public static WebElement btn_Next_Section(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("btnNextEff"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement lbl_Configure_All_Meters_Installed_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[2]/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Configure_All_Meters_Installed_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
