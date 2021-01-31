@updateProfile
Feature: Update profile

Scenario: Verify message after updating profile

Given The user is on homepage
When The user clicks on profile icon and select sign in
And The user enters correct credentials and click on sign in
And The user clicks on profile icon and select my profile
And The user enters following information

|address       |zip     |state   |city      |phoneNo       |
|123 happy st  |75040   |Tx      |Lakecity  |4698101219    |

And The user clicks on update profile button
Then The user should see "Your profile has been updated" message

