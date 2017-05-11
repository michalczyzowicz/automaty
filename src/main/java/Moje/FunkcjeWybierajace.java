package Moje;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FunkcjeWybierajace {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.name("multipleselect[]")));
		// zaznaczanie po numerze indexu
		 select.selectByIndex(2);
		 select.selectByIndex(0);

		// zaznaczanie po value
		 select.selectByValue("ms1");

		// po widocznym tekscie
		 select.selectByVisibleText("Selection Item 1");

		// metoda getAllSelectedOptions() zwraca wszystkie wybrane opcje;
		
		  select.selectByIndex(2); List<WebElement> selectedOptions =
		  select.getAllSelectedOptions(); for (WebElement b : selectedOptions)
		  { System.out.println(b.getText()); }
		 

		// metoda getOptions() zwraca wszystkie dane z listy opsji
		  for (WebElement b : select.getOptions()) {
		  System.out.println(b.getText()); }
		 

		// metoda isMultiple() sprawdza wsparcie dla wielokrotnego wyboru
		if (select.isMultiple()) {
			System.out.println("Wspiera wielokrotny wybór");
		}
		else{
			System.out.println("Nie wspiera wielokrotnego wyboru");
		}

		// metoda getFirstSelectedOption() pobiera pierwsza wybrana opcje lub aktualnie wybrana opcje z listy
		 select.selectByIndex(1);
		 WebElement FSO = select.getFirstSelectedOption();
		 System.out.println(select.getFirstSelectedOption().getText());

		 // usuwanie wszystkich zaznaczeñ
		 select.deselectAll();

		// usuwanie po indexie
		 select.deselectByIndex(3);

		// usuwanie zaznaczenia po value
		 select.deselectByValue("ms4");

		// usuwanie zaznaczenia po widocznm tekscie
		 select.deselectByVisibleText("Selection Item 4");

	}

}
