package org.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class5 {
	public static WebDriver driver;
	@FindBy(xpath ="(//input[@type='button'])[2]")
	private WebElement click1;

	

	public Pom_Class5(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getClick1() {
		return click1;
	}

}
