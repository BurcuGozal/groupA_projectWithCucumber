package step_definitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;
import pages.SearchCarPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;
public class FurkanSprint3SaveCarWithoutRegisterSteps {
	
	@When(": The user enters a model in searchbox and enter")
	public void the_user_enters_a_model_in_searchbox_and_enter() {
		
		MainPage mp = new MainPage();
		mp.mainSearchBox.sendKeys(ConfigReader.getProperty("save_car"),Keys.ENTER);
		
		
	}

	@When(": The user like any car from that page")
	public void the_user_like_any_car_from_that_page() {
		
		SearchCarPage sc = new SearchCarPage();
		JavascriptExecutor jsExecutor = (JavascriptExecutor)Driver.getDriver();
		try{BrowserUtils.waitForClickablility(sc.keepStoreButton, 5);
		jsExecutor.executeScript("arguments[0].click();", sc.keepStoreButton);}
		catch(Exception e) {}
		
		sc.savedCar.click();
		
		try{BrowserUtils.waitForClickablility(sc.acceptMessage, 5);
		jsExecutor.executeScript("arguments[0].click();", sc.acceptMessage);}
		catch(Exception e) {}
		
	}

	@When(": The user clicks on heart button on homepage")
	public void the_user_clicks_on_heart_button_on_homepage() {
		MainPage mp = new MainPage();
		mp.saveButton.click();
	}

	@Then(": The user should be able to see the car that he liked")
	public void the_user_should_be_able_to_see_the_car_that_he_liked() {
		
		String savedCar=Driver.getDriver().findElement(By.xpath("//h2[@class='kmx-vehicle-tile__ymmt']")).getText();
		assertTrue(savedCar.contains(ConfigReader.getProperty("save_car")));
	}

}
