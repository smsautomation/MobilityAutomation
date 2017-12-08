/* 
* LIST OF METHODS CONTAINED IN THIS CLASS
* 
* URL
* Path_TestData
* File_TestData
* Path_ScreenShot
* Col_TestCaseName
* Col_UserName
* Col_Password
* Col_Browser
* 
*/

package utility;

/* *******************************************************************
* Author: Rory Cruickshank
* Date: 30/03/2016
* Function: Constant
* Purpose: This method holds the constants which will be used for a test suite
* Arguments: 
* 			
* Returns: 
**********************************************************************
* Change Log:
* 
* Date: 09/06/2017
* Author: Iain Storrie
* Details: Change URL value to Siemen's Mobility test environment URL,
* update Path_TestData and Path_ScreenShot values
*
*********************************************************************/
public class Constant {

    //public static final String URL = "siemens-og-bykrw4fz56yr6nyvlskmwpwq-sdg1-test.mbaas1.sdg.feedhenry.com/#/login";
	public static final String URL = "siemens-og-bykrw4fz56yr6nyvlskmwpwq-sdg1-test.mbaas1.sdg.feedhenry.com/#/login";
	public static final String URLWaypoint = "https://gbwonw9bp73.sml.siemens.co.uk";
    public static final String Path_TestData = "C://MobilityAutomation//src//testData//";    		 
    public static final String File_TestData = "Mobility_Automation_Test_Data.xlsm";    
    public static final String Path_ScreenShot = "C://MobilityAutomation//MobilityFramework//test-output//screenshots//";   
	public static final int Col_Test_Case_Name = 0;	
	public static final int Col_Browser = 1;
	//public static final int Col_User = 2;
	
}
