package in.simplilearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDetailsPage {
	
	@FindBy(id="first-name")
	private WebElement firstname;
	
	@FindBy(id="last-name")
	private WebElement lastname;
	
	@FindBy(id="postal-code")
	private WebElement postcode;
	
	@FindBy(id="continue")
	private WebElement Continue;
	
	public AddDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void FirstName()
	{
		firstname.sendKeys("Vikas");
	}
	
	public void LastName()
	{
		lastname.sendKeys("K N");
	}
	
	public void PostCode()
	{
		postcode.sendKeys("577134");
	}

	public void ContinueBtn()
	{
		Continue.click();
	}
}
