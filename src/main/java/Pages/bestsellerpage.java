package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class bestsellerpage {
	
	WebDriver driver;
	public bestsellerpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
		
	}
	@FindBy(how=How.XPATH, using = "//a[normalize-space()='Best Sellers']")
	public WebElement clickbestseller ;
	
	@FindBy(how= How.XPATH, using = "//div[@role='treeitem']//a[contains(text(),'Books')]")
	public WebElement     comicsbooks          ;
	
	
	@FindBy(how= How.XPATH, using = "//div[normalize-space()='Shrimad Bhagwat Geeta Yatharoop']")
	public WebElement clickbook;
	
	public void home() {
		
		clickbestseller.click();
		
	}
	public void comicbook() {
		comicsbooks.click();
	}
    public void product() {
    	
    	clickbook.click();
    }
}
