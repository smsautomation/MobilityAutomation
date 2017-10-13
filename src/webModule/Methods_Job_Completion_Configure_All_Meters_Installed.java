package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Job_Completion_Configure_All_Meters_Installed_Page;
//import pageObjectRepositories.Objects_Job_Completion_Device_Binding_Commissioning_Page;
import utility.Log;
import utility.Utils;

public class Methods_Job_Completion_Configure_All_Meters_Installed{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 06/07/2017
	* Purpose: This method checks the main page elements on the Job Completion Configure All Meters Installed 
	* page upon initial landing
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
		Objects_Job_Completion_Configure_All_Meters_Installed_Page.lbl_Configure_All_Meters_Installed(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Configure All Meters Installed label displayed as expected");
		}				
		if ("Exchange_1_End_To_End_Chrome".equals(sTestCaseName))
		{ 
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Wan_Established_Yes(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full WAN Established - Yes radio button displayed as expected");
			}	
			
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Wan_Established_No(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full WAN Established - No radio button displayed as expected");
			}
			
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Configuration_Applied_Gas_Yes(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full Configuration Applied Gas - Yes radio button displayed as expected");
			}
				
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Configuration_Applied_Gas_No(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full Configuration Applied Gas - No radio button displayed as expected");
			}
			
		}
		else if (sTestCaseName.equals("Exchange_2_End_To_End_Chrome")) 
		{ 
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Wan_Established_Yes(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full WAN Established - Yes radio button displayed as expected");
			}	
			
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Wan_Established_No(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full WAN Established - No radio button displayed as expected");
			}
			
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Configuration_Applied_Electricity_Yes(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full Configuration Applied Elec - Yes radio button displayed as expected");
			}
				
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Configuration_Applied_Electricity_No(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full Configuration Applied Elec - No radio button displayed as expected");
			}
			
		}
		else if (sTestCaseName.equals("Exchange_3_End_To_End_Chrome")) 
		{
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Wan_Established_Yes(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full WAN Established - Yes radio button displayed as expected");
			}
				
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Configuration_Applied_Gas_Yes(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full Configuration Applied Gas - Yes radio button displayed as expected");
			}
				
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Configuration_Applied_Gas_No(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full Configuration Applied Gas - No radio button displayed as expected");
			}
			
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Configuration_Applied_Electricity_Yes(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full Configuration Applied Elec - Yes radio button displayed as expected");
			}
				
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Configuration_Applied_Electricity_No(driver).isDisplayed();{
			Log.info(sTestCaseName + " | Full Configuration Applied Elec - No radio button displayed as expected");
			}
			
		}
			else	
		{ 
			System.out.println("Doing the else "); 
		}
		
		/*
		//Check that all of the elements of that are expected are displayed
		Objects_Job_Completion_Configure_All_Meters_Installed_Page.lbl_Configure_All_Meters_Installed(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Configure All Meters Installed label displayed as expected");
		}
		
		Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Wan_Established_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Full WAN Established - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Wan_Established_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Full WAN Established - No radio button displayed as expected");
		}
		
		Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Configuration_Applied_Electricity_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Full Configuration Applied Electricity - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Configuration_Applied_Electricity_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Full Configuration Applied Electricity - No radio button displayed as expected");
		}
		
		Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Configuration_Applied_Gas_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Full Configuration Applied Gas - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Configuration_Applied_Gas_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Full Configuration Applied Gas - No radio button displayed as expected");
		}*/
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 06/07/2017
	* Purpose: This method adds the required responses in the Job Completion Configure All Meters Installed 
	* page in order to force a successful device binding and commissioning
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
	
		if ("Exchange_1_End_To_End_Chrome".equals(sTestCaseName))
		{ 
			//Add correct responses for a successful installed meters configuration
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Wan_Established_Yes(driver).click();{
			Log.info(sTestCaseName + " | Full WAN Established - Yes radio button clicked");
			}	
			
		}
		else if (sTestCaseName.equals("Exchange_2_End_To_End_Chrome")) 
		{ 
			//Add correct responses for a successful installed meters configuration
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Wan_Established_Yes(driver).click();{
			Log.info(sTestCaseName + " | Full WAN Established - Yes radio button clicked");
			}
			
		}
		else if  ("Exchange_3_End_To_End_Chrome".equals(sTestCaseName))
		{ 
			//Add correct responses for a successful installed meters configuration
			Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Wan_Established_Yes(driver).click();{
			Log.info(sTestCaseName + " | Full WAN Established - Yes radio button clicked");
			}
			
		}
		else
		{ 
			System.out.println("Doing the else "); 
		}
			
/*		//Add correct responses for a successful installed meters configuration
		Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Full_Wan_Established_Yes(driver).click();{
		Log.info(sTestCaseName + " | Full WAN Established - Yes radio button clicked");
		}*/
		Objects_Job_Completion_Configure_All_Meters_Installed_Page.btn_Next_Section(driver).click();{		
		Log.info(sTestCaseName + " | Next Section button clicked");
		}
		Objects_Job_Completion_Configure_All_Meters_Installed_Page.lbl_Configure_All_Meters_Installed_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Configure All Installed Meters Complete Label displayed");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
			
//END OF METHODS
}