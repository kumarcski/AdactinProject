package com.adactin.runner;

import org.base.com.Base_Class;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.configuration.reader.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src//test//java//com//adactin//feature",glue = "com.adactin.stepdefinition")
	public class Runner {
		public static WebDriver driver;
		@BeforeClass
		public static void setUp() throws Throwable {
			String browser = FileReaderManager.getInstance().getInstanceCr().getBrowser();
			driver=Base_Class.bLaunch(browser);
			
		}
		@AfterClass
		public static void tearDown() {
         Base_Class.close();
		}
		
		
		
		
		
		
		
}
