package Zajecia;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingSearch {
	@FindBy(id = "ss")
	private WebElement search;
	@FindBy(xpath = "//ul/li/b")
	private List<WebElement> autocompleteItems;
	@FindBy (className = "sb-searchbox__button")
	private WebElement searchButton;
	@FindBy (className = "sr_animate_low_avail_percent")
	private WebElement chart;

	public WebElement getSearch() {
		return search;
	}

	public void submit() {
		search.submit();
	}

	public void setTextInSearch(String text) {
		search.sendKeys(text);
	}

	public List<WebElement> getList() {
		return autocompleteItems;
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public WebElement visibleChart() {
		return chart;
	}
	
	public boolean wynikWyszukiwania() {
		if (search.getAttribute("value").contains("Warsaw-Modlin Airport")) {
			return true;
		} 
			return false;
	}
	
}
