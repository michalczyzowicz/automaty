package Zajecia;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
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
}
