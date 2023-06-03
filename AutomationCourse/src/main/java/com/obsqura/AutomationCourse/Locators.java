package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;

public class Locators extends Base{
	public void locateAmazonSearchbox()
	{
		//locateById
		driver.findElement(By.id("twotabsearchtextbox"));
		//loacteByClassName
		
		
		//locateByCssSeelector
		//tag#id
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//tag.className
		
		//tag[attribute=value]
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]"));
		
		//tag#id[attribute=value]
		driver.findElement(By.cssSelector("input#twotabsearchtextbox[type=text]"));
		
		//tag.ClassName[attribute=value]
		
		//locateByXpath
		//tagName[@attribute='value']
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		
	}
	
	public void locateById()
	{
		driver.findElement(By.id("twotabsearchtextbox"));
	}
	public void loacteByClassName()
	{
		driver.findElement(By.className("hm-icon-label"));
	}
	public void locateByName()
	{
		driver.findElement(By.name("glow-validation-token"));
	}
	public void locateByCssSelector()
	{
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		driver.findElement(By.cssSelector("span.hm-icon-label"));
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]"));
		driver.findElement(By.cssSelector("a#nav-hamburger-menu[data-csa-c-slot-id=HamburgerMenuDesktop]"));
		
	}
	
	public void locateByLinkText()
	{
		driver.findElement(By.linkText("Sell on Amazon"));
	}
	public void partialLinkText()
	{
		driver.findElement(By.partialLinkText("Today's"));
		//driver.findElement(By.xpath(null));
	}
	public void locateByXpath()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		driver.findElement(By.xpath("//a[@href='/ref=nav_logo']"));
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']"));
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']"));
		driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		
		//locateByXpath
		driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_sell_T3']"));
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		driver.findElement(By.xpath("//span[@id='glow-ingress-line1']"));
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_newreleases']"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//a[@href='date-picker.php']"));
		driver.findElement(By.xpath("//a[@id='others']"));
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']"));
		driver.findElement(By.xpath("//a[@id='progress-bars']"));
		
		driver.navigate().back();
		driver.navigate().refresh();

		
	}
	public static void main(String[] args) {
		Locators locators = new Locators();
		locators.initializeBrowser();
		//locators.locateAmazonSearchbox();
		//locators.locateById();
		//locators.loacteByClassName();
		//locators.locateByName();
		//locators.locateByCssSelector();
		//locators.locateByLinkText();
		//locators.partialLinkText();
		locators.locateByXpath();
		locators.driverQuit();
		
	}

}
