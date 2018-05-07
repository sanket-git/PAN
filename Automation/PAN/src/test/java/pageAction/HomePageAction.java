package pageAction;
import org.openqa.selenium.WebDriver;

import pageObject.HomePage;
import pageObject.ResourcePage;
import utility.Constants.JANRAIN_TYPE;

public class HomePageAction {
	
	public static void login(WebDriver driver) throws Exception {
		
		ResourcePage.Search.selectFacet(driver, "White Paper");
		ResourcePage.Search.searchText(driver, "whitepaper");
		ResourcePage.Search.selectResource(driver, "2018 NSS Labs Advanced Endpoint Protection Report").click();
		System.out.println("*****"+driver.getTitle());
		//HomePage.Login.loginLink(driver).click();
		LoginPageAction.researchLogin(driver);
		Thread.sleep(10000);
		//LoginPageAction.janrainLogin(driver, JANRAIN_TYPE.GOOGLE );
		LoginPageAction.Logout(driver);
	}
}
