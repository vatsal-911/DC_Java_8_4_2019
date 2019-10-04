package com.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	Properties pr;
	
	public Login(ChromeDriver driver, Properties pr) {
	this.driver=driver;
	this.pr=pr;
	}
	
	public void SignIn( String user, String password) {
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
	}

}
