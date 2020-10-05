package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.*;
import pomPageFactory.OpenTwitterPageOfTOIAndRetrieveTweetsPublishedInLast2Hours_POM;

public class OpenTwitterPageOfTOIAndRetrieveTweetsPublishedInLast2Hours_SD {
	public static WebDriver driver = null;
	public OpenTwitterPageOfTOIAndRetrieveTweetsPublishedInLast2Hours_POM openTwitterPageOfTOIAndRetrieveTweetsPublishedInLast2Hours;
	
	@Given("^launch browser and open twitter page of TOI (.*)$")
	public void launch_browser_and_open_twitter_page_of_TOI_url(String url) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    
		driver.get(url);
		Thread.sleep(5000);
	}
	
	@When("^retrieve and verify all tweets published in last (.*) hours$")
	public void retrieve_and_verify_all_tweets_published_in_last_givenHours_hours(int givenHours) throws InterruptedException {
		openTwitterPageOfTOIAndRetrieveTweetsPublishedInLast2Hours = new OpenTwitterPageOfTOIAndRetrieveTweetsPublishedInLast2Hours_POM(driver);
		String tweet1 = openTwitterPageOfTOIAndRetrieveTweetsPublishedInLast2Hours.getText_label_Tweet1();
		Thread.sleep(5000);
		
		System.out.println("Latest Tweet - whole string: " + tweet1);
		
		int tweetLength = tweet1.length();
		for(int i = 0; i <= tweetLength; i=i+50) {
			if(i+50 <= tweetLength) {
				System.out.println("Tweets by spliting into 50 characters: " + tweet1.substring(i, i+50));
			} else {
				System.out.println("Tweets by spliting into 50 characters: " + tweet1.substring(i, tweetLength));
			}
		}
	}
	
	@When("close the browser opened with twitter page of TOI")
	public void close_the_browser_opened_with_twitter_page_of_TOI() throws InterruptedException {
		driver.close();
	}
}
