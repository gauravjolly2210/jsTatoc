package com.qait.automation.Tatoc_js_Based;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class Cookies {
	JavascriptExecutor jsDriver;
	public Cookies(JavascriptExecutor jsDriver) {
		this.jsDriver=jsDriver;
	}

	public void creating_cookie() {
		jsDriver.executeScript("document.querySelector('body > div > div.page > a:nth-child(8)').click()");
		String value=(String) jsDriver.executeScript("return document.getElementById(\"token\").innerHTML");
		  Cookie ck=new Cookie("Token", value.substring(value.indexOf(":")+2));
		  jsDriver.executeScript("document.cookie='"+ck+"'");
		  jsDriver.executeScript("document.querySelector('body > div > div.page > a:nth-child(10)').click()");
		  String response=(String) jsDriver.executeScript("return document.querySelector(\'.page>h1\').textContent");
			Assert.assertEquals(response,"End");
			System.out.println("Cookie Page executed successfully");
	}

}
