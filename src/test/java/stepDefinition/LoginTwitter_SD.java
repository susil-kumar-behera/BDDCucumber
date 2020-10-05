package stepDefinition;

import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.*;
import pomPageFactory.LoginTwitter_POM;

public class LoginTwitter_SD {	

	public static WebDriver driver = null;
	public LoginTwitter_POM loginTwitter;
	
	@Given("launch browser")
	public void launch_browser() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	@When("^open twitter (.*)$")
	public void open_twitter_url(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000);
	}

	@And("click signin button")
	public void click_signin_button() throws InterruptedException {
		loginTwitter = new LoginTwitter_POM(driver);
		loginTwitter.click_btn_Signin();
		Thread.sleep(5000);
	}

	@And("^enter (.*) and (.*)$")
	public void enter_username_and_password(String username, String password) throws InterruptedException {
		loginTwitter.sendkey_txtBox_PhoneEmailUsername(username);
		Thread.sleep(2000);
		loginTwitter.sendkey_txtBox_Password(password);
	    Thread.sleep(2000);
	}

	@And("click login button")
	public void click_login_button() throws InterruptedException {
		loginTwitter.click_btn_Login();
		Thread.sleep(2000);
	}

	@Then("verify url and title after successful login")
	public void verify_url_and_title_after_successful_login() {
	    String url = driver.getCurrentUrl();
	    String title = driver.getTitle();
	    
	    assertTrue(url.contains("https://twitter.com"));	    
	    assertTrue(title.contains("/ Twitter"));
	}

	@Then("get driver login twitter")
	public static WebDriver get_driver_login_twitter() {	    
	    return driver;
	}
}
