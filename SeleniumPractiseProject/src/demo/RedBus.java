package demo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--disable-notifications");

		 driver=new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		//driver.findElement(By.id("bus_tickets_vertical")).click();
		//Thread.sleep(30000);
		driver.findElement(By.id("src")).sendKeys("Davanagere");
		driver.findElement(By.id("dest")).sendKeys("Bangelore");
		driver.findElement(By.id("onwardCal")).click();
		
	driver.findElement(By.cssSelector("#onwardCal > div > div.sc-jzJRlG.dPBSOp > div > div > div:nth-child(3) > div:nth-child(6) > span > div:nth-child(1)")).click();
	    Thread.sleep(30000);
	    driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li[1]")).click();
		

}
}