package step_definitions3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AfterSign;
import pages.MainPage;
import pages.MyProfilePage;
import pages.RegisterPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class FurkanSprint3RegisterSteps {
	
	private JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();

	@Given("The user is on homepage")
	public void the_user_is_on_homepage() {
	    Driver.getDriver().get(ConfigReader.getProperty("url"));
	    BrowserUtils.waitForPageToLoad(5);
	}

	@When("The user clicks on profile icon and clicks on register")
	public void the_user_clicks_on_profile_icon_and_clicks_on_register() {
	    MainPage mp = new MainPage();
	    mp.profileIcon.click();
	    BrowserUtils.waitForClickablility(mp.register, 4);
	    js.executeScript("arguments[0].click();", mp.register);
	    BrowserUtils.waitForPageToLoad(5);
	}

	@When("The user enters {string} in first name field")
	public void the_user_enters_in_first_name_field(String string) {
	   RegisterPage rp = new RegisterPage();
	   rp.firstName.sendKeys(string);
	}

	@When("The user enters {string} in last name field")
	public void the_user_enters_in_last_name_field(String string) {
		RegisterPage rp = new RegisterPage();
		rp.lastname.sendKeys(string);
	}

	@When("The user enters {string} in email field")
	public void the_user_enters_in_email_field(String string) {
		RegisterPage rp = new RegisterPage();
		rp.email.sendKeys(string);
	}

	@When("The user enters {string} in password field")
	public void the_user_enters_in_password_field(String string) {
		RegisterPage rp = new RegisterPage();
		rp.password.sendKeys(string);
	}

	@When("The user enters {string} in confirm password field")
	public void the_user_enters_in_confirm_password_field(String string) {
		RegisterPage rp = new RegisterPage();
		rp.confirmPassword.sendKeys(string);
	}

	@When("The user clicks on register button")
	public void the_user_clicks_on_register_button() {
		RegisterPage rp = new RegisterPage();
		rp.registerButton.click();
		BrowserUtils.waitForPageToLoad(5);
	}

	@When("The user clicks on profile icon and select profile")
	public void the_user_clicks_on_profile_icon_and_select_profile() {
	    MainPage mp = new MainPage();
	    AfterSign as = new AfterSign();
	    mp.profileIcon.click();
	    BrowserUtils.waitForClickablility(as.myProfile, 4);
	    Actions act = new Actions(Driver.getDriver());
	    act.click(as.myProfile).build().perform();
	    BrowserUtils.waitForPageToLoad(5);
	}

	@Then("The user should be able to see his {string}")
	public void the_user_should_be_able_to_see_his(String string) {
	    BrowserUtils.waitFor(8);
		MyProfilePage mpp = new MyProfilePage();
	    assertTrue(mpp.nameField.getText().contains(string));
	}
}
