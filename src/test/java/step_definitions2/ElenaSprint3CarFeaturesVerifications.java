package step_definitions2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CarsChoicesPage;
import pages.LoginPage;

import utilities.BrowserUtils;
import utilities.Driver;

public class ElenaSprint3CarFeaturesVerifications {

	@Then("The user clicks Shop by lifestyle subcategory {string} and clicks Exterior Color option")
	public void theUserClicksShopByLifestyleSubcategoryAndClicksExteriorColorOption(String string, List<String> expectedList) {
		LoginPage lp = new LoginPage();
		CarsChoicesPage cc = new CarsChoicesPage();
		
		 lp.family.click();
		
		 BrowserUtils.popUpHandle(cc.popUpHandle);
		 
		 
		 
		 cc.exteriorColorButton.click();
	       List<String> actualList = BrowserUtils.getElementsText(cc.exteriorColorPallet);
	       
	        for (int i = 0; i<actualList.size(); i++) {
				assertEquals(expectedList.get(i).toLowerCase(), actualList.get(i).toLowerCase());
			}
	}

	
	@Then("The user clicks Shop by lifestyle subcategory {string} and click on the {string} car and information should be the following using maps")
	public void theUserClicksShopByLifestyleSubcategoryAndClickOnTheCarAndInformationShouldBeTheFollowingUsingMaps(String string, String string2, List<Map<String, String>> dataTable) {
		LoginPage lp = new LoginPage();
		CarsChoicesPage cc = new CarsChoicesPage();
		lp.outdoor.click();
		
		 BrowserUtils.popUpHandle(cc.popUpHandle);
		
		BrowserUtils.waitForPageToLoad(8);
		
		cc.volvoOption.click();
		cc.remoteVolvoStart.click();
		
		cc.outdoorCarOption.click();
		
		Map<String, String> map = dataTable.get(0);
		
		String expectedModel = map.get("model");
		String expectedPrice = map.get("price");
		String expectedMileage = map.get("mileage");
		String expectedYear = map.get("year");
			
		BrowserUtils.waitForPageToLoad(8);
		
		String actualModel = cc.outdoorCarModel.getText().toLowerCase();
		System.out.println(actualModel);
		String actualPrice = cc.outdoorCarPrice.getText().substring(1, 7);
		System.out.println(actualPrice);
		String actualMileage = cc.outdoorCarMileage.getText().substring(0, 3);
		System.out.println(actualMileage);
		String actualYear = cc.outdoorCarYear.getText().substring(0, 4);
		System.out.println(actualYear);
	
		
		assertEquals(expectedModel, actualModel);
		assertEquals(expectedPrice, actualPrice);
		assertEquals(expectedMileage, actualMileage);
		assertEquals(expectedYear, actualYear);
	
	}

	
}
