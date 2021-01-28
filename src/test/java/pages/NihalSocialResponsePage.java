package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NihalSocialResponsePage {

	public NihalSocialResponsePage() {
		PageFactory.initElements(Driver.getDriver(), this);  
	}
	
	@FindBy(xpath = "//a[@class='kmx-button kmx-button--primary']")
	public WebElement pdf;
	

}