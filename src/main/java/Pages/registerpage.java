package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class registerpage {
WebDriver driver;





public registerpage(WebDriver driver) {





PageFactory.initElements(driver, this);
this.driver = driver;
}



public void RegistrationPage(WebDriver driver) {

PageFactory.initElements(driver, this);
this.driver = driver;
}

@FindBy(how=How.XPATH,using="//*[@id=\"nav-link-accountList-nav-line-1\"]")
public WebElement New;


@FindBy(how=How.XPATH,using="//*[@id=\"createAccountSubmit\"]")
public WebElement start;


@FindBy(how=How.XPATH,using="//*[@id=\"ap_customer_name\"]")
public WebElement yourName;



@FindBy(how=How.XPATH,using="//*[@id=\"ap_phone_number\"]")
public WebElement phone;



@FindBy(how=How.XPATH,using="//*[@id=\"ap_password\"]")
public WebElement passcode;

@FindBy(how=How.XPATH,using="//*[@id=\"continue\"]")
public WebElement submit;



public void clicknew() {
New.click();
}
public void startHere() {
start.click();
}

public void enterName() {
yourName.sendKeys("Sayan Hazra");
}

public void enterPhone() {
phone.sendKeys("7029721216");
}



public void enterPasscode() {
passcode.sendKeys("maven_selenium");
}

public void clickSubmit() {
submit.click();
}



}
