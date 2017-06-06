package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Initial_Polarity_Check_Martindale_Test_Page
* Purpose: This class contains all of the elements on the Electricity Meter Initial Polarity Check Martindale Test page
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

public class Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Initial_Polarity_Check_Martindale_Test_Page";

    public static WebElement lbl_Initial_Polarity_Check_Martindale_Test(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/plugintest/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Initial_Polarity_Check_Martindale_Test not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement cbx_Carry_Out_Polarity_Check(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/plugintest/div/div[2]/div/div[2]/select"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Carry_Out_Polarity_Check not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Socket_Safety_Test_Pass(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/plugintest/div/div[2]/div[2]/div[2]/div[1]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Socket_Safety_Test_Pass not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Socket_Safety_Test_Fail(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/plugintest/div/div[2]/div[2]/div[2]/div[2]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Socket_Safety_Test_Fail not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Socket_Test_Location(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("select2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Socket_Test_Location not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Additional_Notes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("smartnotes"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Risk_Assessment_Pass_Yes not found | Exception desc : "+e.getMessage());		
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
	
	public static WebElement btn_Sockets_Reverse_Polarity_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/plugintest/div/div[2]/div[5]/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Sockets_Reverse_Polarity_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Sockets_Reverse_Polarity_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/plugintest/div/div[2]/div[5]/div[2]/div[2]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Sockets_Reverse_Polarity_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Reverse_Polarity_Sockets_Location(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("select3"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Reverse_Polarity_Sockets_Location not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Reverse_Polarity_Sockets_Number(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Reverse_Polarity_Sockets_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Add_Another(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Add_Another not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_All_Sockets_Completed(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn3"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_All_Sockets_Completed not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
		
	public static WebElement lbl_Initial_Polarity_Check_Martindale_Test_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/plugintest/div/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Initial_Polarity_Check_Martindale_Test_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
				
//END OF METHODS	    
}
