package Moje;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyOnetSearch {
	
	@FindBy (id = "searchQuery")
	private WebElement searchText;
	@FindBy (id = "searchSubmit")
	private WebElement button;
	@FindBy (css = ".boxResult2 > .box")
	private List<WebElement> results;
	
	
		
	public void setSearchText (String text) {
		this.searchText.sendKeys(text);
	}
	
	public void click() {
		button.click();
	}
	
		
	public List<WebElement> getResults() {
		return results;
	}
	
}
