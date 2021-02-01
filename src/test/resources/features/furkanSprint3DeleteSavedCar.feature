@furkan
Feature: Delete saved cars

As a user, I want to be able sucessfully delete the car I liked before

   Scenario Outline: Verify message after deleting the car
   
   	Given The User is on the homepage
   	And The user clicks on sign in button and enter correct credentials
   	Then The user enters "<model>" in search box
   	And The user likes the car number "<number>"
   	And The user clicks on saved cars button
   	Then The user should be able to see "<model>" in the description
   	When The user clicks on trash icon
   	Then "<message>" message should appear
   	
Examples:
|model     |number    |message                         |
|Kia       |3         |Your saved car has been deleted |
|Nissan    |5         |Your saved car has been deleted | 
|Ford      |7         |Your saved car has been deleted |  

