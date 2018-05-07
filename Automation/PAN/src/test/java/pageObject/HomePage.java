package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private static WebElement element = null;

	public static class Login {
		public static WebElement loginLink(WebDriver driver) {
			element = driver.findElement(By.id("main_menu_login_id"));
			return element;
		}

		public static WebElement searchLink(WebDriver driver) {
			element.findElement(By.id(""));
			return element;
		}

		public static WebElement languageLink(WebDriver driver) {
			element.findElement(By.id(""));
			return element;
		}

		public static WebElement userLink(WebDriver driver) {
			element.findElement(By.id("main_menu_login_id"));
			return element;
		}

		public static WebElement logout(WebDriver driver) {
			driver.findElement(By.id("main_menu_login_id")).click();
			element = driver.findElement(By.linkText("Log out"));
//			List<WebElement> loginOptions = driver.findElements(By.xpath("//*[@id='main_menu_login_id']/li/a"));
//			for (WebElement element : loginOptions) {
//				System.out.println(element.getText());
//				if (element.getText().contains("Log out")) {
//					return element;
//				} else {
//					System.out.println("Log out Option does not Exist !!!! ");
//				}
//			}
			return element;
		}
	}
}
