package org.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class3 {
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radio;
	
	@FindBy(id = "continue")
	private WebElement con;

	public Pom_Class3(WebDriver driver) {

	this.driver =driver;
	PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getBtn() {
		return con;
	}

	
}
