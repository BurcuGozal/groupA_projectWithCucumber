package step_definitions4;

import static org.junit.Assert.assertTrue;


import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BurcuPage;

import utilities.BrowserUtils;
import utilities.Driver;

public class BurcuSprint3FilterMileage {
	
	
	@Given("The user is on the homepage")
	public void the_user_is_on_the_homepage() {
		
		 Driver.getDriver().get("https://www.carmax.com");
		 
		 BrowserUtils.waitForPageToLoad(5);

	}

	@When("The user clicks on Shop All Cars button")
	public void the_user_clicks_on_shop_all_cars_button() {
		
		BurcuPage b = new BurcuPage();
		
		BrowserUtils.waitForPageToLoad(8);
	       
	    b.shopAllCars.click();
	    
	    BrowserUtils.waitForPageToLoad(8);
	    
	    BrowserUtils.popUpHandle(b.popUpHandle);
	    
	    BrowserUtils.waitForPageToLoad(8);

	}

	@When("The user click on the Mileage option")
	public void the_user_click_on_the_mileage_option() {
		
		BrowserUtils.waitForPageToLoad(8);
		
		BurcuPage b = new BurcuPage();
		
		//BrowserUtils.jsClick(b.keepStoreButton);
		    
		BrowserUtils.waitForPageToLoad(8);

	    b.filterMileage.click();
	    
	    BrowserUtils.waitForPageToLoad(8);
	    
	    BrowserUtils.popUpHandle(b.popUpHandle);
	    
	    BrowserUtils.waitForPageToLoad(8);
	    
	}

	@Then("The user should see a drop-down list of mileages")
	public void the_user_should_see_a_drop_down_list_of_mileages() {
		
	String expected = "svg-icon-wrapper";
	
	BrowserUtils.waitForPageToLoad(8);
	
    assertTrue(Driver.getDriver().getPageSource().contains(expected));

	

	}

}
