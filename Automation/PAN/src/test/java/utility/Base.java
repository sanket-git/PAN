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

	
}
