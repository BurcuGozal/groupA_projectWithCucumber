@burcu
Feature: As a user, I want to be able to use Size link from the Filters list and narrow down the obtions to find the most suitable car for me.

Scenario: Verify if Size option in the list has Compact, Mid-size and Full-size options 
Given The user is on the homepage
When The user clicks on Shop All Cars button
And The user clicks on Size option from the Filter list
Then The user should see Compact, Mid-size, Full-size car options

|Compact  |
|Mid-size |
|Full-size|


#Scenario: Verify if when user click on the Compact option of Size filter, the Compact will be seen in URL, as well
#Given The user is on the homepage
#When The user clicks on Shop All Cars button
#And The user clicks on Size options and then clicks on Compact
#Then The user should be able to see the "Compact" in websites URL, as well