package Moje;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class MyOnetSearchTest {
		public static WebDriver driver;
		
	@BeforeClass
	public static void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://www.onet.pl/");
	}
	/*@AfterClass
	public static void tearsDown() {
		driver.quit();
	}*/
	
	@Test
	public void TestTitle() {
		MyOnetSearch onetSearch = PageFactory.initElements(driver, MyOnetSearch.class);
		onetSearch.setSearchText("nikon");
		onetSearch.click();
		assertTrue(onetSearch.getTitle(), true);
		System.out.println(onetSearch.getTitle());
		assertEquals(onetSearch.getResults().size(), 10);
		
	}
	
}
