package stepDefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pomPageFactory.LoginTwitter_POM;
import pomPageFactory.UpdateBioTwitter_POM;

public class UpdateBioTwitter_SD {
	public WebDriver driver = null;
	public LoginTwitter_POM loginTwitter;
	public UpdateBioTwitter_POM updateBioTwitter;
	
	public UpdateBioTwitter_SD (LoginTwitter_SD webDriver) {
		driver = LoginTwitter_SD.get_driver_login_twitter();
	}

	@And("^update (.*) on your account$")
	public void update_newBio_on_your_account(String newBio) throws InterruptedException {
		updateBioTwitter = new UpdateBioTwitter_POM(driver);
		updateBioTwitter.sendkey_txtBox_Bio(newBio);
		Thread.sleep(5000);
	}
}
