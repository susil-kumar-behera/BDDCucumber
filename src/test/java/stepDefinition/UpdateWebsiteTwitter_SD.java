package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pomPageFactory.LoginTwitter_POM;
import pomPageFactory.UpdateWebsiteTwitter_POM;

public class UpdateWebsiteTwitter_SD {
	public WebDriver driver = null;
	public LoginTwitter_POM loginTwitter;
	public UpdateWebsiteTwitter_POM updateWebsiteTwitter;
	
	public UpdateWebsiteTwitter_SD (LoginTwitter_SD webDriver) {
		driver = LoginTwitter_SD.get_driver_login_twitter();
	}

	@And("^update (.*) on the twitter account$")
	public void update_newWebsite_on_the_twitter_account(String newWebsite) throws InterruptedException {
		updateWebsiteTwitter = new UpdateWebsiteTwitter_POM(driver);
		updateWebsiteTwitter.sendkey_txtBox_Bio(newWebsite);
		Thread.sleep(5000);
	}
}
