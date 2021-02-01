package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class MyProfilePage {
	
	public MyProfilePage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//h4[@class='kmx-typography--headline-1']")
	public WebElement nameField;
	
	@FindBy (id = "firstName")
	public WebElement firstName;
	
	@FindBy (id = "lastName")
	public WebElement lastName;
	
	@FindBy (id = "addressLine1")
	public WebElement addressLine1;
	
	@FindBy (id = "zipCode")
	public WebElement zipCode;
	
	@FindBy (id = "state")
	public WebElement state;
	
	@FindBy (id = "city")
	public WebElement city;
	
	@FindBy (id = "phoneNumber")
	public WebElement phoneNumber;
	
    @FindBy (xpath = "(//button[@class='kmx-button--align-right-xsmall kmx-button kmx-button--primary'])[1]")
	public WebElement submitButton;
    
    @FindBy (xpath = "//div[@class='kmx-toast kmx-toast--success kmx-toast--active']")
	public WebElement messageDiv;

	
	
	
	
	
	
	
	
	
		
}
