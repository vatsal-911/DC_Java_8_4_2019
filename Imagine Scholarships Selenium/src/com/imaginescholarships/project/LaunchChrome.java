package com.imaginescholarships.project;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
		String username;
		String pwd;
		Scanner sc=new Scanner("System.in");
		System.out.println("Enter secure Username/Email for login");
		username=sc.next();
		Thread.sleep(12000);
		System.out.println(username);
		Scanner sc1=new Scanner("System.in");
	    System.out.println("Enter secure password");
	    pwd=sc1.next();
	    Thread.sleep(25000);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://imaginescholarships.com:3000/");
        driver.manage().window().maximize();
        WebElement login=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/div/nav/div[1]/div/a[2]"));
        login.click();
        WebElement email=driver.findElement(By.id("username"));
        email.sendKeys(username);
        WebElement password=driver.findElement(By.id("loginPassword"));
        password.sendKeys(pwd);
        WebElement submit=driver.findElement(By.id("loginSubmit"));
        submit.click();
        sc.close();
        sc1.close();
        //String s=driver.getCurrentUrl().toString();
        //System.out.println(s);
        //driver.close();
	}

}
