package com.facebook.testCases;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.facebook.utilities.Facebook_ReadConfig;

public class FacebookBaseClass {
	
	//Getting date from ReadConfig and properties file...
	
	
	Facebook_ReadConfig rc = new Facebook_ReadConfig();
	public String ApplicationURL = rc.GetApplicationUrl();
	public String Username = rc.GetFacebookUserName();
	public String Password = rc.GetFacebookUserPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) 
	{
		
		logger = Logger.getLogger(FacebookBaseClass.class);
		PropertyConfigurator.configure("D:\\Automation\\iNetBanking\\log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",rc.GetChromePath());
			driver = new ChromeDriver();
			logger.info("Lunching Chrome Browser....");
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",rc.GetFirefoxPath());
			driver = new FirefoxDriver();
			logger.info("Lunching Firefox Browser....");
		}
		else if(br.equals("IE")){
			System.setProperty("webdriver.ie.driver",rc.GetIEpath());
			driver = new InternetExplorerDriver();
			logger.info("Lunching InternetExplorer Browser....");
		}
		driver.manage().window().maximize();
		logger.info("Maximizing Browser....");

		driver.get(ApplicationURL);
		logger.info("Opening Application URL....");

		
	}
	
	@AfterClass
	public void teardown() 
	{
		driver.quit();
		logger.info("Closing Browser....");

	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");

}
}
