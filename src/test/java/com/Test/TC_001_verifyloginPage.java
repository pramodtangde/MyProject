package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class TC_001_verifyloginPage extends BaseClass {

	@Test
	public void VerifyFBLogin()  {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_sendkeys(login.getEmail(),excel.getStringData("Sheet1", 0, 0), "Email");
		Library.custom_sendkeys(login.getPass(),excel.getStringData("Sheet1", 0, 1), "Pass");
	    Library.custom_click(login.getLogin(),"login");
		
		
			
	}
	
	
	
	
	
}
