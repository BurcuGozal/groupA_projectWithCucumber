package step_definitions;


import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CarsChoicesPage;

import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class ElenaSprint3OutlineTitleVerification {
	
	@Then("The user clicks on {string} link")
	public void theUserClicksOnLink(String string) {
		BrowserUtils.waitForPageToLoad(5);
		CarsChoicesPage cc = new CarsChoicesPage();
		new LoginPage().hondaField.click();
		
		 BrowserUtils.popUpHandle(cc.popUpHandle);
		
	}

	@Then("And user clicks on {string} Carmodel")
	public void andUserClicksOnCarmodel(String carmodel) {
		
		new CarsChoicesPage().clickOnCarModel(carmodel);
		
		
	}

	@Then("The title should be {string}")
	public void theTitleShouldBe(String expectedTitle) {
		String actual = Driver.getDriver().getTitle();
		   assertEquals(expectedTitle, actual);
		}

}
