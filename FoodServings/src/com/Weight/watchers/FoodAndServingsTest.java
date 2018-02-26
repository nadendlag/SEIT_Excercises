package com.Weight.watchers;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FoodAndServingsTest {
	public static WebDriver driver;

	public static void main(String[] args){
		
		setup();
		FoodAndServingsPage foodPgObj1 = new FoodAndServingsPage(driver);
		foodPgObj1.getFoodItemsList();
		foodPgObj1.getFSMap();
	
		driver.quit();	
	}
	
	
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String CURRENT_DIR = System.getProperty("user.dir");

		//driver.get("C:/Users/govar/Documents/Work/Input.html");
		driver.get("file:"+CURRENT_DIR+"./Input.html");
	}

	
}
