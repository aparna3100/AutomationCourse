package com.obsqura.SeleniumTestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe extends Base{
	@Test
	public void iFrameByIndex() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame(1);
		WebElement iFrameLink = driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		iFrameLink.click();
	}

	@Test
	public void iFrameByName() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		WebElement iFrameLink = driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		iFrameLink.click();
	}
	@Test
	public void iFrameByWebElement() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='a077aa5e']")));
		WebElement iFrameLink = driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		iFrameLink.click();
	}
}
