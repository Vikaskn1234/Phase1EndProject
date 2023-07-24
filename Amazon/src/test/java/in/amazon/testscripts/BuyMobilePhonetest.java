package in.amazon.testscripts;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;

public class BuyMobilePhonetest extends BaseTest {
	
	
	@Test
	
	public void buyMobile()
	{
		//4.click on "Mobiles" in the navigator bar
		
		LandingPage landingpage=new LandingPage(driver);
		landingpage.clickMobiles();
		// 5. Hover the pointer  over 'Mobiles'& Accessories'
		
		AllMobileBrands allMobilesBrands=new AllMobileBrands (driver);
		allMobilesBrands.hoverOverMobileAndAccessories();
		
		
		// 6. Click on 'Apple' in sub-menu
		allMobilesBrands.clickApple();
		// 7. click on first available phone
		ApplePhones applePhones=new ApplePhones(driver);
		applePhones.clickFirstMobile();
		
		//9.focus on new tab
		
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		// 8. click on 'Buy Now' button
		BuyPhone buyPhone=new BuyPhone(driver);
		buyPhone.clickBuynowBtn();
		
		
		//10. verify user sees the text 'Sign in ' on the last page
		SignIn signin=new SignIn(driver);
		String expetedText="Sign in";
		String ActalText=signin.getSignInText();
		Assert.assertEquals(ActalText, expetedText);
		
	}
	
}


