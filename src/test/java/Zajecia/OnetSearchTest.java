package Zajecia;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class OnetSearchTest {

		public static WebDriver driver;
	
	@BeforeClass
	public static void setUp(){
		driver = new FirefoxDriver();
		driver.get("http://www.onet.pl/");
	}
	
	@AfterClass
	public static void tearsDown() {
		driver.quit();
	}
	
	@Test
	public void testSearch() throws InterruptedException{
		OnetSearch onet = PageFactory.initElements(driver, OnetSearch.class);
		Thread.sleep(3000);
		onet.setSearchText("nikon");
		onet.click();
		assertEquals(onet.getResults().size(), 10);
	}
	
	
	
}
