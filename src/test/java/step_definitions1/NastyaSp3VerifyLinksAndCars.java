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

public class NastyaSp3VerifyLinksAndCars {

	@Given("The user is on the home page")
	public void theUserIsOnTheHomePage() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
	}

	@When("The user scrolls down to the Popular Research Section")
	public void theUserScrollsDownToThePopularResearchSection() {
		BrowserUtils.scroll(0, 2100);
	}

	@Then("The user should see the links")
	public void theUserShouldSeeTheLinks(List<String> expectedLinks) {
		NastyaMainPage mp = new NastyaMainPage();
		List<String> actualList = BrowserUtils.getElementsText(mp.researchLinks);
		System.out.println(actualList);
		System.out.println(expectedLinks);
		assertEquals(expectedLinks, actualList);
	}

	@When("The user clicks on the link {string}")
	public void theUserClicksOnTheLink(String expLink) {
		NastyaMainPage mp = new NastyaMainPage();
		String actLink = mp.link.getText();
		assertEquals(expLink, actLink);
		mp.link.click();
	}

	@Then("The user should be able to see car selection")
	public void theUserShouldBeAbleToSeeCarSelection(List<String> expectedCars) {
		NastyaMainPage mp = new NastyaMainPage();
		BrowserUtils.scroll(0, 800);
		BrowserUtils.waitForPageToLoad(5);
		List<String> actualCars = BrowserUtils.getElementsText(mp.bestMidSizeSuv);
		assertEquals(expectedCars, actualCars);
	}

}
