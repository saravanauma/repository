package practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


public class Relativelocator {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://stage-web-new.dalanguages.co.uk/");
		
	WebElement test =driver.findElement(By.xpath("(//a[@class=\"btn btn-primary\"])[1]"));
		
	File file = test.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File ("Logo.Png") ); 
	System.out.println(test.getRect().getDimension().getHeight());
	System.out.println(test.getRect().getDimension().getWidth());

TakesScreenshot ts = ((TakesScreenshot)driver);
File file2 = ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file2, new File ("Full.Png") ); 
driver.switchTo().newWindow(WindowType.WINDOW);

Set<String> handles=driver.getWindowHandles();

Iterator<String> it=handles.iterator();

String parentWindowId = it.next();
System.out.println(parentWindowId);

String childWindow =it.next();
System.out.println(childWindow);
driver.switchTo().window(childWindow);

Thread.sleep(3000);

driver.switchTo().window(parentWindowId);



	}

}
