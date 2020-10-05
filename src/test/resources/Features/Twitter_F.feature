@AllScenarios
Feature: loginTwitter, UploadProfilePhoto, UpdateBio, UpdateLocation, UpdateWebsite

  @LoginTwitter
  Scenario Outline: loginTwitter
    Given launch browser
    When open twitter <url>
    And click signin button
    And enter <username> and <password>
    And click login button
    Then verify url and title after successful login
    And get driver login twitter

    Examples: 
      | url                 | username   | password    |
      | https://twitter.com | XXXXXXXXXX | XXXXXXXXXXX |

  @UploadProfilePhoto
  Scenario Outline: UploadProfilePhoto
    Given verify url and title after successful login
    When click the profile image button on home page
    And click the edit profile button
    And click the profile photo image button
    And enter the <absoluteFilePath> to upload photo
    And click the Apply button
    And click the Save button
    And get driver login twitter

    Examples: 
      | absoluteFilePath |
      | c:\\pic2.jpg     |

  @UpdateBio
  Scenario Outline: UpdateBio
    Given verify url and title after successful login
    When click the edit profile button
    And update <newBio> on your account
    And click the Save button
    And get driver login twitter

    Examples: 
      | newBio      |
      | CucumberBDD |

  @UpdateLocation
  Scenario Outline: UpdateLocation
    Given verify url and title after successful login
    When click the edit profile button
    And update <newLocation> on your twitter account
    And click the Save button
    And get driver login twitter

    Examples: 
      | newLocation  |
      | Banki, India |

  @UpdateWebsite
  Scenario Outline: UpdateWebsite
    Given verify url and title after successful login
    When click the edit profile button
    And update <newWebsite> on the twitter account
    And click the Save button
    And get driver login twitter

    Examples: 
      | newWebsite  |
      | twitter.com |

  @VerifyBioLocationWebsite
  Scenario Outline: VerifyBioLocationWebsite
    Given verify url and title after successful login
    Then Verify <newBio> bio
    And Verify <newLocation> location
    And Verify <newWebsite> website
    And get driver login twitter

    Examples: 
      | newBio      | newLocation  | newWebsite  |
      | CucumberBDD | Banki, India | twitter.com |

  @LogoffTwitter
  Scenario Outline: LogoffTwitter
    When click the profile image button
    And click the logout user button
    And click the logout final button
    Then verify url and title after successful logoff
    And close browser

  @OpenTwitterPageOfTOIAndRetrieveTweetsPublishedInLast2Hours
  Scenario Outline: LoginAndLogoutTwitter
    Given launch browser and open twitter page of TOI <url>
    When retrieve and verify all tweets published in last <givenHours> hours
    Then close the browser opened with twitter page of TOI

    Examples: 
      | url                              | givenHours |
      | https://twitter.com/timesofindia |          2 |
