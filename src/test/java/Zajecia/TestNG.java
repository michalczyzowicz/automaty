package Zajecia;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {

	public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://www.optyczne.pl/");
    }

    @AfterClass
    public static void tearsDown() {
        driver.quit();
    }

    @Test
    public void testSearch() {
        OptyczneSearch optyczneSearch = PageFactory.initElements(driver,  OptyczneSearch.class);
        optyczneSearch.setSearchText("nikon");
        optyczneSearch.click();
        assertEquals(optyczneSearch.getResults().size(), 20);
    }
    
}
