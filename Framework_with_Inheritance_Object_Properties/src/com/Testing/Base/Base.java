package com.Testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public ChromeDriver driver;
    public Properties pr;
	
	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		File f=new File("C:\\Users\\asus\\eclipse-workspace\\Framework_with_Inheritance_Object_Properties\\Env.properties");
		FileInputStream f_input=new FileInputStream(f);
        pr=new Properties();
		pr.load(f_input);
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://youtube.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}
}
