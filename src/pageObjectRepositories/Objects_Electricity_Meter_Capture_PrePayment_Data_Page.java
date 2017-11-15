package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Paul Middleton
* Date: 13/11/2017
* Function: Objects_Electiricty_Meter_Meter_Credit_Page
* Purpose: This class contains all of the elements on the Electricity Meter Meter Credit page
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

public class Objects_Electricity_Meter_Capture_PrePayment_Data_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Capture_PrePayment_Data_Page";

    public static WebElement lbl_Prepayment_Meter_Data(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/metercredit/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("lbl_Cap_PrePay_Met_Data"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Capture_PrePayment_Meter_Data not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    /*public static WebElement cbx_Elec_Meter_Tariff(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("select1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Elec_Meter_Tariff not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}*/
    
    public static WebElement txt_Credit_Remaining_Meter(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("input1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Credit_Remaining_Meter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Total_Value_Credit_Accepted(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("input2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Total_Value_Credit_Accepted not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Standing_Charge_Weekly_Debt_Setting(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("input3"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Standing_Charge_Weekly_Debt_Setting not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Weekly_Debt_Charge(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("input4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Weekly_Debt_Charge not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Total_Debt_Remaining(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("input5"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Total_Debt_Remaining not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Total_Debt_set(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("input6"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Total_Debt_set not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    
    public static WebElement txt_Fixed_Standing_Charge(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("input7"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Fixed_Standing_Charge not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Meter_Emergency_Credit_Yes(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/metercredit/div[2]/div[9]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("ppq1"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Set_Emergency_Credit_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Meter_Emergency_Credit_No(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/metercredit/div[2]/div[9]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("ppq2"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Set_Emergency_Credit_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Additional_Notes(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("notesprepay"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
       
    public static WebElement btn_Next_Section(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("btnNextPreP"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lbl_Prepayment_Meter_Data_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/metercredit/div[1]/div[2]"));
			element = driver.findElement(By.id("lbl_Cap_PrePay_Met_Data"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Prepayment_Meter_Data_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
