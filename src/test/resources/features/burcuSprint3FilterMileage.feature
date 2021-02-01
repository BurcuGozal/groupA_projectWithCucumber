@burcu
Feature: As a user, I want to be able to use Mileage option from the Filters link to narrow down the options to and find most the suitable car for me.

Scenario: Verify if the Mileage option provides a drop-down list to choose desired mileage
Given The user is on the homepage
When The user clicks on Shop All Cars button
And The user click on the Mileage option
Then The user should see a drop-down list of mileages

