package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadProfilePhotoTwitter_POM {
	
	WebDriver driver;
	
	public UploadProfilePhotoTwitter_POM(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-14lw9ot r-atwnbb']/div/div/div/div/div/a/div[2]")
	@CacheLookup
	WebElement imgBtn_Profile;
	
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-obd0qt r-18u37iz r-1w6e6rj r-1h0z5md r-dnmrzs']/a/div/span/span")
	@CacheLookup
	WebElement btn_EditProfile;
	
	
	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]")
	@CacheLookup
	WebElement imgBtn_ProfilePhoto;
	
	
	@FindBy(xpath = "//*[@id=\"layers\"]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/div[3]/div/div/span/span")
	@CacheLookup
	WebElement btn_Apply;
	
	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/div[3]/div/div/span/span")
	@CacheLookup
	WebElement btn_Save;
	
	public void click_imgBtn_Profile() {
		imgBtn_Profile.click();
	}
	
	public void click_btn_EditProfile() {
		btn_EditProfile.click();
	}
	
	public void click_imgBtn_ProfilePhoto() {
		imgBtn_ProfilePhoto.click();
	}
	
	public void click_btn_Apply() {
		btn_Apply.click();
	}
	
	public void click_btn_Save() {
		btn_Save.click();
	}

}
