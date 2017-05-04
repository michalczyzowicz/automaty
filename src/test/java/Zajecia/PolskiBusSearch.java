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
		//najpierw musimy wejsc do "ramki" aby mozna bylo wyszukiwac w niej elementy, nastepnie robimy PageFactory
		driver.switchTo().frame("BEHold");
		PolskiBus search = PageFactory.initElements(driver, PolskiBus.class);
		search.setPeople("4");
		search.click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-1']/li")));
		//driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']")).get(3).getText();
		search.getCityFrom().get(1).click();
		search.click2();
		search.getCityTo().get(3).click();
	}
	
	/*@Test
	//drugi sposób wyszukania - metodka z selectem
	public void search2(){
		driver.switchTo().frame("BEHold");
		PolskiBus search = PageFactory.initElements(driver, PolskiBus.class);
		search.setPeople2().selectByValue("7");;
	}*/
	
}
	

