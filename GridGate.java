package com.qait.automation.Tatoc_js_Based;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class GridGate {

	JavascriptExecutor jsDriver;
	
	public GridGate(JavascriptExecutor jsDriver) {
		this.jsDriver=jsDriver;
	}
	
	public void greenBox() {
		jsDriver.executeScript("document.getElementsByClassName(\'greenbox\')[0].click();");
		String response=(String) jsDriver.executeScript("return document.querySelector(\'.page>h1\').textContent");
		Assert.assertEquals(response, "Frame Dungeon");
		System.out.println("Green Box Clicked");
	}
}
