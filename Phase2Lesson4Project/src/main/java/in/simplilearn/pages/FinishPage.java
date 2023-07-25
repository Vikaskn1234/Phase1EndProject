package in.simplilearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage {
	WebDriver driver;
	@FindBy(id="finish")
	private WebElement finish;
	public FinishPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void FinishBtn()
	{
		finish.click();
		
		
	}
	
	
	
	

}
