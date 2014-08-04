package com.selenium.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllPostsPage {
	WebDriver driver;
	@FindBy(how = How.ID, using = "the-list")
	WebElement postsContainer;
	@FindBy(how = How.ID, using = "post-search-input")
	WebElement searchPosts;
	@FindBy(how = How.ID, using = "cat")
	WebElement viewByCategories;

	public AllPostsPage(WebDriver driver) {
		this.driver = driver;
		driver.get("http://pageobjectpattern.wordpress.com/wp-admin/edit.php");
	}

	public void createANewPost(String title, String description) {
	}

	public void editAPost(String title) {
	}

	public void deleteAPost(String postTitle) {
	}

	public void filterPostsByCategory(String category) {
	}

	public void searchInPosts(String searchText) {
	}
}
