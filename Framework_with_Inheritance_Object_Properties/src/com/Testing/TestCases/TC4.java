package com.Testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Testing.Base.Base;
import com.Testing.Pages.Login;
import com.Testing.Pages.VideoPlay;

public class TC4 extends Base {

	@Test
	public void test() throws InterruptedException {
		
		//Login to YouTube account 
		Login l=new Login(driver, pr);
		l.SignIn(pr.getProperty("email_value"), pr.getProperty("password_value"));
		Thread.sleep(5000);
		
		//Play a Video
				VideoPlay play=new VideoPlay(driver, pr);
				play.PlayVideo();
	     		System.out.println("Video was launched, now Subscribe the Channel of the video");
		        Thread.sleep(6000);
		
		//Subscribe the Channel of the video
		WebElement subscribe_selector=driver.findElement(By.xpath(pr.getProperty("subscribe_video_button_xpath")));
		Thread.sleep(3000);
		subscribe_selector.click();
		System.out.println("Subscription button clicked");
		Thread.sleep(5000);
		
		//Get Video title of playing video
		WebElement video_name=driver.findElement(By.xpath(pr.getProperty("video_name_xpath")));
		Thread.sleep(5000);
		String Video_Title=video_name.getText();
		System.out.println("The playing Video is: "+Video_Title);
		
		//Get Channel name of the Video 
		WebElement channel_name=driver.findElement(By.xpath(pr.getProperty("channel_name_xpath")));
		Thread.sleep(5000);
		String Channel=channel_name.getText();
		System.out.println("The Channel subscribed to is: "+Channel);
	}
	
}
