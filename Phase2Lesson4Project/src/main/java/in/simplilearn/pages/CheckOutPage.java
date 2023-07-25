package in.simplilearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

	@FindBy(id="checkout")
	private WebElement check;
	public CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void CheckOut()
	{
		check.click();
	}
}
