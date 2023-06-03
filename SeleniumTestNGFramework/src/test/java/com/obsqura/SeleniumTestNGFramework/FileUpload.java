package com.obsqura.SeleniumTestNGFramework;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload extends Base{
	@Test
	public void fileUploadSample() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\Users\\user\\Desktop\\COLLEGE WORKS\\5 pen pc\\5pen.pdf");
	}
	@Test
	public void fileUploadAutoIt() throws IOException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement uploadElement = driver.findElement(By.id("pickfiles"));
		uploadElement.click();
		Runtime.getRuntime().exec("E:\\AutoIT\\FileUpload.exe");
	}
	
	@Test
	public void verifyWhethertheDataEnteredCanBeDownloaded(){
		driver.navigate().to("https://selenium.obsqurazone.com/file-download.php");
		WebElement enterData = driver.findElement(By.xpath("//textarea[@id='textbox']"));
		WebElement downloadButton = driver.findElement(By.xpath("//a[@id='download-file']"));
		WebElement generateFileButton = driver.findElement(By.xpath("//button[@id='create']"));
		enterData.sendKeys("Selenium is a free (open-source) automated testing framework used to validate web applications across different browsers and platforms.");
		generateFileButton.click();
		downloadButton.click();
		assertTrue(downloadButton.isEnabled(),"the entered text is not dowloaded as a file");
	}

}
