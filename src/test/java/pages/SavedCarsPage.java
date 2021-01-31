package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SavedCarsPage {
	
	public SavedCarsPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath="//h4[@class='kmx-typography--headline-1']")
	public WebElement savedCar;
	
	@FindBy (xpath="(//span[@class='svg-icon'])[3]")
	public WebElement trashIcon;
	
	@FindBy (xpath="//h3[@class='kmx-typography--display-2']")
	public WebElement noSavedCarField;
	
	@FindBy (xpath="//div[@class='kmx-toast_body']")
	public WebElement deleteDiv;
	
	@FindBy (xpath="//div[@class='kmx-toast kmx-toast--success kmx-toast--active']")
	public WebElement deleteDivMain;
	
	
	
	
	
	
	
	
	
	
	

}
