package com.testng.testsuite1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 {
	ChromeDriver driver;
	String email;
	String password;
	
	@BeforeMethod
	public void LaunchChrome() {
		//Launch the Browser 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Login email");
		email=sc.next();
		System.out.println("Enter your password");
		Scanner sc1=new Scanner(System.in);
		password=sc1.next();  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}

	@Test
	public void TestCase() throws InterruptedException {
		//Test Case 1 - Launch youtube.com , login as user & Click on Subscriptions
		WebElement login=driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer"));
		login.click();
		WebElement username=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		username.sendKeys(email);
		WebElement next_1=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]"));
		next_1.click();
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		pass.sendKeys(password);
		WebElement next_2=driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span"));
		next_2.click();
		WebElement subscriptions=driver.findElement(By.xpath("//*[@id=\"items\"]/ytd-guide-entry-renderer[3]"));
		subscriptions.click();
		Thread.sleep(5000);
		System.out.println("Subscription button was clicked successfully");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		
	}

	@AfterMethod
	public void CloseBrowser() throws InterruptedException {
		//Closing the Browser
		System.out.println("Closing the Browser now");
		Thread.sleep(5000);
		driver.close();
		System.out.println("Test Case 2 executed successfully");
	}

}
