@IndividualScenario
Feature: LoginTwitter, UpdateWebsite and LogoffTwitter

  @LoginUpdateWebsiteAndLogoffTwitter
  Scenario Outline: LoginUpdateWebsiteAndLogoffTwitter
    Given launch browser
    When open twitter <url>
    And click signin button
    And enter <username> and <password>
    And click login button
    Then verify url and title after successful login
    When click the profile image button on home page
    And click the edit profile button
    And update <newWebsite> on the twitter account
    And click the Save button
    And Verify <newWebsite> website
    When click the profile image button
    And click the logout user button
    And click the logout final button
    Then verify url and title after successful logoff
    And close browser

    Examples: 
      | url                 | username   | password    | newWebsite  |
      | https://twitter.com | XXXXXXXXXX | XXXXXXXXXXX | twitter.com |
