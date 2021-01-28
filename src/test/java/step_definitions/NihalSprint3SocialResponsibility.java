package step_definitions;

import io.cucumber.java.en.Then;
import pages.NihalLinkPage;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NihalSprint3SocialResponsibility {


    @Then("The user clicks on Social Responsibility link")
    public void the_user_clicks_on_social_responsibility_link() {
        NihalLinkPage n=new NihalLinkPage();
        n.socialresponsLink.click();
    }
    @Then("The url should contain {string}")
    public void the_url_should_contain(String expected) {
        assertTrue(Driver.getDriver().getCurrentUrl().contains(expected));
    }














}
