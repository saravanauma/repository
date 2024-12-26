package sampleproject.Test;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sampleproject.TestComponents.BaseTest;
import sampleproject.pageobjects.TestLog;
import sampleproject.pageobjects.bookingform;



//import io.github.bonigarcia.wdm.WebDriverManager;

public class Adminlogin extends BaseTest{
    
	private static final Logger logger = LogManager.getLogger(Adminlogin.class);

	@Test(dataProvider="Data")
	public void StaffloginTest(HashMap <String, String> input) throws IOException {
		Loginpage.LoginAsAdmin(input.get("email"), input.get("Password"));
		//Assert.assertTrue(true,"")
        logger.info("Starting the Selenium Test");

			}			
	
	@Test (dependsOnMethods = {"StaffloginTest"})
	public void fillform() throws InterruptedException{
      bookingform bf = new bookingform(driver);
      bf.GoToTheNewBokkingForm("https://prestaging.link.dals.co.uk/account/clients/19219/interpretings/new");
      Thread.sleep(3000);
      bf.selecttolanguage("Tamil");
      bf.enterendusername("saravana");
      logger.info("Form opened");

	}			

	@DataProvider
	public Object[][] Data() throws IOException
	{
		List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//sampleproject//TestData//Data.json");
        return new Object[][] {{data.get(0)}};
		
	}
}

    