package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Water_Login;
import utility.Log;
import utility.Utils;

public class Methods_Water_Login{
	/* --------------------------------------------------------------------------------------------------
	-- Function: viewPage
	-- Author: Greg Bliss
	-- Date: 08/11/2017
	-- Purpose: This method checks the main page elements on the Login page
	-- Arguments: 
	-- 
	-- Returns: 
	-----------------------------------------------------------------------------------------------------
	-- Change Log:
	--
	-- Date:
	-- Author: 
	-- Details:
	----------------------------------------------------------------------------------------------------- */	
	public static void viewPage(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements of that are expected are displayed
		Objects_Water_Login.Username(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Username displayed as expected");
		}
		
		Objects_Water_Login.Password(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Password displayed as expected");
		}
		
		Objects_Water_Login.btn_Login(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Login button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewMainPage");
	
	}	//END OF VIEW PAGE METHOD
	
	
	/* --------------------------------------------------------------------------------------------------
	-- Function: viewPage
	-- Author: Greg Bliss
	-- Date: 08/11/2017
	-- Purpose: This method adds the required responses in the Login page in order to log in to Mobility
	-- successfully
	-- Arguments: 
	-- 
	-- Returns: 
	-----------------------------------------------------------------------------------------------------
	-- Change Log:
	--
	-- Date:
	-- Author: 
	-- Details:
	----------------------------------------------------------------------------------------------------- */
	public static void addSuccessValues(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful login Procedure
		Objects_Water_Login.Username(driver).click();
		Objects_Water_Login.Username(driver).sendKeys("Automation2");{
		Log.info(sTestCaseName + " | Username entered");
		}
		Objects_Water_Login.Password(driver).click();
		Objects_Water_Login.Password(driver).sendKeys("Aut0m4t1on2");{
		Log.info(sTestCaseName + " | Password entered");
		}
		Objects_Water_Login.btn_Login(driver).click();{
		Log.info(sTestCaseName + " | Login button clicked");
		}
		Thread.sleep(5000);
						
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
			
	}	//END OF ADD SUCCESS VALUES METHOD
}	//END OF METHODS