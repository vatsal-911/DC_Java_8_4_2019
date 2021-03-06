package com.Testing.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Testing.Base.Base;
import com.Testing.Pages.Login;
import com.Testing.Utilities.Screenshot;

public class TC2 extends Base {

	@Test
	public void TestCase() throws InterruptedException, IOException {
		//Test Case 1 - Launch youtube.com , login as user & Click on Subscriptions
		// Browser Launch & URL launch handled by Base.java @BeforeMethod annotation
		Login l=new Login(driver, pr);
		l.SignIn(pr.getProperty("email_value"), pr.getProperty("password_value"));
		WebElement subscriptions=driver.findElement(By.xpath(pr.getProperty("subscriptions_page_xpath")));
		subscriptions.click();
		Thread.sleep(5000);
		Screenshot.CaptureScreenshot(driver, "C:\\Users\\asus\\Desktop\\Images\\second.png");
		System.out.println("Subscription button was clicked successfully");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		
	}

	
}
