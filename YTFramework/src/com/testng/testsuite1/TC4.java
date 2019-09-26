package com.testng.testsuite1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 {
	
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
		
		//Get Videos into List 
		java.util.List<WebElement> all= driver.findElements(By.id("video-title"));
		System.out.println("Total videos are : "+all.size());
		
		//Play Video
		all.get(2).click();
		System.out.println("Video was launched, now Subscribe the Channel of the video");
		Thread.sleep(6000);
		
		//Subscribe the Channel of the video
		WebElement subscribe_selector=driver.findElement(By.xpath("//*[@id=\"subscribe-button\"]/ytd-subscribe-button-renderer/paper-button/yt-formatted-string"));
		subscribe_selector.click();
		System.out.println("Subscription button clicked");
		Thread.sleep(5000);
		
		//Get Video title of playing video
		WebElement video_name=driver.findElement(By.xpath("//*[@id=\"container\"]/h1/yt-formatted-string"));
		String Video_Title=video_name.getText();
		System.out.println("The playing Video is: "+Video_Title);
		
		//Get Channel name of the Video 
		WebElement channel_name=driver.findElement(By.xpath("//ytd-video-secondary-info-renderer/div/div[2]/ytd-video-owner-renderer/div[1]/ytd-channel-name/div/div/yt-formatted-string"));
		String Channel=channel_name.getText();
		System.out.println("The Channel subscribed to is: "+Channel);
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Last page launched was: "+driver.getCurrentUrl());
		System.out.println();
		//Now Close the current browser
		driver.close();
		System.out.println("Test Case 4 executed successfully");
		System.out.println();
	}


}
