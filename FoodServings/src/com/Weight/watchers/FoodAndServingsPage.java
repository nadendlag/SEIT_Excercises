package com.Weight.watchers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoodAndServingsPage {
	WebDriver driver;
	List<WebElement> lst;
	HashMap<String, String> mp;

	By spanPath = By.xpath("/html/body/div/span");

	public FoodAndServingsPage(WebDriver driver) {
		this.driver = driver;

	}

	public void getFSMap() {
		String servingSize;
		String foodName;

		lst = driver.findElements(spanPath);
		mp = new HashMap();
		int k;
		for (int j = 0; j < lst.size(); j += 2) {
			k = j + 1;

			foodName = lst.get(j).getText();
			servingSize = lst.get(k).getText();

			mp.put(foodName, servingSize);

		}
		System.out.println("");
		System.out.println("************* Food Items and servings Sizes are as below :");
		//System.out.println(mp);
		
		 for (Map.Entry<String, String> entry : mp.entrySet()) {
		 System.out.println( entry.getKey() + "  : " + entry.getValue());
		 }
		 
	}

	public void getFoodItemsList() {
		lst = driver.findElements(spanPath);
		String foodItem;
		
		System.out.println("************* The 3rd and 5th Items in the List are:");
		for (int i = 0; i < lst.size(); i++) {
			if (i == 4 || i == 8) {
				foodItem = lst.get(i).getText();
				System.out.println(foodItem);
			}
		
		}
		

	}
}
