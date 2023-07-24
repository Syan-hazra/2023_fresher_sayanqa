package Tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.newrelease;

public class releasetest extends basetest {
	@Test
	
	public void new_release() {
		
		extenttest = extent.startTest("release test");
		
		newrelease new_release= new newrelease(driver); 
		
		new_release.all();
		new_release.newrelease_click();
		
		extenttest.log(LogStatus.PASS, " test passed successfully");
		extent.endTest(extenttest);
	}
	

}
