package step_definitions3;

import static org.junit.Assert.assertTrue;

import java.util.List;

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
public class FurkanSprint3SignOutSteps {
	
	@Given(": After the user sign in succesfully")
	public void after_the_user_sign_in_succesfully() {
	  
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		MainPage mp = new MainPage();
		mp.profileIcon.click();
		BrowserUtils.waitForClickablility(mp.signIn, 10);
		JavascriptExecutor jsExecutor = (JavascriptExecutor)Driver.getDriver();
		jsExecutor.executeScript("arguments[0].click();" , mp.signIn);
		SignInPage s = new SignInPage();
		s.userEmail.sendKeys(ConfigReader.getProperty("email"));
		s.userPassword.sendKeys(ConfigReader.getProperty("password"));
		s.signInButton.click();
		BrowserUtils.waitFor(10);
	}

	@When(": The user clicks on sign out from menu on homepage")
	public void the_user_clicks_on_sign_out_from_menu_on_homepage() {
		MainPage mp = new MainPage();
		mp.profileIcon.click();
		AfterSign as = new AfterSign();
		BrowserUtils.waitForClickablility(as.signOut, 10);
		as.signOut.click();
		BrowserUtils.waitFor(4);
		
	}

	@Then(": The user should only see three options on menu")
	public void the_user_should_only_see_three_options_on_menu() {
		MainPage mp = new MainPage();
		mp.profileIcon.click();
		List<WebElement>list = Driver.getDriver().findElements(By.xpath("//li[@class='header-footer-menu-list-item']"));
		int expectedSize=3;
		assertTrue(expectedSize==list.size());
	}

}
