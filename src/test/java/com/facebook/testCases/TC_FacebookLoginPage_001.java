package com.facebook.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.facbook.pageObjects.FacebookLoginPage;

public class TC_FacebookLoginPage_001 extends FacebookBaseClass {
	
	@Test
	public void verifyFacbookLoginPageFunctionality() throws IOException
	
	{
		
		FacebookLoginPage lp = new FacebookLoginPage(driver);
				lp.verifyFacebookUsername(Username);
				logger.info("Facebook username entered..");
		        lp.VerifyFacebookPassword(Password);
				logger.info("Facbook password entered..");
				lp.verifyFacbookLoginButton();
				logger.info("Clicked Login Button..");
				
				
				
		if(driver.getTitle().contains("Facebook"))
		{
			Assert.assertTrue(true);
			logger.info("Title Verified Successfully.....");
			
		}
		else
		{
			captureScreen(driver,"FacebookLoginPage");
			Assert.assertTrue(false);
		}

		        
		
	}

}
