package com.ClickMortgage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CMLogin {
	public static void main(String[] args) {
		
		//Launch Chrome Browser, Hit CM Login url, Login with credentials
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("http://3.212.4.70:81/clickmortgage/index.php/login/login_page");
		
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("vatsal.t@devtrust.biz");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("Admin@123");
		WebElement submit=driver.findElement(By.name("submit"));
		submit.click();
		
		//Launch Admin Dashboard & Execute a Search for Applicant Name
		
		WebElement type=driver.findElementByCssSelector("a#Applicants Name");
		type.click(); //Select dropdown 
		WebElement search=driver.findElement(By.className("search_data"));
		search.sendKeys("son"); // Enter query string
		WebElement hit_search=driver.findElement(By.name("search"));
		hit_search.click(); // Hit Search button
		
		
		
		
	}

}
