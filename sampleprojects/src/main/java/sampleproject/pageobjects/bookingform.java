package sampleproject.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.reactivex.rxjava3.functions.Action;
import sampleproject.Abstract.AbstractComments;

public class bookingform extends AbstractComments{
WebDriver driver ;


	public bookingform(WebDriver driver) {
		super(driver);
		this.driver = driver;
		//this.actions = new Actions(driver);
		PageFactory.initElements(driver, this);	

	}

	@FindBy(xpath ="//span[ancestor::div[contains(@id,'language_to_')]]")
	WebElement Languagetofield;
	
	@FindBy(xpath ="//input[contains(@class,'chosen-search-input')][ancestor::div[contains(@id,\"language_to\")]]")
	WebElement Languagetofieldinput;
	
	@FindBy(xpath ="//*[contains(@id,\"language_to\")]/div/ul/li[.=\"Tamil\"]")
	WebElement selecttamiltolanguage;
	
	@FindBy(xpath ="//input[contains(@id,\"interpreting_end_user_name_and_reference\")]")
	WebElement Endusername;

	
public void GoToTheNewBokkingForm(String formurl)
{
	driver.get(formurl);
	return;	
}
public void selecttolanguage(String language)
{
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("window.scrollTo(0, 0);");
    actions.moveToElement(Languagetofield);
	Languagetofield.click();
	Languagetofieldinput.sendKeys(language);
	selecttamiltolanguage.click();
	return;
}
public void enterendusername(String name)
{
	
   Endusername.sendKeys(name);
	return;
}




}