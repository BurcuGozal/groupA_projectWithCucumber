package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class SignInPage {
	
	public SignInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	@FindBy (xpath = "//input[@type='email']")
	public WebElement userEmail;
	
	@FindBy (xpath = "//input[@type='password']")
	public WebElement userPassword;
	
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement signInButton;
	
	@FindBy (xpath = "//div[@class='mdc-snackbar__text']")
	public WebElement signInFailedBox;
	
	

}
