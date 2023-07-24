package Tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.registerpage;

public class registertest extends basetest{
@Test
public void Register() {
	
	extenttest = extent.startTest("registerpage");
	
registerpage login = new registerpage(driver);




login.clicknew();
login.startHere();



login.enterName();



login.enterPhone();





login.enterPasscode();
login.clickSubmit();

extenttest.log(LogStatus.PASS, " test passed successfully");
extent.endTest(extenttest);

}



}
