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


public class AA_Logon_Water {
	
	//Declare our test variables
	public WebDriver driver;	
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
	    driver = Utils.openBrowserWater(iTestCaseRow);
	    
	    //Verify that we are on the correct page
	    Thread.sleep(2000);
	    Objects_Login_Page.btn_LoginWater(driver).isDisplayed();
	    Log.info("Login button displayed");
		
	}	
	
	//Run the test
	@Test
	public void main() throws Exception {
			
		Methods_LoginWater.viewPageWater(driver, sTestCaseName);
		Methods_LoginWater.addSuccessValuesWater(driver, sTestCaseName);
		
		Log.info("Test Water 1 <<<<<<<<<<Completed By Paul Middleton>>>>>>>>>>AA_Logon_Water");
		
	}
	//Log out
	
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	    
	
	}
	
}