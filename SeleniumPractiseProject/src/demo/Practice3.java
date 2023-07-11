package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
	
	    private WebDriver driver;

	    public Practice3() {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	     ChromeDriver  driver = new ChromeDriver();
	    }

	    public void openWebsite(String url) {
	        driver.get("https://www.makemytrip.com/");
	    }

	    public WebElement locateElement(By locator) {
	        return driver.findElement(locator);
	    }

	    // Create a page object design pattern class to store the web elements of a webpage
	    public class HomePage {
	        public final By FILE_INPUT = By.id("fileInput");

	        public void uploadFile(String filePath) {
	            WebElement fileInput = locateElement(FILE_INPUT);
	            fileInput.sendKeys(filePath);
	        }
	    }

	    // Create a class to handle external elements
	    public class ExternalElementHandler {
	        // Implement methods to handle external elements
	    }

	    // Create a table in SQL for product data
	    // Implement DB connection class to initiate a JDBC connection

	    // Create a class for Screenshot
	    public class ScreenshotCapturer {
	        // Implement methods to capture screenshots
	    }

	    public static void main(String[] args) {
	        Practice3 fileUploadHandler = new Practice3();
	        fileUploadHandler.openWebsite("https://www.makemytrip.com/");

	        // Usage example
	        Practice3.HomePage homePage = fileUploadHandler.new HomePage();
	        homePage.uploadFile("path/to/file");
	    }
	}
	

	


