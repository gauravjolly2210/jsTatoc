package com.qait.automation.Tatoc_js_Based;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class DragAround {
	JavascriptExecutor jsDriver;
	public DragAround(JavascriptExecutor jsDriver) {
		this.jsDriver=jsDriver;
	}
	public void dragBox() {
		jsDriver.executeScript("document.getElementById(\"dragbox\").setAttribute(\"style\",\"position: relative; left: 40px; top: -66px;\")");
		jsDriver.executeScript("document.querySelector(\".page > a:nth-child(10)\").click()");
		String response=(String) jsDriver.executeScript("return document.querySelector(\'.page>h1\').textContent");
		Assert.assertEquals(response,"Popup Windows");
	}

}
