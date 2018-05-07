package pageAction;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.HomePage;
import pageObject.LoginPage;
import utility.Constants.JANRAIN_TYPE;
import utility.Log;

public class LoginPageAction {

	public static void researchLogin(WebDriver driver) {
		LoginPage.Login.researchLoginUsername(driver).clear();
		LoginPage.Login.researchLoginUsername(driver).sendKeys("test@yahoo.com");
		LoginPage.Login.researchLoginPassword(driver).clear();
		LoginPage.Login.researchLoginPassword(driver).sendKeys("pan1234");
		LoginPage.Login.researchLoginButton(driver).click();
	}

	public static void janrainLogin(WebDriver driver, JANRAIN_TYPE janrainType) {
		// Perform the actions on new window
		switch (janrainType) {
		case GOOGLE:
			googleLogin(driver);
			// Perform the click operation that opens new window
			LoginPage.Login.janrainElement(driver, janrainType).click();
			System.out.println("Clicked on the Google Plus and waiting");

			break;

		case FACEBOOK:
			driver.findElement(By.id("janrain-facebook"));
			break;
		case LINKEDIN:
			driver.findElement(By.id("janrain-linkedin"));
			break;

		default:
			Log.error("*************Janrain Type not found************");
		}
	}

	public static void Logout(WebDriver driver) {
		try {
		HomePage.Login.logout(driver).click();
		} catch(StaleElementReferenceException e){
			HomePage.Login.logout(driver).click();
		}
	}

	public static void googleLogin(WebDriver driver) {
		String url = "https://accounts.google.com/signin";
		driver.get(url);
		WebElement email_phone = driver.findElement(By.id("identifierId"));
		email_phone.sendKeys("sanket.86.sharma");
		driver.findElement(By.id("identifierNext")).click();
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("Pan@1234");
		driver.findElement(By.id("passwordNext")).click();
	}
}