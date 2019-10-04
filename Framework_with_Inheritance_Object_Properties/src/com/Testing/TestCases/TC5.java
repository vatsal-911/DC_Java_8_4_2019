package com.Testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Testing.Base.Base;

public class TC5 extends Base{

	@Test
	public void TestCase() throws InterruptedException {
		//Test Case 1 - Launch youtube.com , login as user & Click on History
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
		WebElement history=driver.findElement(By.partialLinkText("History"));
		history.click();
		Thread.sleep(5000);
		System.out.println("History button was clicked successfully");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		
	}
	
}
