package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Job_Completion_Summary_Page
* Purpose: This class contains all of the elements on the Job Completion Summary page
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

public class Objects_Job_Completion_Summary_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Job_Completion_Summary_Page";

    public static WebElement lbl_Summary(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[4]/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("lbl_Summary"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Summary not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_Electricity_Meter_Mpan(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[4]/div[2]/div[2]/div[1]/div/h4"));
			element = driver.findElement(By.id("lbl_SumElecMet_mpan"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Electricity_Meter_Mpan not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement lbl_Gas_Meter_Mprn(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[4]/div[2]/div[2]/div[1]/div/h4"));
			element = driver.findElement(By.id("lbl_SumGasMet_mprn"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Meter_Mprn not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Potential_Customer_Vulnerability_Identified_Yes(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[4]/div[2]/div[6]/div[2]/div/label"));
			element = driver.findElement(By.id("rb_PotVulCusIden_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Potential_Customer_Vulnerability_Identified_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Additional_Notes(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[4]/div[2]/textarea"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Customer_Agreement_Yes(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[4]/div[2]/div[7]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_CustAgrInf_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Customer_Agreement_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Customer_Agreement_No(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[4]/div[2]/div[7]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_CustAgrInf_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Customer_Agreement_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
       
	public static WebElement lbl_Summary_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/complete/div/div/div[4]/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Summary_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
