package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyBioLocationWebsiteTwitter_POM {
	WebDriver driver;
	
	public VerifyBioLocationWebsiteTwitter_POM(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div/span")
	@CacheLookup
	WebElement label_Bio;
	
	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div[4]/div/span[1]/span/span")
	@CacheLookup
	WebElement label_Location;
	
	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div[4]/div/a")
	@CacheLookup
	WebElement label_Website;
	
	public String getText_label_Location() {
		return label_Location.getText();
	}
	
	public String getText_label_Website() {
		return label_Website.getText();
	}
	
	public String getText_label_Bio() {
		return label_Bio.getText();
	}
}
