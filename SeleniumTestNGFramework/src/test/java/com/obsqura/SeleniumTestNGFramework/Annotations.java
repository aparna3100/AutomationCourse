package com.obsqura.SeleniumTestNGFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations extends Base{
	
	@Test
	public void testSample() {
		System.out.println("test case 1");	
	}
	
	@Test
	public void testSample2() {
		System.out.println("test case 2");		
	}
	
	@BeforeMethod
	public void beforeMethodSample() {
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethodSample() {
		System.out.println("@AfterMethod");
	}
	
	@BeforeClass
	public void beforeClassSample() {
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public void afterClassSample() {
		System.out.println("@AfterClass");
	}
	
	@BeforeTest
	public void beforeTestSample() {
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void afterTestSample() {
		System.out.println("@AfterTest");
	}
	
	@BeforeSuite
	public void beforeSuiteSample() {
		System.out.println("@BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuiteSample() {
		System.out.println("@AfterSuite");
	}
	

}
