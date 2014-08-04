package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminLoginPage {
	
	WebDriver driver;
	@FindBy(how=How.ID,id="user_login")
	WebElement email;
	@FindBy(how=How.ID,id="user_pass")
	WebElement password;
	@FindBy(how=How.ID,id="wp-submit")
	WebElement submit;

	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
		driver.get("http://pageobjectpattern.wordpress.com/wp-admin");
//		email = driver.findElement(By.id("user_login"));
//		password = driver.findElement(By.id("user_pass"));
//		submit = driver.findElement(By.id("wp-submit"));
	}

	public void login() {
		email.sendKeys("pageobjectpattern@gmail.com");
		password.sendKeys("webdriver123");
		submit.click();
	}
}
