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

public class BurcuSprint3FilterSize {
	
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
	
	@When("The user clicks on Size option from the Filter list")
	public void the_user_clicks_on_size_option_from_the_filter_list() {
		BurcuPage b = new BurcuPage();
	       
	    b.shopAllCars.click();
	    
	    BrowserUtils.waitForPageToLoad(3);
	   
	    b.filterSize.click();
	    
	    BrowserUtils.waitForPageToLoad(3);

	}

	@Then("The user should see Compact, Mid-size, Full-size car options")
	public void the_user_should_see_compact_mid_size_full_size_car_options(List<String> expectedList) {
		
		BurcuPage b = new BurcuPage();
		
		List<String> actualList = BrowserUtils.getElementsText(b.filterSizeList);
		
        for (int i = 0; i<actualList.size(); i++) {
            
        	assertEquals(expectedList.get(i).toLowerCase(), actualList.get(i).toLowerCase());

	}
	}

	@When("The user clicks on Size options and then clicks on Compact")
	public void the_user_clicks_on_size_options_and_then_clicks_on_compact() {
	    
		BurcuPage b = new BurcuPage();

	    b.filterSizeCompact.click();
	    
	    
	}

	@Then("The user should be able to see the {string} in websites URL, as well")
	public void the_user_should_be_able_to_see_the_in_websites_url_as_well(String expected) {
	    
		BurcuPage b = new BurcuPage();
	    
	    assertTrue(Driver.getDriver().getCurrentUrl().contains(expected));
		
		
		

	}


	
	

}
