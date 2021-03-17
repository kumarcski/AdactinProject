package org.project_manager.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.pom.com.Pom_Claass4;
import org.pom.com.Pom_Class;
import org.pom.com.Pom_Class2;
import org.pom.com.Pom_Class3;
import org.pom.com.Pom_Class5;


public class Project_Object_Manager {
	public  WebDriver driver;
	 private Pom_Class login;
	 private Pom_Class2 hotel;
	 private  Pom_Class3 search;
	 private Pom_Claass4 book;
     private Pom_Class5 hittery;
	 
	 
	
	 
	 public  Project_Object_Manager(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}

	public Pom_Class getInstanceLogin() {
 login=new Pom_Class(driver);
 return login;
	}
	 
	 public Pom_Class2 getInstancehotel() {
		 hotel=new Pom_Class2(driver);
		 return hotel;

	}
	 public Pom_Class3 getInstanceSearch() {
		 search=new Pom_Class3(driver);
		 return search;

	}
	 public Pom_Claass4 getInstanceBook() {
book=new  Pom_Claass4(driver);
return book;
	}

	 
	 
	
	 
	 
	 

}
