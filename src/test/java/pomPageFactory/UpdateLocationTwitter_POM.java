package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateLocationTwitter_POM {
WebDriver driver;
	
	public UpdateLocationTwitter_POM(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[5]/label/div/div[2]/div/input")
	@CacheLookup
	WebElement txtBox_Location;
	
	public void sendkey_txtBox_Bio(String newLocation) {
		txtBox_Location.clear();
		txtBox_Location.sendKeys(newLocation);
	}

}
