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
* Date: 08/06/2017
* Author: Iain Storrie
* Details: Change URL value to Siemen's Mobility test environment URL,
* update Path_TestData and Path_ScreenShot values
*
*********************************************************************/
public class Constant {

    //public static final String URL = "sl-intranet-int.company-net.com";
	public static final String URL = "https://siemens-og-bykrw4c6spfh7rcf452vdehd-sdg1-test.mbaas1.sdg.feedhenry.com/#/login";
    
    public static final String Path_TestData = "C://Users//z003td0k//My Documents//MobilityAutomation//src//testData//";
    		 
    public static final String File_TestData = "TestData.xlsx";
    
    public static final String Path_ScreenShot = "C://Users//z003td0k//My Documents//MobilityAutomation//MobilityFramework//test-output//screenshots//";
   
	public static final int Col_TestCaseName = 0;	

	public static final int Col_Browser = 1;
	
	public static final int Col_User = 2;
    
}
