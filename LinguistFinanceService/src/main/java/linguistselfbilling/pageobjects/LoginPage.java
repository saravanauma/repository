package linguistselfbilling.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import linguistselfbilling.Abstract.AbstractComments;

public class LoginPage extends AbstractComments {
	
	WebDriver driver;	


public LoginPage(WebDriver driver){
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(linkText="SINGLE SIGN ON")
WebElement UseSingleSignOn;

@FindBy(css="#staff_email_id")
WebElement Validatethemail;

@FindBy(css = "#staff_non_sso_login")
WebElement NonSSOpageLink;

@FindBy(id="userEmail")
WebElement useremail ;

@FindBy(id="staff_password")
WebElement Passwordele;

@FindBy(id="kt_sign_in_submit")
WebElement Signin;

@FindBy(id="jk")
WebElement hcapthca;


public void LoginAsStaffUser(String email, String password) {
	UseSingleSignOn.click();
	Validatethemail.sendKeys(email);
	NonSSOpageLink.click();
	Passwordele.sendKeys(password);
	Signin.click();

}
public void goTo(String URL) {
driver.get(URL);	
}
}



