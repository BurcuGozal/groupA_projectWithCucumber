	@furkan
	Feature: Customer Sign in
	As a user I want to be able to sign in
	
	
	Background:
	Given : The user is on homepage
	When : The user clicks on sign in from menu options
	
	
	Scenario: Verify positive login
	
	When : The user enter right credentials
	And : The user should be able to click on my profile in menu options
	Then : The user should see his name 
	
	Scenario: Verify negative log in
	
	When : The user enter wrong credentials
	Then : The user should see sign in failed message
	
	
	
	
	