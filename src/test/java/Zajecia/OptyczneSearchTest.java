package Zajecia;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OptyczneSearchTest{
	private static final Logger LOG = LoggerFactory.getLogger(OptyczneSearchTest.class);
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
        LOG.info("test");
    	OptyczneSearch optyczneSearch = PageFactory.initElements(driver,  OptyczneSearch.class);
        optyczneSearch.setSearchText("nikon");
        optyczneSearch.click();
        assertEquals(optyczneSearch.getResults().size(), 20);
    }

}
