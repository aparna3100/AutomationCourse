package com.obsqura.SeleniumTestNGFramework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends Base{
	@Test
	public void verifyRadioButtonDemo() {
		String expectedShowSelectedValueText = "Radio button 'Male' is checked";
		MenuSelection menuSelection = new MenuSelection();
		menuSelection.navigateToMenuElements("Radio Buttons Demo", driver);
		WebElement clickOnMale = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement clickOnShowSelectedValue = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement ShowSelectedValueText = driver.findElement(By.xpath("//div[@id='message-one']"));
		clickOnMale.click();
		clickOnShowSelectedValue.click();
		String actualShowSelectedValueText =ShowSelectedValueText.getText();	
		assertEquals(expectedShowSelectedValueText,actualShowSelectedValueText,"the expected and actual show selected value text does not match"+expectedShowSelectedValueText);
	}
	@Test
	public void verifyGroupRadioButtonsDemo() {
		String expectedGetResultsText = "Gender : Female\n"
				+ "Age group: 45 to 60";
		MenuSelection menuSelection = new MenuSelection();
		menuSelection.navigateToMenuElements("Radio Buttons Demo", driver);
		WebElement clickOnPateintsGenderAsFemale = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement clickOnPateintsAgeGroupAs45To60 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement clickOnGetResultsButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement getResultsButtonText = driver.findElement(By.xpath("//div[@id='message-two']"));
		clickOnPateintsGenderAsFemale.click();
		clickOnPateintsAgeGroupAs45To60.click();
		clickOnGetResultsButton.click();
		String actualGetResultsText = getResultsButtonText.getText();
		assertEquals(expectedGetResultsText,actualGetResultsText,"the expected and actual get results text are not equal"+expectedGetResultsText);
		
	}

}
