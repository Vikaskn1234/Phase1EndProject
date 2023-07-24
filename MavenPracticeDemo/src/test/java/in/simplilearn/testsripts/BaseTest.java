package in.simplilearn.testsripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void LaunchApplication()
	{
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
	}
	

}
