package com.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {

	
	ChromeDriver driver;
	Properties pr;
	
	public VideoPlay(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void PlayVideo() {
		//Get Total Videos count
				java.util.List<WebElement> all= driver.findElements(By.id(pr.getProperty("videos_xpath")));
				System.out.println("Total videos are : "+all.size());
				
				//Play Video
				all.get(2).click();
				System.out.println("Video was launched, now Like the playing video");
	}
}
