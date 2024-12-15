package sampleproject.pageobjects;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sampleproject.Abstract.AbstractComments;

public class HomePage extends AbstractComments {
	
	WebDriver driver;	

public HomePage(WebDriver driver){
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);	
}

By clientserach = By.id("filter_forms_client_text_search");
public void FilterClient(String clientname) 
{   
	
	waitForElementToApper(clientserach);
}

public void Alethandle() 
{
Alert  alert = driver.switchTo().alert();
alert.accept();
	
}

}
