package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NihalBrowseByCategoryPage {

	public NihalBrowseByCategoryPage() {
		PageFactory.initElements(Driver.getDriver(), this);  
	}
	
	@FindBy(xpath = "//div[@class='brand-tiles']/a")
	public List<WebElement> titles;
	@FindBy(xpath = "(//a[@class='icon-tile text-centered'])[1]")
	public WebElement toyota;

	@FindBy(xpath = "//button[contains(text(),'Keep Store')]")
	public WebElement keepinStore;


	@FindBy(xpath = "//h2[.='Shop by brand']")
	public WebElement shopbyBrand;


	@FindBy(xpath = "//ul[@class='kmx-typography--body-1']/a")
	public List<WebElement> locations;
}