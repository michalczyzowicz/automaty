package Moje;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogowanieLinkedin {

	
	@FindBy (id = "login-email")
	private WebElement email;
	@FindBy (id = "login-password")
	private WebElement password;
	@FindBy (id = "login-submit")
	private WebElement submit;
	@FindBy (className = "error")
	private List<WebElement> error;
	@FindBy (id = "mynetwork-tab-icon")
	private WebElement logo;
	@FindBy ())
	private WebElement searchPeople;
	@FindBy (id = "nav-search-controls-wormhole")
	private WebElement submit2;
	
	
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void submit() {
		submit.click();
	}
	
	public void clearForm() {
		email.clear();
		password.clear();
	}
	
	public List<String> getErrors(){
		List<String> errorMessages = new ArrayList<String>();
		for(WebElement e:error){
			errorMessages.add(e.getText());
		}
		return errorMessages;
	}
	
	public WebElement allow(){
		return logo;
	}
	
	public void setPeople(String people) {
		this.searchPeople.sendKeys(people);
	}
	
	public void submit2() {
		submit2.click();
	}
	
	
}
