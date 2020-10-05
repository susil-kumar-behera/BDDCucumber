package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutTwitter_POM {
	
	WebDriver driver;
	
	public LogoutTwitter_POM(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div[2]/div/div/div/div/div[2]")
	@CacheLookup
	WebElement imgBtn_ProfileMenu;
	
	
	@FindBy(xpath = "//*[@id=\"layers\"]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/a[2]/div/div")
	@CacheLookup
	WebElement btn_LogoutUser;
	
	
	@FindBy(xpath = "//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div[3]/div[2]/div/span/span")
	@CacheLookup
	WebElement btn_LogoutFinal;
	
	public void click_imgBtn_ProfileMenu() {
		imgBtn_ProfileMenu.click();
	}
	
	public void click_btn_LogoutUser() {
		btn_LogoutUser.click();
	}
	
	public void click_btn_LogoutFinal() {
		btn_LogoutFinal.click();
	}
}
