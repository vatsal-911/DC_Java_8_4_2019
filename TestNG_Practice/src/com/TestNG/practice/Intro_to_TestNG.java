package com.TestNG.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Intro_to_TestNG {
// This program is a practical implementation of all TestNG annotations
	
	@AfterMethod
	public void AM() {
		System.out.println("@AfterMethod Annotation");
	}
	
	@org.testng.annotations.Test
	public void Test() {
		System.out.println("@Test Annotation");
	}
	
	@BeforeSuite
	public void BS() {
		System.out.println("@BeforeSuite Annotation");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("@AfterClass Annotation");
	}

	
    @BeforeClass
	public void BC() {
		System.out.println("@BeforeClass Annotation");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("@AfterSuite Annotation");
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("@BeforeMethod Annotation");
	}
	
} //end of Class
