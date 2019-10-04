package com.Testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Testing.Base.Base;
import com.Testing.Pages.Login;
import com.Testing.Pages.VideoPlay;

public class TC3 extends Base {

	@Test
	public void test() throws InterruptedException {
		
		//Login to YouTube account 
		Login l=new Login(driver, pr);
		l.SignIn(pr.getProperty("email_value"), pr.getProperty("password_value"));
		Thread.sleep(5000);
		
		//Play a Video
		VideoPlay play=new VideoPlay(driver, pr);
		play.PlayVideo();
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
