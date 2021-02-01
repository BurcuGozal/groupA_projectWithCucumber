@nastya
Feature: Sort By Options 
	As a user I want to be able to see all Sort By Options
	
Scenario: Verify Sort By Option 
	Given The user is on the main page 
	And The user clicks on the "Research Midsize SUVs" link 
	When The user clicks on the "Toyota Verza" 
	And The user should be able to click on the Sort By and see the Options as follows 
	
		|		Best match			|
		|		Nearest distance	|
		|		Lowest price		|
		|		Highest price		|
		|		Lowest mileage		|
		|		Highest mileage		|
		|		Newest year			|
		|		Oldest year			|
		|		New arrivals		|
	