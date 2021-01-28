package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NihalLinkPage {

	public NihalLinkPage() {
		PageFactory.initElements(Driver.getDriver(), this);  
	}
	
	@FindBy(xpath = "//a[@class='footer-link'][.='Browse By Category']")
	public WebElement browseByCatecory;

	@FindBy(xpath = "//a[.='Social Responsibility']")
	public WebElement socialresponsLink;

	///schedule an appraisal
	@FindBy(xpath = "//a[@class='footer-link'][contains(text(),'Schedule an Appraisal')]")
	public WebElement scheduleApp;
	@FindBy(linkText = "Schedule your free, custom offer")
	public WebElement text;
	@FindBy(xpath = "//input[@id='appt-fname']")
	public WebElement firstName;
	@FindBy(xpath = "//input[@id='appt-lname']")
	public WebElement lastName;
	@FindBy(xpath = "//input[@id='appt-phone']")
	public WebElement phone;
	@FindBy(xpath = "//input[@id='appt-email']")
	public WebElement email;
	@FindBy(xpath = "//form[@id='appt-personal']")
	public WebElement nextButton;



}