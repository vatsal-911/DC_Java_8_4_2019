package com.imaginescholarships.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Signup {
public static void main(String[] args) throws InterruptedException {


String user;
System.out.println("Enter email address");
java.util.Scanner s=new java.util.Scanner(System.in);
user=s.next();
String pass;
System.out.println("Enter password");
java.util.Scanner s1=new java.util.Scanner(System.in);
pass=s1.next();
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();

driver.get("http://imaginescholarships.com:3000/");
driver.manage().window().maximize();

/* Registration functionality */

WebElement login_page=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/div/nav/div[1]/div/a[2]"));
login_page.click();

WebElement signup_form=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/nav/a[2]"));
signup_form.click();

WebElement f_name=driver.findElement(By.id("first_name"));
f_name.sendKeys("Vatsal");

WebElement l_name=driver.findElement(By.id("last_name"));
l_name.sendKeys("Tewari");

WebElement email=driver.findElement(By.id("email"));
email.sendKeys(user);

WebElement pwd=driver.findElement(By.id("password"));
pwd.sendKeys(pass);

WebElement cfrm_pass=driver.findElement(By.id("cfrm_pass"));
cfrm_pass.sendKeys(pass);

WebElement check_box=driver.findElement(By.xpath("//*[@id=\"register\"]/div[7]/div[1]/div"));
check_box.click();

WebElement submit_cta=driver.findElement(By.id("regSubmit"));
submit_cta.click();

Thread.sleep(5000);

WebElement logout=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/header/div/nav/div[1]/a[3]"));
JavascriptExecutor jse=driver;
jse.executeScript("arguments[0].scrollIntoView();",logout);
logout.click();



// Login Functionality - User to login with Registered Credentials & then fill out their profile

/*WebElement login=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/div/nav/div[1]/div/a[2]"));
login.click();
WebElement login_email=driver.findElement(By.id("username"));
login_email.sendKeys("");
WebElement login_password=driver.findElement(By.id("loginPassword"));
login_password.sendKeys("");
WebElement submit=driver.findElement(By.id("loginSubmit"));
submit.click(); */


/* Profile completion - User to fill out their profile*/



/*WebElement find_sc=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/a"));
find_sc.click(); */

//Click on unlock profile & make payment

//Apply for scholarship

}
}
