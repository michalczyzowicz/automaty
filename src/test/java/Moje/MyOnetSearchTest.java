package Moje;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



public class MyOnetSearchTest {
		public static WebDriver driver;
		
	@BeforeClass
	public static void setUp() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://www.onet.pl/");
		Thread.sleep(4000);
	}
	
	@AfterClass
	public static void tearsDown() {
		driver.quit();
	}
	
	@Test
	public void Test01() throws InterruptedException {
		MyOnetSearch mySearch = PageFactory.initElements(driver, MyOnetSearch.class);
		assertEquals(driver.getTitle(), "Onet.pl");
		Thread.sleep(3000);
		mySearch.setSearchText("nikon");
		mySearch.click();
		assertEquals(mySearch.getResults().size(), 10);
	}
	
}
