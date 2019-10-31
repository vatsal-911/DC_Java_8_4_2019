package com.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base  {
	
	public ChromeDriver driver;
	public Properties pr;	
	
	
	@BeforeMethod
	public void LaunchBrowserChrome() throws InterruptedException, IOException {
		File f=new File("C:\\Users\\asus\\eclipse-workspace\\Imagine Scholarships Framework\\Env.properties");
		FileInputStream f_input=new FileInputStream(f);
        pr=new Properties();
		pr.load(f_input);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		System.out.println("Browser Launch initiated");
		driver=new ChromeDriver();
		System.out.println("ChromeDriver 76.0.3809.126 launched successfully");
        Thread.sleep(2000);
		driver.get("http://imaginescholarships.com:3000/"); //HP_url
		System.out.println("Target launch url launched"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void Shutdown() throws InterruptedException {
		Thread.sleep(2000);
	    System.out.println("@Test annotations executed. Shutdown initiated. Browser will shut down in 5 secs");
	    Thread.sleep(5000);
		driver.close();
		System.out.println("Executed successfully. Check TestNG reports for results");
	}
	
}
