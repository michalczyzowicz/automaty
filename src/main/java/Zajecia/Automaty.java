package Zajecia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Automaty {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		Optyczne optyczne = PageFactory.initElements(driver,  Optyczne.class);
	    //<input type="text" id="s" name="s" placeholder="Szukaj ..." value="">
	    WebElement id = driver.findElement(By.id("s"));
	    //<form name="searchform" action="szukaj.html" method="POST">
	    WebElement name = driver.findElement(By.name("searchform"));
	    //<input type="submit" value="&nbsp;" class="search-button"
	    WebElement cssSelector = driver.findElement(By.cssSelector(".search-button"));
	    //css class <div class="article-header">
	    WebElement className = driver.findElement(By.className("article-header"));
	    //<a ...><img src="upload2/menu_174784_pen-1.jpg" class="setborder" alt="Poszukujecie pamięci USB? Lexar ma ciekawą propozycję" title="Poszukujecie pamięci USB? Lexar ma ciekawą propozycję" style="margin: 0px; padding: 0px; float: none; position: relative;">
	    WebElement linkText = driver.findElement(By.linkText("Poszukujecie pamięci USB? Lexar ma ciekawą propozycję"));
	    //<a ...><img src="upload2/menu_174784_pen-1.jpg" class="setborder" alt="Poszukujecie pamięci USB? Lexar ma ciekawą propozycję" title="Poszukujecie pamięci USB? Lexar ma ciekawą propozycję" style="margin: 0px; padding: 0px; float: none; position: relative;">
	    WebElement partialLink = driver.findElement(By.partialLinkText("Poszukujecie"));
	    //<select name="m"><option value="12">Grudzień</option>
	    WebElement tagName = driver.findElement(By.tagName("select"));
	    //<div<span><i class="fa fa-angle-left"></i></span></div>
	    WebElement xpath = driver.findElement(By.xpath("//div/span/i"));

	   /* WebElement element = driver.findElement();
	    List<WebElement> elements = driver.findElements();*/
	   // System.out.println("element " + className.getText());
	    driver.close();

	}

}
