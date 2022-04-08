package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")private WebElement Email;

	@FindBy(xpath="//input[@id='pass']")private WebElement Pass;
	
	@FindBy(xpath="//button[@type='submit']")private WebElement Login;
	
	//Declaring constructor
	
     public LoginPom() {
	
	  PageFactory.initElements(driver, this);
	
    }
//Method Declaration
     
    public WebElement getEmail() {
	   return Email;
  }

    public WebElement getPass() {
	    return Pass;
 }

    public WebElement getLogin() {
	   return Login;
}



	
}
