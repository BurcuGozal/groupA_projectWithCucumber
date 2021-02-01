package step_definitions3;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;
import pages.SavedCarsPage;
import pages.SearchCarPage;
import pages.SignInPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class FurkanSprint3DeleteCarSteps {

	@Given("The User is on the homepage")
	public void the_user_is_on_the_homepage() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		 BrowserUtils.waitForPageToLoad(5);
	}

	@Given("The user clicks on sign in button and enter correct credentials")
	public void the_user_clicks_on_sign_in_button_and_enter_correct_credentials() {
		 MainPage mp = new MainPage();
		   mp.profileIcon.click();
		   BrowserUtils.waitForClickablility(mp.signIn, 4);
		   mp.signIn.click();
		   SignInPage si = new SignInPage();
		   BrowserUtils.waitForClickablility(si.userEmail, 4);
		   si.userEmail.sendKeys(ConfigReader.getProperty("email"));
		   BrowserUtils.waitForClickablility(si.userPassword, 4);
		   si.userPassword.sendKeys(ConfigReader.getProperty("password"));
		   si.signInButton.click();
		   BrowserUtils.waitForPageToLoad(5);
	}

	@Then("The user enters {string} in search box")
	public void the_user_enters_in_search_box(String string) {
		BrowserUtils.waitFor(5); 
		MainPage mp = new MainPage();
		 BrowserUtils.waitForClickablility(mp.mainSearchBox, 4);
		 JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
		 js.executeScript("arguments[0].click();", mp.mainSearchBox);
		 mp.mainSearchBox.sendKeys(string,Keys.ENTER);
		 BrowserUtils.waitForPageToLoad(6);
	}

	@Then("The user likes the car number {string}")
	public void the_user_likes_the_car_number(String string) {
		JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
		 SearchCarPage sc = new SearchCarPage();
		 try{BrowserUtils.waitForClickablility(sc.keepStoreButton, 10);
			js.executeScript("arguments[0].click();", sc.keepStoreButton);}
			catch(Exception e) {}
		 
	    String path = "(//button[@aria-label='Save this car'])["+string+"]";
	    Driver.getDriver().findElement(By.xpath(path)).click();
	    BrowserUtils.waitFor(4);
	}

	@Then("The user clicks on saved cars button")
	public void the_user_clicks_on_saved_cars_button() {
		 MainPage mp = new MainPage();
		    JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
		    js.executeScript("arguments[0].click();", mp.saveButton);
		    BrowserUtils.waitFor(5);
	}

	@Then("The user should be able to see {string} in the description")
	public void the_user_should_be_able_to_see_in_the_description(String string) {
		 SavedCarsPage sc = new SavedCarsPage();
		    String expected=sc.savedCar.getText();
		    assertTrue(expected.contains(string));
	}

	@When("The user clicks on trash icon")
	public void the_user_clicks_on_trash_icon() {
		 SavedCarsPage sc = new SavedCarsPage();
		  sc.trashIcon.click();
	}

	@Then("{string} message should appear")
	public void message_should_appear(String string) {
		 SavedCarsPage sc = new SavedCarsPage();
		 BrowserUtils.fluentWait(sc.deleteDivMain, 4, 2);
		 String expectedMessage=sc.deleteDivMain.getText();
		 assertTrue(expectedMessage.contains(string));
	}
}
