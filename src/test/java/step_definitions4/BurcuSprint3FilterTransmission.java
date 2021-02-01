package step_definitions4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BurcuPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class BurcuSprint3FilterTransmission {
	
	
	@Given("The user is on the homepage")
	public void the_user_is_on_the_homepage() {
		
		 Driver.getDriver().get("https://www.carmax.com");

	}

	@When("The user clicks on Shop All Cars button")
	public void the_user_clicks_on_shop_all_cars_button() {
		
		BurcuPage b = new BurcuPage();
	       
	    b.shopAllCars.click();
	    
	    BrowserUtils.waitForPageToLoad(3);

	}
	
	
	@When("The user clicks on the Transmission option")
	public void the_user_clicks_on_the_transmission_option() {
	    
		BurcuPage b = new BurcuPage();
		
		b.filterTransmission.click();
		
		BrowserUtils.waitForPageToLoad(3);
		
	}

	@Then("The user should see three option is listed as follows")
	public void the_user_should_see_three_option_is_listed_as_follows(List <String> expectedList) {
	   
		BurcuPage b = new BurcuPage();
		
		List<String> actualList = BrowserUtils.getElementsText(b.filterTransmissionList);
		
        for (int i = 0; i<actualList.size(); i++) {
            
        	assertEquals(expectedList.get(i).toLowerCase(), actualList.get(i).toLowerCase());
		
        }
	}

	@When("The user clicks on the Transmission and then clicks on Automatic options")
	public void the_user_clicks_on_the_transmission_and_then_clicks_on_automatic_options() {
	    
		BurcuPage b = new BurcuPage();
		
		b.filterTransmission.click();
		
		BrowserUtils.waitForPageToLoad(3);
		 
		b.filterTransmissionAutomatic.click();
		
		BrowserUtils.waitForPageToLoad(3);
	}

	@Then("The user can see the {string} in the websites URL")
	public void the_user_can_see_the_in_the_websites_url(String expected) {
	   
		BurcuPage b = new BurcuPage();
	    
	    assertTrue(Driver.getDriver().getCurrentUrl().contains(expected));
		
		
	}



	

}
