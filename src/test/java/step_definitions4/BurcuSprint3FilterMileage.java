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

	}

	@When("The user clicks on Shop All Cars button")
	public void the_user_clicks_on_shop_all_cars_button() {
		
		BurcuPage b = new BurcuPage();
	       
	    b.shopAllCars.click();
	    
	    BrowserUtils.waitForPageToLoad(3);

	}

	@When("The user click on the Mileage option")
	public void the_user_click_on_the_mileage_option() {
		
		BurcuPage b = new BurcuPage();
	      
	    b.filterMileage.click();
	    
	    BrowserUtils.waitForPageToLoad(3);
	    
	}

	@Then("The user should see a drop-down list of mileages")
	public void the_user_should_see_a_drop_down_list_of_mileages() {
		
	String expected = "svg-icon-wrapper";
	
    assertTrue(Driver.getDriver().getPageSource().contains(expected));

	

	}

}
