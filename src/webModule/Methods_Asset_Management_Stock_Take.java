package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Asset_Management_Stock_Take_Page;
import utility.Log;
import utility.Utils;

public class Methods_Asset_Management_Stock_Take{
	
	//Declare variables 
	private static String sElectricityMeterSerialNumber; 
	private static String sGasMeterSerialNumber;
			
	/* **************************************************************************************************
	* Function: getTableValues
	* Author: Iain Storrie
	* Date: 11/07/2017
	* Purpose: This method gets values for all of the associated variables
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
	public static void getTableValues(int iRow) {
		
		sElectricityMeterSerialNumber = Utils.assignStringVariable("E_ASSET_SERIAL_NO", iRow); 
		sGasMeterSerialNumber = Utils.assignStringVariable("G_ASSET_SERIAL_NO", iRow);
				
	//END OF GET TABLE VALUES METHOD
	}
		
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 11/07/2017
	* Purpose: This method checks the main page elements on the Asset Management Van List page
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
		Objects_Asset_Management_Stock_Take_Page.lnk_Stock_Take(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Stock Take link displayed as expected");
		}
		
		Objects_Asset_Management_Stock_Take_Page.txt_Asset_Serial_1(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Asset Serial No 1 textbox displayed as expected");
		}
		
		Objects_Asset_Management_Stock_Take_Page.img_Trash(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Serial Number textbox displayed as expected");
		}
		
		Objects_Asset_Management_Stock_Take_Page.btn_Submit(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Notes textbox displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewMainPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 11/07/2017
	* Purpose: This method adds the required responses in the Asset Management Van List page in order to 
	* successfully add Van Assets
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
	public static void addSuccessValues(WebDriver driver, String sTestCaseName, int iRow) throws Exception{
	
		getTableValues(iRow);
		
		//Add Assets to the van list
		
		Objects_Asset_Management_Stock_Take_Page.txt_Asset_Serial_1(driver).click();
		Objects_Asset_Management_Stock_Take_Page.txt_Asset_Serial_1(driver).sendKeys(sElectricityMeterSerialNumber);
		Objects_Asset_Management_Stock_Take_Page.txt_Asset_Serial_1(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Serial Number 1 entered");
		}
		Objects_Asset_Management_Stock_Take_Page.txt_Asset_Serial_2(driver).click();
		Objects_Asset_Management_Stock_Take_Page.txt_Asset_Serial_2(driver).sendKeys(sGasMeterSerialNumber);
		Objects_Asset_Management_Stock_Take_Page.txt_Asset_Serial_2(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | Serial Number 2 entered");
		}
		Objects_Asset_Management_Stock_Take_Page.btn_Submit(driver).click();{
		Log.info(sTestCaseName + " | Submit button clicked");
		}
		Thread.sleep(1000);
		Objects_Asset_Management_Stock_Take_Page.btn_OK(driver).click();{
		Log.info(sTestCaseName + " | OK button clicked");
		}
		Thread.sleep(1000);
		Objects_Asset_Management_Stock_Take_Page.btn_Stock_Take_OK(driver).click();{
		Log.info(sTestCaseName + " | Stock Take OK button clicked");
		}
								
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
//END OF METHODS
}