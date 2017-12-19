package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Login_Page;
import utility.Log;
import utility.Utils;

public class Methods_LoginWater{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 29/06/2017
	* Purpose: This method checks the main page elements on the Login page
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
	public static void viewPageWater(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements of that are expected are displayed
		Objects_Login_Page.UsernameWater(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Username displayed as expected");
		}
		
		Objects_Login_Page.PasswordWater(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Password displayed as expected");
		}
		
		Objects_Login_Page.btn_LoginWater(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Login button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewMainPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 29/06/2017
	* Purpose: This method adds the required responses in the Login page in order to log in to Mobility
	* successfully
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
	public static void addSuccessValuesWater(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful login Procedure
		
		Objects_Login_Page.UsernameWater(driver).click();
		Objects_Login_Page.UsernameWater(driver).sendKeys("Automation2");{
		//Objects_Login_Page.Username(driver).sendKeys("Automation");{
		Log.info(sTestCaseName + " | Username entered");
		}
		Objects_Login_Page.PasswordWater(driver).click();
		Objects_Login_Page.PasswordWater(driver).sendKeys("Aut0m4t1on2");{
		//Objects_Login_Page.Password(driver).sendKeys("Aut0m4t1on");{
		Log.info(sTestCaseName + " | Password entered");
		}
		Objects_Login_Page.btn_LoginWater(driver).click();{
		Log.info(sTestCaseName + " | Login button clicked");
		}
		Thread.sleep(5000);
						
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
//END OF METHODS
}