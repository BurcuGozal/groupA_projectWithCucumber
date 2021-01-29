package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class NastyaMainPage {
	
	public NastyaMainPage() {
		PageFactory.initElements(Driver.getDriver(), this);  
	}

	@FindBy ( xpath = "//a[@class='kmx-typography--body-2']")
	public List<WebElement> links;
	
	
	
	
	
}
