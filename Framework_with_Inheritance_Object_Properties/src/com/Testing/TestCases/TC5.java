package com.Testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Testing.Base.Base;
import com.Testing.Pages.Login;

public class TC5 extends Base{

	@Test
	public void TestCase() throws InterruptedException {
		//Test Case 1 - Launch youtube.com , login as user & Click on History
		Login l=new Login(driver, pr);
		l.SignIn(pr.getProperty("email_value"), pr.getProperty("password_value"));
		WebElement history=driver.findElement(By.partialLinkText("History"));
		history.click();
		Thread.sleep(5000);
		System.out.println("History button was clicked successfully");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		
	}
	
}
