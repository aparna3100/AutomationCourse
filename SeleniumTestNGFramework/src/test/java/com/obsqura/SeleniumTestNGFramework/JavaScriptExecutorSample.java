package com.obsqura.SeleniumTestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorSample extends Base{
	@Test 
	public void javaScriptExecutorSample() {
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='hello';",singleInputTextField);
		js.executeScript("arguments[0].click();", showMessageButton);
		js.executeScript("window.scrollBy(0,250)", "");
		js.executeScript("window.scrollBy(0,-250)", "");
		js.executeScript("arguments[0].scrollIntoView();", showMessageButton);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
