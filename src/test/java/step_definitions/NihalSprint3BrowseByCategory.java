package step_definitions;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.NihalLinkPage;
import pages.NihalBrowseByCategoryPage;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NihalSprint3BrowseByCategory {
    @When("The user scroll down the page")
    public void the_user_scroll_down_the_page() {
        BrowserUtils.scroll(0,100);

    }

    @Then("The user clicks on Browse by Category link")
    public void the_user_clicks_on_browse_by_category_link() {
        NihalLinkPage n=new NihalLinkPage();
        n.browseByCatecory.click();
         }


    @Then("The user should land on the used cars page and the title should be Used Cars for Sale-CarMax")
    public void the_user_should_land_on_the_used_cars_page_and_the_title_should_be_used_cars_for_sale_car_max() {
        String actual= Driver.getDriver().getTitle();
        System.out.println(actual);
        Assert.assertTrue(actual.equals("Used Cars for Sale - CarMax"));
       }

    @Then("The user should see the following Shop by brand subcategories")
    public void theUserShouldSeeTheFollowingShopByBrandSubcategories(List<String> expectedList) {
        NihalBrowseByCategoryPage n=new NihalBrowseByCategoryPage();
        List<String> actualList=BrowserUtils.getElementsText(n.titles);
        for (int i = 0; i<actualList.size(); i++) {
            assertEquals(expectedList.get(i).toLowerCase(), actualList.get(i).toLowerCase());
        }

    }

    @Then("The user should be able to see these brands under the {string} text")
    public void theUserShouldBeAbleToSeeTheseBrandsUnderTheText(String expected) {
        NihalBrowseByCategoryPage n=new NihalBrowseByCategoryPage();
        assertTrue(Driver.getDriver().getPageSource().contains("Shop by brand"));
    }
    @Then("The user clikcs {string}")
    public void the_user_clikcs(String string) {
        NihalBrowseByCategoryPage n=new NihalBrowseByCategoryPage();
        n.toyota.click();
        BrowserUtils.waitForPageToLoad(2000);
        BrowserUtils.waitForClickablility(n.keepinStore,2000);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(n.keepinStore).click().build().perform();

    }

    @Then("The user scrolls down the page")
    public void the_user_scrolls_down_the_page() {
        BrowserUtils.scroll(0,100);
    }

    @Then("The user should see the Search by popular location text")
    public void the_user_should_see_the_search_by_popular_location_text() {
        NihalBrowseByCategoryPage n=new NihalBrowseByCategoryPage();
        BrowserUtils.waitForPageToLoad(2000);
        assertTrue(Driver.getDriver().getPageSource().contains(" Search by popular location"));
    }

    @Then("The user should see the following popular location links")
    public void the_user_should_see_the_following_popular_location_links(List<String> expectedList) {
        NihalBrowseByCategoryPage n=new NihalBrowseByCategoryPage();
        List<String> actualList=BrowserUtils.getElementsText(n.locations);
        for (int i = 0; i<actualList.size(); i++) {
            assertEquals(expectedList.get(i).toLowerCase(), actualList.get(i).toLowerCase());
        }


        }







}
