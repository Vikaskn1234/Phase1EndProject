package in.simplilearn.testsripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
	@BeforeTest	
	public void LaunchApplication() {
		;	
//		1.	Open the browser
		 driver= new ChromeDriver();
		 
//		2.	Maximize it
		driver.manage().window().maximize();
		
//		3.	Navigate to https://www.amazon.in/
		driver.get( "https://www.saucedemo.com/");
		
		
	}
	
	
			@AfterTest
		public void closeBrowser()
	{
			driver.quit();
		}
	

}
