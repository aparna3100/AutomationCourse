package com.obsqura.SeleniumTestNGFramework;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.Point;

public class WebElementCommands extends Base {
	@Test
	public void sendKeysSample()
	{
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys("hello");
		
		//hW
		WebElement twoInputTextFieldA = driver.findElement(By.xpath("//input[@id='value-a']"));
	    WebElement twoInputTextFieldB = driver.findElement(By.xpath("//input[@id='value-b']"));
	    twoInputTextFieldA.sendKeys("100");
	    twoInputTextFieldB.sendKeys("200");
		
	}
	
	@Test
	public void clickSample() {
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys("hello");
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		
		//hW
		WebElement twoInputTextFieldA = driver.findElement(By.xpath("//input[@id='value-a']"));
	    WebElement twoInputTextFieldB = driver.findElement(By.xpath("//input[@id='value-b']"));
	    WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
	    twoInputTextFieldA.sendKeys("100");
	    twoInputTextFieldB.sendKeys("200");
	    getTotalButton.click();
	}
	
	//hW
	@Test
	public void amazonSearchBar() {
		driver.navigate().to("https://www.amazon.in/");
		WebElement searchBarTextField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBarTextField.sendKeys("iphone 14");
		WebElement searchSubmitButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchSubmitButton.click();
	}
	
	@Test
	public void clearSample()
	{
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys("hello");
		singleInputTextField.clear();
		
		//hW
		WebElement twoInputTextFieldA = driver.findElement(By.xpath("//input[@id='value-a']"));
	    WebElement twoInputTextFieldB = driver.findElement(By.xpath("//input[@id='value-b']"));
	    twoInputTextFieldA.sendKeys("100");
	    twoInputTextFieldB.sendKeys("200");
	    twoInputTextFieldA.clear();
	    twoInputTextFieldB.clear();
	    
	}
	@Test
	public void isEnabledSample() {
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean isShowMessageButtonEnabled = showMessageButton.isEnabled();		
		
		//HW
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean isgetTotalButtonEnabled = getTotalButton.isEnabled();
		
	}
	@Test
	public void isDisplayedSample() {
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean isShowMessageButtonDisplayed = showMessageButton.isDisplayed();
		
		//hW
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean isgetTotalButtonDisplayed = getTotalButton.isDisplayed();
		
	}
	@Test
	public void getTextSample() {
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String showMessageButtonText = showMessageButton.getText();
		
		//hW
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String  getTotalButtonText = getTotalButton.getText();
	}
	@Test
	public void getAttributeSample() {
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String getClassNameOfShowMessageButton = showMessageButton.getAttribute("class");
		String getTypeOfShowMessageButton = showMessageButton.getAttribute("type");
		
		//hW
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String getClassNameOfgetTotalButton = getTotalButton.getAttribute("class");
		String getTypeOfgetTotalButton = getTotalButton.getAttribute("type");
		
		
	}
	@Test
	public void getCssValueSample() {
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String getShowMessageButtonBackgroundColor = showMessageButton.getCssValue("background-color");
		String getShowMessageButtonTextColor = showMessageButton.getCssValue("color");
		
		//hW
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String getgetTotalButtonBackgroundColor = getTotalButton.getCssValue("background-color");
		String getTextColorOfgetTotalButton = getTotalButton.getCssValue("color");
		
	}
	public void getLocationSample() {
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		Point singleInputFieldLocation = singleInputTextField.getLocation();
		int singleInputFieldXaxis = singleInputFieldLocation.x;
		int singleInputFieldYaxis = singleInputFieldLocation.y;
		Point showMessageButtonLocation = showMessageButton.getLocation();
		int ShowMessageButtonXaxis = showMessageButtonLocation.x;
		int ShowMessageButtonYaxis = showMessageButtonLocation.y;
	}
	@Test
	public void getSizeSample() {
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		Dimension showMessageButtonSize =showMessageButton.getSize();
		int showMessageButtonHeight = showMessageButtonSize.height;
		
		//hW
		 WebElement twoInputTextFieldA = driver.findElement(By.xpath("//input[@id='value-a']"));
		 WebElement twoInputTextFieldB = driver.findElement(By.xpath("//input[@id='value-b']"));
		 WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		 Dimension  getTotalButtonSize = getTotalButton.getSize();
		 int getTotalButtonHeight = getTotalButtonSize.height;
	}	
	
	@Test
	public void webElementsCommandsSample() {
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		boolean isShowMessageButtonEnabled = showMessageButton.isEnabled();
		boolean isShowMessageButtonDisplayed = showMessageButton.isDisplayed();
		String showMessageButtonText = showMessageButton.getText();
		String getClassNameOfShowMessageButton = showMessageButton.getAttribute("class");
		String getTypeOfShowMessageButton = showMessageButton.getAttribute("type");
		String getShowMessageButtonBackgroundColor = showMessageButton.getCssValue("background-color");
		String getShowMessageButtonTextColor = showMessageButton.getCssValue("color");
		Point singleInputFieldLocation = singleInputTextField.getLocation();
		int singleInputFieldXaxis = singleInputFieldLocation.x;
		int singleInputFieldYaxis = singleInputFieldLocation.y;
		Point showMessageButtonLocation = showMessageButton.getLocation();
		int ShowMessageButtonXaxis = showMessageButtonLocation.x;
		int ShowMessageButtonYaxis = showMessageButtonLocation.y;
		Dimension showMessageButtonSize =showMessageButton.getSize();
		int showMessageButtonHeight = showMessageButtonSize.height;
		
	}
	
