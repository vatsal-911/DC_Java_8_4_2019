package com.judge.run;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Judge_run {

	ChromeDriver driver;
	BufferedWriter writer;
	
	@BeforeMethod
	public void Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.imdb.com/name/nm0431918/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void GetPara() throws IOException, InterruptedException {
    WebElement text_locator=driver.findElement(By.xpath("//*[@id=\"name-bio-text\"]/div/div"));
    String barry=text_locator.getText();
    System.out.println(barry);
    writer = new BufferedWriter(new FileWriter("C:\\Users\\asus\\Desktop\\Write.txt"));
    writer.write("Barry - ");
    writer.write(barry);
    writer.newLine();
    WebElement search_next=driver.findElement(By.xpath("//*[@id=\"navbar-query\"]"));
    search_next.sendKeys("Rory Culkin"); //sending inout in search box
    Thread.sleep(3000);  // added wait to let suggestion box populate with matches/suggestions
    Actions act=new Actions(driver);
    Thread.sleep(5000);
    WebElement target=driver.findElement(By.xpath("//*[text()='Rory Culkin')]")); //trying to search if suggestions div contains "string"
    act.moveToElement(target).click(); // attempting to click the string, if found
    WebElement para_locator=driver.findElement(By.xpath("//*[@id=\"name-bio-text\"]/div/div"));
    String grant=para_locator.getText();
    System.out.println(grant);
    writer = new BufferedWriter(new FileWriter("C:\\Users\\asus\\Desktop\\Write.txt"));
    writer.write("Grant - ");
    writer.write(grant);
    writer.newLine();
    
    //WebElement go=driver.findElement(By.xpath("//*[@id=\"navbar-submit-button\"]"));
    //go.click();
    
    
    }
	
	
	
	@AfterMethod
	public void End() throws IOException, InterruptedException {
		System.out.println("Closing browser in 5 seconds");
		Thread.sleep(4000);
		writer.close();
		driver.close();
		
	}
}
