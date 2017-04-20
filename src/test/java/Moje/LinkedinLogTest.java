package Moje;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedinLogTest {

	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://pl.linkedin.com/");
	}
	
	@AfterClass
	public static void tearsDown() throws AWTException, IOException {
		Robot r = new Robot();
		BufferedImage img = r.createScreenCapture(new Rectangle(0, 0, 1050, 840));
		File path = new File ("D://Testowanie//screen.jpg");
		ImageIO.write(img, "JPG", path);
		driver.quit();
	}
	
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
	
	/*@Test
	public void test03(){
		LogowanieLinkedin logowanielinkedin = PageFactory.initElements(driver, LogowanieLinkedin.class);
		logowanielinkedin.setEmail("michalczyzowicz@gmail.com");
		logowanielinkedin.setPassword("Marley87!0");
		logowanielinkedin.submit();
		assertTrue(logowanielinkedin.allow().isDisplayed());
	}*/
	
	@Test
	public void test04() throws InterruptedException {
		LogowanieLinkedin logowanielinkedin = PageFactory.initElements(driver, LogowanieLinkedin.class);
		logowanielinkedin.setEmail("michalczyzowicz@gmail.com");
		logowanielinkedin.setPassword("***********");
		logowanielinkedin.submit();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='ember-text-field ember-view']")));
		logowanielinkedin.setPeople("Marta Czyżowicz");
		logowanielinkedin.submit2();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='search-result__result-link ember-view']")));
		//assertTrue(logowanielinkedin.people().isDisplayed());
		logowanielinkedin.clickPeople();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='message primary ember-view']")));
		logowanielinkedin.message();
		logowanielinkedin.setMessage("Przyk�adowy text");
		logowanielinkedin.submit3();
		
		
	}
	
		
}
