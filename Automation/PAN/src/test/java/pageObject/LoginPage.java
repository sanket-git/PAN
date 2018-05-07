package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Constants.JANRAIN_TYPE;
import utility.Log;

public class LoginPage {
	private static WebElement element = null;

	public static class Login{

		public static  WebElement janrainElement(WebDriver driver, JANRAIN_TYPE janrainType){
			String url = "https://www.paloaltonetworks.com/login";
			driver.get(url);

			switch (janrainType)
			{
			case GOOGLE: 
				return driver.findElement(By.id("janrain-googleplus"));


			case FACEBOOK:  
				return driver.findElement(By.id("janrain-facebook"));


			case LINKEDIN: 
				return driver.findElement(By.id("janrain-linkedin"));
				
			default:
				Log.error("*************Janrain Type not found************");
			}
			
			return element;
		}

		public static WebElement researchLoginUsername(WebDriver driver){
			return driver.findElement(By.id("capture_signIn_signInEmailAddress"));
		}

		public WebElement ssoLogin(WebDriver driver){
			return driver.findElement(By.id(""));
			
		}
		
		public static WebElement researchLoginPassword(WebDriver driver){
			return driver.findElement(By.id("capture_signIn_currentPassword"));
			
		}
		public static WebElement researchLoginButton(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id='capture_signIn_signInForm']//button[@type='submit']"));
		}

	}
}