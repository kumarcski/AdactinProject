package org.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Claass4 {
	
	public static WebDriver driver;
	@FindBy(id = "hotel_name_dis")
	private WebElement hotel_name_dis;

	@FindBy(id = "location_dis")
	private WebElement location_dis;

	@FindBy(id = "room_type_dis")
	private WebElement room_type_dis;

	@FindBy(id = "room_num_dis")
	private WebElement room_num_dis;

	@FindBy(id = "total_days_dis")
	private WebElement total_days_dis;

	@FindBy(id = "price_night_dis")
	private WebElement price_night_dis;

	@FindBy(id = "total_price_dis")
	private WebElement total_price_dis;

	@FindBy(id = "gst_dis")
	private WebElement gst_dis;

	@FindBy(id = "final_price_dis")
	private WebElement final_price_dis;

	@FindBy(id = "first_name")
	private WebElement first_name;

	@FindBy(id = "last_name")
	private WebElement last_name;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cc_num;

	@FindBy(id = "cc_type")
	private WebElement cc_type;

	@FindBy(id = "cc_exp_month")
	private WebElement cc_exp_month;

	@FindBy(id = "cc_exp_year")
	private WebElement cc_exp_year;

	@FindBy(id = "cc_cvv")
	private WebElement cc_cvv;

	@FindBy(id = "book_now")
	private WebElement book_now;

	public Pom_Claass4(WebDriver driver) {
       this.driver=driver;
       PageFactory.initElements(driver,this);
	
	}

	public WebElement getHotel_name_dis() {
		return hotel_name_dis;
	}

	public WebElement getLocation_dis() {
		return location_dis;
	}

	public WebElement getRoom_type_dis() {
		return room_type_dis;
	}

	public WebElement getRoom_num_dis() {
		return room_num_dis;
	}

	public WebElement getTotal_days_dis() {
		return total_days_dis;
	}

	public WebElement getPrice_night_dis() {
		return price_night_dis;
	}

	public WebElement getTotal_price_dis() {
		return total_price_dis;
	}

	public WebElement getGst_dis() {
		return gst_dis;
	}

	public WebElement getFinal_price_dis() {
		return final_price_dis;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}
	

}
