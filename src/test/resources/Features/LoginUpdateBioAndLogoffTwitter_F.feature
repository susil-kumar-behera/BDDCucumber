@IndividualScenario
Feature: LoginTwitter, UpdateBio and logoffTwitter

  @LoginUpdateBioAndlogoffTwitter
  Scenario Outline: UpdateBio
    Given launch browser
    When open twitter <url>
    And click signin button
    And enter <username> and <password>
    And click login button
    Then verify url and title after successful login
    When click the profile image button on home page
    And click the edit profile button
    And update <newBio> on your account
    And click the Save button
    Then Verify <newBio> bio
    When click the profile image button
    And click the logout user button
    And click the logout final button
    Then verify url and title after successful logoff
    And close browser

    Examples: 
      | url                 | username   | password    | newBio      |
      | https://twitter.com | XXXXXXXXXX | XXXXXXXXXXX | BIO Message |
