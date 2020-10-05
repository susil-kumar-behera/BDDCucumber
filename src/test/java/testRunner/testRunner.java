package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinition"},
        monochrome = true,
        tags = "@AllScenarios"
//        tags = "@IndividualScenario"
//        tags = "@LoginAndLogoffTwitter or @LoginUpdateBioAndlogoffTwitter or @LoginUpdateBioLocationWebsiteAndLogoffTwitter or @LoginUpdateLocationAndLogoffTwitter or @LoginUpdateVerifyBioLocationWebsiteAndLogoffTwitter or @LoginUpdateWebsiteAndLogoffTwitter or @LoginUploadProfilePhotoAndLogoffTwitter or @LoginVerifyBioLocationWebsiteAndLogoffTwitter or @OpenTwitterPageOfTOIAndRetrieveTweetsPublishedInLast2Hours"
        
        )
public class testRunner {

}