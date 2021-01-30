package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Nastya_mainPage {

	public Nastya_mainPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@class='kmx-typography--body-2']")
	public List<WebElement> researchLinks;
	
	@FindBy(xpath = "//a[@href='https://www.carmax.com/articles/best-midsize-suv-ranking']")
	public WebElement link;
	
	@FindBy(xpath = "//ol/li")
	public List<WebElement> bestMidSizeSuv;
	

//	@FindBy(xpath = "//a[@href='/cars/dodge/journey']")
//	public WebElement dodge;
//	
//	@FindBy(xpath = "//div[@class='responsive-dropdown']")
//	public WebElement dropDown;
//	
//	@FindBy (xpath = "(//button[@class='kmx-button kmx-button--tertiary kmx-button--flat'])[1]")
//	public WebElement keepStoreButton;
//	
//	@FindBy(xpath = "(//input[@class='mdc-text-field__input'])[3]")
//	public WebElement yearBox;
//	
//	@FindBy (xpath = "(//select[@class='mdc-select__native-control'])[2]")
//	public WebElement makeBox;
//	
//	@FindBy (xpath = "//div[@class='mdc-select kmx-select'])[4]")
//	public WebElement modelBox;
//	
//	@FindBy (xpath = "//*[@id=\"widget-form\"]/div/div[3]/div/div/select/option")
//	public List<WebElement> models;
//	
//	@FindBy (xpath = "(//select[@class='mdc-select__native-control'])[4]")
//	public List<WebElement> list;
//	
//	@FindBy (id = "calc-button-shop-cars_tablet-mobile")
//	public WebElement buttonSee;
//	
//	@FindBy (xpath = "//div[@class='car-container listing-container']")
//	public WebElement firstCar;
//	
//	@FindBy (xpath = "//span[@class='svg-icon-wrapper show']")
//	public WebElement fAndSpec;
//	
//	@FindBy (xpath = "//button[@class='kmx-button kmx-button--tertiary']")
//	public WebElement seeAllF;
//	
//	@FindBy (xpath = "//div[@class='features-modal']")
//	public WebElement allFeatures;
//	
//	
//	@FindBy (xpath = "features-modal")
//	public WebElement featurePopup;
//	
//	@FindBy (xpath = "//div[@class='content']")
//	public WebElement f;
////	(//div[@class='mobile']/ul/li)[30]
//	
//	////div[@class='vehicle-type-tile-title kmx-typography--body-1'] ->type of the cars
}
