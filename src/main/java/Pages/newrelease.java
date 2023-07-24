package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class newrelease {
	WebDriver driver;
	public newrelease(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	@FindBy(how=How.XPATH, using = "//span[@class='hm-icon-label']")
	public WebElement clickall ;
	
	@FindBy(how=How.XPATH, using = "//ul[@class='hmenu hmenu-visible']//a[@class='hmenu-item'][normalize-space()='New Releases']")
	public WebElement newrelease ;
	
	
	
	
	public void all() {
		clickall.click();
	}
	public void newrelease_click() {
		newrelease.click();	
	}
	
	
	
	

}
