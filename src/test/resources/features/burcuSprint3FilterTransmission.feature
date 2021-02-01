@burcu
Feature: As a user, I want to be able to use Transmission options from the Filters link to narrow down the obtions and to find the most suitable car for me.

Scenario: Verify if the Transmission option in the list has three options
Given The user is on the homepage
When The user clicks on Shop All Cars button
And The user clicks on the Transmission option 
Then The user should see three option is listed as follows

|Automatic     |
|Manual 4 Speed|
|Manual 5 Speed|
|Manual 6 Speed|


#Scenario: Verify if after clicking on Automatic from the Transmission link, the websites URL contains Automatic 
#Given The user is on the homepage
#When The user clicks on Shop All Cars button
#And The user clicks on the Transmission and then clicks on Automatic options
#Then The user can see the "Automatic" in the websites URL