Feature: Verify "Shop by" page details

 
   Scenario: Verify Shop by type page details
      Given The User is on the homepage
      When The user clicks on Shop page link
      Then The user should see the following Shop by type subcategories
           | SUVs             |
           | Trucks           |
           | Crossovers       |
           | Sedans           |
           | Coupes           |
           | Convertibles     |
           | Luxury           |
           | Sports Cars      |
           | Diesel Engines   |
           | Vans             |
           | Hybrids          |
           | Wagons           |
           | Electric Vehicles|
           
      And  The page title should be "Used Cars for Sale - CarMax"
        

		 
	 Scenario: Verify Shop by price page details
      Given The User is on the homepage
      When The user clicks on Shop page link
      Then The user should see the following Shop by lifestyle subcategories
           | Commuter    |
           | Eco-Friendly|
           | Family      |
           | Outdoor     |
                               
      And  The page title should be "Used Cars for Sale - CarMax"
      
      
      
      
      
      
        