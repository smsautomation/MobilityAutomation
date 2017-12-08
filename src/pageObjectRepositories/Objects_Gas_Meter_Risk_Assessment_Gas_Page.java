package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Gas_Meter_Risk_Assessment_Gas_Page
* Purpose: This class contains all of the elements on the Gas Meter Risk Assessment - Gas page
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

public class Objects_Gas_Meter_Risk_Assessment_Gas_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Gas_Meter_Risk_Assessment_Gas_Page";

    public static WebElement lbl_Risk_Assessment_Gas(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[1]/div/div[1]/h4"));
			element = driver.findElement(By.id("Title_RiskAss_gas"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Risk_Assessment_Gas not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Capture_Meter_Pressure_Low(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Meter_Pressure_Low not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Capture_Meter_Pressure_Med(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Meter_Pressure_Med not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Volt_Stick_Check_Pass(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div[2]/div/div/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Volt_Stick_Check_Pass not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Volt_Stick_Check_Fail(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div[2]/div/div/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Volt_Stick_Check_Fail not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Check_Signs_Tampering_Pass(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div[3]/div/div/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Check_Signs_Tampering_Pass not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Check_Signs_Tampering_Fail(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div[3]/div/div/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Check_Signs_Tampering_Fail not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_ECV_Checks_Pass(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div[4]/div/div/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_ECV_Checks_Pass not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_ECV_Checks_Fail(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div[4]/div/div/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_ECV_Checks_Fail not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Work_Area_Safety_Check_Pass(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div[5]/div/div/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Work_Area_Safety_Check_Pass not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Work_Area_Safety_Check_Fail(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div[5]/div/div/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Work_Area_Safety_Check_Fail not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Additional_Notes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("text1"));
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
	
	public static WebElement btn_Safe_To_Continue_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div[6]/div[2]/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Safe_To_Continue_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Safe_To_Continue_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div[6]/div[2]/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Safe_To_Continue_No not found | Exception desc : "+e.getMessage());		
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
	
	public static WebElement btn_Med_Pressure_Perform_Job_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div[2]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Med_Pressure_Perform_Job_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Med_Pressure_Perform_Job_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[2]/div[2]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Med_Pressure_Perform_Job_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Risk_Assessment_Gas_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/riskassessgas/div/div[1]/div/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Risk_Assessment_Gas_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Gas_Meter_Procedure_Fail(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/div[3]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Gas_Meter_Procedure_Fail not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Abort(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn_Gas_fail"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Abort not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
