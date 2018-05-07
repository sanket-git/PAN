package automation.PAN;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageAction.HomePageAction;
import utility.Base;
import utility.Constants;
import utility.ExcelUtils;
import utility.Log;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	WebDriver driver;
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest( String testName )
	{
		Log.info(testName + " Constructor is called");
	}

	@BeforeTest
	public void startup() {
		Log.info("Startup is called");
		driver = Base.getDriver("chrome");
		driver.get("https://www.paloaltonetworks.com/resources");
		driver.manage().window().maximize();
	}



	@DataProvider(name = "Authentication")

	public static Object[][] credentials() throws Exception {
		 Object[][] testObjArray = ExcelUtils.getTableArray(Constants.Path_TestData + Constants.File_TestData,"Sheet1");//"D://ToolsQA//OnlineStore//src//testData//TestData.xlsx","Sheet1");
		 
         return (testObjArray);

		/*return new Object[][] { { "testuser_1", "Test@123"}, 
			{ "testuser_1", "Test@123"}, 
			{ "testuser_1", "Test@123"}
		};*/
	}



	/**
	 * Test Sample
	 * @throws Exception 
	 */
	@Test
	public void testApp() throws Exception
	{
		Log.info("Apptest is called");
		HomePageAction.login(driver);
		Thread.sleep(2000);
		Assert.assertTrue( true );
	}

	@AfterTest
	public void teardown() throws Exception {
		//Log.info("Tear Down is called");
		Thread.sleep(10000);
		//driver.close();
		driver.quit();
	}
}
