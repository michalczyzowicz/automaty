package Zajecia;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SearchOptyczne {

    public static void main(String[] args) {
        
    	//ustawianie profilu domyslnego, nie dziala na wszystkich wersjach przegladarki
    	FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("browser.privatebrowsing.autostart",true);
        WebDriver driver = new FirefoxDriver(firefoxProfile);
        driver.get("http://www.optyczne.pl/");

        /*WebElement searchText = driver.findElement(By.id("s"));
        searchText.sendKeys("nikon");
        WebElement click = driver.findElement(By.className("search-button"));
        //searchText.submit();
        click.click();*/

        /*List<WebElement> results = driver.findElements(By.cssSelector(".post > .article-header"));
        //List<WebElement> results = driver.findElements(By.cssSelector(".articles-listing > .post"));
       System.out.println(results.size());*/

        OptyczneSearch optyczneSearch = PageFactory.initElements(driver,  OptyczneSearch.class);
        optyczneSearch.setSearchText("nikon");
        optyczneSearch.click();

        //System.out.println(optyczneSearch.getResults().size());
        //driver.quit();
    }
}
