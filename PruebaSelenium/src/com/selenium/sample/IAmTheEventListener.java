package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class IAmTheEventListener implements WebDriverEventListener{

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0.getTagName());
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0.getTagName());
		
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0);
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0);
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0);
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0);
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0);
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0.getTagName());
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0.getTagName());
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0);
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0);
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0);
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0);
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0);
		
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName() + arg0);
		
	}

}
