@nihal
Feature:As a user I should be able to see CarMax social responsibility projects

  Scenario:Verify social responsibility link
    Given The User is on the homepage
    When The user scroll down the page
    Then The user clicks on Social Responsibility link
    And The url should contain "socialresponsibility"