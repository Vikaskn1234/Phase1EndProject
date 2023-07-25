package in.simplilearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartPage {
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addcart;
	
	@FindBy(css="#shopping_cart_container > a")
	private WebElement viewcart;
	public AddCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void AddCart()
	{
		addcart.click();
	}
	public void ViewCart()
	{
		viewcart.click();
	}

}
