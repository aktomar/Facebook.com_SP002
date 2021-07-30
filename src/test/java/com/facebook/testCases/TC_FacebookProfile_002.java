package com.facebook.testCases;

import org.testng.annotations.Test;

import com.facbook.pageObjects.FacebookLoginPage;
import com.facbook.pageObjects.SetFacebookProfilePicture;

public class TC_FacebookProfile_002 extends FacebookBaseClass{
	
	@Test
	public void verifyFacebookProfilePicture () throws InterruptedException 
	{
		
		FacebookLoginPage lp = new FacebookLoginPage(driver);
		lp.verifyFacebookUsername(Username);
		logger.info("Facebook username entered..");
        lp.VerifyFacebookPassword(Password);
		logger.info("Facbook password entered..");
		lp.verifyFacbookLoginButton();
		logger.info("Clicked Login Button..");
		Thread.sleep(2000);
		
		
		SetFacebookProfilePicture sp = new SetFacebookProfilePicture(driver);
		sp.ClickonProfileName();
		Thread.sleep(5000);
		logger.info("Clicked on profile Name..");
		
		
	}

}
