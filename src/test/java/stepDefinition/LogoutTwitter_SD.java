package stepDefinition;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pomPageFactory.LoginTwitter_POM;
import pomPageFactory.LogoutTwitter_POM;

public class LogoutTwitter_SD {	

	public WebDriver driver = null;
	public LoginTwitter_POM loginTwitter;
	public LogoutTwitter_POM logoutTwitter;
	
	public LogoutTwitter_SD (LoginTwitter_SD webDriver) {
		driver = LoginTwitter_SD.get_driver_login_twitter();
	}
	
	@When("click the profile image button")
	public void click_the_profile_image_button() throws InterruptedException {
		Thread.sleep(5000);
		logoutTwitter = new LogoutTwitter_POM(driver);
		logoutTwitter.click_imgBtn_ProfileMenu();
		Thread.sleep(5000);
	}

	@And("click the logout user button")
	public void click_the_logout_user_button() throws InterruptedException {
		logoutTwitter = new LogoutTwitter_POM(driver);
		logoutTwitter.click_btn_LogoutUser();
		Thread.sleep(5000);
	}

	@And("click the logout final button")
	public void click_the_logout_final_button() throws InterruptedException {
		logoutTwitter = new LogoutTwitter_POM(driver);
		logoutTwitter.click_btn_LogoutFinal();
		Thread.sleep(10000);
	}

	@And("verify url and title after successful logoff")
	public void verify_url_and_title_after_successful_logoff() throws InterruptedException {
	    String url = driver.getCurrentUrl();
	    String title = driver.getTitle();
	    
	    assertTrue(url.contains("https://twitter.com/?logout"));	    
	    assertTrue(title.contains("Twitter. It’s what’s happening / Twitter"));
	}
	
	@And("close browser")
	public void close_browser() throws InterruptedException {
		driver.close();
		Thread.sleep(2000);
	}
}
