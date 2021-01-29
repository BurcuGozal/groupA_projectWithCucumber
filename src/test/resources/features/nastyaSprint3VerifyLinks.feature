@nastya
Feature: Verify links title on Research popular used cars and Suvs Section

	Scenario Outline: Verify the links title
	
		Given The user is on the home page
		When The user click on the "<link>"
		Then The title should be "<title>"

		Examples:
		
		|			link				|			title													|
		|	Research Best-Selling Cars	|	145 Best Used Cars for 2021: Ranked by Type & Price | CarMax	|
		|	Research AWD Cars			|	10 Best AWD Cars for 2021 | CarMax								|
		|	Research Hybrid Cars		|	15 Best Hybrid Cars of 2020: Reviews, Photos, and More | CarMax	|
		|	Research SUVs				|	74 Best SUVs for 2021: Ranked by Type & Price | CarMax			|
		|	Research Compact SUVs		|	10 Best Small and Compact SUVs for 2020: Reviews, Photos and More | CarMax|
		|	Research Midsize SUVs		|	10 Best Midsize SUVs for 2020: Reviews, Photos, and More | CarMax|
		