Feature: Appraisel Make Types
	As A user I want to select year and the Make of the car for appraisal and see all the models for that car
	
	Scenario: Verify Car Make for Appraisal
		Given The user is on the main page
		And The user scrolls to the appraisel section
		When The user enters the year "2013" and the Make of the car "Volkswagen"
		Then The user should be able to see all the model of that car
		|		Beetle					|
		|		CC						|
		|		Eos						|
		|		GLI						|
		|		Golf					|
		|		GTI						|
		|		Jetta					|
		|		Jetta Hybrid			|
		|		Passat					|
		|		Routan					|
		|		Tiguan					|
		|		Touareg					|
		|		Touareg Hybrid			|
		|		Other					|