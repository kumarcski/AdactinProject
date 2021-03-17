package com.configuration.reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigurationReader {
	public static WebDriver driver;
	public static Properties p;
	public ConfigurationReader() throws Throwable {
		File f=new File("C:\\Users\\vickey kumar\\eclipse-workspace\\project_basics\\src\\main\\java\\com\\adactin\\properties\\Configuration.properties");
		
	FileInputStream fis=new FileInputStream(f);
	 p=new Properties();
	 p.load(fis);
	 
	 
	
	
		
	}
	
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
         return browser;  
	}
	
	public String getUrl() {
String url = p.getProperty("url");
	return url;
	
	}
	
	public String getUsername() {
   String username = p.getProperty("username");
   return username;
	}
	
	public String getPassword() {
      String password = p.getProperty("password");
      return password;
      
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
