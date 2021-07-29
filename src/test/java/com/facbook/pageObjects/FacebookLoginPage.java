package com.facbook.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	
	
	WebDriver ldriver;
	
	public FacebookLoginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(name="email")
	@CacheLookup
	WebElement user;
	
	@FindBy(name="pass")
	@CacheLookup
	WebElement pswd;
	
	@FindBy(name="login")
	@CacheLookup
	WebElement lgn;
	
	public void verifyFacebookUsername(String username) 
	{
		user.sendKeys(username);
	}
	public void VerifyFacebookPassword(String password)
	{
		pswd.sendKeys(password);
	}
	public void verifyFacbookLoginButton() 
	{
		lgn.click();
	}

}
