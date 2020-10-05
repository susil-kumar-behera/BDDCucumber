@IndividualScenario
Feature: LoginTwitter and LogoffTwitter

  @LoginAndLogoffTwitter
  Scenario Outline: LoginAndLogoutTwitter
    Given launch browser
    When open twitter <url>
    And click signin button
    And enter <username> and <password>
    And click login button
    Then verify url and title after successful login
    And get driver login twitter
    When click the profile image button
    And click the logout user button
    And click the logout final button
    Then verify url and title after successful logoff
    And close browser

    Examples: 
      | url                 | username   | password    |
      | https://twitter.com | XXXXXXXXXX | XXXXXXXXXXX |
