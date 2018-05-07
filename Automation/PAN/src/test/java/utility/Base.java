/**
 * 
 */
package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author ssharma1
 *
 */
public class Base {
	private static WebDriver driver = null;
	
	public static WebDriver getDriver(String browserName) {
		System.out.println(new java.io.File("").getAbsolutePath());
		System.setProperty("webdriver.chrome.driver", "libraries//chromedriver");
		System.setProperty("webdriver.gecko.driver", "libraries//geckodriver");
		
		
		if (browserName.toLowerCase().equals("chrome")){
			driver = new ChromeDriver();
		} else if (browserName.toLowerCase().equals("firefox")) {
			driver= new FirefoxDriver();
		} else if (browserName.toLowerCase().equals("ie")) {
				driver= new InternetExplorerDriver();
			}
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 return driver;	
		}
	public static void switchWindows(String browserName) {
	// Store the current window handle
	String winHandleBefore = driver.getWindowHandle();

	// Perform the click operation that opens new window

	// Switch to new window opened
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}

	// Perform the actions on new window

	// Close the new window, if that window no more required
	driver.close();

	// Switch back to original browser (first window)
	driver.switchTo().window(winHandleBefore);

	// Continue with original browser (first window)
	}
}
