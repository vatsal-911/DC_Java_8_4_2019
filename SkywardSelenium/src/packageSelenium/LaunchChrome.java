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
		WebElement e1 = driver.findElementByXPath("//*[@id=\"root\"]/div/div/div/footer/div/ul/li[5]/a"); //Locate Get Started CTA
		e1.click();
		WebElement e2 = driver.findElement(By.id("email"));
		e2.sendKeys("arjun5@yopmail.com");
		WebElement e3 = driver.findElement(By.id("password"));
		e3.sendKeys("Vatsal@123");
		WebElement e4 =driver.findElement(By.id("confirm_password"));
		e4.sendKeys("Vatsal@123");
		WebElement e5 =driver.findElementByXPath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/form/button");
		e5.click();
		System.out.println("Script executed & Terminated successfully!");
		//driver.close();
	}

}
