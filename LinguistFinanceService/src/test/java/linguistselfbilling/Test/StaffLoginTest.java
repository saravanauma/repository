package linguistselfbilling.Test;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import linguistselfbilling.TestComponents.BaseTest;
import linguistselfbilling.pageobjects.HomePage;



//import io.github.bonigarcia.wdm.WebDriverManager;

public class StaffLoginTest extends BaseTest{
	
	@Test(dataProvider="Data")
	public void StaffloginTest(HashMap <String, String> input) throws IOException {
		Loginpage.LoginAsStaffUser(input.get("email"), input.get("Password"));
	   HomePage homepage = new HomePage(driver);
    	//homepage.NavigateToClientlistPage();
	//	homepage.FilterClient("Client");
			}			
	@DataProvider
	public Object[][] Data() throws IOException
	{
		List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//linguistselfbilling//TestData//Data.json");
        return new Object[][] {{data.get(0)}};
		
	}
}

    