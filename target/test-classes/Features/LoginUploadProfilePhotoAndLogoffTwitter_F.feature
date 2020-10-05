@IndividualScenario
Feature: LoginTwitter, UploadProfilePhoto and LogoffTwitter

  @LoginUploadProfilePhotoAndLogoffTwitter
  Scenario Outline: LoginUploadProfilePhotoAndLogoffTwitter
    Given launch browser
    When open twitter <url>
    And click signin button
    And enter <username> and <password>
    And click login button
    Then verify url and title after successful login
    When click the profile image button on home page
    And click the edit profile button
    And click the profile photo image button
    And enter the <absoluteFilePath> to upload photo
    And click the Apply button
    And click the Save button
    When click the profile image button
    And click the logout user button
    And click the logout final button
    Then verify url and title after successful logoff
    And close browser

    Examples: 
      | url                 | username   | password    | absoluteFilePath |
      | https://twitter.com | XXXXXXXXXX | XXXXXXXXXXX | c:\\pic1.jpg     |
