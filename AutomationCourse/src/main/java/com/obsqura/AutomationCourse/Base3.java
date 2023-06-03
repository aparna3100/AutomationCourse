package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Base3 {
	
	public WebDriver driver;
	
	public void initializeBrowser() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\user\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resources\\msedgedriver.exe");
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.amazon.in/");
	}
	
	public static void main(String[] args) {
		Base3 base = new Base3();
		base.initializeBrowser();
	}

}
