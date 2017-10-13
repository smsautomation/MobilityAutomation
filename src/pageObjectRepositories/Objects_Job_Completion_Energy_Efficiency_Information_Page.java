package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Job_Completion_Energy_Efficient_Information_Page
* Purpose: This class contains all of the elements on the Job Completion Energy Efficiency Information page
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

public class Objects_Job_Completion_Energy_Efficiency_Information_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Job_Completion_Enerygy_Efficiency_Information_Page";

    public static WebElement lbl_Energy_Efficiency_Information(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[3]/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("lbl_EnEff_info"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Energy_Efficiency_Information not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Energy_Efficiency_Information_Provided_Yes(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[3]/div[2]/div[3]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_EngEffInfoP_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Energy_Efficiency_Information_Provided_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Energy_Efficiency_Information_Provided_No(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[3]/div[2]/div[3]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_EngEffInfoP_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Energy_Efficiency_Information_Provided_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Energy_Efficiency_Documentation_Yes(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[3]/div[2]/div[4]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_EngEffDocleft_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Energy_Efficiency_Documentation_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Energy_Efficiency_Documentation_No(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[3]/div[2]/div[4]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_EngEffDocleft_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Energy_Efficiency_Documentation_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Customer_Happy_Yes(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[3]/div[2]/div[5]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_IsCusHap_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Customer_Happy_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Customer_Happy_No(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[3]/div[2]/div[5]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_IsCusHap_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Customer_Happy_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Additional_Energy_Efficiency_Information_Yes(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[3]/div[2]/div[6]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_AddEEInfo_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Additional_Energy_Efficiency_Information_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Additional_Energy_Efficiency_Information_No(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[3]/div[2]/div[6]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_AddEEInfo_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Additional_Energy_Efficiency_Information_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Additional_Notes(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("txt_EneNotes"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
     
    public static WebElement btn_Next_Section(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("btn_Next_Eff"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement lbl_Energy_Efficiency_Information_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[3]/div[1]/div[2]"));
			element = driver.findElement(By.id("lbl_EnEff_info"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Energy_Efficiency_Information_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
