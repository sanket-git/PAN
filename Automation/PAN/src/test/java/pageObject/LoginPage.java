package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Constants.JANRAIN_TYPE;
import utility.Log;

public class LoginPage {
	private static WebElement element = null;

	public static class Login{

		public static WebElement janrainLogin(WebDriver driver, JANRAIN_TYPE janrainType){

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

		public static WebElement researchLogin(WebDriver driver){
			element.findElement(By.id(""));
			return element;
		}

		public static WebElement ssoLogin(WebDriver driver){
			element.findElement(By.id(""));
			return element;
		}

	}
}