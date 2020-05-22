/*
 * Class: Driver
 * 
 * Initiate a static variable WebDrive and start using the Firefox driver
 * 
 */
package Utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	//Initiate a driver
	public static WebDriver driver = null;
	
	//URL to the test site
	static String baseUrl = "http://ktvn-test.s3-website.us-east-1.amazonaws.com/";

	// Support to run on Firefox 
	public static WebDriver startBrowser() {
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("mac")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		} else {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver_window.exe");
		}

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);

		return driver;
	}

	// Close browser
	public static void closeBrowser() {
		driver.close();
	}
}
