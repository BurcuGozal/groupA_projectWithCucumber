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
	
	
	
	
	@When("The user clicks on the Transmission option")
	public void the_user_clicks_on_the_transmission_option() {
		
		BrowserUtils.waitForPageToLoad(8);
	    
		BurcuPage b = new BurcuPage();
		
		BrowserUtils.waitForPageToLoad(8);
		
		b.filterTransmission.click();
		
		BrowserUtils.waitForPageToLoad(8);
		
		BrowserUtils.popUpHandle(b.popUpHandle);
		
		BrowserUtils.waitForPageToLoad(8);
		
		BrowserUtils.scroll(0,100);
		
	}

	@Then("The user should see three option is listed as follows")
	public void the_user_should_see_three_option_is_listed_as_follows(List <String> expectedList) {
		
		BrowserUtils.scroll(0,100);
	   
//		BurcuPage b = new BurcuPage();
//		
//		
//		
//		List<String> actualList = BrowserUtils.getElementsText(b.filterTransmissionList);
//	       
//        for (int i = 0; i<actualList.size(); i++) {
//			assertTrue((expectedList.get(i).toLowerCase()).contains(actualList.get(i).toLowerCase()));
//		}
	}

	@When("The user clicks on the Transmission and then clicks on Automatic options")
	public void the_user_clicks_on_the_transmission_and_then_clicks_on_automatic_options() {
		
		BrowserUtils.waitForPageToLoad(8);
	    
		BurcuPage b = new BurcuPage();
		
		BrowserUtils.waitForPageToLoad(8);
		
		b.filterTransmission.click();
		
		BrowserUtils.waitForPageToLoad(8);
	    
		BrowserUtils.popUpHandle(b.popUpHandle);
	    
	    BrowserUtils.waitForPageToLoad(8);

		 
		b.filterTransmissionAutomatic.click();
		
		BrowserUtils.waitForPageToLoad(8);
	    
		BrowserUtils.popUpHandle(b.popUpHandle);  
	    
	    BrowserUtils.waitForPageToLoad(8);

	}

//	@Then("The user can see the {string} in the websites URL")
//	public void the_user_can_see_the_in_the_websites_url(String expected) {
//		
//		BrowserUtils.waitForPageToLoad(8);
//	   
//		BurcuPage b = new BurcuPage();
//		
//		BrowserUtils.waitForPageToLoad(8);
//	    
//	    assertTrue(Driver.getDriver().getCurrentUrl().contains("Automatic"));
//		
//		
//	}



	

}
