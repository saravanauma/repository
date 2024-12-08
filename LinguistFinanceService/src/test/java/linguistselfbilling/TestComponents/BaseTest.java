package linguistselfbilling.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import linguistselfbilling.pageobjects.LoginPage;


public class BaseTest {
	public WebDriver driver;
	public LoginPage Loginpage;

	public WebDriver intializedriver() throws IOException {
		
	Properties prop = new Properties();
	FileInputStream files = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//linguistselfbilling//resources//GlobalData.properties");
	prop.load(files);
	String browsername = prop.getProperty("browser");
	if (browsername.equalsIgnoreCase("chrome"))
	{
	//WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	else if (browsername.equalsIgnoreCase("chrome"))
	{
		
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	driver.manage().window().maximize();
	return driver;

}
	public List<HashMap<String, String>> getJsonDataToMap(String filepath) throws IOException
	{
	String jsonContent =FileUtils.readFileToString(new File(filepath),
			StandardCharsets.UTF_8);
		
	ObjectMapper mapper = new ObjectMapper();
	  List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
      });
	  return data;
	}
		public String getScreenShot(String testCaseName, WebDriver driver) throws IOException
		{
			TakesScreenshot ts = ((TakesScreenshot)driver);
			File source = ts.getScreenshotAs(OutputType.FILE);
			File file = new File(System.getProperty("user.dir")+"//reports//"+ testCaseName + ".png");
			FileUtils.copyFile(source, file);
			return System.getProperty("user.dir")+"//reports//"+ testCaseName + ".png";
	}
	@BeforeMethod
	public LoginPage launchapplication() throws IOException
	{
		driver = intializedriver();
		Loginpage = new LoginPage(driver);
		Loginpage.goTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
        return Loginpage;
	}
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
		}
