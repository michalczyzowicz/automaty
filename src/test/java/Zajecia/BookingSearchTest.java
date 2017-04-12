package Zajecia;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingSearchTest {

	
	@Test
	public void search() {
	BookingSearch search = PageFactory.initElements(driver, BookingSearch.class);
	search.setTextInSearch("Warszawa");
	WebDriverWait wait = new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul/li/b")));
	List<WebElement> ulLi = driver.findElements(By.xpath("//ul/li/b"));
	// search.getList().get(3).submit();
	ulLi.get(3).submit();
	}
	
}
