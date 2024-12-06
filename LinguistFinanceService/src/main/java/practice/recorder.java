package practice;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.io.IOException;

	public class recorder {
	    public static void main(String[] args) {
	        // Start FFmpeg recording
	        String command = "ffmpeg -f x11grab -s 1920x1080 -i :0.0 -c:v libx264 -pix_fmt yuv420p -r 30 -y test.mp4";
	        ProcessBuilder builder = new ProcessBuilder("bash", "-c", command);
	        try {
	            Process process = builder.start();
	            System.out.println("Recording started...");
	            
	            // Initialize WebDriver
	            WebDriver driver = new ChromeDriver();
	            driver.get("https://www.example.com");
	            
	            // Perform actions on the webpage
	            System.out.println("Performing actions on the website...");
	            Thread.sleep(5000); // Simulate a test step
	            
	            // Stop the FFmpeg recording
	            process.destroy();
	            System.out.println("Recording stopped.");
	            
	            // Close WebDriver
	            driver.quit();
	        } catch (IOException | InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}



