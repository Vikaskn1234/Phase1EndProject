package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridDemo {
	WebDriver driver;
	
	@BeforeTest
	public void launchApplication() throws MalformedURLException
	{
		//Specify the capabilities of the node where the test case is to be executed using DesiredCapabilites
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL("http://localhost:4466/wd/hub"),cap);
		
	}
	@Test
	public void titleVerification()
	{
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	@AfterTest
	
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
