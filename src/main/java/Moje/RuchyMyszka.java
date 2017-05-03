package Moje;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RuchyMyszka {
	
	

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot r = new Robot();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		driver.findElement(By.id("ss")).sendKeys("Barcelona");
		driver.findElement(By.className("sb-searchbox__input sb-date-field__field  -empty")).click();
		//driver.findElement(By.xpath("//*[@id='current_account']")).click();
		r.mouseMove(370, 522);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		

	}
	
//	public static boolean isTextInSourceCode(WebDriver driver, String searchText) {
//		return driver.getPageSource().contains(searchText);
//		}

}
