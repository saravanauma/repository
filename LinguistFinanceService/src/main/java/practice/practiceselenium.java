package practice;


import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practiceselenium {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
WebElement	element= driver.findElement(By.name(null));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //implicitly wait it apply globally 
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30)); // 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("value"))); // Waits for a specific condition using WebDriverWait
	
    Wait<WebDriver> wait2 = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
     .pollingEvery(Duration.ofSeconds(2))
     .ignoring(NoSuchElementException.class);
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", element);
	
    Actions actions = new Actions(driver);
	actions.moveToElement(element).click().perform();
	

	
}
}