package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pomPageFactory.LoginTwitter_POM;
import pomPageFactory.UpdateLocationTwitter_POM;

public class UpdateLocationTwitter_SD {
	public WebDriver driver = null;
	public LoginTwitter_POM loginTwitter;
	public UpdateLocationTwitter_POM updateLocationTwitter;
	
	public UpdateLocationTwitter_SD (LoginTwitter_SD webDriver) {
		driver = LoginTwitter_SD.get_driver_login_twitter();
	}

	@And("^update (.*) on your twitter account$")
	public void update_newLocation_on_your_twitter_account(String newLocation) throws InterruptedException {
		updateLocationTwitter = new UpdateLocationTwitter_POM(driver);
		updateLocationTwitter.sendkey_txtBox_Bio(newLocation);
		Thread.sleep(5000);
	}

}
