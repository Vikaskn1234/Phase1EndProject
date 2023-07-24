package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyErrorMsg {
	
  ChromeDriver driver;
  
 @BeforeTest
 public void LaunchApplication()
 {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
 }
 
 @Test
 public void Verification()
 {
	 driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("abc123");
	 driver.findElement(By.name("login")).click();
	 
	 String expectedErrMsg="The email address you entered isn't connected to an account. Find your account and log in.";
		//String actualErrMsg=driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		String actualErrMsg=driver.findElement(By.xpath("(//div[contains(@class, 'ay')])[3]")).getText();
		
    // System.out.println("actualmsg");
     Assert.assertEquals(actualErrMsg, expectedErrMsg);
     
 }
 @AfterTest
 public void CloseBrowser()
 {
	 driver.quit();
 }

}
