package com.obsqura.SeleniumTestNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public WebDriver driver;
	
	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\SeleniumTestNGFramework\\src\\main\\java\\Resources\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
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
