package com.obsqura.SeleniumTestNGFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends MenuSelection{
	@Test
	public void VerifyWhetherSuccessMessageIsAvailableWhenYouAreClickingOnCheckBox() {
		String expectedsuccessMessageText = "Success - Check box is checked";
		MenuSelection menuSelection = new MenuSelection();
		menuSelection.navigateToMenuElements("Checkbox Demo", driver);
		WebElement clickOnCheckBox =driver.findElement(By.xpath("//input[@id='gridCheck']"));
		WebElement successMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		clickOnCheckBox.click();
		boolean checkBoxButtonIsSelected =clickOnCheckBox.isSelected();
		String actualsuccessMessageText =successMessageText.getText();
		assertEquals(expectedsuccessMessageText,actualsuccessMessageText,"expected message is not shown "+expectedsuccessMessageText);
	}
	
	@Test
	public void verifyWhetherfirstTwoButtonsOfMultipleCheckboxDemoAreSelected() {
		MenuSelection menuSelection = new MenuSelection();
		menuSelection.navigateToMenuElements("Checkbox Demo", driver);
		WebElement clickOnCheckBoxOne = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement clickOnCheckBoxTwo = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		clickOnCheckBoxOne.click();
		clickOnCheckBoxTwo.click();
		boolean CheckBoxOneIsSelected = clickOnCheckBoxOne.isSelected();
		boolean CheckBoxTwoIsSelected = clickOnCheckBoxTwo.isSelected();
		assertTrue(CheckBoxOneIsSelected,"check box one of Multiple Checkbox Demo is selected");
		assertTrue(CheckBoxTwoIsSelected,"check box one of Multiple Checkbox Demo is selected");		
	}
	
	@Test
	public void verifyWhetherAllButtonsAreSelectedUponClickingOnSelectAll() {
		MenuSelection menuSelection = new MenuSelection();
		menuSelection.navigateToMenuElements("Checkbox Demo", driver);
		WebElement clickOnSelectAll = driver.findElement(By.xpath("//input[@id='button-two']"));
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		clickOnSelectAll.click();
		for(WebElement selectAll : allcheckboxes) {
			if(clickOnSelectAll.isEnabled()) {
				boolean allcheckboxesIsSelected = selectAll.isSelected();
				assertTrue(allcheckboxesIsSelected,"all check boxes  of Multiple Checkbox Demo are not selected");
				break;
			}			
		}			
	}
	
	@Test
	public void verifyWhetherAllButtonsAreUnSelectedUponClickingOnUnSelectAll() {
		MenuSelection menuSelection = new MenuSelection();
		menuSelection.navigateToMenuElements("Checkbox Demo", driver);
		WebElement clickOnSelectAll = driver.findElement(By.xpath("//input[@id='button-two']"));
		WebElement clickOnUnSelectAll = driver.findElement(By.xpath("//input[@id='button-two']"));
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		clickOnSelectAll.click();
		clickOnUnSelectAll.click();
		for(WebElement unSelectAll : allcheckboxes) {
			if(clickOnUnSelectAll.isEnabled()) {
				boolean allcheckboxesIsUnSelected = unSelectAll.isSelected();
				assertFalse(allcheckboxesIsUnSelected,"all check boxes  of Multiple Checkbox Demo are selected");
				break;
			}
		}		
	}
}

