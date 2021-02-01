package step_definitions2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class ElenaSprint3ShopBy {
	@Given("The User is on the homepage")
	public void theUserIsOnTheHomepage() {
	  	   Driver.getDriver().get("https://www.carmax.com");
			}

	@When("The user clicks on Shop page link")
	public void theUserClicksOnShopPageLink() {
	   new LoginPage().shopButton.click();
	}

	@Then("The user should see the following Shop by type subcategories")
	public void theUserShouldSeeTheFollowingShopByTypeSubcategories(List<String> expectedList) {
		LoginPage lp = new LoginPage();
		 
		 
	       List<String> actualList = BrowserUtils.getElementsText(lp.shopByTypeSubcategoriesList);
	       
	        for (int i = 0; i<actualList.size(); i++) {
				assertEquals(expectedList.get(i).toLowerCase(), actualList.get(i).toLowerCase());
			}
			
		   
	}

	@Then("The page title should be {string}")
	public void thePageTitleShouldBe(String expected) {
	    assertEquals(expected, Driver.getDriver().getTitle());
	}
	
	
	
	@Then("The user should see the following Shop by lifestyle subcategories")
	public void theUserShouldSeeTheFollowingShopByPriceSubcategories(List<String> expectedList) {
		LoginPage lp = new LoginPage();
		 
		 
	       List<String> actualList = BrowserUtils.getElementsText(lp.shopByLifestyleSubcategoriesList);
	       
	        for (int i = 0; i<actualList.size(); i++) {
				assertEquals(expectedList.get(i).toLowerCase(), actualList.get(i).toLowerCase());
			}
	}


}
