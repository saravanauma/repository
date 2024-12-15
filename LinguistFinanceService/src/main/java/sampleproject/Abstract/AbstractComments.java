package sampleproject.Abstract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class AbstractComments {
	
	WebDriver driver;
	

		
	public AbstractComments(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);	

		// TODO Auto-generated constructor stub
	}

	@FindBy(css="a[href='/account/clients']")
	WebElement ClientTab;
	@FindBy(xpath="//a[normalize-space()='Bookings']")
	WebElement BookingsTab;
	@FindBy(xpath="//a[normalize-space()='Linguists']")
	WebElement LinguistsTab;
	@FindBy(xpath="//a[normalize-space()='Finance']")
	WebElement FinanceTab;
	@FindBy(xpath="//a[normalize-space()='Finance']")
	WebElement s;

	

	public void waitForElementToApper(By findby)
	{
		
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
	
	}

	public void NavigateToClientlistPage() {
		ClientTab.click();	
	}
	public void NavigateToBookingslistPage() 
	{
		BookingsTab.click();
	}
	public void NavigateToLinguistslistPage() 
	{
		LinguistsTab.click();	
	}
	}


