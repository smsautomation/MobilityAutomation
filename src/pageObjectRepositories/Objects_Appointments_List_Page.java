package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 31/05/2017
* Function: Objects_Appointments_List_Page
* Purpose: This class contains all of the elements on the Appointments List page
* Arguments: 
* 			
* Returns: 
**********************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
*********************************************************************/

public class Objects_Appointments_List_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Appointments_List_Page";

    public static WebElement btn_Logout(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.className("logout-icon"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Logout not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Force_Sync(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/siemensheader/div[1]/div/div[3]/div[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Force_Sync not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement btn_Asset_Management (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.className("menu-open-button"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Asset_Management not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement hdr_First_Appointment (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[1]/div/div[1]/div/div[2]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | hdr_First_Appointment not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_First_Appointment_Description (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[1]/div/div[2]/div[1]/div[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_First_Appointment_Description not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_First_Appointment_Status (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[1]/div/div[2]/div[2]/div[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_First_Appointment_Status not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_First_Appointment_Supplier (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[1]/div/div[2]/div[3]/div[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_First_Appointment_Supplier not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_First_Appointment_Name (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[1]/div/div[2]/div[4]/div[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_First_Appointment_Name not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_First_Appointment_Contact (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[1]/div/div[2]/div[5]/div[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_First_Appointment_Contact not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_First_Appointment_Address (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[1]/div/div[2]/div[6]/div[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_First_Appointment_Address not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_First_Appointment_Postcode (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[1]/div/div[2]/div[7]/div[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_First_Appointment_Postcode not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lbl_First_Appointment_DateTime (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[1]/div/div[2]/div[8]/div[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_First_Appointment_DateTime not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_First_Appointment_Select (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[1]/div/div[1]/div/div[1]/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_First_Appointment_Select not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Second_Appointment_Select (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[2]/div/div[1]/div/div[1]/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Second_Appointment_Select not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Third_Appointment_Select (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[3]/div/div[1]/div/div[1]/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Third_Appointment_Select not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Fourth_Appointment_Select (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[4]/div/div[1]/div/div[1]/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Fourth_Appointment_Select not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Fifth_Appointment_Select (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[5]/div/div[1]/div/div[1]/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Fifth_Appointment_Select not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Sixth_Appointment_Select (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[6]/div/div[1]/div/div[1]/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Sixth_Appointment_Select not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Seventh_Appointment_Select (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[7]/div/div[1]/div/div[1]/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Seventh_Appointment_Select not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Eighth_Appointment_Select (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[8]/div/div[1]/div/div[1]/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Eighth_Appointment_Select not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Ninth_Appointment_Select (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[9]/div/div[1]/div/div[1]/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Ninth_Appointment_Select not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Tenth_Appointment_Select (WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem[10]/div/div[1]/div/div[1]/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Tenth_Appointment_Select not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
//END OF METHODS	    
}
