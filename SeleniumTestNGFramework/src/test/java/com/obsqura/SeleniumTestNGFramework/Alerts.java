package com.obsqura.SeleniumTestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alerts extends Base{
	@Test
	public void simpleAlert() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickOnclickmeOfJavaScriptAlertBox = driver.findElement(By.xpath("//button[contains(@class,'btn btn-success')]"));
		clickOnclickmeOfJavaScriptAlertBox.click();
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}
	@Test
	public void dismissAlert() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickOnclickmeOfJavaScriptConfirmBox = driver.findElement(By.xpath("//button[contains(@class,'btn-warning')]"));
		WebElement alertConfirmationText = driver.findElement(By.xpath("//p[@id='confirm-demo']"));
		clickOnclickmeOfJavaScriptConfirmBox.click();
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		String getalertConfirmationText = alertConfirmationText.getText();
	}
	@Test
	public void promptKeys() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickOnclickForPromtBox = driver.findElement(By.xpath("//button[contains(@class,'btn-danger')]"));
		WebElement alertpromtConfirmationText = driver.findElement(By.xpath("//p[@id='prompt-demo']"));
		clickOnclickForPromtBox.click();
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Aparna");
		driver.switchTo().alert().accept();		
		String getalertpromtConfirmationText = alertpromtConfirmationText.getText();
		}
	
}
