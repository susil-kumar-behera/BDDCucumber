package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateBioTwitter_POM {
	WebDriver driver;
	
	public UpdateBioTwitter_POM(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[4]/label/div/div[2]/div/textarea")
	@CacheLookup
	WebElement txtBox_Bio;
	
	public void sendkey_txtBox_Bio(String bioText) {
		txtBox_Bio.clear();
		txtBox_Bio.sendKeys(bioText);
	}
}
