@nihal
Feature: As a user ,I should be able to schedule for Appraisal

  Scenario: Verify the Schedule an Appraisal link works
    Given The User is on the homepage
    When The user scroll down the page
    Then The user clicks on Schedule an Appraisal Link
    And The user should be able to see "Schedule your free, custom offer" text



    Scenario: Schedule an appraisal
      Given The User is on the homepage
      When The user scroll down the page
      Then The user clicks on Schedule an Appraisal Link
      And the user enters the credentials for schedule
      And the user should see the "AppointmentForm" in the url








