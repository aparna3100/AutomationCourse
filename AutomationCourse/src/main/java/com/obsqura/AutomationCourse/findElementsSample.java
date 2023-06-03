package com.obsqura.AutomationCourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class findElementsSample extends Base {
	public void findElementsMethod()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");

		List<WebElement> list1 = driver.findElements(By.tagName("div"));
		int listCount1 =list1.size();
		System.out.println(listCount1);
		
		//hW
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='card-header']"));
		int listCount2 =list2.size();
		System.out.println(listCount2);
		
		
		
	}
	public void findElement()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	
		//following
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		driver.findElement(By.xpath("//img[@src='images/logo.png']//following::div[@id='collapsibleNavbar']"));
		driver.findElement(By.xpath("//button[@class='navbar-toggler']//following::div[@id='collapsibleNavbar']"));
		
		//preceding
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@id='collapsibleNavbar']"));
		driver.findElement(By.xpath("//img[@src='images/logo.png']//preceding::div[@class='top-logo']"));
		driver.findElement(By.xpath("//button[@class='navbar-toggler']//preceding::div[@class='header-top']"));
		
		//parent
		driver.findElement(By.xpath("//a[@class='nav-link']//parent::li[@class='nav-item ']"));
		driver.findElement(By.xpath("//a[@href='simple-form-demo.php']//parent::li[@class='nav-item']"));
		driver.findElement(By.xpath("//a[@id='progress-bars']//parent::li[@class='nav-item']"));
		
		//child
		driver.findElement(By.xpath("//div[@class='header-top']//child::div[@class='container']"));
		driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::a[@href='index.php']"));
		driver.findElement(By.xpath("//button[@class='navbar-toggler']//child::span[@class='navbar-toggler-icon']"));
		
		//ancestor
		driver.findElement(By.xpath("//button[@class='navbar-toggler']//ancestor::div[@class='mb-sec']"));
		driver.findElement(By.xpath("//a[@href='bootstrap-dual-list.php']//ancestor::div[@class='row']"));
		driver.findElement(By.xpath("//img[@alt='logo']//ancestor::a[@href='index.php']"));
		
		//descendant
		driver.findElement(By.xpath("//button[@class='navbar-toggler']//descendant::span[@class='navbar-toggler-icon']"));
		driver.findElement(By.xpath("//ul[@class='navbar-nav']//descendant::a[@href='date-picker.php']"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::a[@href='simple-form-demo.php']"));
		
		//following-sibling
		driver.findElement(By.xpath("//button[@data-toggle='collapse']//following-sibling::div"));
		driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//following-sibling::ul"));
		driver.findElement(By.xpath("//ul[@class='navbar-nav']//following-sibling::a[@href='simple-form-demo.php']"));
	}
	public static void main(String[] args) {
		findElementsSample findElementsSample = new findElementsSample();
		findElementsSample.initializeBrowser();
		findElementsSample.findElementsMethod();
		findElementsSample.findElement();
		findElementsSample.driverQuit();

	}

}
