package Zajecia;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PolskiBus {

	@FindBy(id = "PricingForm_Adults")
	private WebElement people;

	@FindBy(xpath = "//ul[@id='ui-id-1']/li[@class='ui-menu-item']")
	private List<WebElement> cityFrom;

	@FindBy(xpath = "//ul[@id='ui-id-2']/li[@class='ui-menu-item']")
	private List<WebElement> cityTo;

	@FindBy(id = "ShowAllDepCity")
	private WebElement button;

	@FindBy(id = "CustomToCity")
	private WebElement button2;
	
	@FindBy (xpath = "//*[@class ='btn btn-lg btn-success onb_btnRoundTR']")
	private WebElement search;

	public void setPeople(String people) {
		this.people.sendKeys(people);
	}

	public Select setPeople2() {
		return new Select(people);
	}

	public void click() {
		button.click();
	}

	public List<WebElement> getCityFrom() {
		return cityFrom;
	}

	public void click2() {
		button2.click();
	}

	public List<WebElement> getCityTo() {
		return cityTo;

	}
	public void search() {
		search.click();
	}
	
}