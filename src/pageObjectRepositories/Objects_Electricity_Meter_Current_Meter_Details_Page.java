package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Current_Meter_Details_Page
* Purpose: This class contains all of the elements on the Electricity Meter Current Meter Details page
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

public class Objects_Electricity_Meter_Current_Meter_Details_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Current_Meter_Details_Page";

    public static WebElement lbl_Current_Meter_Details(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/currentmeter/div/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("Title_CurrMe_Det"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Current_Meter_Details not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Update_Values(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn_Update_values"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Update_Values not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Manufacturer_Letter(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("cbx_ManLet_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Manufacturer_Letter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Meter_Type(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/currentmeter/div/div[2]/div[6]/div[2]/div[2]/select"));
			element = driver.findElement(By.id("cbx_MetType_sel"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Meter_Type not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_SSC_Code(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/currentmeter/div/div[2]/div[6]/div[3]/div/div[2]/select"));
			element = driver.findElement(By.id("cbx_SigSSC_sel"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_SSC_Code not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Meter_Location_Code(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("cbx_MetLocCode_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Meter_Location_Code not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Existing_Meter_Correct_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/currentmeter/div/div[2]/div[6]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_ExMetDetCorrt_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Existing_Meter_Correct_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Existing_Meter_Correct_No(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/currentmeter/div/div[2]/div[6]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_ExMetDetCorrt_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Existing_Meter_Correct_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Capture_Meter_Reading(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("reg0"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Capture_Meter_Reading not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Status_Of_Asset(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("cbx_StaAss_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Status_Of_Asset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Removed_Meter_Reading(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input0"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Removed_Meter_Reading not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Unable_Read_Meter_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/removemeter/div/div[2]/div/div[3]/div[2]/div[2]/div/label"));
			element = driver.findElement(By.id("rb_UnReadMet_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Unable_Read_Meter_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Additional_Notes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("txt_AddUnRead_note"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Next_Section(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn_Next_rmv"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Current_Meter_Details_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/currentmeter/div/div[1]/div[2]"));
			element = driver.findElement(By.id("Title_CurrMe_Det"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Current_Meter_Details_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
