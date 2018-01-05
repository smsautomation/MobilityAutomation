package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Doorstep_Protocol_Page;
import utility.Log;
import utility.Utils;

public class Methods_Doorstep_Protocol{
	
		
	/* **************************************************************************************************
	* Function: viewSidebarItem
	* Author: Iain Storrie
	* Date: 14/06/2017
	* Purpose: This method checks the Sidebar elements on the Doorstep Protocol page
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void viewSidebar(WebDriver driver, String sTestCaseName) throws Exception{
	
				
		//Check that all of the elements of that are expected are displayed
		Objects_Doorstep_Protocol_Page.Sidebar.lbl_Customer_Details(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Customer Details Label displayed as expected");
		}
		
		Objects_Doorstep_Protocol_Page.Sidebar.lbl_Customer_Details_More_Details(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Customer Details More Details Label displayed as expected");
		}
		
		Objects_Doorstep_Protocol_Page.Sidebar.lbl_Job_Details(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Job Details Label displayed as expected");
		}
		
		Objects_Doorstep_Protocol_Page.Sidebar.lbl_Job_Details_More_Details(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Job Details More Details Label displayed as expected");
		}
		
		Objects_Doorstep_Protocol_Page.Sidebar.lbl_Meter_Details(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Meter Details Label displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewJobDetails");
		
	//END OF VIEW SIDEBAR METHOD	
	}
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 14/06/2017
	* Purpose: This method checks the main page elements on the Doorstep Protocol page
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void viewPage(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements of that are expected are displayed
		Objects_Doorstep_Protocol_Page.btn_Arrive(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Arrive button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewMainPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewArrivePage
	* Author: Iain Storrie
	* Date: 14/06/2017
	* Purpose: This method checks the main page elements on the Doorstep Protocol page after the Arrive button
	* has been clicked
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void viewArrivePage(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements of that are expected are displayed
		Objects_Doorstep_Protocol_Page.lbl_Warning_Info(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Warning Info label displayed as expected");
		}
		
		Objects_Doorstep_Protocol_Page.cbx_Risks_Identified(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Risks Identified combobox displayed as expected");
		}
		
		Objects_Doorstep_Protocol_Page.btn_Access_Site_Gained_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Access Site Gain Yes button displayed as expected");
		}
		
		Objects_Doorstep_Protocol_Page.btn_Access_Site_Gained_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Access Site Gain No button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewArrivePage");
		
	//END OF VIEW ARRIVE PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addAbortValues
	* Author: Iain Storrie
	* Date: 14/06/2017
	* Purpose: This method adds the required responses in the doorstep Protocol page in order to force a 
	* Doorstep Procedure Fail Abort 
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addAbortValues(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses to force a Doorstep Procedure Fail Abort
		
		Objects_Doorstep_Protocol_Page.btn_Access_Site_Gained_No(driver).click();{
		Log.info(sTestCaseName + " | Access Site Gained - No radio button clicked");
		}
		Objects_Doorstep_Protocol_Page.btn_Customer_Onsite_No(driver).click();{
		Log.info(sTestCaseName + " | Customer Onsite - No radio button clicked");
		}
		Objects_Doorstep_Protocol_Page.btn_Capture_Photo(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Doorstep_Protocol_Page.btn_No_Access_Card_Left_Yes(driver).click();{
		Log.info(sTestCaseName + " | No Access Card Left Radio - Yes button clicked");
		}
		Objects_Doorstep_Protocol_Page.lbl_Warning_Info(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Warning Info Label displayed");
		}
		Objects_Doorstep_Protocol_Page.btn_Abort_No_Access(driver).isDisplayed();
		Log.info(sTestCaseName + " | Abort No Access Button displayed as expected");	
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValues");
		
	//END OF ADD ABORT VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 14/06/2017
	* Purpose: This method adds the required responses in the Doorstep Protocol page in order to force a 
	* successful doorstep procedure 
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValues(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful Doorstop Procedure
		
		Objects_Doorstep_Protocol_Page.btn_Access_Site_Gained_Yes(driver).click();{
		Log.info(sTestCaseName + " | Access Site Gained - Yes radio button clicked");
		}
		Objects_Doorstep_Protocol_Page.btn_Customer_Onsite_Yes(driver).click();{
		Log.info(sTestCaseName + " | Customer Onsite - Yes radio button clicked");
		}
		Objects_Doorstep_Protocol_Page.btn_Onsite(driver).click();{
		Log.info(sTestCaseName + " | Onsite button clicked");
		}
						
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValuesFLTY17
	* Author: Paul Middleton
	* Date: 03/08/2017
	* Purpose: This method adds the required responses in the Doorstep Protocol page in order to force a 
	* successful doorstep procedure for the FLTY17 workflow
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValuesFLTY17(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful Doorstop Procedure
		
		Objects_Doorstep_Protocol_Page.btn_Access_Site_Gained_Yes(driver).click();{
		Log.info(sTestCaseName + " | Access Site Gained - Yes radio button clicked");
		}
		Objects_Doorstep_Protocol_Page.btn_Onsite(driver).click();{
		Log.info(sTestCaseName + " | Onsite button clicked");
		}
						
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES FLTY17 METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValuesFLTY17
	* Author: Paul Middleton
	* Date: 03/08/2017
	* Purpose: This method adds the required responses in the Doorstep Protocol page in order to force a 
	* successful doorstep procedure for the FLTY17 workflow
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValuesSuspend(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful Doorstop Procedure
		
		Objects_Doorstep_Protocol_Page.btn_Access_Site_Gained_No(driver).click();{
		Log.info(sTestCaseName + " | Access Site Gained - Yes radio button clicked");
		}
		Objects_Doorstep_Protocol_Page.btn_Customer_Onsite_Yes(driver).click();{
		Log.info(sTestCaseName + " | Customer Onsite - Yes radio button clicked");
		}
		Objects_Doorstep_Protocol_Page.btn_Capture_Photo_Customer_Present(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Doorstep_Protocol_Page.btn_Suspend_Job_Yes(driver).click();{
		Log.info(sTestCaseName + " | Capture Photo button clicked");
		}
		Objects_Doorstep_Protocol_Page.lbl_Warning_Info(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Warning Info Label displayed");
		}
		Objects_Doorstep_Protocol_Page.btn_Suspend_No_Access(driver).isDisplayed();
		Log.info(sTestCaseName + " | Abort No Access Button displayed as expected");	
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addAbortValues");
		
	//END OF ADD SUCCESS VALUES FLTY17 METHOD
	}
	
//END OF METHODS
}