package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Additional_Electricity_Tests_Page
* Purpose: This class contains all of the elements on the Electricity Meter Additional Electricity Tests page
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

public class Objects_Electricity_Meter_Additional_Electricity_Tests_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Additional_Electricity_Tests_Page";

    public static WebElement lbl_Additional_Electricity_Tests(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Additional_Electricity_Tests not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_All_Seals_Intact_Yes(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div/div[2]/div/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_All_Seals_Intact_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Approved_Siemens_Cable_Markers_Yes(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div[2]/div[2]/div/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Approved_Siemens_Cable_Markers_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Terminal_Screw_Tightness_Yes(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div[3]/div[2]/div/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Terminal_Screw_Tightness_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Capture_Photo(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("btn2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photo not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Visual_Inspection_Completed_Yes(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div[5]/div[2]/div/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Visual_Inspection_Completed_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Cable_Marker(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("select1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Cable_Marker not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Earth_Type(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("select2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Earth_Type not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Replacement_Meter_Board_Yes(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div[8]/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Replacement_Meter_Board_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Replacement_Meter_Board_No(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div[8]/div[2]/div[2]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Replacement_Meter_Board_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

    public static WebElement btn_Meter_Tails_Changed_Yes(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div[9]/div[2]/div[1]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Tails_Changed_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Meter_Tails_Changed_No(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div[9]/div[2]/div[2]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Meter_Tails_Changed_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Replaced_Main_Fuse_Yes(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div[10]/div[2]/div[1]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Replaced_Main_Fuse_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Replaced_Main_Fuse_No(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div[10]/div[2]/div[2]/label/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Replaced_Main_Fuse_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Emergency_Job_Yes(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div[11]/div[2]/div[1]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Emergency_Job_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Emergency_Job_No(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[2]/div[11]/div[2]/div[2]/label/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Emergency_Job_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Next_Section(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("btnNextPost"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement lbl_Additional_Electricty_Checks_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/postchecks/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Additional_Electricty_Checks_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
