package Tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.Searchpage;


public class searchtest  extends basetest{
	@Test
	
	public void search() {
		
		extenttest = extent.startTest("Search ");
		
		Searchpage search = new Searchpage(driver);
	
		search.entersearch("Boat storm smart watch ");
	
	search.clicksubmit();
	
	extenttest.log(LogStatus.PASS, " test passed successfully");
	extent.endTest(extenttest);
	
	
	}
	

}
