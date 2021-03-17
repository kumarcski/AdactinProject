package org.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class {
	public static WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement user_name;
	
	@FindBy(id = "password")
	private WebElement password;
	

	@FindBy(id = "login")
	private WebElement login_btn;


	public Pom_Class(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getUser_name() {
		return user_name;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin_btn() {
		return login_btn;
	}

	
	
	
}
