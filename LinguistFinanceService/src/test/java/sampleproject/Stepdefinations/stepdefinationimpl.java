package sampleproject.Stepdefinations;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sampleproject.TestComponents.BaseTest;
import sampleproject.pageobjects.LoginPage;

public class stepdefinationimpl extends BaseTest{
 public LoginPage landingpage;
 @Given ("Launch the application")
 public void Launch_the_application() throws IOException
	 {
	 landingpage =launchapplication();
	 
 }
 
 @When ("^Go to the signin page usser email (.+) and user password (.+)$")
 
	 public void signin_page_credetilas(String name , String Password)
	  {
		Loginpage.LoginAsAdmin(name,Password);


 }
 
 @Then("Close the application")
 public void Close_the_application()
 {
	 driver.close();
 
 }
}
