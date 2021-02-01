package step_definitions1;

import static org.junit.Assert.assertEquals;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NastyaMainPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class NastyaSp3FilterMake {

	@Given("User is on the home page")
	public void userIsOnTheHomePage() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
	}

	@Given("The user click on the {string}")
	public void theUserClickOnThe(String string) {
		BrowserUtils.scroll(0, 900);
		NastyaMainPage mp = new NastyaMainPage();
		mp.buttonSee.click();
		BrowserUtils.waitForPageToLoad(5);
		BrowserUtils.jsClick(mp.keepStoreButton);
	}

	@When("User click on the {string}")
	public void userClickOnThe(String string) {
		NastyaMainPage mp = new NastyaMainPage();
		BrowserUtils.jsClick(mp.dropDownMake);
		BrowserUtils.waitFor(5);
	}

	@Then("User should see all the options")
	public void userShouldSeeAllThe(List<String> expectedOptions) {
		List<String> actualOptions = BrowserUtils.getElementsText(new NastyaMainPage().carOptions);
		assertEquals(expectedOptions, actualOptions);

	}
}
