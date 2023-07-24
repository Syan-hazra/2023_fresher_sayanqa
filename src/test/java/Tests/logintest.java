package Tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.loginpage;

public class logintest extends basetest{
@Test
public void validLogin() {
	
	extenttest = extent.startTest("login");
	
loginpage login = new loginpage(driver);




login.clicksignin();



login.enteruserName();



login.clickSubmit();



login.enterPassword();



login.inside();


extenttest.log(LogStatus.PASS, " test passed successfully");
extent.endTest(extenttest);

}



}
