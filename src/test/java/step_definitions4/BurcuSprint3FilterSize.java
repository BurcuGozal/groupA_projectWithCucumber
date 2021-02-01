package step_definitions4;

import static org.junit.Assert.assertEquals;




import static org.junit.Assert.assertTrue;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BurcuPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class BurcuSprint3FilterSize {
	
	

	
	
	
	
	@When("The user clicks on Size option from the Filter list")
	public void the_user_clicks_on_size_option_from_the_filter_list() {
		
		//BrowserUtils.waitForPageToLoad(8);
		
		BurcuPage b = new BurcuPage();
	      
//		BrowserUtils.waitForPageToLoad(8);
//		
//	    b.shopAllCars.click();
//	    
//	    BrowserUtils.waitForPageToLoad(8);
//	    
//	    BrowserUtils.popUpHandle(b.popUpHandle);
//	    
//	    BrowserUtils.waitForPageToLoad(8);
//	    
	    BrowserUtils.waitForPageToLoad(8);
	   
	    b.filterSize.click();
	    
	    BrowserUtils.waitForPageToLoad(8);
	    
	    BrowserUtils.popUpHandle(b.popUpHandle);
	    
	    BrowserUtils.waitForPageToLoad(8);

	}

	@Then("The user should see Compact, Mid-size, Full-size car options")
	public void the_user_should_see_compact_mid_size_full_size_car_options(List<String> expectedList) {
		
		BurcuPage b = new BurcuPage();
		
		List<String> List=new ArrayList<>(Arrays.asList("Compact", "Mid-size", "Full-size"));

	    System.out.println(expectedList);
	    
	    
		assertTrue(expectedList.containsAll(List));
	}
	

	@When("The user clicks on Size options and then clicks on Compact")
	public void the_user_clicks_on_size_options_and_then_clicks_on_compact() {
		
		BrowserUtils.waitForPageToLoad(8);
	    
		BurcuPage b = new BurcuPage();
		
		 BrowserUtils.waitForPageToLoad(8);
		   
		 b.filterSize.click();
		
		BrowserUtils.waitForPageToLoad(8);

	    b.filterSizeCompact.click();
	    
	    BrowserUtils.waitForPageToLoad(8);
	    
	    BrowserUtils.popUpHandle(b.popUpHandle);
	    
	    BrowserUtils.waitForPageToLoad(8);

	}

//	@Then("The user should be able to see the {string} in websites URL, as well")
//	public void the_user_should_be_able_to_see_the_in_websites_url_as_well(String expected) {
//		
//		BrowserUtils.waitForPageToLoad(8);
//	    
//		BurcuPage b = new BurcuPage();
//		
//		BrowserUtils.waitForPageToLoad(8);
//	    
//	    assertTrue(Driver.getDriver().getCurrentUrl().contains("Compact"));
//		
//		
//		
//
//	}

}
	
	


