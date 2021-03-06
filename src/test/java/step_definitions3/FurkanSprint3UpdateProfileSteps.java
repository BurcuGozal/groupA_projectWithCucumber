package step_definitions3;

import org.openqa.selenium.JavascriptExecutor;
import static org.junit.Assert.*;

import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AfterSign;
import pages.MainPage;
import pages.MyProfilePage;
import pages.SignInPage;
import pojo.User;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class FurkanSprint3UpdateProfileSteps {
	
	@When("The user clicks on profile icon and select sign in")
	public void theUserClicksOnProfileIconAndSelectSignIn() {
		MainPage mp = new MainPage();
		mp.profileIcon.click();
		BrowserUtils.waitForClickablility(mp.signIn, 10);
		JavascriptExecutor jsExecutor = (JavascriptExecutor)Driver.getDriver();
		jsExecutor.executeScript("arguments[0].click();" , mp.signIn);
	}

	@When("The user enters correct credentials and click on sign in")
	public void theUserEntersCorrectCredentialsAndClickOnSignIn() {
		SignInPage s = new SignInPage();
		s.userEmail.sendKeys(ConfigReader.getProperty("email"));
		s.userPassword.sendKeys(ConfigReader.getProperty("password"));
		s.signInButton.click();
		BrowserUtils.waitFor(10);
	}

	@When("The user clicks on profile icon and select my profile")
	public void theUserClicksOnProfileIconAndSelectMyProfile() {
		MainPage mp = new MainPage();
		AfterSign as = new AfterSign();
		mp.profileIcon.click();
		as.myProfile.click();
		BrowserUtils.waitFor(5);
	}

	@When("The user enters {string} at the end of address line")
	public void theUserEntersAtTheEndOfAddressLine(String string) {
		 MyProfilePage mpp = new MyProfilePage();
		 mpp.addressLine1.click();
		 mpp.addressLine1.sendKeys(string);
	}

	@When("The user clicks on update profile button")
	public void theUserClicksOnUpdateProfileButton() {
	    MyProfilePage mpp = new MyProfilePage();
	    mpp.submitButton.click();
	}

	@Then("The user should see {string} message")
	public void theUserShouldSeeMessage(String string) {
		 MyProfilePage mpp = new MyProfilePage();
		 BrowserUtils.waitForVisibility(mpp.messageDiv, 4);
		 assertTrue(mpp.messageDiv.getText().contains(string));
	}

}
