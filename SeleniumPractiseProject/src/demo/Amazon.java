package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		WebElement signInElement=driver.findElement(By.id("ap_email"));
		if(signInElement.isDisplayed())
		{
			System.out.println("user not signed");
		}
		else
		{
			System.out.println("user is signed");
		}
		
	}

}
