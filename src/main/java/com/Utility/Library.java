package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	public static ExtentTest test;
	public static void custom_sendkeys(WebElement element,String value,String fieldname) {
		try {
			if(element.isEnabled()==true) {
		element.sendKeys(value);
		test.log(Status.PASS, fieldname+"<==Value Succesfully Send==>"+value);
		
	}
		}catch(Exception e) {
		test.log(Status.FAIL, "Unable to send value==>"+e);
		}
	}
	public static void custom_click(WebElement element,String fieldname) {
		try {
			if(element.isDisplayed()&& element.isEnabled()) {
		element.click();
		test.log(Status.PASS,"click succesfully==>"+ fieldname );
		System.out.println("");
			}
		}catch(Exception e) {
			test.log(Status.FAIL, "Unable to click"+e);
		}
		
	}
	
		
	}

