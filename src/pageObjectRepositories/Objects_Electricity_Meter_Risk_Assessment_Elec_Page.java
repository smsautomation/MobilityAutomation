package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Risk_Assessment_Elec_Page
* Purpose: This class contains all of the elements on the Electricity Meter Risk Assessment - Elec page
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

public class Objects_Electricity_Meter_Risk_Assessment_Elec_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Risk_Assessment_Elec_Page";

    public static WebElement lbl_Risk_Assessment_Elec(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[1]/div/div[1]/h4"));
			element = driver.findElement(By.id("Title_RiskAss_elec"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Risk_Assessment_Elec not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Perform_Risk_Assessment_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div/div[2]/div/label"));
			element = driver.findElement(By.xpath("//*[contains(text(), 'Perform Risk Assessment')]/..//label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Perform_Risk_Assessment_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement cbx_Risk_Reason_Code(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("select1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Risk_Reason_Code not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Risk_Assessment_Pass_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div[2]/div[2]/div[2]/div[1]/label"));
			element = driver.findElement(By.xpath("//*[contains(text(), 'Risk Assessment Pass')]/..//label[text()='YES']"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Risk_Assessment_Pass_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Risk_Assessment_Pass_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div[2]/div[2]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Risk_Assessment_Pass_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Additional_Notes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("ranotes"));
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
	
	public static WebElement btn_Capture_Photo_Hazards(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photo_Hazards not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Called_AIRline_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div[3]/div[1]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Called_AIRline_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Called_AIRline_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div[3]/div[1]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Called_AIRline_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_AIRline_Reference_Number(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_AIRline_Reference_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Reported_Risk_DNO_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div[3]/div[3]/div/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Reported_Risk_DNO_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Reported_Risk_DNO_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div[3]/div[3]/div/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Reported_Risk_DNO_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_DNO_Job_Ref(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("input2"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_DNO_Job_Ref not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Stay_On_Site_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div[3]/div[4]/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Stay_On_Site_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Stay_On_Site_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div[3]/div[4]/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Stay_On_Site_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Can_Work_Completed_Yes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div[3]/div[4]/div/div[2]/div[1]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Can_Work_Completed_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Can_Work_Completed_No(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[2]/div[3]/div[4]/div/div[2]/div[2]/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Can_Work_Completed_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Additional_Notes_DNO(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("text3"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes_DNO not found | Exception desc : "+e.getMessage());		
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
	
	public static WebElement lbl_Elec_Meter_Procedure_Fail(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/div[3]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Elec_Meter_Procedure_Fail not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Abort(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("//*[@ng-click='abort()']"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Abort not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Risk_Assessment_Elec_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/riskassesselec/div/div[1]/div/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Risk_Assessment_Elec_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
