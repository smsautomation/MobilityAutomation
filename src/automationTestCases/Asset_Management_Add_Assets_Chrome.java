/* *******************************************************************
* Test Case Name: Asset_Management_Add_Assets_Chrome
* Author: Iain Storrie
* Date: 11/07/2017
* Purpose: This test ensures that a user can add assets using the Asset
* Management functionality on the Chrome browser 
*
**********************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
*********************************************************************/

package automationTestCases;


import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//Add for Grid session
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import pageObjectRepositories.Objects_Appointments_List_Page;
import pageObjectRepositories.Objects_Asset_Management_Van_List_Page;
import pageObjectRepositories.Objects_Login_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
import webModule.Methods_Appointments_List;
import webModule.Methods_Asset_Management_Van_List;
import webModule.Methods_Login;



public class Asset_Management_Add_Assets_Chrome {

	//Declare our test variables
	public WebDriver driver;
	//Add for Grid session
	//public RemoteWebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
	//Get data and open the browser
	@BeforeMethod
	public void beforeMethod() throws Exception {
	
		DOMConfigurator.configure("log4j.xml");
	
	    sTestCaseName = this.toString().trim();
	
	    sTestCaseName = Utils.getTestCaseName(this.toString().trim());
	
	    Log.startTestCase(sTestCaseName);
	    System.out.println("//////////////////GET :" + sTestCaseName );
	    System.out.println("/////////////////TEST CASES STARTED//////////////////////");
	   
	
	  // ExcelUtils.setExcelFile(Constant.Path_TestData + "Mobility_Automation_Test_Data" + ".xlsm","Data");
	   ExcelUtils.setExcelFile(Constant.Path_TestData +  Constant.File_TestData,"Data");
	
	    iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_Test_Case_Name);
	
	    driver = Utils.openBrowser(iTestCaseRow);
	    
	    System.out.println("//////////////////OPEN BROWSER/////////////////////////"  );
	    
	    
	    //Add for Grid session
	    //driver = (RemoteWebDriver) Utils.openGridBrowser(iTestCaseRow);
	    
	    
	    System.out.println("//////////////////LOG IN BUTTON DISPLAYED//////////////"  );		    
	  // Verify that we are on the correct page
	    Thread.sleep(2000);
	    System.out.println("driver =" + driver);
	    Objects_Login_Page.btn_Login(driver).isDisplayed();
	    Log.info("Login button displayed");
				    
		}
		
		

		//Run the test
		@Test
		public void main() throws Exception {
				
		Methods_Login.viewPage(driver, sTestCaseName);
		 System.out.println("/////////////////////////////////VIEW PAGE //LOGIN DIASPLAYED////////" );
			
		Methods_Login.addSuccessValues(driver, sTestCaseName);
		 System.out.println("//////////////////////////////////////////ADD SUCCESSFUL /// LOGIN COMPLETED//" );
		   
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		Methods_Appointments_List.viewPage(driver, sTestCaseName);
		 System.out.println("/////////////////////////////////////////APPOINTMENT LINK ELEMENTS DISPLAYED/////////" );
			
		Objects_Appointments_List_Page.btn_Asset_Management(driver).click();
			
		//Verify that we are on the Asset Management Van List page
		Objects_Asset_Management_Van_List_Page.lnk_Van_List(driver).isDisplayed();
		Log.info("Asset Management Van List page displayed as expected");	
			
		//Verify Initial page elements displayed
		Methods_Asset_Management_Van_List.viewPage(driver, sTestCaseName);
		
		 System.out.println("///////////////////////////////////////// the Asset Management Van List page/////////////////////////////////////////////////////////////////" );
			
		//Invoke Method to add assets to van 
		Methods_Asset_Management_Van_List.addSuccessValues(driver, sTestCaseName, 137);
		 System.out.println("////////////////////////////////////////TESCASES ABOUT TO END /////////////////////////////////////////////////////////////////" );
		 
		
		Log.info("Test Asset 1 <<<<<<<<<<Completed By Paul Middleton>>>>>>>>>>Asset_Management_Add_Assets_Chrome");
		
}
		
	//Log out
	@AfterMethod
	public void afterMethod() {
		 System.out.println("////////////////ABOUT TO LOG OUT///////////////" );
	    driver.quit();
	    System.out.println("////////////////////////////////////////LOG OUT/////////////////////////////////////////////////////////////////" );
		    
	    Log.endTestCase(sTestCaseName);  
	   
		
	}
}

