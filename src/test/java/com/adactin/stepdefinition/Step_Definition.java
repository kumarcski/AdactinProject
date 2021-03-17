package com.adactin.stepdefinition;

import org.base.com.Base_Class;
import org.openqa.selenium.WebDriver;
import org.pom.com.Pom_Claass4;
import org.pom.com.Pom_Class;
import org.pom.com.Pom_Class2;
import org.pom.com.Pom_Class3;
import org.pom.com.Pom_Class5;
import org.project_manager.com.Project_Object_Manager;

import com.adactin.runner.Runner;
import com.configuration.reader.FileReaderManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	
	public static WebDriver driver=Runner.driver;
	Pom_Class5 p5=new Pom_Class5(driver);
	Project_Object_Manager pom=new Project_Object_Manager(driver);
	
	

@Given("^user Launch The Application$")
public void user_Launch_The_Application() throws Throwable {
	String url = FileReaderManager.getInstance().getInstanceCr().getUrl();
	get_Url(url);

  
}

@When("^user Enter The Username In Username Field$")
public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	String username = FileReaderManager.getInstance().getInstanceCr().getUsername();
	
	inputvalueElement(pom.getInstanceLogin().getUser_name(),username);

}

@When("^user Enter The Password In Password Field$")
public void user_Enter_The_Password_In_Password_Field() throws Throwable {
	String password = FileReaderManager.getInstance().getInstanceCr().getPassword();
    inputvalueElement(pom.getInstanceLogin().getPassword(),password);
}

@Then("^user Click On The Login Button And It Navigate To The Search Hotel Page$")
public void user_Click_On_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page() throws Throwable {
    clickonElement(pom.getInstanceLogin().getLogin_btn());
}

@When("^user Select The Location In Locatiion Field$")
public void user_Select_The_Location_In_Locatiion_Field() throws Throwable {
	dropDown(pom.getInstancehotel().getLocation(),"select",2);
  
}

@When("^user Select The Hotel Location In Location Field$")
public void user_Select_The_Hotel_Location_In_Location_Field() throws Throwable {
   dropDown(pom.getInstancehotel().getHotels(),"select", 2);
}

@When("^user Select The Room Type In Room Field$")
public void user_Select_The_Room_Type_In_Room_Field() throws Throwable {
	
  dropDown(pom.getInstancehotel().getRoom_type(),"select",2);
}

@When("^user Select The Rooms In Number Of Room Field$")
public void user_Select_The_Rooms_In_Number_Of_Room_Field() throws Throwable {
	dropDown(pom.getInstancehotel().getRoom_nos(),"select",3);
   
}

@When("^user Select The Check In Date In Check In Date Field$")
public void user_Select_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
inputvalueElement(pom.getInstancehotel().getDate(),"14/03/2021");
}

@When("^user Select The Check Out Date In Check Out Date Field$")
public void user_Select_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
  inputvalueElement(pom.getInstancehotel().getOdate(),"15/03/2021");
}

@When("^user Select The Adult Per Room In Adult Per Room Field$")
public void user_Select_The_Adult_Per_Room_In_Adult_Per_Room_Field() throws Throwable {
dropDown(pom.getInstancehotel().getAdult_room(),"select", 1);
}

@When("^user Select The Children Per Room In Children Per Room Field$")
public void user_Select_The_Children_Per_Room_In_Children_Per_Room_Field() throws Throwable {
 dropDown(pom.getInstancehotel().getChild_room(),"select",1);
}

@Then("^user Click On The Search Button And It Navigate To The Select Home Page$")
public void user_Click_On_The_Search_Button_And_It_Navigate_To_The_Select_Home_Page() throws Throwable {
  clickonElement(pom.getInstancehotel().getSubmit());
}

@When("^user Select The Hotel In Hotel Field$")
public void user_Select_The_Hotel_In_Hotel_Field() throws Throwable {
	clickonElement(pom.getInstanceSearch().getRadio());
   
}

@Then("^user Click On The Continue Button And It Navigate To Book A Hotel Page$")
public void user_Click_On_The_Continue_Button_And_It_Navigate_To_Book_A_Hotel_Page() throws Throwable {
   clickonElement(pom.getInstanceSearch().getBtn());
}

@When("^user Enter The First Name In First Name Field$")
public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
inputvalueElement(pom.getInstanceBook().getFirst_name(),"kumar");
}

@When("^user Enter The Last Name In Last Name Field$")
public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
	
	inputvalueElement(pom.getInstanceBook().getLast_name(),"csk");
}

@When("^user Enter The Billing Adress In Billing Adress Field$")
public void user_Enter_The_Billing_Adress_In_Billing_Adress_Field() throws Throwable {
 inputvalueElement(pom.getInstanceBook().getAddress(), "chennai");
}

@When("^user Enter The Card No In Card No Field$")
public void user_Enter_The_Card_No_In_Card_No_Field() throws Throwable {
	inputvalueElement(pom.getInstanceBook().getCc_num(), "1234567890123456");

}

@When("^user Select The Credit Card Type In Credit Card Type Field$")
public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
   dropDown(pom.getInstanceBook().getCc_type(),"select", 2);
}

@When("^user Select The Expiry Date In Expiry Date Field$")
public void user_Select_The_Expiry_Date_In_Expiry_Date_Field() throws Throwable {
 dropDown(pom.getInstanceBook().getCc_exp_month(),"select",2);
}

@When("^user Select The Year In Year Field$")
public void user_Select_The_Year_In_Year_Field() throws Throwable {
	dropDown(pom.getInstanceBook().getCc_exp_year(),"select",3);
  
}

@When("^user Enter The Cvv Number In Cvv Number Field$")
public void user_Enter_The_Cvv_Number_In_Cvv_Number_Field() throws Throwable {
  inputvalueElement(pom.getInstanceBook().getCc_cvv(),"1234");
}

@Then("^user Click On The Book Now Button$")
public void user_Click_On_The_Book_Now_Button() throws Throwable {
	clickonElement(pom.getInstanceBook().getBook_now());

}

@Then("^user Click On The Ittenary Button$")
public void user_Click_On_The_Ittenary_Button() throws Throwable {
	clickonElement(p5.getClick1());

}




}
