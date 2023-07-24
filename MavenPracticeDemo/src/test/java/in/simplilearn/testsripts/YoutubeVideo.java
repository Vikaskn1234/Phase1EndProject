package in.simplilearn.testsripts;

import org.testng.annotations.Test;

import in.simplilearn.pages.LandingPage;

public class YoutubeVideo  extends BaseTest {
	
	@Test
	public void youtubeLogin()
	{
		LandingPage page=new LandingPage(driver);
		
		page.truckClick();
	}

}
