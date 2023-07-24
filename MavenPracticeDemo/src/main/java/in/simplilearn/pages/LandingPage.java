package in.simplilearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy(id="guide-button")
	private WebElement truck;
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void truckClick()
	{
		truck.click();
	}

}
