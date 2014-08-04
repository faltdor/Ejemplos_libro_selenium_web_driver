package com.selenium.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class IAmTheEventListener2 extends AbstractWebDriverEventListener {

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		super.afterChangeValueOf(element, driver);
	}
	
	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		super.afterNavigateForward(driver);
	}
}
