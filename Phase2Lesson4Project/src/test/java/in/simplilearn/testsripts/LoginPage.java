package in.simplilearn.testsripts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.simplilearn.pages.AddCartPage;
import in.simplilearn.pages.AddDetailsPage;
import in.simplilearn.pages.CheckOutPage;
import in.simplilearn.pages.FinishPage;
import in.simplilearn.pages.LandingPage;
import in.simplilearn.pages.VerifyTitle;

public class LoginPage extends BaseTest{
	@Test
	
	public void verifypage()
	{
		LandingPage landingpage=new LandingPage(driver);
		
		landingpage.Username();
		
		landingpage.Password();
		landingpage.LoginButton();
		
		AddCartPage page=new AddCartPage(driver);
		
		page.AddCart();
		
		page.ViewCart();
		
		CheckOutPage check=new CheckOutPage(driver);
		
		check.CheckOut();
		
		AddDetailsPage details=new AddDetailsPage(driver);
		
		details.FirstName();
		
		details.LastName();
		
		details.PostCode();
		
		details.ContinueBtn();
		 FinishPage finish=new FinishPage(driver);
		 
		 finish.FinishBtn();
		 
		VerifyTitle title=new VerifyTitle(driver);
		
		String Actual = title.Ordertxt();
		String Expected = "Thank you for your order!";
		assertEquals(Actual, Expected);
		
		
		
		
		
		
	}
	
	

}
