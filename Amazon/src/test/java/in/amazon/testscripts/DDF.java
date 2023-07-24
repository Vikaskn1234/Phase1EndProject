package in.amazon.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;

import utils.ReadExcell;

public class DDF extends BaseTest{
	@Test
	public void VerifyErrorMsg() throws IOException
	{
		
		//4. Hover the pointer over 'Hello Sign-in' menu
		LandingPage landingpage=new LandingPage(driver);
		landingpage.hoverOverHelloSignInMenu();
		//5.click on Sign in Button in the sub menu
		
		landingpage.clickSignInBtn();
		String[][] data=ReadExcell.getData("resources//TestData.xlsx", "Sheet1");
		
		for(int i=1;i<6;i++) {
			String username=data[i][1];
		
		//6.Enter invalid username in the email text box
		SignIn signin=new SignIn(driver);
		signin.enterEmail(username);
		
		//7.click on continue button
		signin.clickcontinueBtn();
		
		//8.Verify the error mag -We cannot find an account with that email
		
		String expectedErrMsg="We cannot find an account with that email address";
		String actualErrmsg=signin.getErrMsg();
		Assert.assertEquals(actualErrmsg, expectedErrMsg);
		}	
		}
		
	}

