package sampleproject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sampleproject.Abstract.AbstractComments;

public class LoginPage extends AbstractComments {
	
	WebDriver driver;	


public LoginPage(WebDriver driver){
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}

@FindBy(name ="staff[email]")
WebElement Username;

@FindBy(name="staff[password]")
WebElement Password;

@FindBy(name ="commit")
WebElement Signin;


public void LoginAsAdmin(String email, String password) {
	Username.sendKeys(email);
	Password.sendKeys(password);
	Signin.click();
}
 public void goTo(String URL) {
 driver.get(URL);	
}
}



