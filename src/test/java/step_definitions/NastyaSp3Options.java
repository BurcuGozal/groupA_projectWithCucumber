package step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NastyaMainPage;
import utilities.BrowserUtils;

public class NastyaSp3Options {
	
	@Given("The user clicks on the {string} link")
	public void theUserClicksOnTheLink(String string) {
	    BrowserUtils.scroll(0, 2000);
	}


	@When("The user clicks on the {string}")
	public void theUserClicksOnThe(String link) {
	    NastyaMainPage mp = new NastyaMainPage();
	    mp.suvMidsize.click();
	    String midLink = mp.venza.getText();
	    assertEquals(link,midLink);
	    mp.toyotaCar.click();
	    BrowserUtils.waitForPageToLoad(5);
	    BrowserUtils.jsClick(mp.keepStoreButton);
	    

	}

	@When("The user should be able to click on the Sort By and see the Options as follows")
	public void theUserShouldBeAbleToClickOnTheSortByAndSeeTheOptionsAsFollows(List<String> expectedSort) {
		NastyaMainPage mp = new NastyaMainPage();
		BrowserUtils.jsClick(mp.sortBy);
		List<String> actualOptions = BrowserUtils.getElementsText(mp.dropDown);
		for (int i = 0; i < 9; i++) {
			assertEquals(expectedSort.get(i).toLowerCase(), actualOptions.get(i).toLowerCase());
		}
	}

}
