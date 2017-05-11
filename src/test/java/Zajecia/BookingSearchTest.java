package Zajecia;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Moje.KomponentLogowania;

public class BookingSearchTest {

	private WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://booking.com/");
	}

	/*
	 * @Test public void search() { BookingSearch search =
	 * PageFactory.initElements(driver, BookingSearch.class);
	 * search.setTextInSearch("Warszawa"); WebDriverWait wait = new
	 * WebDriverWait(driver, 15);
	 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
	 * "//ul/li/b"))); List<WebElement> ulLi =
	 * driver.findElements(By.xpath("//ul/li/b")); //
	 * search.getList().get(3).submit(); ulLi.get(3).submit(); }
	 */

	/*
	 * @Test public void windowsHandle() throws Exception { List<WebElement>
	 * button =
	 * driver.findElements(By.cssSelector(".index-nav_menu-item-link"));
	 * button.get(0).click(); String base = driver.getWindowHandle(); WebElement
	 * element; Actions newTab = new Actions(driver);
	 * newTab.keyDown(Keys.CONTROL
	 * ).keyDown(Keys.SHIFT).click(button.get(1)).keyUp
	 * (Keys.CONTROL).keyUp(Keys.SHIFT) .build().perform();
	 * button.get(1).sendKeys(Keys.CONTROL + "t"); Set<String> set =
	 * driver.getWindowHandles(); String newBase = driver.getWindowHandle();
	 * driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
	 * driver.switchTo().defaultContent(); driver.switchTo().window((String)
	 * set.toArray()[1]); }
	 */

	
	  @Test 
	  public void submitForm() { BookingSearch search =
	  PageFactory.initElements(driver, BookingSearch.class);
	  search.setTextInSearch("Warszawa"); 
	  WebDriverWait wait = new WebDriverWait(driver, 15);
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul/li/b"))); 
	  List<WebElement> ulLi =  driver.findElements(By.xpath("//ul/li/b"));
	  ulLi.get(3).click();
	  List<WebElement> checkin = driver.findElements(By.cssSelector(".sb-searchbox__row > .js--sb-dates > .sb-dates__grid > .--checkin-field"));
	  	 
	  Calendar calen = PageFactory.initElements(driver, Calendar.class);
	  calen.getDaysWithMonth().get("Czerwiec 2017").get(24).click();
	  
	  driver.findElement(By.cssSelector(".sb-searchbox__row > .js--sb-dates > .sb-dates__grid > .--checkout-field")).click();
	 
	  Calendar calen2 = PageFactory.initElements(driver, Calendar.class);
	  calen.getDaysWithMonth().get("Czerwiec 2017").get(29).click();
	  

	/*
	 * List<WebElement> calendar =
	 * driver.findElements(By.className("c2-calendar")); List<WebElement>
	 * columns = calendar.get(0).findElements(By.tagName("tr"));
	 * List<WebElement> today = calendar.get(0).findElements(By.xpath(
	 * "//td[@class = 'c2-day c2-day-s-today']")); today.get(0).click();
	 */
	// }

	/*
	 * @Test 
	 * public void welcomePopup() { WebDriverWait wait = new
	 * WebDriverWait(driver, 10); WebElement element =
	 * driver.findElement(By.className("header-signin-prompt__close"));
	 * element.click(); }
	 */

	/*@Test
	public void currency() {
		WebElement currencyMain = driver.findElement(By.className("uc_currency"));
		currencyMain.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='currency_list']/li/a/span[@class='selsymbol']")));
		List<WebElement> currencyPopup = driver.findElements(By.xpath("//ul[@class='currency_list']/li/a/span[@class='selsymbol']"));
		for (WebElement e : currencyPopup) {
			if (e.getText().equals("HUF"))
				e.click();
		}*/
		
	}
}
	  
	  
