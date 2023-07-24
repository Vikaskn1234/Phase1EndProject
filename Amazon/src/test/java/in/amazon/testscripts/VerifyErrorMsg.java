package in.amazon.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;

public class VerifyErrorMsg extends BaseTest{

	@Test
	public void VerifyErrorMsg()
	{
		//4. Hover the pointer over 'Hello Sign-in' menu
		LandingPage landingpage=new LandingPage(driver);
		landingpage.hoverOverHelloSignInMenu();
		//5.click on Sign in Button in the sub menu
		
		landingpage.clickSignInBtn();
		
		//6.Enter invalid username in the email text box
		SignIn signin=new SignIn(driver);
		signin.enterEmail("batsman554466@gmail.com");
		
		//7.click on continue button
		signin.clickcontinueBtn();
		
		//8.Verify the error mag -We cannot find an account with that email
		
		String expectedErrMsg="We cannot find an account with that email address";
		String actualErrmsg=signin.getErrMsg();
		Assert.assertEquals(actualErrmsg, expectedErrMsg);
				
		
	}

}
