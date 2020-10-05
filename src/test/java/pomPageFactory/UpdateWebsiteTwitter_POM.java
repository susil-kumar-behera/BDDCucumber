package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateWebsiteTwitter_POM {
	WebDriver driver;
	
	public UpdateWebsiteTwitter_POM(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[6]/label/div/div[2]/div/input")
	@CacheLookup
	WebElement txtBox_Website;
	
	public void sendkey_txtBox_Bio(String newWebsite) {
		txtBox_Website.clear();
		txtBox_Website.sendKeys(newWebsite);
	}
}
