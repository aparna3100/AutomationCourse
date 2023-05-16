package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base4 {
public WebDriver driver;
	
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}
	public void driverQuit() {
		driver.quit();
	}
	public void getTitle() {
		String title = driver.getTitle();
	}
	
	public void pageSource() {
		String pgSrc = driver.getPageSource();
	}
	
	public void geturl() {
		String url = driver.getCurrentUrl();
	}
	public void navigate() {
		  driver.navigate().to("https://www.myntra.com/");
		  driver.navigate().back();
		 // driver.navigate().forward();
		  driver.navigate().refresh();
		 }


}
