package org.base.com;

	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Base_Class {
	
		public static WebDriver driver;
		public static WebDriver bLaunch(String browser) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe" );
				driver = new ChromeDriver();
			
				driver.manage().window().maximize();
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
			}
			return driver;
			
		}
		
		public static void get_Url(String url) {
			
			driver.get(url);

		}
		
		
		
		
		
		public static void dropDown(WebElement element,String type,int value) {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("select")) {
				s.selectByIndex(value);	
			}
			else if (type.equalsIgnoreCase("getoptions")) {
				System.out.println("***LIST OF OPTIONS***");
				List<WebElement> options = s.getOptions();
				
				for (WebElement goptions : options) {
					String text = goptions.getText();
					System.out.println(text);	
				}
			}
			else if (type.equalsIgnoreCase("multiple")) {
				boolean multiple = s.isMultiple();
				System.out.println(multiple);
			}
			else if (type.equalsIgnoreCase("multiple select")) {
				for (int i = 0; i < 8; i++) {
					if (i==value) {
						s.selectByIndex(i);
						System.out.println(i);
					}	
				}
			}
			else if (type.equalsIgnoreCase("first selected")) {
				System.out.println("***FIRST SELECTED***");
				WebElement first = s.getFirstSelectedOption();
				String text = first.getText();
				System.out.println(text);
			}
			else if (type.equalsIgnoreCase("all selected")) {
				System.out.println("***SELECTED***");
				List<WebElement> allSelected = s.getAllSelectedOptions();
				for (WebElement selected : allSelected) {
					String text = selected.getText();
					System.out.println(text);
				}
			}
		}
		public static void clickonElement(WebElement element) {
			element.click();
		}
		public static void ac(WebElement element,String type) {
			if (type.equalsIgnoreCase("move")) {
				Actions a = new Actions(driver);
				a.moveToElement(element).build().perform();
			}
				else if (type.equalsIgnoreCase("right click")) {
					Actions ac = new Actions(driver);
					ac.contextClick(element).build().perform();
			}
		}
		public static void timeout(int s) {
			driver.manage().timeouts().pageLoadTimeout(s, TimeUnit.SECONDS);
		}
		public static void frame(WebElement element) {
			driver.switchTo().frame(element);
		}
		public static void inputvalueElement(WebElement element,String value) {
			element.sendKeys(value);
		}
		public static void close() {
			driver.close();
		}
		public static void quit() {
			driver.quit();
		}
		public static void to(String url) {
			driver.navigate().to(url);
		}
		public static void back() {
			driver.navigate().back();
		}
		public static void forward() {
			driver.navigate().forward();
		}
		public static void refresh() {
			driver.navigate().refresh();
		}
		public static void get(String type) {
			if (type.equalsIgnoreCase("title")) {
				driver.getTitle();
			}
			else if (type.equalsIgnoreCase("current url")) {
				driver.getCurrentUrl();
			}
		}
		public static void gettext(WebElement element) {
			String text = element.getText();
			System.out.println(text);
		}
		public static void getattribute(WebElement element,String by) {
			if (by.equalsIgnoreCase("value")) {
				String v = element.getAttribute("value");
				System.out.println(v);
			}
			else if (by.equalsIgnoreCase("Name")) {
				String v = element.getAttribute("name");
				System.out.println(v);
			}
		}
		public static void alert(String type) {
			if (type.equalsIgnoreCase("simple")) {
				Alert simp = driver.switchTo().alert();
				simp.dismiss();
			}
			else if (type.equalsIgnoreCase("confirm")) {
				Alert confirm = driver.switchTo().alert();
				confirm.accept();
			}
			else if (type.equalsIgnoreCase("dismiss")) {
				Alert confirm = driver.switchTo().alert();
				confirm.dismiss();
			}
		}
		public static void robot(int value) throws Throwable {
			Robot r = new Robot();
			for (int i = 0; i < value; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);		
			}	
		}
		public static void windowhandle(String mytitle) {
			Set<String> allid = driver.getWindowHandles();
			for (String id : allid) {
				String title = driver.switchTo().window(id).getTitle();
				System.out.println(title);
			}
			for (String id : allid) {
				if (driver.switchTo().window(id).getTitle().equals(mytitle)) {
					break;
				}
			}
		}
		public static void is(WebElement element,String type) {
			if (type.equalsIgnoreCase("Enabled")) {
				boolean enabled = element.isEnabled();
				System.out.println(enabled);
			}
			else if (type.equalsIgnoreCase("Displayed")) {
				boolean displayed = element.isDisplayed();
				System.out.println(displayed);
			}
			else if (type.equalsIgnoreCase("Selected")) {
				boolean selected = element.isSelected();
				System.out.println(selected);
			}
		}
		public static void screenshot(String name) throws Throwable {
			TakesScreenshot ts = (TakesScreenshot) driver;//narrowing type casting
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(System.getProperty("user.dir")+ "\\screenshot\\"+name+".png");
			FileUtils.copyFile(source, dest );
			}
		public static void scroll(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollintoview();", element);
		}

	}


