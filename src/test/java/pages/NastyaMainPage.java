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

	@FindBy(xpath = "//a[@class='kmx-typography--body-2']")
	public List<WebElement> researchLinks;

	@FindBy(xpath = "//a[@href='https://www.carmax.com/articles/best-midsize-suv-ranking']")
	public WebElement link;

	@FindBy(xpath = "//ol/li")
	public List<WebElement> bestMidSizeSuv;

	@FindBy(id = "calc-button-shop-cars_tablet-mobile")
	public WebElement buttonSee;

	@FindBy(xpath = "(//span[@class='refinement-value--name'])[2]")
	public WebElement chooseCar;

	@FindBy(xpath = "//span[@class='refinement-value--name']")
	public List<WebElement> carOptions;

	@FindBy(xpath = "//a[@href='/car/19735468']")
	public WebElement firstCar;

	@FindBy(xpath = "//div[@aria-label='Make']")
	public WebElement dropDownMake;

	@FindBy(xpath = "(//button[@class='kmx-button kmx-button--tertiary kmx-button--flat'])[1]")
	public WebElement keepStoreButton;

	@FindBy(xpath = "//div[@data-drawer='features']")
	public WebElement featuresAndSpecs;

	@FindBy(xpath = "//div[@class='specifications']//p")
	public List<WebElement> allSpecifications;

	@FindBy(xpath = "(//input[@class='mdc-text-field__input'])[3]")
	public WebElement yearBox;

	@FindBy(xpath = "(//select[@class='mdc-select__native-control'])[2]")
	public WebElement makeBox;

	@FindBy(xpath = "//div[@class='mdc-select kmx-select'])[4]")
	public WebElement modelBox;
	
	@FindBy(xpath = "//div[@class='mdc-select kmx-select mdc-select--disabled']")
	public WebElement term;
	
	@FindBy(xpath = "(//select[@class='mdc-select__native-control'])[4]")
	public WebElement termLength;
	
	@FindBy(xpath = "//select[@class='mdc-select__native-control']")
	public WebElement modelSelect;

	@FindBy(xpath = "//a[@href='https://www.carmax.com/articles/best-midsize-suv-ranking']")
	public WebElement suvMidsize;

	@FindBy(xpath = "(//button[@class='kmx-menu-button kmx-button kmx-button--tertiary'])[2]")
	public WebElement sortBy;

	@FindBy(xpath = "//a[@href='/cars/toyota/venza']")
	public WebElement toyotaCar;

	@FindBy(xpath = "//ul[@class='kmx-list']//li[@class='kmx-menu-item']")
	public List<WebElement> dropDown;

	@FindBy(xpath = "//a[@id='venza']")
	public WebElement venza;
	

}
