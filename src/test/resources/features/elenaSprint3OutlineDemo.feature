Feature: Verify title of page using multiple Honda models 
  
   
    Scenario Outline: Verify title of page using multiple Honda models 
    
        Given The User is on the homepage
        When The user clicks on Shop page link
        Then The user clicks on "<link>" link 
        And And user clicks on "<carmodel>" Carmodel
        And The title should be "<title>"
        
        Examples:
         | link       |  carmodel    |             title               |
         | Honda      |     accord   |  Used Honda Accord for Sale     |
         | Honda      |    odyssey   |  Used Honda Odyssey for Sale    | 
         | Honda      |     pilot    |  Used Honda Pilot for Sale      | 
         | Honda      |     civic    |  Used Honda Civic for Sale      |