package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Asset_Management_Van_List_Page;
import utility.Log;
import utility.Utils;

public class Methods_Asset_Management_Van_List{
	
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
		Objects_Asset_Management_Van_List_Page.lnk_Van_List(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Van List link displayed as expected");
		}
		
		Objects_Asset_Management_Van_List_Page.btn_Add_Van_Asset(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Add Van Asset button displayed as expected");
		}
		
		Objects_Asset_Management_Van_List_Page.txt_Serial_Number(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Serial Number textbox displayed as expected");
		}
		
		Objects_Asset_Management_Van_List_Page.txt_Notes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Notes textbox displayed as expected");
		}
		
		Objects_Asset_Management_Van_List_Page.btn_Add_Asset(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Add Asset button displayed as expected");
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
		
		Objects_Asset_Management_Van_List_Page.txt_Serial_Number(driver).click();
		Objects_Asset_Management_Van_List_Page.txt_Serial_Number(driver).sendKeys(sElectricityMeterSerialNumber);{
		Log.info(sTestCaseName + " | Serial Number entered");
		}
		Objects_Asset_Management_Van_List_Page.txt_Notes(driver).click();
		Objects_Asset_Management_Van_List_Page.txt_Notes(driver).sendKeys("Electricity Meter");{
		Log.info(sTestCaseName + " | Notes entered");
		}
		Objects_Asset_Management_Van_List_Page.btn_Add_Asset(driver).click();{
		Log.info(sTestCaseName + " | Add Asset button clicked");
		}
		Objects_Asset_Management_Van_List_Page.btn_OK(driver).click();{
		Log.info(sTestCaseName + " | OK button clicked");
		}
		
		Objects_Asset_Management_Van_List_Page.txt_Serial_Number(driver).click();
		Objects_Asset_Management_Van_List_Page.txt_Serial_Number(driver).sendKeys(sGasMeterSerialNumber);{
		Log.info(sTestCaseName + " | Serial Number entered");
		}
		Objects_Asset_Management_Van_List_Page.txt_Notes(driver).click();
		Objects_Asset_Management_Van_List_Page.txt_Notes(driver).sendKeys("Gas Meter");{
		Log.info(sTestCaseName + " | Notes entered");
		}
		Objects_Asset_Management_Van_List_Page.btn_Add_Asset(driver).click();{
		Log.info(sTestCaseName + " | Add Asset button clicked");
		}
		Objects_Asset_Management_Van_List_Page.btn_OK(driver).click();{
		Log.info(sTestCaseName + " | OK button clicked");
		}
		
								
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
//END OF METHODS
}