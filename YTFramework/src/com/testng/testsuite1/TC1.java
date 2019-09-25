package com.testng.testsuite1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import java.io.InputStream;
//import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
ChromeDriver driver;
//String email;
//String password;

@BeforeMethod
public void LaunchChrome() {
	//Launch the Browser 
/*	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Login email");
	email=sc.next();
	Scanner sc1=new Scanner(System.in);
	password=sc1.next();  */
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
}

@Test
public void TestCase() throws InterruptedException {
	//Test Case 1 - Launch youtube.com & click on Trending
	//WebElement trending=driver.findElement(By.xpath("//*[@id=\"endpoint\"]/paper-item/span[1]"));
	WebElement trending=driver.findElement(By.xpath("//*[@id=\"items\"]/ytd-guide-entry-renderer[2]"));
	trending.click();
	Thread.sleep(5000);
	System.out.println("Trending button was clicked successfully");
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(5000);
}

@AfterMethod
public void CloseBrowser() throws InterruptedException {
	//Closing the Browser
	System.out.println("Closing the Browser now");
	Thread.sleep(5000);
	driver.close();
	System.out.println("Test Case 1 executed successfully");
	System.out.println();
}
}
