package step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NastyaMainPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class NastyaSp3CarsSpecifictions {
	
	
	@Given("The user is on the main page")
	public void theUserIsOnTheMainPage() {
	    Driver.getDriver().get(ConfigReader.getProperty("url"));
	}

	@Given("Clicks on Button See more cars")
	public void clicksOnButtonSeeMoreCars() {
	    BrowserUtils.scroll(0, 900);
	    NastyaMainPage mp = new NastyaMainPage();
	    mp.buttonSee.click();
	}

	@When("The user chooses the make as {string}")
	public void theUserChoosesTheMakeAs(String string) {
		NastyaMainPage mp = new NastyaMainPage();
	    BrowserUtils.jsClick(mp.keepStoreButton);
	    BrowserUtils.jsClick(mp.dropDownMake);
	    BrowserUtils.jsClick(mp.chooseCar);
	    
	}

	@When("The user clicks on the first choice")
	public void theUserClicksOnTheFirstChoice() {
	   NastyaMainPage mp = new NastyaMainPage();
	   BrowserUtils.jsClick(mp.firstCar);
	}

	@When("The user scrolldown the page and clicks on the {string}")
	public void theUserScrolldownThePageAndClicksOnThe(String string) {
		NastyaMainPage mp = new NastyaMainPage();
	    BrowserUtils.scroll(0, 700);
	    BrowserUtils.waitForPageToLoad(5);
	    BrowserUtils.jsClick(mp.featuresAndSpecs);
	}

	@Then("The user should see all the specificatons as follows")
	public void theUserShouldSeeAllTheSpecificatonsAsFollows(List<String> expectedSpecifications) {
		NastyaMainPage mp = new NastyaMainPage();
		List<String> actualSpecifications = BrowserUtils.getElementsText(mp.allSpecifications);
		assertEquals(expectedSpecifications,actualSpecifications);
	}

}
