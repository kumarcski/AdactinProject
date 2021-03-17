package org.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class2 {
	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement room_type;

	@FindBy(id = "room_nos")
	private WebElement room_nos;

	@FindBy(id = "datepick_in")
	private WebElement date;

	@FindBy(id = "datepick_out")
	private WebElement odate;

	@FindBy(id = "adult_room")
	private WebElement adult_room;

	@FindBy(id = "child_room")
	private WebElement child_room;

	@FindBy(id = "Submit")
	private WebElement Submit;

	public Pom_Class2(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getOdate() {
		return odate;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return Submit;
	}

}
