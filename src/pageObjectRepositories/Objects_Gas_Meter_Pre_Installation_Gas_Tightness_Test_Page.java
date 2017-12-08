package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page
* Purpose: This class contains all of the elements on the Gas Meter Pre Installation Gas Tightness Test page
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

public class Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Page";

    public static WebElement lbl_Pre_Installation_Gas_Tightness_Test(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Pre_Installation_Gas_Tightness_Test not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Gas_Tightness_Test_Carried_Out_Yes(WebDriver driver){

		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[1]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_PreGasTigTCarOut_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Gas_Tightness_Test_Carried_Out_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Gas_Tightness_Test_Carried_Out_No(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[1]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_PreGasTigTCarOut_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Gas_Tightness_Test_Carried_Out_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Capture_Photo(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("btn_CapPho_GTT"));
			//element = driver.findElement(By.xpath(".//*[@id='btn1']"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Capture_Photo not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Drop_In_Pressure_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[3]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_WasDropPress_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Drop_In_Pressure_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Drop_In_Pressure_No(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[3]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_WasDropPress_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Drop_In_Pressure_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Dip_Gas_Pressure(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("cbx_DipPress_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Dip_Gas_Pressure not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement cbx_Meter_Type(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("cbx_MetreType_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Meter_Type not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Smell_Gas_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[6]/div[2]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_SmellGas_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Smell_Gas_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Smell_Gas_No(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[6]/div[2]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_SmellGas_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Smell_Gas_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_Additional_Notes(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("txt_AddNotGasTigT"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Test_Failure_Outcome_Customer_Issue(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[8]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_TestFailOutCmCusIss_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Test_Failure_Outcome_Customer_Issue not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Test_Failure_Outcome_GT_Issue(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[8]/div[2]/div[3]/label"));
			element = driver.findElement(By.id("rb_TestFailOutCmGTIss_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Test_Failure_Outcome_GT_Issue not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Reported_Incident_GT_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[8]/div[3]/div/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_RepGT_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Reported_Incident_GT_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Reported_Incident_GT_No(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[8]/div[3]/div/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_RepGT_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Reported_Incident_GT_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement txt_National_Grid_Job_Ref(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("gt_issue"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_National_Grid_Job_Ref not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Reported_Incident_AIRline_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[8]/div[3]/div[3]/div[2]/label[1]"));
			element = driver.findElement(By.id("rb_RepAirLine_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Reported_Incident_AIRline_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Reported_Incident_AIRline_No(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[8]/div[3]/div[3]/div[2]/label[2]"));
			element = driver.findElement(By.id("rb_RepAirLine_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Reported_Incident_AIRline_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Wait_GT_Attendance_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[8]/div[3]/div[4]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_GTAttSite_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Wait_GT_Attendance_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Wait_GT_Attendance_No(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[8]/div[3]/div[4]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_GTAttSite_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Wait_GT_Attendance_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_GT_Resolve_Issue_Yes(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[8]/div[3]/div[5]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("rb_GTResIss_y"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_GT_Resolve_Issue_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_GT_Resolve_Issue_No(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[2]/div/div[8]/div[3]/div[5]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("rb_GTResIss_n"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_GT_Resolve_Issue_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_Pre_Installation_Gas_Tightness_Test_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/gastask/div/div/gastightness/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Pre_Installation_Gas_Tightness_Test_Complete not found | Exception desc : "+e.getMessage());		
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
