package Zajecia;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PolskiBusSearch {

private WebDriver driver;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get("http://polskibus.com/");
	}
	@Test
	public void search(){
		driver.switchTo().frame("BEHold");
		PolskiBus search = PageFactory.initElements(driver, PolskiBus.class);
		search.setPeople("4");
		search.click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-1']/li/div[@class='ui-menu-item-wrapper']")));
		search.getCityFrom().get(5).click();
	}
	
	/*@Test
	//drugi sposób wyszukania - metodka z selectem
	public void search2(){
		driver.switchTo().frame("BEHold");
		PolskiBus search = PageFactory.initElements(driver, PolskiBus.class);
		search.setPeople2().selectByValue("7");;
	}*/
	
}
	

