package com.ClickMortgage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CMLogin {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch Chrome Browser, Hit CM Login url, Login with credentials
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://3.212.4.70:81/clickmortgage/index.php/login/login_page");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("vatsal.t@devtrust.biz");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("Admin@123");
		WebElement submit=driver.findElement(By.name("submit"));
		submit.click();
		
		//Launch Admin Dashboard & Execute a Search for Applicant Name
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		Thread.sleep(5000); //reveals options hidden on the Bootstrap Dropdown
		
		java.util.List<WebElement> webList= driver.findElements(By.className("searchby_menu dropdown-menu"));
		for (WebElement element : webList) 
		{    System.out.println("System entered Listing loop");
			//System.out.println(element.getAttribute("innerHTML"));
			if(element.findElement(By.cssSelector("a[data-value='dealname']")) != null)
			{
			element.click();
			}
			//if (element.getAttribute("innerHTML").contains("Applicants Name")) {
			//element.click();
			//}
			else {
				System.out.println("Selection failed as element was null");
	
			}			
		}
				
		System.out.println("Print to test if code ran");
		
		WebElement search=driver.findElement(By.xpath("//*[@id=\"container\"]/input[1]"));
		search.sendKeys("son"); // Enter query string 
		WebElement hit_search=driver.findElement(By.xpath("//*[@id=\"container\"]/button/i"));
		hit_search.click(); // Hit Search button
		
		
		
	}

}
