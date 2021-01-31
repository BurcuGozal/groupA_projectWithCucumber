@nastya
	Feature: Check filters functions
	As a user I want to be able to see options of the filters
	
	Background:
		Given user is on the home page
		And the user click on the "See Cars In Your Budget"
		
	Scenario: Checking Functionality of the Filters
		When user click on the "<filter>"
		Then user should see all the "<filter>" options as "<options>"
		
		|			filter			|			options			|
		|		|		|
		|		|		|
		|		|		|
		|		|		|
		|		|		|
		|		|		|
		|		|		|
		|		|		|
		|		|		|
		|		|		|
		|		|		|
		|		|		|
		|		|		|
		
		