package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BrowserUtils;
import utilities.Driver;

public class CarsChoicesPage {
	
	public CarsChoicesPage() {
		PageFactory.initElements(Driver.getDriver(), this);  
	}
	
	
	
	@FindBy (xpath = "//*[@class='recommended-refinement']")
	public List<WebElement> recommendedFilters;
	
	@FindBy (xpath = "//*[@class='drawer--loader']")
	public List<WebElement> filters;
	
	@FindBy (xpath = "(//*[@class='svg-icon-wrapper'])[9]")
	public List<WebElement> bestMatchFilters;
	
	@FindBy (xpath = "//*[@class='filter-count']")
	public WebElement numberOfFilters;
	
	@FindBy (xpath = "(//*[contains(text(), 'Under $10,000')])[2]")
	public WebElement actualPriceRange;
	
	@FindBy (xpath = "(//*[@class='image-carousel--scroller kmx-typography--body-1'])[26]")
	public WebElement ecoCar;

	@FindBy (xpath = "//*[@data-drawer='features']")
	public WebElement ecoCarFeatures;
	
	@FindBy (xpath = "(//*[@class ='carousel-item hero-image'])[25]")
	public WebElement dieselCarOption;
	
	@FindBy (xpath = "(//li[contains(text(), 'Turbo Diesel Engine')])[1]")
	public WebElement dieselEngine;
	
	@FindBy (xpath = "//*[@class='mpg']")
	public WebElement actualMPG;
	
	@FindBy (xpath = "//*[@class = 'refinement-pill']")
	public List<WebElement> commuterTypeSelectOptions;
	
	@FindBy (xpath = "(//*[@class = 'drawer--label'])[3]")
	public WebElement carYearButton;
	

	@FindBy (xpath = "(//*[@class='kmx-custom-select__icon'])[1]")
	public WebElement creditScoreButton;
	
	@FindBy (xpath = "(//*[@class='kmx-custom-select__icon'])[2]")
	public WebElement termLengthButton;
	
	@FindBy (xpath = "(//*[@class='carousel-item hero-image'])[26]")
	public WebElement suvCarOption;
	
	@FindBy (id = "fname")
	public WebElement firstName;
	
	@FindBy (id = "lname")
	public WebElement lastName;
	
	@FindBy (name = "dob")
	public WebElement dateOfBirth;
	
			@FindBy (xpath = "(//*[@class='kmx-form-textfield__error'])[5]")
			public WebElement errorMessage;
			
			@FindBy (id = "phone")
			public WebElement phoneNumber;
			
			@FindBy (id = "free-text")
			public WebElement inputSearch;
			
			
			@FindBy (xpath = "(//button[@class='kmx-button kmx-button--tertiary kmx-button--flat'])[1]")
			public WebElement popUpHandle;
			
			@FindBy (xpath = "//*[@class='refinement-pill--text kmx-typography--body-1']")
			public WebElement year;
			
			@FindBy (xpath = "//*[@value='1']")
			public WebElement creditScoreValue;
			
			@FindBy (xpath = "//*[@value='60']")
			public WebElement termLengthValue;
			
			@FindBy (xpath = "(//*[@class='svg-icon-wrapper'])[13]")
			public WebElement preApprovedButton;
			

			@FindBy (id="title")
			public WebElement cartype;	
			
			@FindBy (xpath = "(//button[@class='kmx-button kmx-button--tertiary kmx-button--flat'])[1]")
			public WebElement keepStoreButton;
			
			@FindBy (xpath = "//button[@class='close-accessible-button base-modal--close']")
			public WebElement closeIcon;
			
			@FindBy (xpath = "//*[@class='facet--color-value']")
			public List<WebElement> exteriorColorPallet;
			
			@FindBy (xpath = "(//div[@class='drawer--label'])[8]")
			public WebElement exteriorColorButton;
			
			
			@FindBy (xpath = "(//a[@href='/cars/volvo/crossovers/pickup-trucks/sport-utilities/wagons/4wdawd'])[2]")
			public WebElement volvoOption;
			
			
			@FindBy (xpath = "(//a[@href=\"/cars/volvo/crossovers/pickup-trucks/sport-utilities/wagons/4wdawd/remote-start\"])[2]")
			public WebElement remoteVolvoStart;
			
			
			
			
			@FindBy (xpath = "(//div[@class=\"carousel-item hero-image\"])[4]")
			public WebElement outdoorCarOption;
			
			@FindBy (xpath = "//span[@class='price-mileage__car-title__model-trim']")
			public WebElement outdoorCarModel;
			
		
			@FindBy (xpath = "//span[@class='value-price']")
			public WebElement outdoorCarPrice;

			@FindBy (xpath = "//div[@class=\"price-mileage__mileage-container\"]")
			public WebElement outdoorCarMileage;

			@FindBy (xpath = "//span[@class='price-mileage__car-title__year-make']")
			public WebElement outdoorCarYear;
			
			
			
			@FindBy (xpath = "(//a[@href='/cars/honda/accord'])[2]")
			public WebElement accord;
			
			@FindBy (xpath = "(//a[@href='/cars/honda/civic'])[2]")
			public WebElement civic;
			
				





			public void clickOnCarModel(String carmodel) {
				String xpath = "(//a[@href='/cars/honda/"+carmodel+"'])[2]" ;
				BrowserUtils.jsClick(Driver.getDriver().findElement(By.xpath(xpath)));
				
			}

		}
	
