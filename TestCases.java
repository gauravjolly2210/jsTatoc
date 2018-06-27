package com.qait.automation.Tatoc_js_Based;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCases {

	WebDriver driver;
	JavascriptExecutor jsDriver;
	homePage home;
	GridGate gate;
	FrameDungeon color;
	DragAround drag;
	PopUp pop;
	Cookies cook;
	@BeforeClass
	public void LaunchBrowser() {
		driver=new ChromeDriver();
		jsDriver = (JavascriptExecutor)driver;	
		jsDriver.executeScript("window.location='http://10.0.1.86/tatoc\'");
	}
	@Test
	public void Step_01_Click_on_Basic() {
		home=new homePage(jsDriver);
		home.navigate_To_Basic();
	}
	@Test
	public void Step_02_Grid_Gate() {
		gate=new GridGate(jsDriver);
		gate.greenBox();
	}
	@Test
	public void Step_03_Frame_Dungeon() throws InterruptedException {
		color=new FrameDungeon(jsDriver);
		color.sameColor();
	}
	
	@Test
	public void Step_04_Drag_Around() {
		drag=new DragAround(jsDriver);
		drag.dragBox();
	}
	
	@Test
	public void Step_05_Pop_Up() throws InterruptedException {
		pop=new PopUp(jsDriver);
		pop.PopUpClick(driver);
	}
	
	@Test
	public void Step_06_Cookies_page() {
		cook =new Cookies(jsDriver);
		cook.creating_cookie();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
