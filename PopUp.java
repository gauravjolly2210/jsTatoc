package com.qait.automation.Tatoc_js_Based;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PopUp {
	JavascriptExecutor jsDriver;
	public PopUp(JavascriptExecutor jsDriver) {
		this.jsDriver=jsDriver;
	}
	
	public void PopUpClick(WebDriver driver) throws InterruptedException {
//		jsDriver.executeScript("var popUpWindow=window.open('/tatoc/basic/windows/popup')");
//		jsDriver.executeScript("popUpWindow.focus()");
//		jsDriver.executeScript("popUpWindow.document.getElementById(\'name\').value=\'nmc\'");
//		jsDriver.executeScript("popUpWindow.document.getElementById(\'submit\').click()");
//		jsDriver.executeScript("document.querySelector(\".page > a:nth-child(10)\").click()");
//		String response=(String) jsDriver.executeScript("return document.querySelector(\'.page>h1\').textContent");
//		Assert.assertEquals(response,"Popup Windows");
		
		
		//driver.findElement(By.linkText("Launch Popup Window")).click();
		jsDriver.executeScript("document.querySelector('body > div > div.page > a:nth-child(4)').click()");
	     String parentWindow=driver.getWindowHandle();
	     String subWindow=null;
	     Set<String> handles=driver.getWindowHandles();
	     for(String h:handles) {
	    	 subWindow=h;
	     }	     
	     driver.switchTo().window(subWindow);
	     System.out.println(driver.getCurrentUrl());
	     //driver.findElement(By.id("name")).sendKeys("name");
	     jsDriver.executeScript("document.getElementById('name').value='abc'");
	     //driver.findElement(By.id("submit")).click();
	     jsDriver.executeScript("document.getElementById('submit').click()");
	     driver.switchTo().window(parentWindow); 
	     jsDriver.executeScript("document.querySelector('body > div > div.page > a:nth-child(6)').click()");
	     String response=(String) jsDriver.executeScript("return document.querySelector(\'.page>h1\').textContent");
			Assert.assertEquals(response,"Cookie Handling");
			System.out.println("Pop Up executed successfully");
		
	}

}
