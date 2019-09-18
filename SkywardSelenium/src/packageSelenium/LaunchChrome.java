package packageSelenium;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException 
	{
		
		String email;  //Declare String var
		System.out.println("Enter SignUp email address");
		Scanner sc=new Scanner(System.in);
		email=sc.next(); //User Input email entered
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe"); //Define path to Chromedriver
		ChromeDriver driver=new ChromeDriver(); //invoke ChromeDriver class 
		driver.get("https://stage.moveskyward.com"); //pass target url Staging build
		//driver.get("https://apply.moveskyward.com/client/signup/");
		driver.manage().window().maximize();
		
		WebElement started = driver.findElementByXPath("//*[@id=\"root\"]/div/div/div/footer/div/ul/li[5]/a"); //Locate Get Started CTA
		started.click(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Fill Signup form
		
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys(email);
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
        Thread.sleep(5000);
		WebElement s1_next=driver.findElementByXPath("//*[@id=\"one_step_next_button\"]"); //Locate Next button
		if(s1_next.isEnabled()) //Verify if the located button is Enabled for click
		{
		s1_next.click();  //Perform click action
		}
		else {
			System.out.println("Script executed & Terminated successfully!");
	    	}
		
		
		//Fill Onboarding Step 2
		
		//driver.close();  */
		sc.close();
	}

}
