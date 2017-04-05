package Moje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Próbne {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://barnesandnoble.com/");
		Thread.sleep(3000);
		driver.getTitle();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.id("topNav3"))).build().perform();
		//Select select = new Select(driver.findElement(By.id("subMenu3")));
		//select.selectByVisibleText("For Her");
		//driver.findElement(By.id("topNav3")).click();
		
		
		/*driver.findElement(By.id("lst-ib")).isDisplayed();
		System.out.println(driver.findElement(By.id("lst-ib")).isDisplayed());*/
	}

}
