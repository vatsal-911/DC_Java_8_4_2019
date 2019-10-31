package com.testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.testing.Base.Base;

public class TC_1 extends Base {

	public String TC_id="Test Case #1 ";

	
	@Test
	public void TC() throws InterruptedException {
			WebElement login=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/div/nav/div[1]/div/a[2]")); //Login_link
			login.click();
			Thread.sleep(2);
			WebElement signup=driver.findElement(By.partialLinkText("SIGNUP")); //Signup_Tab
			signup.click();
			WebElement first_name=driver.findElement(By.xpath("//*[@id=\"first_name\"]")); //Firstname_xpath
		    first_name.sendKeys("Kagiso");
		    WebElement last_name=driver.findElement(By.xpath("//*[@id=\"last_name\"]")); //Lastname_xpath
		    last_name.sendKeys("Rabada");
		    WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]")); //email_xpath
		    email.sendKeys("kagiso5.rabada@yopmail.com");
		    WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]")); //password_xpath
		    password.sendKeys("Steyn@910");
		    WebElement confirm_password=driver.findElement(By.xpath("//*[@id=\"cfrm_pass\"]")); //confirm_pass_xpath
		    confirm_password.sendKeys("Steyn@910");
		    WebElement terms_checkbox=driver.findElement(By.xpath("//*[@id=\"register\"]/div[7]/div[1]/div")); //T&C_checkbox
		    terms_checkbox.click();
		    WebElement submit_cta=driver.findElement(By.xpath("//*[@id=\"regSubmit\"]")); //Submit_CTA
		    submit_cta.click();
		    Thread.sleep(3000);
			System.out.println("Current Landing page is- "+driver.getCurrentUrl());
	}
	
	
	
}
