package Zajecia;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG2 {
	public static WebDriver driver;
	private static Map<String, Object[]> testNGResults = new HashMap<String, Object[]>();

	@BeforeClass
	public static void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://www.optyczne.pl/");
	}

	@AfterClass
	public static void tearsDown() {
		TestResultToExcel.createExcel(testNGResults);
		driver.quit();
	}

	@Test()
	public void testSearch() {
		OptyczneSearch optyczneSearch = PageFactory.initElements(driver, OptyczneSearch.class);
		optyczneSearch.setSearchText("nikon");
		optyczneSearch.click();
		testNGResults.put("2", new Object[] { 1d, "Go to Optyczne", "Site gets opened", "Pass" });
		Assert.assertEquals(optyczneSearch.getResults().size(), 20);
		testNGResults.put("3", new Object[] { 1d, "Fail", "Fail", "fail" });
	}
}
