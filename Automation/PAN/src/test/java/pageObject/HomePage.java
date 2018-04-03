package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private static WebElement element = null;
	
	public static class Login{
		public static WebElement loginLink(WebDriver driver){
			element = driver.findElement(By.id("main_menu_login_id"));
			return element;
	}
		
		public static WebElement searchLink(WebDriver driver){
			element.findElement(By.id(""));
			return element;
	}
		
		public static WebElement languageLink(WebDriver driver){
			element.findElement(By.id(""));
			return element;
	}

}
}
