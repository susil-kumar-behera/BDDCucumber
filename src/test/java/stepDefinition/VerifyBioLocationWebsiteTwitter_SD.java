package stepDefinition;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pomPageFactory.LoginTwitter_POM;
import pomPageFactory.VerifyBioLocationWebsiteTwitter_POM;

public class VerifyBioLocationWebsiteTwitter_SD {
	public WebDriver driver = null;
	public LoginTwitter_POM loginTwitter;
	public VerifyBioLocationWebsiteTwitter_POM updateAndVerifyBioLocationWebsiteTwitter;
	
	public VerifyBioLocationWebsiteTwitter_SD (LoginTwitter_SD webDriver) {
		driver = LoginTwitter_SD.get_driver_login_twitter();
	}

	@Then("^Verify (.*) bio$")
	public void Verify_new_bio(String newBio) throws InterruptedException {
		updateAndVerifyBioLocationWebsiteTwitter = new VerifyBioLocationWebsiteTwitter_POM(driver);
		String updatedBio = updateAndVerifyBioLocationWebsiteTwitter.getText_label_Bio();
		Thread.sleep(5000);
		assertEquals(newBio, updatedBio);
	}

	@Then("^Verify (.*) location$")
	public void Verify_new_location(String newLocation) throws InterruptedException {
		updateAndVerifyBioLocationWebsiteTwitter = new VerifyBioLocationWebsiteTwitter_POM(driver);
		String updatedLocation = updateAndVerifyBioLocationWebsiteTwitter.getText_label_Location();
		Thread.sleep(5000);
		assertEquals(newLocation, updatedLocation);
	}

	@Then("^Verify (.*) website$")
	public void Verify_new_website(String newWebsite) throws InterruptedException {
		updateAndVerifyBioLocationWebsiteTwitter = new VerifyBioLocationWebsiteTwitter_POM(driver);
		String updatedWebsite = updateAndVerifyBioLocationWebsiteTwitter.getText_label_Website();
		Thread.sleep(5000);
		assertEquals(newWebsite, updatedWebsite);
	}
}
