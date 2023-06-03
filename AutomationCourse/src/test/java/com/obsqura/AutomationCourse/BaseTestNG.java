package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestNG {
	
	public WebDriver driver;
	
	@BeforeTest
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void driverQuit() {
		driver.quit();
	}
	
	public void driverClose() {
		driver.close();
	}
	
	public void getTitle() {
		String title = driver.getTitle();
	}
	
	public void pageSource() {
		String pgSrc = driver.getPageSource();
	}
	
	public void geturl() {
		String expectedUrl = "https://www.amazon.in/";
		String url = driver.getCurrentUrl();
		
		if (url.contentEquals(expectedUrl)) {
            System.out.println("Passed!");
        }
		else {
            System.out.println("Failed");
        }
		
	}
	
}

	

