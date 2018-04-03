package pageAction;
import org.openqa.selenium.WebDriver;

import pageObject.HomePage;
import pageObject.LoginPage;
import utility.Constants.JANRAIN_TYPE;

public class HomePageAction {
	
	public static void login(WebDriver driver) {
		HomePage.Login.loginLink(driver).click();
		LoginPage.Login.janrainLogin(driver, JANRAIN_TYPE.GOOGLE ).click();
	}
}
