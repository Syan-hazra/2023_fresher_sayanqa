package Tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.bestsellerpage;

public class bestsellertest extends basetest{
	@Test
	
	public void bestseller() {
		extenttest = extent.startTest("bestsellerpage");
		
		bestsellerpage bestseller = new bestsellerpage(driver);
		
		bestseller.home();
		bestseller.comicbook();
		bestseller.product();
		
		extenttest.log(LogStatus.PASS, " test passed successfully");
		extent.endTest(extenttest);
	}
}

