package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;

public class BurcuPage {
	
	public BurcuPage() {
	
	
		PageFactory.initElements(Driver.getDriver(), this);  

}
	
	@FindBy(xpath = "(//a[@href='/cars/all'])[3]")
	public WebElement shopAllCars;
	 
	@FindBy(xpath = "//div[@class='drawer--label'][@aria-label='Size']")
	public WebElement filterSize; 
	
	@FindBy(xpath = "//li[@class='refinement-value']")
	public List <WebElement> filterSizeList; 
	
	@FindBy(xpath = "(//li[@class='refinement-value'])[1]")
	public WebElement filterSizeCompact;
	
	@FindBy(xpath = "//li[@class= 'refinement-value'][@data-clickprops = 'Element type: Facet,Value: Mid-size,Is selected: false']")
	public WebElement filterSizeMidSize;
	
	@FindBy(xpath = "//li[@class= 'refinement-value'][@data-clickprops = 'Element type: Facet,Value: Full-size,Is selected: false']")
	public WebElement filterSizeFullSize;
	
	@FindBy(xpath = "//li[@class='refinement-value']")
	public List <WebElement> filterTransmissionList;
	
	@FindBy(xpath = "//div[@class='drawer--label'][@aria-label='Transmission']")
	public WebElement filterTransmission;	
	
	@FindBy(xpath = "//li[@class='refinement-value'][1]")
	public WebElement filterTransmissionAutomatic;
	
	@FindBy(xpath = "//li[@class='refinement-value'][3]")
	public WebElement filterTransmissionAutomaticManual5;
	
	@FindBy(xpath = "//li[@class='refinement-value'][4]")
	public WebElement filterTransmissionAutomaticManual6;
	
	@FindBy(xpath = "//div[@class='drawer--label'][@aria-label='Mileage']")
	public WebElement filterMileage;
	
	@FindBy(xpath = "//div[@class='mileage-filter--container--3_mAj']")
	public WebElement filterMileageDropDown;
	
	@FindBy (xpath = "(//button[@class='kmx-button kmx-button--tertiary kmx-button--flat'])[1]")
	public WebElement popUpHandle;
	
	
	
	
	
	
	
	
	
	
	
}