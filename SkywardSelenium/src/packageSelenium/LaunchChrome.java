package packageSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://apply.moveskyward.com");
		//driver.get("https://apply.moveskyward.com/client/signup/");
		driver.manage().window().maximize();
		WebElement started = driver.findElementByXPath("//*[@id=\"root\"]/div/div/div/footer/div/ul/li[5]/a"); //Locate Get Started CTA
		started.click(); 
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys("arjun4@yopmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Vatsal@123");
		WebElement confirm =driver.findElement(By.id("confirm_password"));
		confirm.sendKeys("Vatsal@123");
		WebElement submit =driver.findElementByXPath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/form/button");
		submit.click();
		System.out.println("Script executed & Terminated successfully!");
		//driver.close();
	}

}
