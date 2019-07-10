package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjectRepositories.Objects_Meter_Comms_Hub_Serial_Number_Page;
import utility.Log;
import utility.Utils;

public class Methods_Meter_Comms_Hub_Serial_Number{
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Paul Middleton
	* Date: 07/12/2017
	* Purpose: This method checks the main page elements on the Meter Comms Hub Serial Number page 
	* upon initial landing
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
	
		//Check that all of the elements that are expected are displayed
		Objects_Meter_Comms_Hub_Serial_Number_Page.lbl_Comms_Hub_Serial_Number(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Comms Hub Serial Number Label displayed as expected");
		}
		Thread.sleep(2000);
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Comms Hub Serial Number Combo Box displayed as expected");
		}
		Thread.sleep(5000);
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Paul Middleton
	* Date: 07/12/2017
	* Purpose: This method adds the required responses in the Meter Comms Hub Details page
	* in order to force a successful selection of valid Comms Hub
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
		
		//Click on the Asset selection Combo box and select the first option
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver).click();{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Select - Select box clicked");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver).sendKeys(Keys.ARROW_DOWN);
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Select first option - Select box clicked");
		}
		//Define the Combobox element and get the text of the first option and assign to the variable selectedComboValue
		//Select comboBox = new Select(driver.findElement(By.id("cbx_CommHub_sel")));
		Select comboBox = new Select(Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver));
		String selectedComboValue = comboBox.getFirstSelectedOption().getText();{
		Log.info(sTestCaseName + " | Got data of the first option and assigned to variable");
		}
		//Click on the Serial Scan text box and enter in the Serial number assigned to the variable selectedComboValue 
		Objects_Meter_Comms_Hub_Serial_Number_Page.txt_Comms_Hub_Serial_Number(driver).click();{
		Log.info(sTestCaseName + " | Serial Number Box - Text Box clicked");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.txt_Comms_Hub_Serial_Number(driver).sendKeys(selectedComboValue);{
		Log.info(sTestCaseName + " | First Option of Combo Box - Text Entered");
		}	
		//Click on the Label bar to get out of the Text box and move on
		Objects_Meter_Comms_Hub_Serial_Number_Page.lbl_Comms_Hub_Serial_Number(driver).click();{
		Log.info(sTestCaseName + " | Click Away for the Text Box on the Label - Label clicked");
		}
		Thread.sleep(500);
		//Click Next on the Pop Up Dialog Box
		Objects_Meter_Comms_Hub_Serial_Number_Page.btn_Serial_Match_Next(driver).click();{
		Log.info(sTestCaseName + " | Matched Asset Next button clicked");
		}
		Thread.sleep(500);
		//Add correct responses for a successful selection of the Comms Hub Location
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Location(driver).click();{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Location - clicked");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Location(driver).sendKeys("C");
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Location(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Location Selection Entered");
		}	
		//Add correct responses for a successful selection of the Comms Hub Connection Method
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Connection_Method(driver).click();{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Connection_Method - clicked");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Connection_Method(driver).sendKeys("ESME");
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Connection_Method(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Connection_Method Selection Entered");
		}
		//Click the Next Section Button and check the section bar is closed
		Objects_Meter_Comms_Hub_Serial_Number_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.lbl_Comms_Hub_Serial_Number_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Current Meter Details Complete label displayed");
		}

		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
		
//END OF METHODS
}
	
	
	/*	public static void addSuccessValues(WebDriver driver, String sTestCaseName) throws Exception{
			
	
<<<<<<< HEAD
		WebDriverWait wait= new WebDriverWait(driver ,10);
		WebElement element1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='chubInstall_selectAsset']")));
		element1.click();
		element1.sendKeys(Keys.ARROW_DOWN);
		element1.sendKeys(Keys.ENTER);
		
		
		Thread.sleep(2000);
=======
		//Click on the Asset selection Combo box and select the first option
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver).click();{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Select - Select box clicked");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver).sendKeys(Keys.ARROW_DOWN);
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Select first option - Select box clicked");
		}
		//Define the Combobox element and get the text of the first option and assign to the variable selectedComboValue
		//Select comboBox = new Select(driver.findElement(By.id("cbx_CommHub_sel")));
		//Select comboBox = new Select(Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver));
		//String selectedComboValue = comboBox.getFirstSelectedOption().getText();
		String selectedComboOptionValue = Objects_Meter_Comms_Hub_Serial_Number_Page.txt_Comms_CHF_ID(driver); {
		Log.info(sTestCaseName + " | Got data of the first option and assigned to variable");
		}
>>>>>>> bf7b6d1c41ed9e6ebec79609ddf5787700cd98d0
		//Click on the Serial Scan text box and enter in the Serial number assigned to the variable selectedComboValue 
		Objects_Meter_Comms_Hub_Serial_Number_Page.txt_Comms_Hub_Serial_Number(driver).click();{
		Log.info(sTestCaseName + " | Serial Number Box - Text Box clicked");
		}
<<<<<<< HEAD
		Thread.sleep(2000);
		Objects_Meter_Comms_Hub_Serial_Number_Page.txt_Comms_Hub_Serial_Number(driver).sendKeys(Keys.ARROW_DOWN);{
		Objects_Meter_Comms_Hub_Serial_Number_Page.txt_Comms_Hub_Serial_Number(driver).sendKeys(Keys.ENTER);{
=======
		Objects_Meter_Comms_Hub_Serial_Number_Page.txt_Comms_Hub_Serial_Number(driver).sendKeys(selectedComboOptionValue);{
>>>>>>> bf7b6d1c41ed9e6ebec79609ddf5787700cd98d0
		Log.info(sTestCaseName + " | First Option of Combo Box - Text Entered");
		}
		
		//Define the Combobox element and get the text of the first option and assign to the variable selectedComboValue
				Select comboBox = new Select(Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Select(driver));
				String selectedComboValue = comboBox.getFirstSelectedOption().getText();{
				Log.info(sTestCaseName + " | Got data of the first option and assigned to variable");
				
				}
				//Click on the Serial Scan text box and enter in the Serial number assigned to the variable selectedComboValue 
				Objects_Meter_Comms_Hub_Serial_Number_Page.txt_Comms_Hub_Serial_Number(driver).click();{
				Log.info(sTestCaseName + " | Serial Number Box - Text Box clicked");
				}
				String CHSN_value  = selectedComboValue.substring(0,16 );
				Objects_Meter_Comms_Hub_Serial_Number_Page.txt_Comms_Hub_Serial_Number(driver).sendKeys(CHSN_value);{
				Log.info(sTestCaseName + " | First Option of Combo Box - Text Entered");
				}	
		
		
		Thread.sleep(2000);
		//Click on the Label bar to get out of the Text box and move on
		Objects_Meter_Comms_Hub_Serial_Number_Page.lbl_Comms_Hub_Serial_Number(driver).click();{
		Log.info(sTestCaseName + " | Click Away for the Text Box on the Label - Label clicked");
		
		
	/*	//select common hub location code
		WebElement element3= driver.findElement(By.xpath("//select[@id='chubInstall_chubLocationSelect']"));
		element3.click();
		element3.sendKeys("D");
		element3.sendKeys(Keys.ENTER);*/
	//	}
		/*Thread.sleep(500);
		//Click Next on the Pop Up Dialog Box
		Objects_Meter_Comms_Hub_Serial_Number_Page.btn_Serial_Match_Next(driver).click();{
		Log.info(sTestCaseName + " | Matched Asset Next button clicked");
		}
		Thread.sleep(500);
		//Add correct responses for a successful selection of the Comms Hub Location
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Location(driver).click();{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Location - clicked");
		}
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Location(driver).sendKeys("C");
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Location(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Location Selection Entered");
		}		
		//Added by Shiva Pasham
		Thread.sleep(500);
		//Add correct responses for a successful selection of the Comms Hub Location
		Objects_Meter_Comms_Hub_Serial_Number_Page.btn_Aerial_Installed_Yes(driver).click();{
		Log.info(sTestCaseName + " | btn_Aerial_Installed_Yes - clicked");
		}
		//Add correct responses for a successful selection of the Comms Hub Connection Method
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Connection_Method(driver).click();{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Connection_Method - clicked");
		}
		driver.findElement(By.cssSelector("#chubInstall_aerialInstalled_y .outer")).click();
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Connection_Method(driver).sendKeys("ESME");
		Objects_Meter_Comms_Hub_Serial_Number_Page.cbx_Comms_Hub_Connection_Method(driver).sendKeys(Keys.ENTER);{
		Log.info(sTestCaseName + " | cbx_Comms_Hub_Connection_Method Selection Entered");
		driver.findElement(By.id("chubInstall_photoEvidence")).click();
		}
		//Added by Shiva Pasham
		Thread.sleep(500);
		//Add correct responses for a successful selection of the Comms Hub Location
		Objects_Meter_Comms_Hub_Serial_Number_Page.btn_Capture_Photographic_Evidence(driver).click();{
		Log.info(sTestCaseName + " | btn_Capture_Photographic_Evidence - clicked");
		}
		//Click the Next Section Button and check the section bar is closed
		Objects_Meter_Comms_Hub_Serial_Number_Page.btn_Next_Section(driver).click();{
		Log.info(sTestCaseName + " | Scan Asset Now button clicked");

		//Objects_Meter_Comms_Hub_Serial_Number_Page.lbl_Comms_Hub_Serial_Number_Complete(driver).isDisplayed();{
		//Log.info(sTestCaseName + " | Current Meter Details Complete label displayed");
		}

		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
		}
	
}

	
		
//END OF METHODS*/