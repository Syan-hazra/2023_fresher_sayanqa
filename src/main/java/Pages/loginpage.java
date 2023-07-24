package Pages;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class loginpage {
WebDriver driver;





public loginpage(WebDriver driver) {





PageFactory.initElements(driver, this);
this.driver = driver;
}



public void LogInPage(WebDriver driver) {

PageFactory.initElements(driver, this);
this.driver = driver;
}
@FindBy(how=How.XPATH,using="//span[@id='nav-link-accountList-nav-line-1']")
public WebElement signin;



@FindBy(how=How.XPATH,using="//input[@id='ap_email']")
public WebElement userName;

@FindBy(how=How.XPATH,using="//input[@id='continue']")
public WebElement submit;

@FindBy(how=How.XPATH,using="//input[@id='ap_password']")
public WebElement password;

@FindBy(how=How.XPATH,using="//input[@id='signInSubmit']")
public WebElement sign;



public void clicksignin() {
signin.click();
}

public void enteruserName() {
userName.sendKeys("7029721216");
}

public void clickSubmit() {
submit.click();
}
public void enterPassword() {
password.sendKeys("maven_selenium");
}

public void inside() {
sign.click();
}


}
