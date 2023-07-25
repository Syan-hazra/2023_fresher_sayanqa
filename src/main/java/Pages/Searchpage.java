package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {
	WebDriver driver;
	public Searchpage(WebDriver driver) {
		PageFactory.initElements(driver , this);
		this.driver= driver;
	}
	@FindBy(how= How.XPATH,using = "//input[@id='twotabsearchtextbox']")
	public WebElement searchBarTEXT;
	
	
	
	@FindBy(how = How.XPATH,using = "//input[@id='nav-search-submit-button']")
	public WebElement submitBTTN;
	
	 
	
	public void entersearch(String user) {
		searchBarTEXT.sendKeys(user);
	}
 
	
	public void clicksubmit() {
	 
	
	 submitBTTN.click();
 }
}
