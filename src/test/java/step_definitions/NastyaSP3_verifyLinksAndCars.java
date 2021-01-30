package step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Nastya_mainPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class NastyaSP3_verifyLinksAndCars {
	
	@Given("The user is on the home page")
	public void theUserIsOnTheHomePage() {
		 Driver.getDriver(ConfigReader.getProperty("url"));
		 BrowserUtils.waitForPageToLoad(5);
	}

	@When("The user scrolls down to the Popular Reasearch")
	public void theUserScrollsDownToThePopularReasearch() {
		BrowserUtils.scroll(0, 2000);
	}

	@Then("The user should see the links")
	public void theUserShouldSeeTheLinks(List<String> expectedLinks) {
		Nastya_mainPage mp = new Nastya_mainPage();
		List<String> actualList = BrowserUtils.getElementsText(mp.researchLinks);
		System.out.println(actualList);
		//assertEquals(expectedLinks,actualList);
	}

	@When("The user clicks on the link {string}")
	public void theUserClicksOnTheLink(String expLink) {
		Nastya_mainPage mp = new Nastya_mainPage();
		String actLink = mp.link.getText();
		assertEquals(expLink,actLink);
		mp.link.click();
	}

	@Then("The user should be able to see car selection")
	public void theUserShouldBeAbleToSeeCarSelection(List<String> expectedCars) {
		Nastya_mainPage mp = new Nastya_mainPage();
		BrowserUtils.scroll(0, 700);
		List<String> actualCars = BrowserUtils.getElementsText(mp.bestMidSizeSuv);
		assertEquals(expectedCars,actualCars);
	}
	
	
	
}
