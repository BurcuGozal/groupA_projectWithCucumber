@nastya 
Feature: Check filters functions 
	As a user I want to be able to see options of the filters
	
Background: 
	Given User is on the home page 
	And The user click on the "See Cars In Your Budget" 
	
Scenario: Checking Functionality of the Filters 
	When User click on the "Make" 
	Then User should see all the options 
	
		|		Acura			|
		|		Audi			|
		|		BMW				|
		|		Buick			|
		|		Cadillac		|
		|		Chevrolet		|
		|		Chrysler		|
		|		Dodge			|
		|		Fiat			|
		|		Ford			|
		|		GMC				|
		|		Honda			|
		|		Hyundai			|
		|		Infiniti		|
		|		Jeep			|
		|		Kia				|
		|		Lexus			|
		|		Lincoln			|
		|		Mazda			|
		|		Mercedes-Benz	|
		|		Mini			|
		|		Mitsubishi		|
		|		Nissan			|
		|		Scion			|
		|		Subaru			|
		|		Toyota			|
		|		Volkswagen		|
		|		Volvo			|
		
		
		