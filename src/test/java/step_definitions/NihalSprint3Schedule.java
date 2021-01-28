package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NihalLinkPage;
import utilities.BrowserUtils;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NihalSprint3Schedule {


    @Then("The user clicks on Schedule an Appraisal Link")
    public void the_user_clicks_on_schedule_an_appraisal_link() {
        NihalLinkPage n=new NihalLinkPage();
        n.scheduleApp.click();
    }

    @Then("The user should be able to see {string} text")
    public void the_user_should_be_able_to_see_text(String expected) {
        assertTrue(Driver.getDriver().getPageSource().contains("Schedule your free, custom offer"));

    }
    @When("the user enters the credentials for schedule")
    public void the_user_enters_the_credentials_for_schedule() {
        NihalLinkPage n=new NihalLinkPage();
        BrowserUtils.waitForClickablility(n.firstName,2000);
        n.firstName.sendKeys("john");
        n.lastName.sendKeys("doe");
        n.phone.sendKeys("1234321234");
        n.email.sendKeys("johnd@aol.com");
        n.nextButton.click();


    }





    @When("the user should see the {string} in the url")
    public void the_user_should_see_the_in_the_url(String expected) {
        String actual=Driver.getDriver().getCurrentUrl();
        assertTrue(actual.contains(expected));
    }




}
