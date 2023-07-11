package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("vikaskamthi143@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Vikaskamthi143@gmail");
		
		driver.findElement(By.name("login")).click();
		
		String expectedmsg="The email address you entered isn't connected to an account. Find your account and log in.";
		String actualmsg=driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
		System.out.println(expectedmsg);
		System.out.println(actualmsg);
		
		if(actualmsg.equals(expectedmsg))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		driver.close();

	}

}
