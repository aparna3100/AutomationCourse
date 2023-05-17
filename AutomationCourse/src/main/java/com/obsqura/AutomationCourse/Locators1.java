package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;

public class Locators1 extends Base4{
	public void locateById()
	{
		driver.findElement(By.id("single-input-field"));
		driver.navigate().to("https://www.meesho.com/");
		driver.findElement(By.id("__jsx-2825112192"));
		driver.navigate().to("https://www.browserstack.com/");
		driver.findElement(By.id("doc-search-box-input"));
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
		
	}
	public void loacteByClassName()
	{
		driver.findElement(By.className("clearfix"));
		driver.navigate().to("https://www.meesho.com/");
		driver.findElement(By.className("header-logo-container"));
		driver.navigate().to("https://www.browserstack.com/");
		driver.findElement(By.className("ais-SearchBox-input"));
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
		
	}
	public void locateByName()
	{
		driver.findElement(By.name("keywords"));
		driver.navigate().to("https://www.meesho.com/");
		driver.findElement(By.name("google-site-verification"));
		driver.navigate().to("https://www.browserstack.com/");
		driver.findElement(By.name("msapplication-TileColor"));
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		Locators1 locators1 = new Locators1();
		locators1.initializeBrowser();
		locators1.getTitle();
		locators1.geturl();
		locators1.pageSource();
		locators1.navigate();
		locators1.locateById();
		locators1.loacteByClassName();
		locators1.locateByName();
		locators1.driverQuit();
	}

}
