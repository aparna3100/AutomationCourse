package com.obsqura.SeleniumTestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSample extends Base{
	@Test
	public void actionsClassSample() throws Exception  {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement draggableElement = driver.findElement(By.xpath("(//div[@id='todrag']//child::span[@draggable='true'])[1]"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(draggableElement).build().perform();
		actions.moveToElement(draggableElement).click();		
		actions.doubleClick(draggableElement).perform();		
		actions.contextClick(draggableElement).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(draggableElement, destination).build().perform();
	}

}
