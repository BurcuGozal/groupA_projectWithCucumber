package step_definitions3;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AfterSign;
import pages.MainPage;
import pages.SignInPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;
public class FurkanSprint3SignInSteps {
	
	@Given(": The user is on homepage")
	public void the_user_is_on_homepage() {
	    
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		
	}

	@When(": The user clicks on sign in from menu options")
	public void the_user_clicks_on_sign_in_from_menu_options() {
	   
		MainPage mp = new MainPage();
		mp.profileIcon.click();
		BrowserUtils.waitForClickablility(mp.signIn, 10);
		JavascriptExecutor jsExecutor = (JavascriptExecutor)Driver.getDriver();
		jsExecutor.executeScript("arguments[0].click();" , mp.signIn);
	}

	@When(": The user enter right credentials")
	public void the_user_enter_right_credentials() {
		
		SignInPage s = new SignInPage();
		s.userEmail.sendKeys(ConfigReader.getProperty("email"));
		s.userPassword.sendKeys(ConfigReader.getProperty("password"));
		s.signInButton.click();
		BrowserUtils.waitFor(10);
	}

	

	@Then(": The user should be able to click on my profile in menu options")
	public void the_user_should_be_able_to_click_on_my_profile_in_menu_options() {
		
		MainPage mp = new MainPage();
		AfterSign as = new AfterSign();
		mp.profileIcon.click();
		as.myProfile.click();
		BrowserUtils.waitFor(5);
	}

	@Then(": The user should see his name")
	public void the_user_should_see_his_name() {
		
		WebElement customer=Driver.getDriver().findElement(By.xpath("//h4[@class='kmx-typography--headline-1']"));
		String customerName = customer.getText();
		assertEquals(ConfigReader.getProperty("customer").toLowerCase() , customerName);
		
	}

	@When(": The user enter wrong credentials")
	public void the_user_enter_wrong_credentials() {
	    
		SignInPage s = new SignInPage();
		s.userEmail.sendKeys(ConfigReader.getProperty("email"));
		s.userPassword.sendKeys(ConfigReader.getProperty("wrong_password"));
		s.signInButton.click();
		BrowserUtils.waitForPageToLoad(10);
	}

	@Then(": The user should see sign in failed message")
	public void the_user_should_see_sign_in_failed_message() {
		SignInPage s = new SignInPage();
		BrowserUtils.waitForVisibility(s.signInFailedBox, 5);
		assertEquals(s.signInFailedBox.getText(),ConfigReader.getProperty("signInFailedMessage"));
		
	}

}
