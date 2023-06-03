package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
	public void indexing()
	{
		driver.findElement(By.xpath("(//div[@class='nav-fill'])[3]"));
	}
	public void axesMethods()
	{
		driver.findElement(By.xpath("(//a[contains(text(),'miniTV')])[1]"));//indexing
		driver.findElement(By.xpath("//input[contains(@class,'nav-progressive-attribute')and@id='twotabsearchtextbox']"));//containsAnd
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'and@autocomplete='off']"));//And
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'or@autocomplete='off']"));//or
		driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearch')]"));
		
		//contains
		driver.findElement(By.xpath("//span[contains(@class,'hm-icon-label')]"));
		driver.findElement(By.xpath("//i[contains(@class,'hm-icon nav-sprite')]"));
		driver.findElement(By.xpath("//div[contains(@id,'nav-flyout-iss-anchor')]"));
		
		//contains and
		driver.findElement(By.xpath("//span[contains(@class,'nav-progressive-content')and@id='logo-ext']"));
		driver.findElement(By.xpath("//a[contains(@class,'nav-progressive-attribute')and@id='nav-logo-sprites']"));
		driver.findElement(By.xpath("//div[contains(@class,'nav-flyout')and@id='nav-flyout-amazonprime']"));
		
		//and
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button'and@type='submit']"));
		driver.findElement(By.xpath("//span[@id='nav-cart-count'and@aria-hidden='true']"));
		driver.findElement(By.xpath("//div[@class='nav-sprite nav-progressive-attribute'and@id='nav-packard-glow-loc-icon']"));
		
		//or
		WebElement searchSubmitButton =driver.findElement(By.xpath("//input[@id='nav-search-submit-button'or@id='nav-search-submit-text']"));
		WebElement cartCount =driver.findElement(By.xpath("//span[@id='nav-cart-count'or@id='nav-cart-count-container']"));
		WebElement locationIcon =driver.findElement(By.xpath("//div[@class='nav-sprite nav-progressive-attribute'or@id='nav-global-location-popover-link']"));

		//contains or
		driver.findElement(By.xpath("//span[contains(@class,'nav-cart-icon')or@id='nav-cart-count-container']"));
		driver.findElement(By.xpath("//a[contains(@id,'nav-logo-sprites')or@aria-label='Amazon.in']"));
		driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')or@aria-describedby='searchDropdownDescription']"));
		
		//starts-with
		driver.findElement(By.xpath("//span[starts-with(@id,'nav-cart')]"));
		driver.findElement(By.xpath("//span[starts-with(@id,'nav-link-accountList')]"));
		driver.findElement(By.xpath("//input[starts-with(@id,'nav-search-submit')]"));
	}
	public void axesMethods2()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//following::div[@id='nav-tools']"));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//preceding::div[@id='nav-packard-glow-loc-icon']"));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//parent::div[@class='nav-search-field ']"));
		driver.findElement(By.xpath("//a[@href='/ref=nav_logo']//child::span[@id='logo-ext']"));
		driver.findElement(By.xpath("//a[@href='/ref=nav_logo']//ancestor::div[@id='a-page']"));
		driver.findElement(By.xpath("//a[@href='/ref=nav_logo']//descendant::span[@id='logo-ext']"));
		driver.findElement(By.xpath("//span[@id='logo-ext']//following-sibling::span"));
		
	}
	

	public static void main(String[] args) {
		Xpath xpath = new Xpath();
		xpath.initializeBrowser();
		xpath.indexing();
		xpath.axesMethods2();
		xpath.driverQuit();

	}

}
