package sampleproject.pageobjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLog {
    private static final Logger logger = LogManager.getLogger(TestLog.class);

	public static void main(String[] args)
	{
	        logger.info("Starting the Selenium Test");

	        // Initialize WebDriver
	       WebDriver driver = new ChromeDriver();
	        logger.debug("ChromeDriver initialized");

	        try {
	            driver.get("https://auth-web-dev.dalanguages.co.uk/");
	            logger.info("Navigated to example.com");
	        } catch (Exception e) {
	            logger.error("An error occurred: ", e);
	        } finally {
	            driver.quit();
	            logger.info("Browser closed");
	        }
	    }
	

	}


