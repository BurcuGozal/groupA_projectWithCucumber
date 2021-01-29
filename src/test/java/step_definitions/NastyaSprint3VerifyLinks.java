package step_definitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class NastyaSprint3VerifyLinks {
	
	@Given ("The user is on the home page")
	public void theUserIsOnTheHomePage() {
		   Driver.getDriver().get("https://www.carmax.com");
	}

	@When ("The user click on the ")
}
