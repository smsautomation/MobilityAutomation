package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 07/07/2017
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

public class Objects_Electricity_Meter_Meter_Credit_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Additional_Electricity_Tests_Page";

    public static WebElement lbl_Meter_Credit(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/metercredit/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Meter_Credit not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Elec_Meter_Tariff(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("select1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Elec_Meter_Tariff not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Credit_Remaining_Meter(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("ppf1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Credit_Remaining_Meter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Total_Value_Credit_Accepted(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("ppf2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Total_Value_Credit_Accepted not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Standing_Charge(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("ppf3"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Standing_Charge not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Total_Debt_Set(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("ppf4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Total_Debt_Set not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Total_Debt_Remaining(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("ppf5"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Total_Debt_Remaining not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Weekly_Debt_Charge_Recovery(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("ppf6"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Weekly_Debt_Charge_Recovery not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Fixed_Standing_Charge(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("ppf7"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Fixed_Standing_Charge not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Meter_Set_Emergency_Credit_Yes(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/metercredit/div[2]/div[9]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Set_Emergency_Credit_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Meter_Set_Emergency_Credit_No(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/metercredit/div[2]/div[9]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Set_Emergency_Credit_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Issued_Key_Card_Yes(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/metercredit/div[2]/div[10]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Issued_Key_Card_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Issued_Key_Card_No(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/metercredit/div[2]/div[10]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Issued_Key_Card_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Demonstrated_Customer_Yes(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/metercredit/div[2]/div[11]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Demonstrated_Customer_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

    public static WebElement btn_Demonstrated_Customer_No(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/metercredit/div[2]/div[11]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Demonstrated_Customer_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Additional_Notes(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("prepaynotes"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
       
    public static WebElement btn_Next_Section(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("btnNextPremc"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement lbl_Meter_Credit_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/metercredit/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Additional_Electricty_Checks_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
