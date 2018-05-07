package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ResourcePage {
	private static WebElement element = null;

	public static class Search{

		public static void searchText(WebDriver driver, String text){
			searchTextBox(driver).clear();
			searchTextBox(driver).click();
			searchTextBox(driver).sendKeys(text);
			searchButton(driver).click();
			//driver.findElements(By.className("chicklet"));
			//return element;
		}
		
		public static WebElement selectFilter(WebDriver driver, String text){
			searchTextBox(driver).clear();
			searchTextBox(driver).click();
			searchTextBox(driver).sendKeys(text);
			searchButton(driver).click();
			//driver.findElements(By.className("chicklet"));
			return element;
		}

		public static WebElement searchTextBox(WebDriver driver){
			element= driver.findElement(By.id("solr.queryInput"));
			return element;
		}
		public static WebElement searchButton(WebDriver driver){
			element= driver.findElement(By.id("search-resources"));
			return element;
		}
		
		public static WebElement selectResource(WebDriver driver, String title) {
			System.out.println("************"+driver.findElement(By.linkText("2018 NSS Labs Advanced Endpoint Protection Report")).getText());
			return driver.findElement(By.linkText("2018 NSS Labs Advanced Endpoint Protection Report"));
			//return driver.findElement(By.xpath("//*[@id='searchresults']/div[@class='chicklet']//a[contains(text(),'2018 NSS Labs Advanced Endpoint Protection Report')]"));
			}
		
		public static WebElement selectFacet(WebDriver driver, String filter){
			//element= driver.findElement(By.id("RC_TYPE_DFACET"));
			List<WebElement> filters = driver.findElements(By.xpath("//*[@id='RC_TYPE_DFACET']/li/a"));
			for(WebElement element : filters){
				System.out.println(element.getText());
				if (element.getText().toLowerCase().contains(filter.toLowerCase())){
					//JavascriptExecutor js = (JavascriptExecutor)driver;
					 // if the element is on top.
					//js.executeScript("scroll(250, 0)");
					//JavascriptExecutor jse = (JavascriptExecutor)driver;

					//jse.executeScript("arguments[0].scrollIntoView()", element); 
					// if the element is on bottom.
					//jse.executeScript("scroll(0, -200)");
					//WebElement element = driver.findElement(By.id("navigationPageButton"));
					//Actions actions = new Actions(driver);
					//actions.moveToElement(element).click().build().perform();
					//element.click();
					break;
				}
				else {
					System.out.println("Filter does not Exist !!!! ");
				}
			}
			return element;
			
		}
	}
}
