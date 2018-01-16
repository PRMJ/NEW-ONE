package com.facebook.Tests;



import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tests {
	
	
		@Test
		public void setup(String browserType)
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.quit();

}
}