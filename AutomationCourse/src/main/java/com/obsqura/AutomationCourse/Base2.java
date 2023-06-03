package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base2 {
	
	public WebDriver driver;
	
	public void initializeBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resources\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}
	
	public static void main(String[] args) {
		Base2 base = new Base2();
		base.initializeBrowser();
	}

}
