@nastya
Feature: Rankings
		As a user I want to be able to see rankings for 10 Best Midsize SUVs
	
			
		Scenario: Verify page contains Best Midsize Suvs car selection
			Given The user is on the home page
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
		