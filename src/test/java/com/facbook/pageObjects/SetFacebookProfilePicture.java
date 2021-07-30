package com.facbook.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class SetFacebookProfilePicture {
	
	WebDriver ldriver;
	
	
	    public SetFacebookProfilePicture(WebDriver rdriver) {
	    	
	    	ldriver = rdriver;
	    	PageFactory.initElements(rdriver,this);
		
	}
	    
	    
	    @FindBy(how=How.XPATH,using="//*[text()='Akshay']")
	    @CacheLookup
	    WebElement name;
	    
	    
	    public void ClickonProfileName() 
	    {
	     name.click();
	    }
}
	    

