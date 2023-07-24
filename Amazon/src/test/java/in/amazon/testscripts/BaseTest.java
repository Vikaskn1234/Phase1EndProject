package in.amazon.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
WebDriver driver;
	
	@BeforeTest
	public void launchAplication()
	{
		//1.open the browser
		driver=new ChromeDriver();
		
		//2.maximize it
		driver.manage().window().maximize();
		
		//3. navigate to url
		driver.get("https://amazon.in");
		
	}
	//11.close the browser
	@AfterTest
		public void closeBrowser()
		{
			//driver.quit();
		}

}
