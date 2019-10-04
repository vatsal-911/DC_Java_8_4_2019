package com.Testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Testing.Base.Base;

public class TC1 extends Base {

	@Test
	public void TestCase() throws InterruptedException {
		//Test Case 1 - Launch youtube.com & click on Trending
		//WebElement trending=driver.findElement(By.xpath("//*[@id=\"endpoint\"]/paper-item/span[1]"));
		WebElement trending=driver.findElement(By.xpath(pr.getProperty("trending_page_xpath")));
		trending.click();
		Thread.sleep(5000);
		System.out.println("Trending button was clicked successfully");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
	}
	
}
