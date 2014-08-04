package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author user
 *The getSize() method
 *The getLocation() method
 *The getText() method
 *The getTagName() method
 *The isDisplayed() method
 *The isEnabled() method
 *The isSelected() method
The isSelected action verifies if an eleme
 * 
 */
public class GetTypeAttribute {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchButton = driver.findElement(By.name("btnK"));
		System.out.println("Location: "+searchButton.getLocation());
		System.out.println("Size: "+searchButton.getSize());
		System.out.println("Text: "+searchButton.getText());
		System.out.println("Tag name: " + searchButton.getTagName());
		System.out.println("isDisplayed: "+ searchButton.isDisplayed());
		System.out.println("isEnabled: "+ searchButton.isEnabled());
		
		WebElement searchBox = driver.findElement(By.name("q"));
		System.out.println("isSelected:"+searchBox.isSelected());
		
	}

}
