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
import utilities.ConfigReader;

public class NastyaSp3VerifyModel {

	@Given("The user scrolls to the appraisel section")
	public void theUserScrollsToTheAppraiselSection() {
		BrowserUtils.scroll(0, 1800);
	}

	@When("The user enters the year {string} and the Make of the car {string}")
	public void theUserEntersTheYearAndTheMakeOfTheCar(String year, String make) {
		NastyaMainPage mp = new NastyaMainPage();
		mp.yearBox.sendKeys(ConfigReader.getProperty("appraisel_year"));
		mp.makeBox.sendKeys(ConfigReader.getProperty("appraisel_make"));

	}

	@Then("The user should be able to see all the model of that car")
	public void theUserShouldBeAbleToSeeAllTheModelOfThatCar(List<String> expectedModels) {
		NastyaMainPage mp = new NastyaMainPage();
		BrowserUtils.jsClick(mp.term);
		Select s = new Select(mp.termLength);
		List<WebElement> models = s.getOptions();
		List<String> actualModels = BrowserUtils.getElementsText(models);
		for (int i = 0; i < actualModels.size(); i++) {
			assertEquals(expectedModels.get(i).toLowerCase(), actualModels.get(i).toLowerCase());
		}

	}
}
