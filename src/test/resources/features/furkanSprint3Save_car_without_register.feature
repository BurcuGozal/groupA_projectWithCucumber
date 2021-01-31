@saveCar
Feature: Save car
As a user I should be able to like a car without register and see it in saved cars menu

Scenario: Verify saved car

Given : The user is on homepage
When : The user enters a model in searchbox and enter
And : The user like any car from that page
And : The user clicks on heart button on homepage
Then : The user should be able to see the car that he liked