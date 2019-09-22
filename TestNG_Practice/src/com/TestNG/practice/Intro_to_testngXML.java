package com.TestNG.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Intro_to_testngXML {
	@AfterMethod
	public void AM() {
		System.out.println("@AfterMethod Annotation of Intro_to_testngXML class ");
	}
	
	@org.testng.annotations.Test
	public void Test() {
		System.out.println("@Test Annotation of Intro_to_testngXML class ");
	}
	
	@BeforeSuite
	public void BS() {
		System.out.println("@BeforeSuite Annotation of Intro_to_testngXML class ");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("@AfterClass Annotation of Intro_to_testngXML class ");
	}

	
    @BeforeClass
	public void BC() {
		System.out.println("@BeforeClass Annotation of Intro_to_testngXML class ");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("@AfterSuite Annotation of Intro_to_testngXML class ");
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("@BeforeMethod Annotation of Intro_to_testngXML class ");
	}

}
