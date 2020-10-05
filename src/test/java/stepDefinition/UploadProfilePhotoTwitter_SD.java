package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pomPageFactory.LoginTwitter_POM;
import pomPageFactory.UploadProfilePhotoTwitter_POM;

public class UploadProfilePhotoTwitter_SD {	

	public static WebDriver driver = null;
	public LoginTwitter_POM loginTwitter;
	public UploadProfilePhotoTwitter_POM uploadProfilePhotoTwitter;
	
	public UploadProfilePhotoTwitter_SD (LoginTwitter_SD webDriver) {
		driver = LoginTwitter_SD.get_driver_login_twitter();
	}
	
	@When("click the profile image button on home page")
	public void click_the_profile_image_button_on_home_page() throws InterruptedException {
		uploadProfilePhotoTwitter = new UploadProfilePhotoTwitter_POM(driver);
		uploadProfilePhotoTwitter.click_imgBtn_Profile();
		Thread.sleep(5000);
	}

	@And("click the edit profile button")
	public void click_the_edit_profile_button() throws InterruptedException {
		uploadProfilePhotoTwitter = new UploadProfilePhotoTwitter_POM(driver);
		uploadProfilePhotoTwitter.click_btn_EditProfile();
		Thread.sleep(5000);
	}

	@And("click the profile photo image button")
	public void click_the_profile_photo_image_button() throws InterruptedException {
		uploadProfilePhotoTwitter.click_imgBtn_ProfilePhoto();
		Thread.sleep(5000);
	}

	@And("^enter the (.*) to upload photo$")
	public void enter_the_absoluteFilePath_to_upload_photo(String absoluteFilePath) throws AWTException {
		Robot robot = new Robot();
		robot.setAutoDelay(5000);
		
		StringSelection stringSelection = new StringSelection(absoluteFilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);		
		robot.setAutoDelay(5000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);		
		robot.setAutoDelay(5000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		
		robot.setAutoDelay(5000);
	}

	@And("click the Apply button")
	public void click_the_Apply_button() throws InterruptedException {
		uploadProfilePhotoTwitter.click_btn_Apply();
		Thread.sleep(5000);
	}

	@And("click the Save button")
	public void click_the_Save_button() throws InterruptedException {
		uploadProfilePhotoTwitter.click_btn_Save();
		Thread.sleep(10000);
	}
}
