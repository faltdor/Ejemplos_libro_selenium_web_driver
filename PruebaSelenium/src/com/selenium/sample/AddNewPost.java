package com.selenium.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewPost {
	WebDriver driver;
	@FindBy(how = How.ID, using = "content_ifr")
	WebElement newPostContentFrame;
	@FindBy(how = How.ID, using = "tinymce")
	WebElement newPostContentBody;
	@FindBy(how = How.ID, using = "title")
	WebElement newPostTitle;
	@FindBy(how = How.ID, using = "publish")
	WebElement newPostPublish;

	public AddNewPost(WebDriver driver) {
		this.driver = driver;
		System.out.println(driver.getCurrentUrl());
	}

	public void addNewPost(String title, String descContent) {
		driver.switchTo().frame(newPostContentFrame);
		newPostContentBody.sendKeys(descContent);
		driver.switchTo().defaultContent();
		newPostTitle.click();
		newPostTitle.sendKeys(title);
		newPostPublish.click();
	}

	public void typeTextinTitle(String title) {
		newPostTitle.sendKeys(title);
	}

	public void clickPublishButton() {
		newPostPublish.click();
	}

	public void typeTextinContent(String descContent) {
		driver.switchTo().frame(newPostContentFrame);
		newPostContentBody.sendKeys(descContent);
	}

}
