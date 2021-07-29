package com.facebook.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Facebook_ReadConfig {
	
	Properties pro;
	
	public Facebook_ReadConfig() {
		
		File src = new File("./Configuration/FaceBook_Config.properties");
		try {
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch(Exception e){
			System.out.println("Exception is" + e.getMessage());
		}
		
		
		
	}
	
	//Accessing properties file elements
	public String GetApplicationUrl() 
	{
		String url = pro.getProperty("baseUrl");
		return url;
	}
	public String GetFacebookUserName() 
	{
		String uname = pro.getProperty("username");
		return uname;
	
	}
	public String GetFacebookUserPassword() 
	{
		String pswrd = pro.getProperty("password");
		return pswrd;
	
	}
	public String GetChromePath() 
	{
		String Cpath = pro.getProperty("ChromePath");
		return Cpath;
	
	}
	public String GetFirefoxPath() 
	{
		String fboxpath = pro.getProperty("firefox");
		return fboxpath;
	
	}
	public String GetIEpath() 
	{
		String IEpath = pro.getProperty("IEPAth");
		return IEpath;
	
	}
	

}
