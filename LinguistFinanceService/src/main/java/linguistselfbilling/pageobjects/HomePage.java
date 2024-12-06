package linguistselfbilling.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import linguistselfbilling.Abstract.AbstractComments;

public class HomePage extends AbstractComments {
	
	WebDriver driver;	

public HomePage(WebDriver driver){
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);	
}

@FindBy(id ="filter_forms_client_text_search")
WebElement ClientSearchFilter;
@FindBy(css ="input[value='Apply']")
WebElement Filter;
@FindBy(xpath="//a[normalize-space()='Linguists']")
WebElement LinguistsTab;
@FindBy(xpath ="//div[@class='bs-old-docs bg-success text-success']")
WebElement text;
@FindBy(xpath="//a[normalize-space()='Finance']")
WebElement FinanceTab;
By clientserach = By.id("filter_forms_client_text_search");
public void FilterClient(String clientname) 
{   
	
	waitForElementToApper(clientserach);
	ClientSearchFilter.click();
	ClientSearchFilter.sendKeys(clientname);
	Filter.click();
}
}


