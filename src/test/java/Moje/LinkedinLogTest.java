package Moje;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class LinkedinLogTest {

	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://pl.linkedin.com/");
	}
	
	/*@AfterClass
	public void tearsDown() {
		driver.quit();
	}*/
	
	/*@Test
	public void test01(){
		LogowanieLinkedin logowanielinkedin = PageFactory.initElements(driver, LogowanieLinkedin.class);
		logowanielinkedin.setEmail("zaazaazaa");
		logowanielinkedin.setPassword("jashdjkah");
		logowanielinkedin.submit();
		assertTrue(logowanielinkedin.getErrors().contains("Podaj prawidłowy adres e-mail"));
	}
	
	@Test
	public void test02(){
		LogowanieLinkedin logowanielinkedin = PageFactory.initElements(driver, LogowanieLinkedin.class);
		logowanielinkedin.setEmail("michalczyzowicz@gmail.com");
		logowanielinkedin.setPassword("jashdjkah");
		logowanielinkedin.submit();
		assertTrue(logowanielinkedin.getErrors().contains("Nieprawidłowe hasło. Spróbuj ponownie lub poproś o nowe."));
	}*/
	
	@Test
	public void test03(){
		LogowanieLinkedin logowanielinkedin = PageFactory.initElements(driver, LogowanieLinkedin.class);
		logowanielinkedin.setEmail("michalczyzowicz@gmail.com");
		logowanielinkedin.setPassword("*******");
		logowanielinkedin.submit();
		assertTrue(logowanielinkedin.allow().isDisplayed());
	}
	
	@Test
	public void test04() {
		LogowanieLinkedin logowanielinkedin = PageFactory.initElements(driver, LogowanieLinkedin.class);
		logowanielinkedin.setPeople("Marta Czy�owicz");
		logowanielinkedin.submit2();
		
	}
	
	
	
	
}
