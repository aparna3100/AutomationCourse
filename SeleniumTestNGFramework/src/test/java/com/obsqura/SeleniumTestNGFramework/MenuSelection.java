package com.obsqura.SeleniumTestNGFramework;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MenuSelection extends Base{
	@Test
    public void navigateToMenuElements(String expectedLinkText,WebDriver driver) {
		WebElement menu = driver.findElement(By.xpath("//ul[contains(@class,'list-group-flush')]")); 
        List<WebElement> links = menu.findElements(By.xpath("//li[@class='list-group-item']"));
        for (WebElement link : links) {
            String actualLinkText = link.getText();
            if (actualLinkText.equals(expectedLinkText)) {
                link.click();
                assertEquals(expectedLinkText,actualLinkText,"the expected and actual  texts of elements in menuare not equal"+expectedLinkText);
                break;
            }
        }
    }
    
}

