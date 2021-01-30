@nastya
Feature: As a user I want to be able to see research of popular used cars and SUVs
		Also I want to be able to see Best Midsize SUVs
		
		Background:
			Given The user is on the home page
	
		Scenario: Verify the link
		
		When The user scrolls down to the Popular Reasearch
		Then The user should see the links

		|	Research Best-Selling Cars	|
		|	Research AWD Cars			|
		|	Research Hybrid Cars		|
		|	Research SUVs				|
		|	Research Compact SUVs		|
		|	Research Midsize SUVs		|
		
		
			
		Scenario: Verify page contains Best Midsize Suvs car selection
		
			When The user clicks on the link "Reasearch Midsize SUVs"
			Then The user should be able to see car selection
			
			|		Toyota Venza			|
			|		Acura MDX				|
			|		Dodge Journey			|
			|		Nissan Murano			|
			|		Jeep Grand Cherokee		|
			|		Ford Edge				|
			|		Toyota 4Runner			|
			|		Toyota Highlander		|
			|		Hyundai Santa Fe		|
			|		Kia Sorento				|
		