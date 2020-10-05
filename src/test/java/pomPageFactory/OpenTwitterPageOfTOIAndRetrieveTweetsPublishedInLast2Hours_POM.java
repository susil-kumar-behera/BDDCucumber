package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTwitterPageOfTOIAndRetrieveTweetsPublishedInLast2Hours_POM {
	WebDriver driver;
	
	public OpenTwitterPageOfTOIAndRetrieveTweetsPublishedInLast2Hours_POM(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[2]/section/div/div/div[1]/div/div/article/div/div/div/div[2]/div[2]/div[2]/div[1]/div/span")
	@CacheLookup
	WebElement label_Tweet1;
	
	public String getText_label_Tweet1() {
		return label_Tweet1.getText();
	}
}