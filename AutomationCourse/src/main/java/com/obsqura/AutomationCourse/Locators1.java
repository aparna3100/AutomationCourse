package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;

public class Locators1 extends Base4{
	public void locateById()
	{
		driver.findElement(By.id("single-input-field"));
	}
	public void loacteByClassName()
	{
		driver.findElement(By.className("clearfix"));
	}
	public void locateByName()
	{
		driver.findElement(By.name("keywords"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
