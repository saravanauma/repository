package linguistselfbilling.Test;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Alert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import linguistselfbilling.TestComponents.BaseTest;



//import io.github.bonigarcia.wdm.WebDriverManager;

public class Adminlogin extends BaseTest{
	
	@Test(dataProvider="Data")
	public void StaffloginTest(HashMap <String, String> input) throws IOException {
		Loginpage.LoginAsAdmin(input.get("email"), input.get("Password"));
		Alert  alert = driver.switchTo().alert();
		alert.accept();

			}			
	@DataProvider
	public Object[][] Data() throws IOException
	{
		List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//linguistselfbilling//TestData//Data.json");
        return new Object[][] {{data.get(0)}};
		
	}
}

    