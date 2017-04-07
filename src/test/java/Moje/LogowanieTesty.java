package Moje;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class LogowanieTesty {

	public WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://demo.mrbuggy2.testarena.pl/zaloguj");
	}
	
	@After
	public void tearsDown() {
		driver.quit();
	}
	
	@Test
	public void walidacjaPol() {
		KomponentLogowania logowanie = PageFactory.initElements(driver, KomponentLogowania.class);
		logowanie.submit();
		assertTrue(logowanie.getErrors().contains("Pole wymagane"));
		logowanie.clearForm();
		logowanie.setEmail("zzaa");
		logowanie.submit();
		assertTrue(logowanie.getErrors().contains("Nieprawidłowy format adresu e-mail. Wprowadź adres ponownie."));
	}
	
	@Test
	public void bledyAdres() {
		KomponentLogowania logowanie = PageFactory.initElements(driver,  KomponentLogowania.class);
		logowanie.clearForm();
		logowanie.setEmail("admin@tc2014.pl");
		logowanie.setPassword("dd");
		logowanie.submit();
		assertTrue(logowanie.getErrors().contains("Adres e-mail i/lub hasło są niepoprawne."));
		driver.navigate().refresh();
		driver.switchTo().alert().dismiss();
	}
	
	@Test
	public void udaneZalogowanie() throws InterruptedException {
	 KomponentLogowania logowanie = PageFactory.initElements(driver, KomponentLogowania.class);
	 logowanie.setEmail("admin@tc2014.pl");
	 logowanie.setPassword("12qwAS");
	 logowanie.submit();
	 assertTrue(logowanie.allow().isDisplayed());
	 logowanie.signOut();
	 Thread.sleep(2000);
	 assertTrue(logowanie.doneExit().isDisplayed());
	}
	
}
