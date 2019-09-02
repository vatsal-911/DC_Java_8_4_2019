package packageSelenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\asus\\Desktop\\Selenium\\geckodriver.exe");
		FirefoxDriver ff_driver=new FirefoxDriver();
		ff_driver.get("https://apply.moveskyward.com");
		ff_driver.manage().window().maximize();
		
		
		//ff_driver.close();
		
		
	}

}
