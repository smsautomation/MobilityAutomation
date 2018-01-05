/* *******************************************************************
* Test Case Name: Asset_Management_Stock_Take_Chrome
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
//Add for Grid session
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utility.*;
import webModule.*;
import pageObjectRepositories.Objects_Login_Page;
import pageObjectRepositories.Objects_Appointments_List_Page;
import pageObjectRepositories.Objects_Asset_Management_Van_List_Page;
import pageObjectRepositories.Objects_Asset_Management_Stock_Take_Page;



public class Asset_Management_Stock_Take_Chrome {

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
	
	    sTestCaseName = this.toString();
	
	    sTestCaseName = Utils.getTestCaseName(this.toString());
	
	    Log.startTestCase(sTestCaseName);
	
	    ExcelUtils.setExcelFile(Constant.Path_TestData + "Mobility_Automation_Test_Data" + ".xlsm","Data");
	
	    iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_Test_Case_Name);
	
	    driver = Utils.openBrowser(iTestCaseRow);
	    //Add for Grid session
	    //driver = (RemoteWebDriver) Utils.openGridBrowser(iTestCaseRow);
	    
		//Verify that we are on the correct page
	    Thread.sleep(2000);
	    Objects_Login_Page.btn_Login(driver).isDisplayed();
	    Log.info("Login button displayed");
			    
	}
	
	//Run the test
	@Test
	public void main() throws Exception {
			
		Methods_Login.viewPage(driver, sTestCaseName);
		
		Methods_Login.addSuccessValues(driver, sTestCaseName);
		
		Methods_Appointments_List.viewPage(driver, sTestCaseName);
		
		Objects_Appointments_List_Page.btn_Asset_Management(driver).click();
		
		//Verify that we are on the Asset Management Van List page
		Objects_Asset_Management_Van_List_Page.lnk_Van_List(driver).isDisplayed();
		Log.info("Asset Management Van List page displayed as expected");	
		
		//Click the Stock Take link to move to the Stock Take page
		Objects_Asset_Management_Stock_Take_Page.lnk_Stock_Take(driver).click();
		Log.info("Asset Management Stock Take page displayed as expected");
		
		//Verify Initial page elements displayed
		Methods_Asset_Management_Stock_Take.viewPage(driver, sTestCaseName);
		
		//Invoke Method to add assets in Stock Take 
		Methods_Asset_Management_Stock_Take.addSuccessValues(driver, sTestCaseName, 139);
		
		Log.info("<<<<<<<<<<Completed By Paul Middleton>>>>>>>>>>Asset_Management_Stock_Take_Chrome");
		
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

