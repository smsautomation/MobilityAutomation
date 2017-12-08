package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Initial_Polarity_Check_At_Meter_And_Cut_Out_Page
* Purpose: This class contains all of the elements on the Electricity Meter Initial Polarity Check At Meter page
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

public class Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page";

    public static WebElement lbl_Initial_Polarity_Check_At_Meter(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("Title_InitPCM"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Initial_Polarity_Check_At_Meter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Polarity_Check_At_Cut_Out_Pass(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[2]/div[1]/div[2]/label[1]"));
			element = driver.findElement(By.id("rb_PolCOPass"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Polarity_Check_At_Cut_Out_Pass not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Polarity_Check_At_Cut_Out_Fail(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[2]/div[1]/div[2]/label[2]"));
			element = driver.findElement(By.id("rb_PolCOFail"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Polarity_Check_At_Cut_Out_Fail not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Polarity_Check_At_Meter_Pass(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[2]/div[2]/div[2]/label[1]"));
			element = driver.findElement(By.id("rb_PolCMPass"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Polarity_Check_At_Meter_Pass not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Polarity_Check_At_Meter_Fail(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[2]/div[2]/div[2]/label[2]"));
			element = driver.findElement(By.id("rb_PolCMFail"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Polarity_Check_At_Meter_Fail not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Reported_Team_Manager_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[2]/div[4]/div[4]/div[2]/div/label"));
			element = driver.findElement(By.id("rb_RepTM_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Reported_Team_Manager_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Team_Manager_Name(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("Txt_TM_Name"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Team_Manager_Name not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Team_Manager_Authorisation_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[2]/div[4]/div[6]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_TMAuth_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Team_Manager_Authorisation_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Team_Manager_Authorisation_No(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[2]/div[4]/div[6]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_TMAuth_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Team_Manager_Authorisation_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Called_AIRline_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[2]/div[4]/div[6]/div[3]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_CallAline_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Called_AIRline_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Called_AIRline_No(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[2]/div[4]/div[6]/div[3]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_CallAline_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Called_AIRline_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_AIRline_Reference(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("txt_Aline_Ref"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_AIRline_Reference not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Reported_Risk_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[2]/div[4]/div[6]/div[5]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_RepRDNO_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Reported_Risk_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Reported_Risk_No(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/polaritytest/div[2]/div[4]/div[6]/div[5]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_RepRDNO_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Reported_Risk_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_DNO_Reference(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("txt_DND_Ref"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_DNO_Reference not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Next_Section(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn_Next_Pol"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Abort_Polarity(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath("//*[@ng-click='abort()']"));
			element = driver.findElement(By.id("btn_Next_ABInPol"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Abort not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Abort(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath("//*[@ng-click='abort()']"));
			element = driver.findElement(By.id("btn_Elec_fail"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Abort not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Initial_Polarity_Check_At_Meter_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("Title_InitPCM"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Initial_Polarity_Check_At_Meter_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
