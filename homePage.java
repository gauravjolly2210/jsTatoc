package com.qait.automation.Tatoc_js_Based;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class homePage {

	JavascriptExecutor jsDriver;
	public homePage(JavascriptExecutor jsDriver) {
		this.jsDriver=jsDriver;
	}
	public void navigate_To_Basic() {
		jsDriver.executeScript("document.querySelector(\".page>a\").click();");
		String response=(String) jsDriver.executeScript("return document.querySelector(\'.page>h1\').textContent");
		Assert.assertEquals(response, "Grid Gate");
		System.out.println("Basic Course clicked");
	}
}
