package Zajecia;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PolskiBus {

	
	@FindBy (id = "PricingForm_Adults")
	private WebElement people;
	
	@FindBy (xpath = "//ul[@id='ui-id-1']/li/div[@class='ui-menu-item-wrapper']")
	private List<WebElement> cityFrom;
	
	@FindBy (id = "ShowAllDepCity")
	private WebElement button;
	
	
	public void setPeople(String people){
		this.people.sendKeys(people);
	}
	
	public Select setPeople2(){
		return new Select(people);
	}
	
	public void click(){
		button.click();
	}
	
	public List<WebElement> getCityFrom(){
		return cityFrom;
	}
}
