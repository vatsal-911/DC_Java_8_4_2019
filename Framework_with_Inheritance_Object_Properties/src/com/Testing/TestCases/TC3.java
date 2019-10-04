package com.Testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Testing.Base.Base;

public class TC3 extends Base {

	@Test
	public void test() throws InterruptedException {
		
		//Login to YouTube account 
		WebElement login=driver.findElement(By.xpath(pr.getProperty("login_page_xpath")));
		login.click();
		WebElement username=driver.findElement(By.xpath(pr.getProperty("input_username_xpath")));
		username.sendKeys(pr.getProperty("email_value"));
		WebElement next_1=driver.findElement(By.xpath(pr.getProperty("next_username_xpath")));
		next_1.click();
		WebElement pass=driver.findElement(By.xpath(pr.getProperty("input_password_xpath")));
		pass.sendKeys(pr.getProperty("password_value"));
		WebElement next_2=driver.findElement(By.xpath(pr.getProperty("next_password_xpath")));
		next_2.click();
		Thread.sleep(5000);
		
		//Get Total Videos count
		java.util.List<WebElement> all= driver.findElements(By.id(pr.getProperty("videos_xpath")));
		System.out.println("Total videos are : "+all.size());
		
		//Play Video
		all.get(2).click();
		System.out.println("Video was launched, now Like the playing video");
		Thread.sleep(6000);
		
		//Like Currently playing video
		WebElement like_selector=driver.findElement(By.xpath(pr.getProperty("like_xpath")));
		like_selector.click();
		Thread.sleep(5000);
		
		//Get Video title of playing video
		WebElement video_name=driver.findElement(By.xpath(pr.getProperty("video_name_xpath")));
		String Video_Title=video_name.getText();
		System.out.println("Liked Video is: "+Video_Title);
	}
	
}
