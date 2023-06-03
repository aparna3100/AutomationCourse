package com.obsqura.SeleniumTestNGFramework;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends Base{
	@Test
	public void dropDownUsingSelectClass() {
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		WebElement dropDownCountry = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(dropDownCountry);
		select.selectByIndex(2);
		select.selectByValue("ANTARCTICA");
		select.selectByVisibleText("BAHRAIN");		
	}
	
	@Test
	public void multipleSelect() {
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement multipleDropDown = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select = new Select(multipleDropDown);
		boolean isDropDownMultiple = select.isMultiple();
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(2);
		select.deselectAll();		
	}
	@Test
	public void getOptionsSample() {
		String expectedSelectedColorsText = "Red,Yellow,Green";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement multipleDropDown = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		WebElement getAllSelectedButton = driver.findElement(By.xpath("//button[@id='button-all']"));
		WebElement selectedColorsText = driver.findElement(By.xpath("//div[@id='message-two']"));
		Select select = new Select(multipleDropDown);
		List<WebElement> options = select.getOptions();
		Actions actions = new Actions(driver);
	    actions.keyDown(Keys.CONTROL);
	    for (WebElement option : options) {
	        actions.click(option);
	    }
	    actions.keyUp(Keys.CONTROL).build().perform();
	    getAllSelectedButton.click();
	    String getTextselectedColorsText = selectedColorsText.getText();
	    String actualSelectedColorsText = getTextselectedColorsText.replace("All selected colors are : ","");
	    assertEquals(expectedSelectedColorsText, actualSelectedColorsText,"The expected and actual colors selected are not equal: " + expectedSelectedColorsText);
	}
	@Test
	public void verifyWhetherselectedColorisShown() {
		String expectedSelectedColorsText = "Yellow";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement multipleDropDown = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		WebElement getAllSelectedButton = driver.findElement(By.xpath("//button[@id='button-all']"));
		WebElement selectedColorsText = driver.findElement(By.xpath("//div[@id='message-two']"));
		Select select = new Select(multipleDropDown);
		List<WebElement> options = select.getOptions();		
		 for (WebElement index : options) {
		        select.selectByIndex(1);
		    }
	    getAllSelectedButton.click();
	    String getTextOfselectedColorsText = selectedColorsText.getText();
	    String actualSelectedColorsText = getTextOfselectedColorsText.replace("All selected colors are : ","");
	    assertEquals(expectedSelectedColorsText, actualSelectedColorsText,"The expected and actual colors selected are not equal: " + expectedSelectedColorsText);
	}
	  
	@Test
	public void verifyWhetherSelectedColorShownInSelectInputDemo() {
		String expectedSelectedColorText = "Yellow";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement selectColor = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		WebElement selectedColorText = driver.findElement(By.xpath("//div[@id='message-one']"));
		Select select = new Select(selectColor);
		select.selectByIndex(2);
		String getTextOfSelectedcolorText = selectedColorText.getText();
		String actualSelectedcolorText = getTextOfSelectedcolorText.replace("Selected Color : ", "");
		assertEquals(expectedSelectedColorText,actualSelectedcolorText,"the expected and actual color selected are not equal"+expectedSelectedColorText);
	}
	
	@Test
	public void verifyWhetherALanguageIswselectedFromTheList() {
		String expectedLanguage="Português (Brasileiro)";
		driver.navigate().to("https://www.selenium.dev/");
		WebElement selectDropDownBox = driver.findElement(By.xpath("//li[contains(@class,'nav-item dropdown d-none d-lg-block')]//child::a[@id='navbarDropdown']"));
		selectDropDownBox .click();
		List<WebElement> dropDownList = driver.findElements(By.xpath("//div[@aria-labelledby='navbarDropdownMenuLink']//child::a[@class='dropdown-item']"));
		for(WebElement options : dropDownList ) {
		String actualSelectedLanguage = options.getText();
			if(expectedLanguage.equals(actualSelectedLanguage)) {
				options.click() ;
				assertEquals(expectedLanguage,actualSelectedLanguage,"the expected and actual language selected are not equal"+expectedLanguage);
				break;
			}
		}
	}
}
