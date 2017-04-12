package Zajecia;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingSearch {
@FindBy(id = "ss")
private WebElement search;
@FindBy(xpath = "//ul/li/b")
private List<WebElement> autocompleteItems;

public WebElement getSearch() {
return search;
}
public void submit(){
search.submit();
}

public void setTextInSearch(String text) {
search.sendKeys(text);
}

public List<WebElement> getList() {
return autocompleteItems;
}

}