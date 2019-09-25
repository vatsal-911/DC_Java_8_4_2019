package com.testng.testsuite1;

import java.awt.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 {

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
	public void test() throws InterruptedException {
		
		//Login to YouTube account 
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
		Thread.sleep(5000);
		
		//Get Total Videos count
		java.util.List<WebElement> all= driver.findElements(By.id("video-title"));
		System.out.println("Total videos are : "+all.size());
		
		//Play Video
		all.get(2).click();
		System.out.println("Video was launched, now Like the playing video");
		Thread.sleep(6000);
		
		//Like Currently playing video
		WebElement like_selector=driver.findElement(By.xpath("//ytd-video-primary-info-renderer/div/div/div[3]/div/ytd-menu-renderer/div/ytd-toggle-button-renderer[1]/a/yt-icon-button/button"));
		like_selector.click();
		Thread.sleep(5000);
		
		//Get Video title of playing video
		WebElement video_name=driver.findElement(By.xpath("//*[@id=\"container\"]/h1/yt-formatted-string"));
		String Video_Title=video_name.getText();
		System.out.println("Liked Video is: "+Video_Title);
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Last page launched was: "+driver.getCurrentUrl());
		System.out.println();
		//Now Close the current browser
		driver.close();
		System.out.println("Test Case 3 executed successfully");
		System.out.println();
	}
}
