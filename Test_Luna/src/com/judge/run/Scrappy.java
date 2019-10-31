package com.judge.run;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scrappy {



		ChromeDriver driver;
		BufferedWriter writer;
		
		@BeforeMethod
		public void Launch() {
			//Run Chromedriver in headless state
			ChromeOptions options = new ChromeOptions();  
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");  

			//Regular browser run script
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("https://streeteasy.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		
		
		@SuppressWarnings("deprecation")
		@Test
		public void GetText() throws IOException, InterruptedException {
	    //Navigate to Borough
			Actions act=new Actions(driver);
			WebElement Rental_tab=driver.findElement(By.xpath("//*[@id=\"site-menu\"]/div[1]/div/ul/li[2]/a"));
			act.moveToElement(Rental_tab).build().perform();
			Thread.sleep(4000);
			WebElement Brooklyn_selector=driver.findElement(By.xpath("//*[@id=\"site-menu\"]/div[1]/div/ul/li[2]/div/div/div[1]/ul/li[2]/a"));
			Brooklyn_selector.click();
			Thread.sleep(2000);
			WebElement count=driver.findElement(By.xpath("//*[@id=\"results-criteria\"]/div"));
			String count_of_buildings=count.getText();
			long time = 0;
			Calendar date_of_execution=new Calendar() {
				
				@Override
				public void roll(int field, boolean up) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public int getMinimum(int field) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public int getMaximum(int field) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public int getLeastMaximum(int field) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public int getGreatestMinimum(int field) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				protected void computeTime() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				protected void computeFields() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void add(int field, int amount) {
					// TODO Auto-generated method stub
					
				}
			};
			
			Time ts=new Time(time);
			System.out.println("Brooklyn contains- "+count_of_buildings+" on "+date_of_execution.getTime()+" at "+ts.getTime());
			
		//Navigate to Building
		//Navigate to Listing	
			
		//Scrap actual data	
		/*	WebElement text_locator=driver.findElement(By.xpath(""));
		    String barry=text_locator.getText();
		    System.out.println(barry);
		    writer = new BufferedWriter(new FileWriter("C:\\Users\\asus\\Desktop\\Write.txt"));
		    writer.write("Barry - ");
		    writer.write(barry);
		    writer.newLine();	    
	   */ 
	    }
		
		
		
		@AfterMethod
		public void End() throws IOException, InterruptedException {
			System.out.println("Closing browser in 5 seconds");
			Thread.sleep(4000);
			writer.close();
			driver.close();
			
		}

	
}
