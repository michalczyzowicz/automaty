package Moje;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyOnetSearch {

	@FindBy (id = "searchQuery")
	private WebElement searchText;
	@FindBy (id = "searchSubmit")
	private WebElement button;
	@FindBy (css = ".boxResult2 > .box")
	private List<WebElement> results;
	@FindBy (css = ".switch")
	private List<WebElement> results2;
	
	public List<WebElement> getLogo() {
		return results2;
	}
	
	public void setSearchText (String text) {
		this.searchText.sendKeys(text);
	}
	
	public void click() {
		button.click();
	}
	
	public List<String> getTitle()
	{	
		return getTitle();
	}
	
	public List<WebElement> getResults() {
		return results;
	}
	
}
