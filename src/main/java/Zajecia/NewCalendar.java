package Zajecia;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class NewCalendar {

	@FindBy(className = "ui-datepicker-title")
	private WebElement title;
	@FindAll({ @FindBy(xpath = "//*[@class='ui-datepicker-prev ui-corner-all']"),
	@FindBy(xpath = "//*[@class='ui-datepicker-prev ui-corner-all ui-state-disabled']") })
	private WebElement prev;
	@FindBy(xpath = "//*[@class='ui-datepicker-next ui-corner-all']|//*[@class='ui-datepicker-next ui-corner-all ui-state-disabled']")
	private WebElement next;
	@FindBy(xpath = "//a[@class='ui-state-default ui-state-highlight ui-state-active']")
	private WebElement today;
	@FindBy(xpath = "//td/a[@class='ui-state-default']")
	private List<WebElement> days;

	public String getTitle() {
		return title.getText();
	}

	public void clickPrev() {
		if (isPrevClickable())
			prev.click();
	}

	public void clickNext() {
		if (isNextClickable())
			next.click();
	}

	public void clickDay(String number) {
		for (WebElement e : days) {
			if (e.getText().equals(number))
				e.click();
		}
	}

	private boolean isPrevClickable() {
		return !prev.getAttribute("class").contains("disabled");
	}

	private boolean isNextClickable() {
		return !next.getAttribute("class").contains("disabled");
	}
	
	
	//do sprawdzenia asercji czy element jest klikalny
	public boolean clickNext2() {
		if (isNextClickable()){
			next.click();
			return true;
		}
			return false;
	}
}
