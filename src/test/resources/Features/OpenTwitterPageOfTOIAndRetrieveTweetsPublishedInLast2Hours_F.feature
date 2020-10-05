@IndividualScenario
Feature: LoginTwitter and LogoffTwitter

  @OpenTwitterPageOfTOIAndRetrieveTweetsPublishedInLast2Hours
  Scenario Outline: LoginAndLogoutTwitter
    Given launch browser and open twitter page of TOI <url>
    When retrieve and verify all tweets published in last <givenHours> hours
    Then close the browser opened with twitter page of TOI

    Examples: 
      | url                              | givenHours |
      | https://twitter.com/timesofindia |          2 |