	@Test
	public void verifyHeightOfShowMessageButton() {
		int  expectedShowMessageButtonHeight = 38;
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		Dimension showMessageButtonSize =showMessageButton.getSize();
		int actualShowMessageButtonHeight = showMessageButtonSize.height;
		assertEquals(expectedShowMessageButtonHeight,actualShowMessageButtonHeight,"show message button height is not "+expectedShowMessageButtonHeight);
		
	}
	@Test
	public void verifyHeightOfgetTotalButton() {
		 int expectedgetTotalButtonHeight = 38;
		 WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		 Dimension  getTotalButtonSize = getTotalButton.getSize();
		 int actualgetTotalButtonHeight = getTotalButtonSize.height;
		 assertEquals(expectedgetTotalButtonHeight,actualgetTotalButtonHeight,"get total button height is not "+expectedgetTotalButtonHeight);
		
	}
	
	@Test
	public void assertSample() {
		String expectedValue = "123";
		String actualValue ="345";
		boolean flag = false;
		String expectedvalue =  null;
		String expectedResult = "123";
		SoftAssert softAssert = new SoftAssert();
		assertNotEquals(expectedValue,actualValue,"expected and actual values are same");
	    assertFalse(flag,"flag is true");
	    assertNull(expectedvalue,"expected value is not null");
	    assertNotNull(expectedResult,"expected reult is null");
	    
		
		
	}
	
	@Test
	public void assertSample2() {
		String expectedValue = "123";
		String actualValue ="123";
		boolean flag = false;
		String expectedvalue =  null;
		String expectedResult = "123";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertNotEquals(expectedValue,actualValue,"expected and actual values are same");
		softAssert.assertFalse(flag,"flag is true");
		softAssert.assertNull(expectedvalue,"expected value is not null");
		softAssert.assertNotNull(expectedResult,"expected reult is null");
		
		
	}
	
	//HW Monday
	@Test
	public void verifyshowMessageButtonColorHeightWidth() {
		String  expectedShowMessageButtonColor = "rgba(255, 255, 255, 1)";
		int  expectedShowMessageButtonHeight = 38;
		int  expectedShowMessageButtonWidth = 137;
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualShowMessageButtonColor = showMessageButton.getCssValue("color");
		Dimension actualShowMessageButtonSize = showMessageButton.getSize();
		int actualShowMessageButtonHeight = actualShowMessageButtonSize.height;
		int actualShowMessageButtonWidth = actualShowMessageButtonSize.width;
		assertEquals(expectedShowMessageButtonColor,actualShowMessageButtonColor,"show message buton color is not as expected"+expectedShowMessageButtonColor);
		assertEquals(expectedShowMessageButtonHeight,actualShowMessageButtonHeight,"show message button height is not as expected"+expectedShowMessageButtonHeight);
		assertEquals(expectedShowMessageButtonWidth,actualShowMessageButtonWidth,"show message button width is not as expected"+expectedShowMessageButtonWidth);
		
	}
	
	@Test
	public void verifytwoInputTextFieldAandtwoInputTextFieldBLocation() {
		boolean flag= false;
		WebElement twoInputTextFieldA = driver.findElement(By.xpath("//input[@id='value-a']"));
	    WebElement twoInputTextFieldB = driver.findElement(By.xpath("//input[@id='value-b']"));
	    Point twoInputTextFieldALocation =  twoInputTextFieldA.getLocation();
	    int twoInputTextFieldAYAxis = twoInputTextFieldALocation.y;
	    Point twoInputTextFieldBLocation =  twoInputTextFieldB.getLocation();
	    int twoInputTextFieldBYAxis = twoInputTextFieldBLocation.y;
	    if(twoInputTextFieldAYAxis < twoInputTextFieldBYAxis) {
	    	flag = true;
	    }
	    assertTrue(flag,"a is below b");
	   
	}
	
	
	@Test
	public void verifyTwoInputFields() {
		String valueA = "300" , valueB = "100";
		int expectedResultValue = Integer.parseInt(valueA) + Integer.parseInt(valueB);//300
		
	    WebElement twoInputTextFieldA = driver.findElement(By.xpath("//input[@id='value-a']"));
	    WebElement twoInputTextFieldB = driver.findElement(By.xpath("//input[@id='value-b']"));
	    WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
	    WebElement actualResult = driver.findElement(By.xpath("//div[@id='message-two']"));
	    
	    twoInputTextFieldA.sendKeys(valueA);
	    twoInputTextFieldB.sendKeys(valueB);
	    getTotalButton.click();
	    
	    String actualResultText = actualResult.getText();//Total A + B : 300
	    
	    StringBuilder digitsOnly = new StringBuilder();
	    for (int i = 0; i < actualResultText.length(); i++) {
	        char c = actualResultText.charAt(i);
	        if (Character.isDigit(c)) {
	            digitsOnly.append(c);
	        }
	    }
	    int actualResultValue = Integer.parseInt(digitsOnly.toString());//300
	 
	   
	    if (actualResultValue == expectedResultValue) {
	        System.out.println("Passed!");
	    } else {
	        System.out.println("Failed!n ");
	    }
    }
	
	@Test
	public void verifyBackgroundColorGetTotalButton() {
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String getBackgroundColorGetTotalButton =  getTotalButton.getCssValue("background-color");
		System.out.println(getBackgroundColorGetTotalButton);
	}
	
	

}
