package packageSelenium;

import java.util.concurrent.TimeUnit;

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Fill Signup form
		
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys("arjun52@yopmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Vatsal@123");
		WebElement confirm =driver.findElement(By.id("confirm_password"));
		confirm.sendKeys("Vatsal@123");
	    WebElement submit =driver.findElementByXPath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/form/button"); 
		submit.click();
		
		//Fill Onboarding Step 1
		
		WebElement f_name=driver.findElement(By.id("name"));
		f_name.sendKeys("Arjun");
		WebElement l_name=driver.findElement(By.id("last_name"));
		l_name.sendKeys("Pandit");
		WebElement phone=driver.findElement(By.id("phone_number"));
		phone.sendKeys("8765060092");
		WebElement s1_next=driver.findElement(By.id("one_step_next_button"));
		s1_next.click();
		System.out.println("Script executed & Terminated successfully!");
		
		//Fill Onboarding Step 2
		
		//driver.close();  */
	}

}
