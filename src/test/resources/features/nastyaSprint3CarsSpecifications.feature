@nastya
Feature: Verify Car Specifications
		As a user I want to see all the car Specifications for a chosen car

	Scenario: Verify Car Specifications
		Given The user is on the main page
		And Clicks on Button See more cars
		When The user chooses the make as "Audi"
		And The user clicks on the first choice
		And The user scrolldown the page and clicks on the "Features & Specs"
		Then The user should see all the specificatons as follows
		
		|	City/Highway Gas Mileage	|
		|	24/33 mpg					|
		|	Exterior/Interior Color		|
		|	Gray/Black					|
		|	Transmission				|
		|	Automatic					|
		|	Drive						|
		|	4WD							|
		|	Engine						|
		|	2.0L						|
		|	Cylinders					|	
		|	4							|
		|	Horsepower					|
		|	220 hp@4500rpm				|
		|	Torque						|
		|	258 torque@1600rpm			|
		