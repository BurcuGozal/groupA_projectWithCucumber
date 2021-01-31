@register
Feature: Verify registeration 

Scenario Outline: Verify registeration with right credentials

Given The user is on homepage
When The user clicks on profile icon and clicks on register 
And The user enters "<firstName>" in first name field 
And The user enters "<lastName>" in last name field
And The user enters "<email>" in email field
And The user enters "<password>" in password field
And The user enters "<confirmPassword>" in confirm password field
And The user clicks on register button
When The user clicks on profile icon and select profile
Then The user should be able to see his "<firstName>"

Examples:
|firstName |lastName |email             |password   |confirmPassword |
|Jo        |Biden    |jbiden15@gmail.com |johndoe1   |johndoe1        |
|Henry     |Biden    |hbiden15@gmail.com |johndoe1   |johndoe1        |
|Alex      |Biden    |abiden15@gmail.com |johndoe1   |johndoe1        |