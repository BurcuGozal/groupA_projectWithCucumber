package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BrowserUtils;
import utilities.Driver;
import java.util.List;

public class BurcuPage {
	
	public BurcuPage() {
	
	
		PageFactory.initElements(Driver.getDriver(), this);  

}
	@FindBy(xpath = "//a[contains(@class, 'reason-to-believe--shop-all-cars-button')]")
	public WebElement shopAllCars;
	 
	@FindBy(xpath = "//div[@class=\'drawer--label\'][@aria-label=\'Size\']")
	public WebElement filterSize; 
	
	@FindBy(xpath = "//*[@id=\"VehicleSize\"]/div[3]/ul/li")
	public List <WebElement> filterSizeList; 
	
	@FindBy(xpath = "//li[@class= 'refinement-value'][@data-clickprops = 'Element type: Facet,Value: Compact,Is selected: false']")
	public WebElement filterSizeCompact;
	
	@FindBy(xpath = "//li[@class= 'refinement-value'][@data-clickprops = 'Element type: Facet,Value: Mid-size,Is selected: false']")
	public WebElement filterSizeMidSize;
	
	@FindBy(xpath = "//li[@class= 'refinement-value'][@data-clickprops = 'Element type: Facet,Value: Full-size,Is selected: false']")
	public WebElement filterSizeFullSize;
	
	@FindBy(xpath = "//*[@id=\"Transmission\"]/div[3]/ul/li")
	public List <WebElement> filterTransmissionList;
	
	@FindBy(xpath = "//div[@class='drawer--label'][@aria-label='Transmission']")
	public WebElement filterTransmission;	
	
	@FindBy(xpath = "//li[@class= 'refinement-value'][@data-clickprops = 'Element type: Facet,Value: Automatic,Is selected: false']")
	public WebElement filterTransmissionAutomatic;
	
	@FindBy(xpath = "//li[@class= 'refinement-value'][@data-clickprops = 'Element type: Facet,Value: Manual 5 Speed,Is selected: false']")
	public WebElement filterTransmissionAutomaticManual5;
	
	@FindBy(xpath = "//li[@class= 'refinement-value'][@data-clickprops = 'Element type: Facet,Value: Manual 6 Speed,Is selected: false']")
	public WebElement filterTransmissionAutomaticManual6;
	
	@FindBy(xpath = "//div[@class='drawer--label'][@aria-label='Mileage']")
	public WebElement filterMileage;
	
	@FindBy(xpath = "(//span[@class='svg-icon-wrapper'])[8]")
	public WebElement filterMileageDropDown;
	
	@FindBy (xpath = "(//button[@class='kmx-button kmx-button--tertiary kmx-button--flat'])[1]")
	public WebElement keepStoreButton;
	
	
	
	
	
	
	
	
	
	
	
}