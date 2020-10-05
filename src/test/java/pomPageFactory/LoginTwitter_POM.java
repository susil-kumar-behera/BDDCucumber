package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTwitter_POM {	
	WebDriver driver;
	
	public LoginTwitter_POM(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//div[@dir='auto' and @class='css-901oao r-1awozwy r-13gxpu9 r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-vw2c0b r-1777fci r-eljoum r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0']")
	@CacheLookup
	WebElement btn_Signin;
	
	
	@FindBy(xpath = "//input[@name='session[username_or_email]' and @class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-1inuy60 r-utggzx r-vmopo1 r-1w50u8q r-1lrr6ok r-1dz5y72 r-fdjqy7 r-13qz1uu']")
	@CacheLookup
	WebElement txtBox_PhoneEmailUsername;
	
	
	@FindBy(xpath = "//input[@name='session[password]' and @class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-1inuy60 r-utggzx r-vmopo1 r-1w50u8q r-1lrr6ok r-1dz5y72 r-fdjqy7 r-13qz1uu']")
	@CacheLookup
	WebElement txtBox_Password;
	
	
	@FindBy(xpath = "//div[@class='css-18t94o4 css-1dbjc4n r-urgr8i r-42olwf r-sdzlij r-1phboty r-rs99b7 r-1w2pmg r-vlx1xi r-zg41ew r-1jayybb r-17bavie r-1ny4l3l r-15bsvpr r-o7ynqc r-6416eg r-lrvibr']/div")
	@CacheLookup
	WebElement btn_Login;
	
	public void click_btn_Signin() {
		btn_Signin.click();
	}
	
	public void sendkey_txtBox_PhoneEmailUsername(String username) {
		txtBox_PhoneEmailUsername.clear();
		txtBox_PhoneEmailUsername.sendKeys(username);
	}
	
	public void sendkey_txtBox_Password(String password) {
		txtBox_Password.clear();
		txtBox_Password.sendKeys(password);
	}
	
	public void click_btn_Login() {
		btn_Login.click();
	}
}
