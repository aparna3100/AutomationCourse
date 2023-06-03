package com.obsqura.SeleniumTestNGFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorAnalysis extends Base{
	@Test
	public void locateById() {
		driver.findElement(By.id("alert-modal"));
	}
	@Test
	public void locateByXpath() {
		driver.findElement(By.xpath("//a[@id='alert-modal']"));
	}
	@Test
	public void locateByClassName() {
		driver.findElement(By.className("navbar-brand"));
	}
	@Test
	public void locateByCssSelector() {
		driver.findElement(By.cssSelector("a#alert-modal"));
	}
	@Test
	public void locateByName() {
		driver.findElement(By.name("keywords"));
	}
}
