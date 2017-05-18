package Zajecia;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingSearch {
	@FindBy(id = "ss")
	private WebElement search;
	@FindBy(xpath = "//ul/li/b")
	private List<WebElement> autocompleteItems;
	@FindBy (className = "b-booker-type--leisure")
	private WebElement travelPurpose;
	@FindBy (className = "sb-searchbox__button")
	private WebElement searchButton;
	@FindBy (id = "b_map_tiles")
	private WebElement map;
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
	
	public void clickTravelpurpose() {
		travelPurpose.click();
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
	
	public boolean mapVisible() {
		if (map.getAttribute("id").contains("b_map_tiles")) {
			return true;
		}
		return false;
	}
	
}
